package Hack_with_infy;

import java.util.Scanner;

public class Gym {
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   int Energy = sc.nextInt();
	   int Size = sc.nextInt();
	   int Array[] = new int[Size];
	   for(int i=0;i<Size ; i++) {
		   Array[i] = sc.nextInt();
	   }
	   int num = calculate(Array,Size,Energy);
	   System.out.println(num);
	   sc.close();
   }

private static int calculate(int[] A, int N, int E) {
	int sum=0,count =0;
	   for(int i=0;i<N ; i++) {
		   sum += A[i];
		   count++;
		   if(sum == E) {
			   return count;
		   }
		   sum += A[i];
		   count++;
		   if(sum == E) {
			   return count;
		   }
	   }
	   if(sum<E) {
		   return -1;
	   }
	   return 0;
   }
}
