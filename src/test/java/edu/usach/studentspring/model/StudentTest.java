/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usach.studentspring.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ArthurPeña
 */
public class StudentTest {
    
    public StudentTest() {
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

    /**
     * Test of setRut method, of class Student.
     */
    @Test
    public void testSetRut() {
        System.out.println("setRut");
        int rut = 180915046;
        Student instance = new Student();
        instance.setRut(rut);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRut method, of class Student.
     */
    @Test
    public void testGetRut() {
        System.out.println("getRut");
        Student instance = new Student();
        instance.setRut(180915046);
        int expResult = 180915046;
        int result = instance.getRut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "David Aguilar";
        Student instance = new Student();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        instance.setName("David Aguilar");
        String expResult = "David Aguilar";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setMail method, of class Student.
     */
    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "david.aguilar@usach.cl";
        Student instance = new Student();
        instance.setMail(mail);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getMail method, of class Student.
     */
    @Test
    public void testGetMail() {
        System.out.println("getMail");
        Student instance = new Student();
        instance.setMail("david.aguilar@usach.cl");
        String expResult = "david.aguilar@usach.cl";
        String result = instance.getMail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setProgram method, of class Student.
     */
    @Test
    public void testSetProgram() {
        System.out.println("setProgram");
        String program = "Ing. Ejec. Computación e Informática";
        Student instance = new Student();
        instance.setProgram(program);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getProgram method, of class Student.
     */
    @Test
    public void testGetProgram() {
        System.out.println("getProgram");
        Student instance = new Student();
        instance.setProgram("Ing. Ejec. Computación e Informática");
        String expResult = "Ing. Ejec. Computación e Informática";
        String result = instance.getProgram();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of setYear method, of class Student.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 2014;
        Student instance = new Student();
        instance.setYear(year);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getYear method, of class Student.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Student instance = new Student();
        instance.setYear(2014);
        int expResult = 2014;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
