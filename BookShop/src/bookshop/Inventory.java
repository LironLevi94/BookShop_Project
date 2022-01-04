/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;
import java.io.*;

import com.sun.jdi.connect.spi.Connection;
import java.io.*;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author liron
 */
public class Inventory implements Serializable
{
    public static Book[] BooksInventory = new Book[150];
    public static int countNumOfBooks = 0;
    
    
    public void AddToInventory(PreparedStatement add/*, Book newBook*/) //AddBook//**fix array needed**
    {
        //BooksInventory[countNumOfBooks++] = newBook;
        try
        {
            int row = add.executeUpdate();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public void DeleteOrUpdateFromInventory(/*Book newBook, */String Query, Statement Delete) //DeleteBook
    {        
        try
        {
            Delete.executeUpdate(Query);
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
        
}
