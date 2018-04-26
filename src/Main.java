import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","/Users/kadirkutluhanalev/Desktop/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://ribony.com");
       for(int x=0 ; x<50;x++){
            String urlId = "ibdlhss"+x;
            String email = "ibdlhss"+x+"@gmail.com";
            driver.findElement(By.xpath("//*[@id=\"r_name\"]")).sendKeys("İbadullah Rahman");
            driver.findElement(By.xpath("//*[@id=\"r_username\"]")).sendKeys(urlId);
            driver.findElement(By.xpath("//*[@id=\"r_email\"]")).sendKeys(email);
            driver.findElement(By.xpath("//*[@id=\"r_password\"]")).sendKeys("antalya");
            driver.findElement(By.xpath("/html/body/div[3]/div[3]/button")).click();
            Thread.sleep(5000);
            // driver.findElement(By.xpath("/html/body/div[5]/div/a")).click();
            driver.navigate().to("https://ribony.com/kendinemuhendis");
            for(int i = 0 ; i<50;i++){
                driver.findElement(By.xpath("//*[@id=\"mesajtext\"]")).sendKeys("Rahman "+ i + " " + Keys.ENTER);
                Thread.sleep(1200 );


            }
            driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[5]/a[1]/span")).click();
            driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[5]/a[2]/span")).click();
            driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[5]/a[3]/span")).click();
            driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[5]/a[4]/span")).click();
            driver.navigate().to("https://ribony.com/"+urlId);
            driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a")).click();
            Thread.sleep(3000);

    }
    }
}
