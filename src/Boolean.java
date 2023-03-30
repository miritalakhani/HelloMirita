/*boolean isFFActive= true; int numOfActiveUsers = 0;
        3. If the feature flag is active, advance the number of active users, else, deduct the number of active users.*/
public class Boolean {
    public static void main(String[] argus){
        boolean isFFActive= false; int numOfActiveUsers = 0;
        if(isFFActive){
            numOfActiveUsers++;
            System.out.println("Increased number Of Active Users by One:" + " " + numOfActiveUsers);
        } else  {
            numOfActiveUsers--;
            System.out.println("Decreased number Of Active Users by One:" + " " + numOfActiveUsers);

        }
    }
}
