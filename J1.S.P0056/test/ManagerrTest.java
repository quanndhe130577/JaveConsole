/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entity.Worker;
import Manager.Manager;
import java.util.ArrayList;
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
public class ManagerrTest {
    
    public ManagerrTest() {
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
    public void testGetWorkerByCode(){
        ArrayList<Worker> ls = new ArrayList();
        ls.add(new Worker("12", "quan", 17, 19, "Ha Noi"));
        
        assertEquals("quan", Manager.getWorkerByCode(ls,"12").getName());
    }

    @Test
    public void testGetCureenDate() {
        assertEquals("03/03/2020", Manager.getCurrentDate());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
