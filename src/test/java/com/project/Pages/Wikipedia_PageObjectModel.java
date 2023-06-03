package com.project.Pages;

import com.project.Utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import com.project.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.io.IOException;

public class Wikipedia_PageObjectModel {

    public Wikipedia_PageObjectModel() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "/html/body/div[3]/form/fieldset/div/input")
    public WebElement SearchBox;

@FindBy(xpath = "/html/body/div[3]/form/fieldset/button/i")
    public WebElement searchButton;

@FindBy(xpath = "/html/body/div[2]/div/div[3]/main/header/h1/span")
    public WebElement MainHeader;



}
