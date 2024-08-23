package day11;

/*Problem Statement
Implement two methods in the SeleniumExecutor class, which should use the Selenium WebDriver to perform the below tasks on the page from the src/test/resources/__files/index.html page.
1. In the getDropdownValues() method: retrieve the values of all selected items in the dropdown with the ID attribute of dropdown-main.
2. In the setInput() method: type in the text passed in the argument of the method into all inputs with the container text-box class.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SeleniumExecutorLoginPage {
    WebDriver driver;

    public SeleniumExecutorLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getDropdownValues() {
        Select select = new Select(driver.findElement(By.id("dropdown-main")));
        List<WebElement> selectedOptions = select.getAllSelectedOptions();

        List<String> values = new ArrayList<>();
        for (WebElement option : selectedOptions) {
            values.add(option.getText());
        }

        return values;
    }

    public void setInput(String text) {
        List<WebElement> inputElements = driver.findElements(By.className("text-box"));

        for (WebElement input : inputElements) {
            input.clear();
            input.sendKeys(text);
        }
    }
}