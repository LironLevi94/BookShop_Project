/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;

/**
 *
 * @author liron
 */
public class Magazine extends Book
{
    private String Category;

    public Magazine(String Category, String Title, String Author, int ID, int Price, int Quantity) {
        super(Title, Author, ID, Price, Quantity);
        this.Category = "Magazine";
    }

    public String getCategory() {
        return Category;
    }

    
}
