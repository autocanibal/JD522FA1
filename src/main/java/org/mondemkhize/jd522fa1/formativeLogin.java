package org.mondemkhize.jd522fa1;

import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class formativeLogin {
    //Hard-coded accounts
    private final static String studentName1 = "John Cena";
    private final static String uName1 = "jjcena#";
    private final static String pWord1 = "IamnotJohnCena23477!";
    private final static String studentName2 = "Peter Parker";
    private final static String uName2 = "spider#";
    private final static String pWord2 = "IamnotSp1der-Man!";

    private static boolean correctUserName(String username) {
        // Regex to check valid username.
        String regex = "^(?=.*#)"
                       + "(?=\\S+$).{1,8}$";
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        // If the username is empty,
        // return false
        if (username == null) {
            return false;
        }
        // Pattern class contains matcher() method
        // to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(username);
        // Return if the username
        // matched the ReGex
        return m.matches();
    }
    private static boolean meetPasswordComplexity(String password) {
         // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[~`!@#$%^&*()-_+=])"
                       + "(?=\\S+$).{8,}$";
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        // If the password is empty,
        // return false
        if (password == null) {
            return false;
        }
        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);
        // Return if the password
        // matched the ReGex
        return m.matches();
    }
    public static void regUser(Window component, String username, String password){
        if(correctUserName(username) && meetPasswordComplexity(password)){
         JOptionPane.showMessageDialog(
                 component,
                 "Username Accepted, Proceed\n " +
                 "Password Accepted",
                 "Everything all good",
                 JOptionPane.INFORMATION_MESSAGE);
         LoginForm loginForm = new LoginForm();
         loginForm.setVisible(true);
         component.dispose();
        }
        else if(!correctUserName(username)) {
            JOptionPane.showMessageDialog(
                    component,
                    "Username does not meet the criteria, please ensure that " +
                            "your username contains an pound sign and is no more than 8 " +
                            "characters in length .",
                    "Username bad",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
        else if(!meetPasswordComplexity(password)) {
            JOptionPane.showMessageDialog(
                    component,
                    "Password not Accepted, please check that you have met all the criteria required",
                    "Password bad",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
    public static void login(Window component,String username, String password){
        if(username.equals(uName1) && password.equals(pWord1)){
            returnLogin(component, "uname1");
        }
        else if(username.equals(uName2) && password.equals(pWord2)){
            returnLogin(component,"uname2");
        }
        else {
            returnLogin(component,"none");
        }
    }
    public static void returnLogin(Window component, String sender) {
        if (sender.equals("uname1")){
            JOptionPane.showMessageDialog(component, "Congratulations "+ studentName1 +", You have made it to the second year. Wishing you all the best");
        }
        else if (sender.equals("uname2")) {
            JOptionPane.showMessageDialog(component, "Congratulations "+ studentName2 +", You have made it to the second year. Wishing you all the best");
        }
        else {
            JOptionPane.showMessageDialog(component, "Incorrect credentials have been supplied, try again");
        }
    }
}
