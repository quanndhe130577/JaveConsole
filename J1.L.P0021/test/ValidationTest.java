/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entity.Report;
import Entity.Student;
import Manager.Validation;
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
    public void testCheckStudentExist(){
        ArrayList<Entity.Student> ls = new ArrayList();
        ls.add(new Student("1", "Quan", "Spring", "java"));
        assertEquals(false, Validation.checkStudentExist(ls, "1", "quan", "spring", "java"));
    }
    @Test
    public void testCheckReportExist(){
        ArrayList<Entity.Report> ls = new ArrayList();
        ls.add(new Report("quan", "java", 1));
        assertEquals(true, Validation.checkReportExist(ls, "1", "java", 2));
    }
    @Test
    public void testCheckIdExist(){
        ArrayList<Entity.Student> ls = new ArrayList();
        ls.add(new Student("1", "Quan", "Spring", "java"));
        assertEquals(true, Validation.checkIdExist(ls, "1", "quan"));
    }
    
    @Test
    public void testCheckChangeInformation(){
        Student s = new Student("1", "quan", "spring", "java");
        assertEquals(false, Validation.checkChangeInfomation(s, "1", "quan", "spring", "java"));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
