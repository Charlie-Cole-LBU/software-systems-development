public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        int[] options = {1,2,3,4,0,-1};   // options to test

        for (int opt : options) {        // goes through list of options

            try {
                menu.displayMenuOption(opt);       //trys said option
            }

            catch (InvalidOptionException e) {      // catches the potential error and gets the message declared in that class
                System.out.println(e.getMessage());
            }
        }

    }
}
