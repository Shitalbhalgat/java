/*  In Java, break and continue are loop control statements.
 They change the normal flow of loops (for, while, do-while) and are also used with switch.
 break :1)Stops the loop completely
        2) Control jumps outside the loop
continue :1)Skips the current iteration
          2)Loop continues with the next iteration

 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        //Continue Example
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}