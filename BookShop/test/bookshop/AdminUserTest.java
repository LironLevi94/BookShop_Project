/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bookshop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author liron
 */
public class AdminUserTest {
    
    public AdminUserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of LoginAdmin method, of class AdminUser.
     */
    @Test
    public void testLoginAdmin() {
        System.out.println("LoginAdmin");
        AdminUser AdminAcc = new AdminUser("Admin", "Password");
        AdminUser instance = new AdminUser("Admin", "Password");
        boolean expResult = true;
        boolean result = instance.LoginAdmin(AdminAcc);
        System.out.println(result);
        System.out.println(expResult);
        /*if(result != expResult)
        {
            fail("The results are not equal.");
        }*/
            
        assertEquals("should be true" ,expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addNewSellerAcc method, of class AdminUser.
     */
    /*@Test
    public void testAddNewSellerAcc() {
        System.out.println("addNewSellerAcc");
        SellerUser Seller = null;
        AdminUser instance = null;
        boolean expResult = false;
        boolean result = instance.addNewSellerAcc(Seller);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of DeleteSellerAcc method, of class AdminUser.
     */
    /*@Test
    public void testDeleteSellerAcc() {
        System.out.println("DeleteSellerAcc");
        SellerUser Seller = null;
        AdminUser instance = null;
        boolean expResult = false;
        boolean result = instance.DeleteSellerAcc(Seller);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of EditSellerAcc method, of class AdminUser.
     */
    /*@Test
    public void testEditSellerAcc() {
        System.out.println("EditSellerAcc");
        SellerUser Seller = null;
        AdminUser instance = null;
        boolean expResult = false;
        boolean result = instance.EditSellerAcc(Seller);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of AddBook method, of class AdminUser.
     */
    /*@Test
    public void testAddBook() {
        System.out.println("AddBook");
        Book newBook = null;
        AdminUser instance = null;
        boolean expResult = false;
        boolean result = instance.AddBook(newBook);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of DeleteBook method, of class AdminUser.
     */
    /*@Test
    public void testDeleteBook() {
        System.out.println("DeleteBook");
        Book newBook = null;
        AdminUser instance = null;
        boolean expResult = false;
        boolean result = instance.DeleteBook(newBook);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of EditBook method, of class AdminUser.
     */
    /*@Test
    public void testEditBook() {
        System.out.println("EditBook");
        Book newBook = null;
        AdminUser instance = null;
        boolean expResult = false;
        boolean result = instance.EditBook(newBook);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
