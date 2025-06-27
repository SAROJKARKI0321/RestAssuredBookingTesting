package tests;

import core.TokenManager;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TokenTest {
    @Test
    public  void testGenerateToken(){
        String token= TokenManager.generateToken();

        Assert.assertNotNull(token,"Token cant be null");
        System.out.println("Generated token: "+token);
    }
}
