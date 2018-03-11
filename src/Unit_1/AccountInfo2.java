package Unit_1; /**
 * Created by aaronhaizel on 2018-02-09.
 */
import java.util.Scanner;

class AccountInfo2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String correctUserName = "andrew";

        String correctUserName2;
        System.out.println("Enter username.");
        correctUserName2 = in.nextLine();

        if (correctUserName2.equals(correctUserName))
        {
            System.out.println("");
        }

        else
        {
            System.out.println("Invalid username");
        }

        String correctPassword = "p@ssw0rd";

        String correctPassowrd2;
        System.out.println("Enter password");
        correctPassowrd2 = in.nextLine();

        if(correctPassowrd2.equals(correctPassword)) {
            System.out.println("You have been logged in.");
        }
        else {
            System.out.println("Invalid password you may not access account");
        }
    }
}
