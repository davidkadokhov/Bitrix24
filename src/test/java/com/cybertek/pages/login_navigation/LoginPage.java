package com.cybertek.pages.login_navigation;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;


import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "")
    @CacheLookup
    public WebElement userNameElement;

    @FindBy(id = "")
    @CacheLookup
    public WebElement passwordElement;

    @FindBy(id = "")
    public WebElement loginButtonElement;

    @FindBy(css = "")
    public WebElement titleElement;

    @FindBy(css = "")
    public WebElement errorMessageElement;


    public void login(String username, String password) {
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public void login() {
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }


    public void login(String role) {
        String username = "";
        String password = "";
        if (role.equalsIgnoreCase("help desk")) {
            username = ConfigurationReader.getProperty("helpdeskusername1");
            password = ConfigurationReader.getProperty("helpdeskpassword1");
        } else if (role.equalsIgnoreCase("marketing")) {
            username = ConfigurationReader.getProperty("marketingusername1");
            password = ConfigurationReader.getProperty("marketingpassword1");
        } else if (role.equalsIgnoreCase("hr")) {
            username = ConfigurationReader.getProperty("hrusername1");
            password = ConfigurationReader.getProperty("hrpassword1");
        }
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public String getErrorMessage() {
        return errorMessageElement.getText();
    }

    public void goToLandingPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url" + ConfigurationReader.getProperty("environment")));
    }
}
