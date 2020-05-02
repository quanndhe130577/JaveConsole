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
    public void testbubbleSort() {
        int a[] = {1,3,5,2,4};
        int b[] = {1,2,3,4,5};
        BinarySearh.bubbleSort(a);
        assertArrayEquals(a, b);
    } 
    
    @Test
    public void testBinarySearch() {
        int a[] = {1,2,3,4,5};
        assertEquals(1, BinarySearh.binarySearch(a,2,0,4));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
