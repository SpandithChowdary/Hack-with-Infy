package Hack_with_infy;
import java.util.*;

public class hero_villans {
	
	public static int defeat(LinkedList<Integer> Hhealth, LinkedList<Integer> Vhealth) {
        int villainsRemoved = 0;

        while (true) {
            LinkedList<Integer> tempHeroes = new LinkedList<>(Hhealth); 
            LinkedList<Integer> tempVillains = new LinkedList<>(Vhealth); 

            boolean heroesWin = fight(tempHeroes, tempVillains);

            if (heroesWin || (tempHeroes.isEmpty() && tempVillains.isEmpty())) {
                break; 
            } else {
                if (!Vhealth.isEmpty()) {
                    Vhealth.removeFirst(); 
                    villainsRemoved++;
                } else {
                    break; 
                }
            }
        }
        return villainsRemoved;
    }
	
	public static boolean fight(LinkedList<Integer> Hhealth,LinkedList<Integer> Vhealth) {

		int i = 0; 
        int j = 0; 
        
        while (i < Hhealth.size() && j < Vhealth.size()) {
            while (j < Vhealth.size() && Hhealth.get(i) > 0) {
                if (Hhealth.get(i) > Vhealth.get(j)) {
                    Hhealth.set(i, Hhealth.get(i) - Vhealth.get(j)); 
                    Vhealth.remove(j);
                } 
                else if (Hhealth.get(i) < Vhealth.get(j)) {
                    Hhealth.remove(i);
                    break; 
                } 
                else { 
                    Hhealth.remove(i);
                    Vhealth.remove(j);
                    break; 
                }
            }

            if (i < Hhealth.size() && Hhealth.get(i) <= 0) {
                Hhealth.remove(i);
            } else {
            	i++;
            }
        }
        return !Hhealth.isEmpty();
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("No.of Villains :");
		int villains = sc.nextInt();
		
		System.out.println("No.of Heros :");
		int heros = sc.nextInt();
		
		System.out.println("Health of heros :");
		int health = sc.nextInt();
		
		LinkedList<Integer> Hhealth = new LinkedList<>();
		for(int j=0; j< heros; j++) {
			 Hhealth.add(health);
		}
		
		LinkedList<Integer> Vhealth = new LinkedList<>();
		System.out.println("Health of villains :");
		for(int j=0; j< villains ; j++) {
			 int a = sc.nextInt();
			 Vhealth.add(a);
		}
		
		int num = defeat(Hhealth,Vhealth);
		System.out.println(num);
		
		sc.close();
	}

}
