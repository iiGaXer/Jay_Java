// package Beginner.UN3;

/*
* Loops - A feature that repeats a set of commands for a durational period
*   - "For" loops a set amount of times 
*   - "While" loops infintely until a condition is proven false
*   - "Do-While" executes the body of code in "Do" and checks "While" 's condition for any proven falses --> if so, breaks
*/

public class loops {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            if (i == 3) {
                break;
            } while (i != 3) {
                continue;
            }
        }

    } 
}