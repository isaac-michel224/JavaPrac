public class SwitchStatements {

    public static void printShirtSize(char shirt){
        String msg = "";
        switch (shirt) {
            case 's':
                msg = "shirt size is small";
                break;
            case 'm':
                msg = "shirt is medium";
                break;
            case 'L':
            case 'l':
                msg = "shirt is large";
                break;
            case 'x':
                msg = "shirt is extra large";
                break;
            default:
                msg = "shirt size unknown";
                break;
        }
        System.out.println(msg);
        // SwitchExample.printShirtSize('S');
        }

        public static void enhancedSwitch(char myCharacter) {

        switch (myCharacter) {
            case 'a' -> System.out.println( "Case a was evaluated successfully");
            case 'b' -> System.out.println( "Case b was evaluated successfully");
            default -> System.out.println( "Did not understand input");
        }
        }

    }

