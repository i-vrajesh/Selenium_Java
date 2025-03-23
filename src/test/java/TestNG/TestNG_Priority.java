package TestNG;
import org.testng.annotations.*;

public class TestNG_Priority {

    @Test(priority=1)
    public void signUp(){
        System.out.println("signUp");
    }
    @Test(priority=2)
    public void searcg(){
        System.out.println("searcg");
    }
    @Test(priority=3)
    public void addToCart(){
        System.out.println("addToCart");
    }
    @Test(priority=4)
    public void purchase(){
        System.out.println("purchase");
    }
    @Test(priority=5)
    public void signOut(){
        System.out.println("signOut");
    }

}
