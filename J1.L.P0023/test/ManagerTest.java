/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Manager.Manager;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Entity.Fruit;
import Entity.Order;
/**
 *
 * @author quanh
 */
public class ManagerTest {
    
    public ManagerTest() {
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
    public void testGetByItem() {
        ArrayList<Fruit> lf = new ArrayList<>();
        lf.add(new Entity.Fruit("1", "Apple", 100, 3, "Ha Noi"));
        lf.add(new Entity.Fruit("2", "Lemon", 100, 3, "Ha Noi"));
        lf.add(new Entity.Fruit("3", "Orange", 100, 3, "Ha Noi"));
        Manager m = new Manager();
        Fruit f = m.getFruitByItem(lf, 2);
        assertEquals(f, lf.get(1));
    }
    
    @Test
    public void testUpdateOrder() {
        ArrayList<Order> lo = new ArrayList<>();
        Order o = new Order("1", "Apple", 3, 100);
        lo.add(o);
        Manager.updateOrder(lo, "1", 3);
        assertEquals(lo.get(0).getQuantity(), 6);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
