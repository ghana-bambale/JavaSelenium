package Testbot.tests;
import org.testng.annotations.Test;
import Testbot.pages.Login;
public class LoginTest{
    Login flipkartSignIn;
    
    @Test(priority=0)
    public void credentialsTest(){
        flipkartSignIn = new Login();
        flipkartSignIn.fillUsername("RealUserName");
        flipkartSignIn.fillPassword("RealUserPassword");
        flipkartSignIn.clickLogin();
    } 
}