/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gab12
 */

interface AnInterface{}

public class MyClassTest {
    
    public MyClassTest() {
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
     * Test of charAt method, of class MyClass.
     */
    @Test
    public void testCharAt() {
        System.out.println("charAt");
        int i = 0;
        MyClass instance = null;
        char expResult = ' ';
        char result = instance.charAt(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of length method, of class MyClass.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        MyClass instance = null;
        int expResult = 0;
        int result = instance.length();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subSequence method, of class MyClass.
     */
    @Test
    public void testSubSequence() {
        System.out.println("subSequence");
        int start = 0;
        int end = 0;
        MyClass instance = null;
        CharSequence expResult = null;
        CharSequence result = instance.subSequence(start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MyClass.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MyClass instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MyClass.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MyClass.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
