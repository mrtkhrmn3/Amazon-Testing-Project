import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;

import java.util.List;

public class tests {
    public  void normalFlow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\psk\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com.tr/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.tr%2F%3F%26tag%3Dtrtxtgoabkde-21%26ref%3Dnav_signin%26adgrpid%3D119366379979%26hvpone%3D%26hvptwo%3D%26hvadid%3D542862704348%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D6776212172183918876%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1012783%26hvtargid%3Dkwd-10573980%26hydadcr%3D12932_2246093%26language%3Dtr_TR&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=trflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

        driver.manage().window().maximize();

        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("testing.se2226project@gmail.com");

        Thread.sleep(2000);
        WebElement login = driver.findElement(By.xpath("//input[@id='continue']"));
        login.click();

        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
        password.sendKeys("232014PMH");

        Thread.sleep(2000);
        WebElement finallogin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
        finallogin.click();


        Thread.sleep(2000);
        WebElement tumu = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
        tumu.click();

        Thread.sleep(2000);
        WebElement comp = driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[1]/li[10]/a"));
        comp.click();

        Thread.sleep(2000);
        WebElement laptop = driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[5]/li[3]/a"));
        laptop.click();

        Thread.sleep(2000);
        WebElement systemFilter = driver.findElement(By.xpath("//*[@id='s-refinements']/div[4]/ul/li[1]/span/a/div/label/i"));
        systemFilter.click();

        Thread.sleep(2000);
        WebElement lowPrice = driver.findElement(By.id("low-price"));
        lowPrice.sendKeys("10000");

        Thread.sleep(2000);
        WebElement topPrice = driver.findElement(By.id("high-price"));
        topPrice.sendKeys("32000");

        Thread.sleep(2000);
        WebElement git = driver.findElement(By.xpath("//input[@class='a-button-input']"));
        git.click();

        Thread.sleep(2000);
        WebElement order = driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
        order.click();

        Thread.sleep(2000);
        WebElement selectorder = driver.findElement(By.cssSelector("a[id='s-result-sort-select_1']"));
        selectorder.click();

        Thread.sleep(2000);
        WebElement select_comp = driver.findElement(By.xpath(" //span[@class='a-size-base-plus a-color-base a-text-normal']"));
        select_comp.click();

        Actions action = new Actions(driver);

        List<WebElement> photoitems = driver.findElements(By.xpath("//*[@id=\"altImages\"]/ul//li"));

        //loop is for the pictures
        for (int i = 4; i <8 ; i++) {
            action.moveToElement(photoitems.get(i)).perform();
            Thread.sleep(500);
        }

        Thread.sleep(2000);
        WebElement cart = driver.findElement(By.xpath("//*[@id='submit.add-to-cart']"));
        cart.click();
        String ExpectedTitle="Sepete Eklendi";
        String ActualTitle=driver.findElement(By.xpath("//*[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']/span")).getText();

        Assert.assertEquals(ExpectedTitle,ActualTitle);
        System.out.println("title:" + ActualTitle);

        Thread.sleep(2000);
        WebElement goToCart = driver.findElement(By.xpath("//*[@id='sw-gtc']/span/a"));
        goToCart.click();

        Thread.sleep(2000);
        WebElement delete = driver.findElement(By.xpath("//input[@value='Sil']"));
        delete.click();
        String ExpectedTitle2="Alışveriş Sepeti";
        String ActualTitle2=driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div/h1")).getText();

