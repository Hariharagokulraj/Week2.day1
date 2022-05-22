package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Dexra Solutions");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Harihara");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gokulraj");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("employee");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Want to join");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hari@gmail.com");
		 WebElement ele = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select down = new Select(ele);
		 down.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateLeadForm_description")).clear();
		 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edit Lead");
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println(driver.getTitle());
		 driver.close();
		 }
}
