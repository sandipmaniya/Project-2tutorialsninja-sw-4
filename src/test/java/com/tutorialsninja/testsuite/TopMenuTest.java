package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    // * 1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {

        // * 1.1    Mouse hover on “Desktops” Tab and click

        homePage.mouseHoverOnDesktopMenu();

        // * 1.2    call selectMenu method and pass the menu = “Show All Desktops”
        homePage.selectMenu("Show AllDesktops");


        // * 1.3    Verify the text ‘Desktops’
        Assert.assertEquals(homePage.verifyTheTextDesktops(), "Show AllDesktops", "Invalid Desktops text displayed!");
    }

    @Test
    // 2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() throws InterruptedException {

        // * 2.1    Mouse hover on “Laptops & Notebooks” Tab and click

        homePage.mouseHoverOnLaptopsAndNotebooksMenu();

        // * 2.2    call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        ;
        homePage.selectMenu("Show AllLaptops & Notebooks");

        // * 2.3    Verify the text ‘Laptops & Notebooks’
        Assert.assertEquals(homePage.verifyTextForLaptopsAndNotebooks(), "Laptops & Notebooks",
                "Invalid laptops and notebooks text displayed!");
    }

    @Test
    //3.    verifyUserShouldNavigateToComponentsPageSuccessfully()
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() throws InterruptedException {
        // * 3.1    Mouse hover on “Components” Tab and click

        homePage.mouseHoverOnComponentsMenu();

        // * 3.2    call selectMenu method and pass the menu = “Show All Components”

        homePage.selectMenu("Show AllComponents");

        // * 3.3    Verify the text ‘Components’
        String actualComponentsText = homePage.verifyTextForComponents();
        String expectedComponentsText = "Components";
        Assert.assertEquals(actualComponentsText, expectedComponentsText, "Invalid components text displayed!");
    }

}
