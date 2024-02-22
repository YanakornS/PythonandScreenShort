import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class TestGoogleWebsite {

	@Test
	void testSearchByKeyword1() throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\selenium-python\\selenium-python-main\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/Customer/Customer.html");

		
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("canonc");
        ageInput.sendKeys("2");
        
        submitButton.click();
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: johnjohn", result);
        Thread.sleep(2000);
		driver.close();
		
		
	}
	@Test
	void testSearchByKeyword2() throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\selenium-python\\selenium-python-main\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/Customer/Customer.html");

		
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        
        firstNameInput.sendKeys("Johnj");
        lastNameInput.sendKeys("canoncanoncano");
        ageInput.sendKeys("149");
        
        submitButton.click();
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: Johnj", result);
        Thread.sleep(2000);
		driver.close();
		
		
	}
	@Test
	void testSearchByKeyword3() throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\selenium-python\\selenium-python-main\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/Customer/Customer.html");

		
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        
        firstNameInput.sendKeys("johnjo");
        lastNameInput.sendKeys("canoncanoncanon");
        ageInput.sendKeys("150");
        
        submitButton.click();
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: johnjo", result);
        Thread.sleep(2000);
		driver.close();
		
		
	}
	@Test
	void testSearchByKeyword4() throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\selenium-python\\selenium-python-main\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/Customer/Customer.html");

		
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        
        firstNameInput.sendKeys("Johnjohnjohnjo");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("75");
        
        submitButton.click();
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: Johnjohnjohnjo", result);
        Thread.sleep(2000);
		driver.close();
		
		
	}
	@Test
	void testSearchByKeyword5() throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\selenium-python\\selenium-python-main\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/Customer/Customer.html");

		
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        
        firstNameInput.sendKeys("johnjohnjohnjoh");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("75");
        
        submitButton.click();
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: johnjohnjohnjoh", result);
        Thread.sleep(2000);
		driver.close();
		
		
	}
	@Test
	void testSearchByKeyword6() throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\selenium-python\\selenium-python-main\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/Customer/Customer.html");

		
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        
        firstNameInput.sendKeys("John");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("75");
        
        submitButton.click();
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: John", result);
        Thread.sleep(2000);
		driver.close();
		
		
	}
	@Disabled
	void testSearchByKeyword7() throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\selenium-python\\selenium-python-main\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/Customer/Customer.html");

		
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        
        firstNameInput.sendKeys("johnjohnjohnjohn");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("75");
        
        submitButton.click();
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: johnjohnjohnjohn", result);
        Thread.sleep(2000);
		driver.close();
		
		
	}
	@Test
	void testSearchByKeyword8() throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\selenium-python\\selenium-python-main\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/Customer/Customer.html");

		
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("cano");
        ageInput.sendKeys("75");
        
        submitButton.click();
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: johnjohn", result);
        Thread.sleep(2000);
		driver.close();
		
		
	}
	@Disabled
	void testSearchByKeyword9() throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\selenium-python\\selenium-python-main\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/Customer/Customer.html");

		
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("canoncanoncanonc");
        ageInput.sendKeys("75");
        
        submitButton.click();
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: johnjohn", result);
        Thread.sleep(2000);
		driver.close();
        
		
		
	}
	@Test
	void testSearchByKeyword10() throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\selenium-python\\selenium-python-main\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/Customer/Customer.html");

		
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("0");
        
        submitButton.click();
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: johnjohn", result);
        Thread.sleep(2000);
		driver.close();
		
		
	}
	@Test
	void testSearchByKeyword11() throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\selenium-python\\selenium-python-main\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/Customer/Customer.html");

		
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("151");
        
        submitButton.click();
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name: johnjohn", result);
        Thread.sleep(2000);
		driver.close();
		
		
	}

	
}