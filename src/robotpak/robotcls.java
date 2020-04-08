package robotpak;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class robotcls {

	WebDriver driver;
	
	@Test
	
	public void set() throws Exception
	{
		Robot r= new Robot();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Golak\\Desktop\\Selenium\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		//org.openqa.selenium.Dimension d= new org.openqa.selenium.Dimension(555, 555);
		//driver.manage().window().setSize(d);
		r.delay(4000);
		//r.mouseWheel(9);
		
		//r.keyPress(KeyEvent.VK_CAPS_LOCK);
		//r.delay(2000);
		
		
		WebElement signin= driver.findElement(By.xpath("//a[@id='uh-signin']"));
		
		Point p= signin.getLocation();
		int x=p.getX();
		int y= p.getY();
		System.out.println(x);
		System.out.println(y);
		r.setAutoDelay(2000);
		r.mouseMove(x+50,y+80 );
		//r.mouseWheel(9);
		
	
		//r.mousePress(InputEvent.BUTTON3_MASK);
		//r.setAutoDelay(2000);
		//r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.setAutoDelay(2000);
		System.out.println(MouseInfo.getPointerInfo().getLocation());
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		/*Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(size);
		BufferedImage img = r.createScreenCapture(new Rectangle(size));
		File path = new File("./Screenshots/screen.png");
		ImageIO.write(img, "png", path);*/
		
		r.setAutoDelay(8000);
		
		driver.quit();
	}
}
