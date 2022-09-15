package com.Etsy.Page_Objects;

import com.Etsy.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Locale;

public class Mens extends BaseClass {
    @FindBy(xpath = "//*[@id=\"sortby\"]/button/div/span[2]/svg")
    WebElement sortDropdown;

    @FindBy(xpath = "//*[@id=\"sortby\"]/div/a[2]")
    WebElement lowestPrice;

    @FindBy(xpath = "//*[@id=\"sortby\"]/div/a[3]")
    WebElement highestPrice;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/div[8]/div/div" +
            "/div/ul/li[11]/div/div/a/div[1]/div/div/div/div/div/img")
    WebElement item;

    public Mens() {
        PageFactory.initElements(driver, this);
    }

    public Mens sortBy(String sortOption) {
        switch(sortOption.toLowerCase(Locale.ROOT)){
            case "lowest price":
                lowestPrice.click();
                break;
            case "highest price":
                highestPrice.click();
                break;
            default:
                System.out.println("That is not a valid sort option");
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Mens();
    }
    public ItemDetail clickItem() {
        item.click();
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        return new ItemDetail();
    }
}