        Assert.assertEquals(ExpectedTitle2,ActualTitle2);
        System.out.println("title:" + ActualTitle2);

    }

    public void alternativeFlow1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\psk\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com.tr/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.tr%2F%3F%26tag%3Dtrtxtgoabkde-21%26ref%3Dnav_signin%26adgrpid%3D119366379979%26hvpone%3D%26hvptwo%3D%26hvadid%3D542862704348%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D6776212172183918876%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1012783%26hvtargid%3Dkwd-10573980%26hydadcr%3D12932_2246093%26language%3Dtr_TR&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=trflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

        driver.manage().window().maximize();

        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("testing.se2226project@gmail.com");

        Thread.sleep(2000);
        WebElement login = driver.findElement(By.xpath("//input[@id='continue']"));
        login.click();

        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
        password.sendKeys("232014PMH");

        Thread.sleep(2000);
        WebElement finallogin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
        finallogin.click();


        Thread.sleep(2000);
        WebElement tumu = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
        tumu.click();

        Thread.sleep(2000);
        WebElement comp = driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[1]/li[10]/a"));
        comp.click();

        Thread.sleep(2000);
        WebElement laptop = driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[5]/li[3]/a"));
        laptop.click();

        Thread.sleep(2000);
        WebElement systemFilter = driver.findElement(By.xpath("//*[@id='s-refinements']/div[4]/ul/li[1]/span/a/div/label/i"));
        systemFilter.click();

        Thread.sleep(2000);
        WebElement lowPrice = driver.findElement(By.id("low-price"));
        lowPrice.sendKeys("100");

        Thread.sleep(2000);
        WebElement topPrice = driver.findElement(By.id("high-price"));
        topPrice.sendKeys("1000");

        Thread.sleep(1000);
        WebElement git = driver.findElement(By.xpath("//input[@class='a-button-input']"));
        git.click();

        Thread.sleep(1000);
        WebElement homepage = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
        homepage.click();

    }

    public void AlternateFlow2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\psk\\Documents\\Selenium\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com.tr/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.tr%2F%3F%26tag%3Dtrtxtgoabkde-21%26ref%3Dnav_signin%26adgrpid%3D119366379979%26hvpone%3D%26hvptwo%3D%26hvadid%3D542862704348%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D6776212172183918876%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1012783%26hvtargid%3Dkwd-10573980%26hydadcr%3D12932_2246093%26language%3Dtr_TR&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=trflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

        driver.manage().window().maximize();

        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("testing.se2226project@gmail.com");

        Thread.sleep(2000);
        WebElement login = driver.findElement(By.xpath("//input[@id='continue']"));
        login.click();

        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
        password.sendKeys("wrongpassword");

        Thread.sleep(2000);
        WebElement finallogin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
        finallogin.click();

        Thread.sleep(2000);
        WebElement password2 = driver.findElement(By.xpath("//input[@id='ap_password']"));
        password2.sendKeys("232014PMH");

        Thread.sleep(2000);
        WebElement finallogin2 = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
        finallogin2.click();

        Thread.sleep(2000);
        WebElement tumu = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
        tumu.click();

        Thread.sleep(2000);
        WebElement comp = driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[1]/li[10]/a"));
        comp.click();

        Thread.sleep(2000);
        WebElement laptop = driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[5]/li[3]/a"));
        laptop.click();

        Thread.sleep(2000);
        WebElement systemFilter = driver.findElement(By.xpath("//*[@id='s-refinements']/div[4]/ul/li[1]/span/a/div/label/i"));
        systemFilter.click();

        Thread.sleep(2000);
        WebElement lowPrice = driver.findElement(By.id("low-price"));
        lowPrice.sendKeys("10000");

        Thread.sleep(2000);
        WebElement topPrice = driver.findElement(By.id("high-price"));
        topPrice.sendKeys("32000");

        Thread.sleep(1000);
        WebElement git = driver.findElement(By.xpath("//input[@class='a-button-input']"));
        git.click();

        Thread.sleep(1000);
        WebElement order = driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
        order.click();

        Thread.sleep(1000);
        WebElement selectorder = driver.findElement(By.cssSelector("a[id='s-result-sort-select_1']"));
        selectorder.click();

        /*Thread.sleep(1000);
        WebElement secondPage = driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[26]/div/div/span/a[1]"));
        secondPage.click();*/

        Thread.sleep(1000);
        WebElement select_comp = driver.findElement(By.xpath(" //span[@class='a-size-base-plus a-color-base a-text-normal']"));
        select_comp.click();

        Actions action = new Actions(driver);

        List<WebElement> photoitems = driver.findElements(By.xpath("//*[@id=\"altImages\"]/ul//li"));

        for (int i = 4; i <8 ; i++) {
            action.moveToElement(photoitems.get(i)).perform();
            Thread.sleep(500);
        }

        Thread.sleep(1000);
        WebElement cart = driver.findElement(By.xpath("//*[@id='submit.add-to-cart']"));
        cart.click();

        Thread.sleep(1000);
        WebElement goToCart = driver.findElement(By.xpath("//*[@id='sw-gtc']/span/a"));
        goToCart.click();

        Thread.sleep(1000);
        WebElement delete = driver.findElement(By.xpath("//input[@value='Sil']"));
        delete.click();


    }


}
