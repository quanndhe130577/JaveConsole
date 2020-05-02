/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entity.Order;
import Manager.Validation;
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
public class ValidationTest {
    
    public ValidationTest() {
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
    public void testCheckIdExist() {
        ArrayList<Entity.Fruit> lf = new ArrayList<>();
        lf.add(new Entity.Fruit("1", "Apple", 3, 100, "Ha Noi"));
        assertEquals(true, Validation.checkIdExist(lf, "2"));
    }
    
    @Test
    public void testCheckItemExist() {
        ArrayList<Entity.Order> lf = new ArrayList<>();
        lf.add(new Order("1", "Apple", 3, 100));
        assertEquals(true, Validation.checkItemExist(lf, "2"));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
