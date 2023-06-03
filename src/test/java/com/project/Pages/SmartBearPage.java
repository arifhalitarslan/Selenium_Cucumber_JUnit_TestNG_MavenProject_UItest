package com.project.Pages;

import com.project.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {
    public SmartBearPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    
    @FindBy(xpath = "//*[@id='ctl00_MainContent_username']")
    public WebElement inputMainContentUsername;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_password']")
    public WebElement inputMainContentPassword;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_login_button']")
    public WebElement inputMainContentLoginButton;


    
    



}
