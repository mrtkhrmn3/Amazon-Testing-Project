
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args) throws InterruptedException {
        tests t = new tests();
        t.normalFlow(); //testcase1
        //t.alternativeFlow1(); //Testcase 5 user selects a filter that doesnt have any product in that range
        //t.AlternateFlow2(); //Testcase3 user enter incorrect pin
    }
}
