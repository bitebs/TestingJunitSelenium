import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver","d:/гк/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        System.out.println(title);
        //driver.close();
    }
}
