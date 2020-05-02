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
public class testSort {
    
    public testSort() {
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
    public void testAsc(){
        int expected[] = {1,2,3,4,5};
        int a[] = {1,3,5,4,2};
        Main.sortArrayAscending(a);
        assertArrayEquals(expected, a);
    }
    
    @Test
    public void testDesc(){
        int expected[] = {5,4,3,2,1};
        int a[] = {1,3,5,4,2};
        Main.sortArrayDescending(a);
        assertArrayEquals(expected, a);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
