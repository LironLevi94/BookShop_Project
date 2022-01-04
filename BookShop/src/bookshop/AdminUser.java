/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;
import java.io.*;
import java.sql.Connection;
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
public class AdminUser extends User
{
    //private int permmision;

    public AdminUser(String UserName, String Password) { //constructor
        super(UserName, Password);
    }

    
    public boolean LoginAdmin(AdminUser AdminAcc) //Login As Admin Accout
    {
        if(AdminAcc.getUserName().equals("Admin") && AdminAcc.getPassword().equals("Password")) //Admin accoount
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    
    
    public boolean addNewSellerAcc(SellerUser Seller) // Add Seller
    {
        Connection Con = null; //DB 
        /*Seller.getUserName();
        Seller.getPassword();
        Seller.getSeller().getID();
        Seller.getSeller().getPhone();
        Seller.getSeller().getAddress();*/

        try
        {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopOb", "User1", "12345"); // connect to the DB
            PreparedStatement add = Con.prepareStatement("insert into UserTbl values(?,?,?,?,?)");
            add.setInt(1, Seller.getSeller().getID()); // add ID
            add.setString(2, Seller.getUserName()); // add Name
            add.setString(3, Seller.getSeller().getPhone()); // add Phone
            add.setString(4, Seller.getSeller().getAddress()); // add Address
            add.setString(5, Seller.getPassword()); // add Password
            int row = add.executeUpdate();  
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        return true;

    }


    


 
            
}
