package com.Etsy;

import com.Etsy.Page_Objects.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EtsyTest extends BaseClass{
    Header header;
    HomePage homePage;
    ClothingAndShoes clothingAndShoes;
    Mens mens;
    ItemDetail itemDetail;

    //what we want to happen before the method
    @BeforeMethod()
    public void setUp() {
        launchApplication();
    }
    //what do we want after our tests
    @AfterMethod()
    public void tearDown() {
        driver.quit();
    }

    @Test()
    public void ourTest() {
        //go to etsy (this is in our before method)

        //click c&s
        header = new Header();
        //click mens
        clothingAndShoes = new ClothingAndShoes();
        //sort
        mens = new Mens();
        //pick product
        mens.sortBy("highest price");
        //click learn more
        mens.clickItem();
        itemDetail.clickLoadMore();
        //print description
        System.out.println(itemDetail.getDecription());
    }
}
