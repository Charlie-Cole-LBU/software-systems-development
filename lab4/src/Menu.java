public class Menu {

    public void displayMenuOption(int opt) throws InvalidOptionException {

        if (opt >= 1 && opt <= 3) {    // opt stores the option currently being used, this if shows that option smaller or bigger than 3 will result in an error message.

            System.out.println("Menu option " + opt + " selected");

        } else {

            throw new InvalidOptionException(

                    "Invalid menu option: " + opt   // this is the message which get thrown upon an error

            );

        }

    }

}
