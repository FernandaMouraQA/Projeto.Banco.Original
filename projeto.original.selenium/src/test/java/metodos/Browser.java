package metodos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
  
	WebDriver driver;
	
	public void abrirNavegador(String site) {
		try {
			
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		} catch (Exception e ) {
			System.err.println("****** erro ao abrir navegador ****** " + e.getMessage());
			System.out.println("****** causa do erro ******" + e.getCause());
			
			
		}
			
		
		
	}

}
