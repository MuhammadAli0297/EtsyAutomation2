package com.Etsy.Page_Objects;

import com.Etsy.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header extends BaseClass {
    @FindBy(css = "Home Favorites")
    WebElement HomeFavoritesNavButton;

    @FindBy(css = "Jewelry & Accessories")
    WebElement JewelryAndAccessoriesNavButton;

    @FindBy(xpath = "//*[@id=\"catnav-primary-link-10923\"]")
    WebElement ClothingAndShoesCategory;

    //creating a constructor
    public Header() {
        //this is equal to the header class
        PageFactory.initElements(driver, this);
    }

    public ClothingAndShoes clickClothingAndShoes() {
        ClothingAndShoesCategory.click();
        return new ClothingAndShoes();
    }


}
