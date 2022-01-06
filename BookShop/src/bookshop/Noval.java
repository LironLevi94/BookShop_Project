/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;

/**
 *
 * @author liron
 */
public class Noval extends Book
{
    private String Category;

    public Noval(String Category, String Title, String Author, int ID, int Price, int Quantity) {
        super(Title, Author, ID, Price, Quantity);
        this.Category = "Noval";
    }

    public String getCategory() {
        return Category;
    }

    
}
