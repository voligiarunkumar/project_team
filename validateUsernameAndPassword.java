package inventory_management;

import java.util.Scanner;
import java.util.regex.*;
    // Java program to validate a username
// using Regular Expression or ReGex
@SuppressWarnings("unused")
class validateUsernameAndPassword {

        // Function to validate the username
        public static boolean isValidUsername(String username)
        {

            // Regex to check valid username.
            String regex = "^[A-Za-z]\\w{5,29}$";

            // Compile the ReGex
            Pattern p = Pattern.compile(regex);

            // If the username is empty
            // return false
            if (username == null) {
                return false;
            }
            // Matcher is used to match username
            Matcher m = p.matcher(username);


            return m.matches();
        }
        public static boolean
        isValidPassword(String creat_password)
        {

            // Regex to check valid password.
            String regex = "(?=.*[a-z])(?=.*[A-Z])"+"^(?=.*[0-9])"
                    +"(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";

            // Compile the ReGex
            Pattern p = Pattern.compile(regex);

            // If the password is empty
            // return false
            if (creat_password == null) {
                return false;
            }

            // Pattern class contains matcher() method
            // to find matching between given password
            // and regular expression.
            Matcher m = p.matcher(creat_password);

            // Return if the password
            // matched the ReGex
            return m.matches();
        }
}
        

