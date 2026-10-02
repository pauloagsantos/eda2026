/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ficha2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IPT
 */
public class IlimitedStackTest {
    
    public IlimitedStackTest() {
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
     * Test of isEmpty method, of class LimitedStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        IlimitedStack s = new IlimitedStack();
        assertEquals(true, s.isEmpty());
        s.push(1);
        assertEquals(false, s.isEmpty());
        s.pop();
        assertEquals(true, s.isEmpty());
    }

    /**
     * Test of push method, of class LimitedStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        IlimitedStack s = new IlimitedStack();
        s.push(1);
        assertEquals(1, s.peek());
        s.push(2);
        assertEquals(2, s.peek());
        s.pop();
        assertEquals(1, s.peek());
        s.pop();
        for(int i=0; i < 11; i++) {
            s.push(i);
        }
    }

    /**
     * Test of pop method, of class LimitedStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        IlimitedStack s = new IlimitedStack();
        assertEquals(null, s.pop());
        for(int i = 1; i <= 10; i++)
            s.push(i);
        for(int i = 10; i >= 1; i--)
            assertEquals(i, s.pop());
    }

    /**
     * Test of peek method, of class LimitedStack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        IlimitedStack s = new IlimitedStack();
        assertEquals(null, s.peek());
        for(int i = 1; i <= 10; i++) {
            s.push(i);
            assertEquals(i, s.peek());
        }
        for(int i = 10; i >= 1; i--) {
            s.pop();
            if (s.isEmpty())
                assertEquals(null, s.peek());
            else
                assertEquals(i-1, s.peek());
        }
           
        
    } 
}
