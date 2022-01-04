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
public class ManageSellerAccount implements Serializable
{
    private int ID;
    private String Phone;
    private String Address;

    public ManageSellerAccount(int ID, String Phone, String Address) {
        this.ID = ID;
        this.Phone = Phone;
        this.Address = Address;
    }
    
    
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }



    
    
}
