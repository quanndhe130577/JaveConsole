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
public class TestManager {
    
    public TestManager() {
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
    public void testHexaToDeci(){
        assertEquals(74667, Manager.convertHexaToDecimal("123AB"));
    }
    
    @Test 
    public void testHexaToBina(){
        assertEquals("1010", Manager.convertHexaToBinary("A"));
    }
    
    @Test 
    public void testDeciToBina(){
        assertEquals("1100", Manager.convertDecimalToBinary("12"));
    }
    
    @Test 
    public void testDeciToHexa(){
        assertEquals("C", Manager.convertDecimalToHexa("12"));
    }
    
    @Test 
    public void testBinaToDeci(){
        assertEquals("10", Manager.convertBinaryToDecimal("1010"));
    }
    
    @Test 
    public void testBinaToHexa(){
        assertEquals("A", Manager.convertBinaryToHexa("1010"));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
