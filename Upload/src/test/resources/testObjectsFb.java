
public class testObjectsFb {
	
	public static WebElement element = null;
	public static WebDriver driver;
	
	public static WebElement exploreBtn(WebDriver driver) {
		element =driver.findElement(By.xpath("//button[@id='explore_button_button']"));
		return element;
	}
	
	
	

}
