/*boolean isFFActive= true; int numOfActiveUsers = 0;
        3. If the feature flag is active, advance the number of active users, else, deduct the number of active users.
        4. do the same with Ternary operator.

Here, condition is evaluated and
if condition is true, expression1 is executed.
And, if condition is false, expression2 is executed.
The ternary operator takes 3 operands (condition, expression1, and expression2)*/

public class TernaryOperator {
    public static void main(String[] argus){
        int isFFActive=1;
        int numOfActiveUsers = 0;
        int result = (isFFActive < 0) ? numOfActiveUsers+1 : numOfActiveUsers-1;
        System.out.println("Result:" + " " +result);
    }
}
