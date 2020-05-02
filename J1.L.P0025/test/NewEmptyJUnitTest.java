/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author quanh
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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

    @Test
    public void testformatOneSpace() {
        String a = "chau len ba chau di mau giao";
        assertEquals(a, Manager.formatOneSpaceSpecial("chau\nlen\nba\nchau\ndi\nmau\ngiao", "a"));
    }
    
    @Test
    public void testformatSpecialCharacters() {
        String a = "chau.le,b:chau di mau giao";
        assertEquals(a, Manager.formatSpecialCharacters("chau .len,ba:chau di mau giao"));
    }
    
    @Test
    public void testAfterDotUpperCase(){
        String a = "chau. Len ba chua. Di mau giao";
        assertEquals(a, Manager.afterDotUpperCase("chau. len ba chua. di mau giao"));
    }
    
    @Test 
    public void testNoSpaceQuotes(){
        String a = "chau \" len ba chau \" di mau giao";
        assertEquals(a, Manager.noSpaceQuotes("chau \"  len ba chau  \" di mau giao"));
    }
    
    @Test 
    public void testFirstUpperCase(){
        String a = "U len ba chau di mau giao";
        assertEquals(a, Manager.firstUpercase("chau len ba chau di mau giao"));
    }
    
    @Test 
    public void testLastAddDot(){
        String a = "chau len ba chau di mau giao.";
        assertEquals(a, Manager.lastAddDot("chau len ba chau di mau giao"));
    }
    
    @Test 
    public void testisLineEmpty(){
        assertEquals(true, Manager.isLineEmpty(""));
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
