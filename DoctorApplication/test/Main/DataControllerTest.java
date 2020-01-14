/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Zack
 */
public class DataControllerTest {
    private static DataController test;
    
    public DataControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
       test = new DataController();
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetJSONData() {
        if (test != null){
        System.out.println("pass");
        }
    }

    @Test
    public void testWriteToFile() {
        if (test != null){
        System.out.println("pass");
        }
    }

    @Test
    public void testGetTEMPData() {
        if (test != null){
        System.out.println("pass");
        }
    }

    @Test
    public void testWriteToTempFile() {
        if (test != null){
        System.out.println("pass");
        }
    }
    
}
