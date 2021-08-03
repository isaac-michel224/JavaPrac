import java.awt.*;

public class ControlFlows {

    public static void elseIf(String name) {
        if (name.length() > 2) {
            System.out.println("Your name is big");
        } else if (name.length() > 5) {
            System.out.println("Your name is really big");

        } else if (name.length() > 2) {
            System.out.println("Your name is big");
        }
    }
    public void checkID(boolean validID, int age, boolean buyingAlc) {


        if (validID) {
            System.out.println("Valid ID presented");
            /* below our if statement has two expressions that
            evaluate to a condition
             */
            if ((age > 21) && buyingAlc) {
                System.out.println("Customer legal to purchase alcohol");
            } else {
                System.out.println("No alcohol sale to this person");
            }

        }
    }

    //below is our entry point
    // this is our main method which

    public static void main (String[] args) {
        int count = 44;
        if ( count > 20)
        {
            String msg = "Count is large!";
            if ( count > 50)
            {
                msg = msg + "\nCount is VERY large";
            }
            System.out.println(msg);
        }
        System.out.println( "Finished checking count.");


        if ( count > 50 )
        {
            String msg = "Count is VERY large!";
            System.out.println(msg);
        }
        System.out.println("Finished checking count.");

        int x = 30;
        if (x < 20) {
            System.out.println("Print true!");
        }
    }
}
