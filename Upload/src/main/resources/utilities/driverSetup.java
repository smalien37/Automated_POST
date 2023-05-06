
public class driverSetup {
	
	public static WebDriver driver;

	public static String exePath;
	public static String urlfb = "https://www.facebook.com/";
	public static String urlinsta = "https://www.instagram.com/";
	public static String urllinkedin = "https://in.linkedin.com/";
	public static String browsertype;
	public static String userDirectory;
	public static String systemtype;
	public static ExtentTest test;
	
	public static WebDriver driverInstantiate(String browser, String system){
	
		browsertype = browser;
		systemtype = system;
		userDirectory = System.getProperty("user.dir");
		String driver_Path;
		
		if (systemtype.equalsIgnoreCase("linux")) {
			exePath = userDirectory/browser_Drivers/linux;
			
			if(browsertype.equalsIgnoreCase("chrome")) {
				exePath = exePath + "/chromedriver";
				System.setProperty("webdriver.chrome.driver", exePath);
				driver = new ChromeDriver();
			}
		
			else if(browser.equalsIgnoreCase("firefox")) {
				exePath = exePath + "/geckodriver";
				System.setProperty("webdriver.gecko.driver", exePath);
				driver = new FirefoxDriver();
			}
		}
		
		if (systemtype.equalsIgnoreCase("mac")) {
			exePath = userDirectory + "/browser_Drivers/mac";
			
			if(browsertype.equalsIgnoreCase("chrome")) {
				exePath = exePath + "/chromedriver";
				System.setProperty("webdriver.chrome.driver", exePath);
				driver = new ChromeDriver();
			}
		
			else if(browser.equalsIgnoreCase("firefox")) {
				exePath = exePath + "/geckodriver";
				System.setProperty("webdriver.gecko.driver", exePath);
				driver = new FirefoxDriver();
			}
		}
		
		if (systemtype.equalsIgnoreCase("windows")) {
			exePath = userDirectory + "/browser_Drivers/windows";
			
			if(browsertype.equalsIgnoreCase("chrome")) {
				exePath = exePath + "/chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				driver = new ChromeDriver();
			}
		
			else if(browser.equalsIgnoreCase("firefox")) {
				exePath = exePath + "/geckodriver.exe";
				System.setProperty("webdriver.gecko.driver", exePath);
				driver = new FirefoxDriver();
			}
			
			else if(browser.equalsIgnoreCase("ie")) {
				exePath = "D:\\Sele\\driver\\IEDriverServer.exe";
				System.setProperty("webdriver.ie.driver", exePath);
				driver = new FirefoxDriver();
			}
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().deleteAllCookies();
		return driver;
	}
	
	public static void driverClose(){
	driver.close();
	}

}
