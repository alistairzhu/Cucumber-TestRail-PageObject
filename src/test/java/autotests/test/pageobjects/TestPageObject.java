package autotests.test.pageobjects;

import autotests.test.helpers.DriverFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestPageObject extends BasePage {
    public TestPageObject(WebDriver driver) {
        super(driver);
    }

   // @FindBy(how = How.XPATH, using = "//*[@id=lst-ib]")
    @FindBy(how = How.XPATH, using = "//*[@id='q']")
    public static WebElement googleSearchBar;


    public static WebElement getSearchBar() {
        WebElement searchBar = DriverFunctions.getElementOfTypeWithTextContaining(driver, "text", "row trips");
        return searchBar;
    }

}
