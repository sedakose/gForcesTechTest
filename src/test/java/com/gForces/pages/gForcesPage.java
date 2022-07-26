package com.gForces.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class gForcesPage extends basePage{



    @FindBy(xpath = "//*[@id=\"main\"]/h1")
    public WebElement computerHeader;

    @FindBy(id = "name")
    public WebElement computerNameField;

    @FindBy(id = "introduced")
    public WebElement introducedDateField;

    @FindBy(id = "discontinued")
    public WebElement discontinuedDateField;



}
