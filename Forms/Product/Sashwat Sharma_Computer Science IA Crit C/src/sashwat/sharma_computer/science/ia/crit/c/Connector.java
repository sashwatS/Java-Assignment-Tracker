/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sashwat.sharma_computer.science.ia.crit.c;

/**
 *
 * @author USER
 */
import java.sql.*;
import javax.swing.*;

public class Connector {
    Connection conn;
    
    public static Connection connectDB(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Computer Science IA.db");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
