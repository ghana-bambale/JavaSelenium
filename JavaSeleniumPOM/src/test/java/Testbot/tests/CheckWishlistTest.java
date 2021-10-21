package Testbot.tests;
import Testbot.pages.Home;
import org.testng.annotations.Test;

public class CheckWishlistTest{
    Home objHomePage;
    @Test(priority=1)
    public void viewWishlist()
    {
        objHomePage = new Home();
        objHomePage.hoverUsername();
        objHomePage.openWishlist();
    } 
}