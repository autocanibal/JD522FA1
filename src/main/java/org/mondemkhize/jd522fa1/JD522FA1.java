/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mondemkhize.jd522fa1;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Monde
 */
public class JD522FA1 {
    public static void main(String[] args) {
        RegisterForm registerForm = new RegisterForm();
        registerForm.setVisible(true);
    }
    public static void errorBoxes(Component comp, String errorMessage, String errorTitle){
        JOptionPane.showMessageDialog(comp, errorMessage, errorTitle, JOptionPane.INFORMATION_MESSAGE);
    }
}
