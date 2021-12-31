/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;
import java.io.*;
/**
 *
 * @author liron
 */
public class SellerUser extends User
{
    private ManageSellerAccount Seller;

    public SellerUser(ManageSellerAccount Seller, String UserName, String Password) { //constractor
        super(UserName, Password);
        this.Seller = Seller;
    }

    public ManageSellerAccount getSeller() {
        return Seller;
    }


    public String getUserName() {
        return UserName;
    }


    public String getPassword() {
        return Password;
    }
    
    
}
