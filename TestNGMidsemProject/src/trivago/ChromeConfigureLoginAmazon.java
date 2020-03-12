package trivago;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeConfigureLoginAmazon {
	
		WebDriver obj;
			
			@BeforeTest
			void configure(){
				String url="https://www.trivago.in/";
				System.setProperty("webdriver.chrome.driver", "E:\\SEM VI\\Test_Automation\\Softwares\\Drivers\\chromedriver.exe");
				obj=new ChromeDriver();
				obj.manage().window().maximize();
				obj.get(url);
			}
			@Test (priority=0)
			void clickonlogin()
			{
				WebElement element;
				element=obj.findElement(By.xpath("//*[@id=\"js_navigation\"]/div/div[1]/button/span"));
				String name=element.getText();
				Assert.assertTrue(name.contains("Log in"));
				element.click();
			}
			
			@Test (priority=1)
			void signupopt()
			{
				WebElement element,element1,element2,element3;
				element=obj.findElement(By.xpath("//*[@id=\"unified-sign-in\"]/section/div/div/div[1]/div[2]/ul/li[4]/button/span[2]"));
				element.click();
				element1=obj.findElement(By.id("ap_email"));
				element1.sendKeys("singberry31@gmail.com");
				element2=obj.findElement(By.id("ap_password"));
				element2.sendKeys("abcd@1234");
				element3=obj.findElement(By.id("signInSubmit"));
				element3.click();
				
				
			}

		}
