package lab8;

import java.util.HashSet;
import java.util.Set;

public class EmailStore {

    Set<String> emailAddresses = new HashSet<String>();

    public boolean addEmail(String Email) {

         if (emailAddresses.contains(Email))
            return false;


        emailAddresses.add(Email);
        return true;

    }

    boolean hasEmail(String email) {

        return emailAddresses.contains(email);

    }

    void displayemails() {
        for(String email : emailAddresses)
            System.out.println(email);
    }






}


