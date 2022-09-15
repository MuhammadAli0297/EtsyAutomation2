package com.Etsy.Page_Objects;

import com.Etsy.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClothingAndShoes extends BaseClass {
    @FindBy(css = "div.wt-viewport-width-full div.wt-card.wt-card--contained:nth-of-type(2)")
    WebElement mensOption;

    public ClothingAndShoes() {
        PageFactory.initElements(driver, this);
    }

    public Mens clickMens(){
        mensOption.click();
        return new Mens();
    }
}
