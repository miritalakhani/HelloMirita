public class Hello {
    public static void main(String[] args) {
        System.out.println("Hi Wednesday!");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.print("Mirita, Hi..This is if part!");
            System.out.print("\nHi Automation class!");
        } else {
            System.out.println("This is else part");
        }

        int m = 1000;
        {
            if (m != 1000) {
                System.out.println("\nm is NOT equal to 0");
            } else if (m >= 1000) {
                System.out.println("\nm is > 100");
            } else {
                System.out.println("m is 0");
            }
        }
    }
}
