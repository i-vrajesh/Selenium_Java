package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DataProvider_Test {

    @Test(dataProvider = "data")
    public void login(String userName, String password){
        System.out.println(userName);
        System.out.println(password);
    }
    @DataProvider()
    public Object[][] data(){
        Object[][] data = new Object[2][2];
        data[0][0] = "Admin";
        data[0][1] = "admin123";
        data[1][0] = "Admin";
        data[1][1] = "test123";
        data[2][0] = "Admin";
        data[2][1] = "trail123";
        return data;
    }

    @Test(dataProvider = "data1")
    public void iterator(Object[] s){
        System.out.println(s[0] +" - "+s[1]);
    }

    @DataProvider(indices = {0,2})
    public Iterator<Object[]> data1(){
        Set<Object[]> data = new HashSet<>();
        data.add(new Object[]{"John",123});
        data.add(new Object[]{"Mark",456});
        data.add(new Object[]{"Jack",456});
        data.add(new Object[]{"Harry",456});
        data.add(new Object[]{"Will",456});
        return data.iterator();
    }
}
