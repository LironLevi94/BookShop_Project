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
public class AdminUser extends User 
{
    private int permmision;

    public AdminUser(int permmision, String UserName, String Password) {
        super(UserName, Password);
        this.permmision = 1;
    }

    public int getPermmision() {
        return permmision;
    }


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }



 
            
}
