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
public class StackTest {
    
    public StackTest() {
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

    public void testIsEmpty(Stack s) {
        System.out.println("isEmpty");
        assertEquals(true, s.isEmpty());
        s.push(1);
        assertEquals(false, s.isEmpty());
        s.pop();
        assertEquals(true, s.isEmpty());
    }

    public void testPush(Stack s) {
        System.out.println("push");
        s.push(1);
        assertEquals(1, s.peek());
        s.push(2);
        assertEquals(2, s.peek());
        s.pop();
        assertEquals(1, s.peek());
        s.pop();
    }
    
    public void testPushFullStack(Stack s) {
        System.out.println("push");
        try {
            for(int i=0; i < 11; i++) {
                s.push(i);
                if (i==10)
                    fail("FullStack Exception must be raised");
            }
        } catch(RuntimeException e) {
            assertEquals(true, true);
        }
    }

    public void testPop(Stack s) {
        System.out.println("pop");
        assertEquals(null, s.pop());
        for(int i = 1; i <= 10; i++)
            s.push(i);
        for(int i = 10; i >= 1; i--)
            assertEquals(i, s.pop());
    }

    public void testPeek(Stack s) {
        System.out.println("peek");
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
    
    @Test
    public void testLimitedStack() {
        testIsEmpty(new LimitedStack(10));
        testPush(new LimitedStack(10));
        testPushFullStack(new LimitedStack(10));
        testPop(new LimitedStack(10));
        testPeek(new LimitedStack(10));
    }
    
    @Test
    public void testIlimitedStack() {
        testIsEmpty(new IlimitedStack());
        testPush(new IlimitedStack());
        testPop(new IlimitedStack());
        testPeek(new IlimitedStack());
    }
}
