/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

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
public class LoginScriptTest {
    private static String login;
    private static String password;
    
    public LoginScriptTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        login = "a";
        password = "memes";
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
    public void testLogin() {
        
        if (login == null && password == null){
            System.out.println("Testing login");
            
        }
        else{
            testLoginFail();
        }
    }

    @Test
    public void testLoginFail() {
        System.out.println("login fail");
    }
    
}
