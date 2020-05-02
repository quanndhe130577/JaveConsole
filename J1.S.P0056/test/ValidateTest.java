/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entity.Worker;
import Manager.Validate;
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
public class ValidateTest {
    
    public ValidateTest() {
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
    public void testCheckIdExit() {
        ArrayList<Worker> ls = new ArrayList();
        ls.add(new Worker("12", "quan", 17, 19, "Ha Noi"));
        ls.add(new Worker("23", "quan1", 17, 19, "Ha Noi"));
        ls.add(new Worker("34", "quan2", 17, 19, "Ha Noi"));
        
        assertEquals(true, Validate.checkIdExist(ls, "23"));
    }
    
    @Test
    public void testCheckWorkerExist() {
        ArrayList<Worker> ls = new ArrayList();
        ls.add(new Worker("12", "quan", 17, 19, "Ha Noi"));
        ls.add(new Worker("23", "quan1", 17, 19, "Ha Noi"));
        ls.add(new Worker("34", "quan2", 17, 19, "Ha Noi"));
        
        assertEquals(true, Validate.checkWorkerExist(ls, "23", "quan", 19, 1000, "Hai Duong"));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
