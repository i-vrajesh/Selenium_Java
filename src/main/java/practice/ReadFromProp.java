package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProp {
    public static void main(String[] args) {
        String filePath = "src/main/resources/config.properties";
        Properties prop = new Properties();
        try{
            FileInputStream fis = new FileInputStream(filePath);
            prop.load(fis);
            String username = prop.getProperty("username");
            String password = prop.getProperty("password");
            System.out.println(username+" - "+password);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
