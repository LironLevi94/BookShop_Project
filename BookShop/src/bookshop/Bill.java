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
public class Bill implements Serializable
{
    public ItemToBill[] ItemsBill;
    public int BillNumber;
    public Customer ClientName;
    public int FinalBillPrice;
    
}
