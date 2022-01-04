/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;
import java.io.*;
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
        //this.permmision = 1;
    }

    /*public int getPermmision() {
        return permmision;
    }*/


    public String getUserName() {
        return UserName;
    }


    public String getPassword() {
        return Password;
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





 
            
}
