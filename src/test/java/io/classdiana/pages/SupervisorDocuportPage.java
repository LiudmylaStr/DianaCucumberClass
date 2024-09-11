package io.classdiana.pages;

import io.classdiana.utilities.BrowserUtils;
import io.classdiana.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.ErrorManager;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class SupervisorDocuportPage extends DocuportBasePage {
    private Logger LOG = LogManager.getLogger ();

    //    @FindBy(xpath = "//h3[.='Choose account']")
//public WebElement chooseAccountText;
public void clickButton(String button){
    switch (button.toLowerCase()){

        case "home":
            WebElement homeButton = Driver.getDriver().findElement(By.xpath("//span[@class='body-1'][contains(text(), 'Home')]"));
            BrowserUtils.waitForVisibility(homeButton, 10);
            BrowserUtils.clickWithJS(homeButton);
            break;
        case "recieved docs":
            WebElement recievedButton = Driver.getDriver().findElement(By.xpath("//span[@class='body-1'][contains(text(), 'Recevied docs')]"));
            // BrowserUtils.waitForVisibility(invitationsButton, 10);
            BrowserUtils.clickWithJS(recievedButton);
            break;

        case "uploads":
            WebElement uploadsButton = Driver.getDriver().findElement(By.xpath("//span[@class='body-1'][contains(text(), 'Clients')]"));
            BrowserUtils.waitForVisibility(uploadsButton, 10);
            BrowserUtils.clickWithJS(uploadsButton);
            break;

        case "leads":
            WebElement leadsButton = Driver.getDriver().findElement(By.xpath("//span[@class='body-1'][contains(text(), 'Users')]"));
            BrowserUtils.waitForVisibility(leadsButton, 10);
            BrowserUtils.clickWithJS(leadsButton);
            break;
        case "bookkeeping":
            WebElement bookkeepingButton = Driver.getDriver().findElement(By.xpath("Leads"));
            BrowserUtils.waitForVisibility(bookkeepingButton, 10);
            BrowserUtils.clickWithJS(bookkeepingButton);
            break;
        case "1099 Form":
            WebElement formButton = Driver.getDriver().findElement(By.xpath("//span[@class='body-1'][contains(text(), 'Bookkeeping')]"));
            BrowserUtils.waitForVisibility(formButton, 10);
            BrowserUtils.clickWithJS(formButton);
            break;

        case "Reconcilliations":
            WebElement ReconcillationButton = Driver.getDriver().findElement(By.xpath("//span[@class='body-1'][contains(text(), 'Reconcilliations')]"));
            BrowserUtils.waitForVisibility(ReconcillationButton, 10);
            BrowserUtils.clickWithJS(ReconcillationButton);
            break;

        default:
            LOG.error("No such " + button + " exists");
            throw new IllegalArgumentException();
    }
}

    public void SuprvisorPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

}

