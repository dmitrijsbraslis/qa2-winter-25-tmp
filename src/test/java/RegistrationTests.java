import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RegistrationTests {
    @Test
    public void passwordInconsistencyTest() {
        //Open Browser window
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();

        //Open Home Page
        browser.get("http://1a.lv");

        //Accept cookies
        //Press Registration btn
        //Click Registration link
        //Enter First Name
        //Enter Last Name
        //Enter E-mail
        //Enter Password
        //Enter Password again with mistake
        //Select marketing check-box
        //Select news check-box
        //Press Registration button
        //Check wrong password error message
    }
}
