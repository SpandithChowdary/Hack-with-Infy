#Problem Statement
You have M heroes, each with the same health H, and N villains, each having their own health 𝑉𝑖.
When a hero (H) fights a villain (V_i), three outcomes are possible: 
H > V_i → The hero wins, loses 𝑉𝑖 health, and continues fighting.
H < V_i → The villain wins, the hero is defeated, and can’t fight anymore.
H = V_i → Both are considered defeated and removed from the battle.
The battle follows a fixed order:
The first hero fights villain 1, then moves on to villain 2, and so on.
#Objective
Before starting the battle, you can remove villains from the front (in order) to ensure heroes' victory.
Find the minimum number of villains to remove to guarantee that heroes win.
#Winning Condition
Heroes win if they can defeat all villains.
If, in the last battle, both the last hero and last villain die at the same time, it is still considered a victory.
#Input Format
N (Integer) → Number of villains (1 ≤ N ≤ 2 × 10^5).
M (Integer) → Number of heroes.
