/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testngapptesting;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
/**
 *
 * @author Lucky Pratama
 */
public class TestNGAppTestingNGTest {
    
    TestNGAppTesting app;
    
    @BeforeTest
    public void init(){
        app = new TestNGAppTesting();
    }

    @Test 
    public void addTest(){
        assertEquals(10, app.add(5, 5));
    }
    
    @Test
    public void subTest(){
        assertEquals(5, app.sub(10,5));
    }
    
    @Test
    public void divTest(){
        assertEquals(5, app.div(10, 2));
    }

    @Test
    public void mulTest(){
        assertEquals(10, app.mul(2, 5));
    }
    
}
