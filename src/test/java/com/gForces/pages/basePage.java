package com.gForces.pages;

import com.gForces.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class basePage {

    public basePage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id = "add")
    public WebElement addANewComputer;
}
