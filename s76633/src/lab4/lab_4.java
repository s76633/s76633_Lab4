/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;
import javax.swing.JOptionPane;
public class lab_4 {
    public static void main(String[] args) {
     JOptionPane.showMessageDialog(null, "Hello, welcome to JOptionPane!");

        // Ask the user for their name using an input dialog
        String name = JOptionPane.showInputDialog("What is your name?");

        // Display a customized message based on user input
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    }
}
