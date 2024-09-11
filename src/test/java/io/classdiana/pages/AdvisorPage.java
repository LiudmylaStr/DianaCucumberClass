package io.classdiana.pages;

import io.classdiana.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvisorPage extends DocuportBasePage {

    @FindBy(xpath = "//h3[.='Choose account']")
    public WebElement chooseAccountText;

    public AdvisorPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
