/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entity.Doctor;
import Manager.Manager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
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
    public void testGetDoctorByCode(){
        ArrayList<Doctor> ld = new ArrayList();
        ld.add(new Doctor("123", "Quan", "Doctor", 1));
        assertEquals("Quan", Manager.getDoctorByCode(ld,"123").getName());
    }
    
    @Test
    public void testListFoundByName(){
        ArrayList<Doctor> ld = new ArrayList();
        ld.add(new Doctor("123", "Quan", "Doctor", 1));
        ld.add(new Doctor("234", "Ha", "Doctor", 1));
        ld.add(new Doctor("345", "Duc", "Doctor", 1));
        ArrayList<Doctor> rs = Manager.listFoundByName(ld, "a");
        assertEquals(2, rs.size());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
