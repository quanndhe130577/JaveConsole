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
    public void testgetPath(){
        assertEquals("ki3\\JavaLab\\J1.S.P0062",Main.getPath("E:\\ki3\\JavaLab\\J1.S.P0062\\text.txt"));
    }
    
    @Test
    public void testGetFileName(){
        assertEquals("text",Main.getFileName("E:\\ki3\\JavaLab\\J1.S.P0062\\text.txt"));
    }
    @Test
    public void testgetExtension(){
        assertEquals(".txt",Main.getExtension("E:\\ki3\\JavaLab\\J1.S.P0062\\text.txt"));
    }
    @Test
    public void testGetDisk(){
        assertEquals("E:\\",Main.getDisk("E:\\ki3\\JavaLab\\J1.S.P0062\\text.txt"));
    }
    @Test
    public void testGetFolder(){
        assertEquals("J1.S.P0062",Main.getForder("E:\\ki3\\JavaLab\\J1.S.P0062\\text.txt"));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
