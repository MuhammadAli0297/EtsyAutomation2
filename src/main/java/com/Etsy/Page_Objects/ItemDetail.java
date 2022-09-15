package com.Etsy.Page_Objects;

import com.Etsy.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemDetail extends BaseClass {
    @FindBy(xpath = "//*[@id=\"product-description-content-toggle\"]/div/div[2]/div[2]/button")
    WebElement loadMore;

    @FindBy(xpath = "//*[@id=\"wt-content-toggle-product-details-read-more\"]/p")
    WebElement description;

    public ItemDetail() {
        PageFactory.initElements(driver, this);
    }
    public ItemDetail clickLoadMore(){
        loadMore.click();
        return new ItemDetail();
    }
    public String getDecription(){
        return description.getText();
    }
}
