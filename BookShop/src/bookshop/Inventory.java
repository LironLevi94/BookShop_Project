/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;

import com.sun.jdi.connect.spi.Connection;
import java.awt.print.Book;
import java.io.*;
import java.sql.PreparedStatement;

/**
 *
 * @author liron
 */
public class Inventory implements Serializable
{
    public static Book[] BooksInventory = new Book[150];
    public static int countNumOfBooks = 0;
    
    
    public void AddToInventory(PreparedStatement add/*, Book newBook*/) //AddBook
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
    
    private void DeleteFromInventory(Book newBook, String Query, Connection Con) //DeleteBook
    {
        
    }
        
    private void UpdateInventory(Book newBook, String Query, Connection Con) //EditBook
    {
        
    }   
}
