package com.db.am.bauhaus.project.pages;

import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

/**
 * Created by ongshir on 05/10/2016.
 */
@DefaultUrl("/")
public class MainSearchPage extends PageObject {

    @FindBy(id = "search-query")
    WebElementFacade inputBox;

    @FindBy(css = "button.btn.btn-primary")
    WebElementFacade searchButton;

    @FindBy(id = "catnav-primary-link-1179")
    WebElementFacade jewelleryMenu;

    @FindBy(id = "catnav-l3-1180-link")
    WebElementFacade ankletItem;

    @FindBy(xpath = "./html/body/div[6]/div/div/span[2]/div/div/div/div[2]/a/div[1]")
    WebElementFacade jewelleryIcon;

    @FindBy(css = "div.pt-xs-1.text-gray-lighter")
    WebElementFacade PageTitleText;

    public MainSearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchFromInputBox(String searchText) {
        inputBox.waitUntilPresent().sendKeys(searchText);
        searchButton.click();
    }

    public void searchFromDropDownMenu(String menuTitle, String menuItem) {
        jewelleryMenu.click();
        ankletItem.click();
    }

    public void searchByClickingIcons(String menuTitle) {
        jewelleryIcon.waitUntilPresent().click();
    }

    public String getTopCategoriesHeader() {
        return find(By.cssSelector("h4.pb-xs-1-5")).getText();
    }

    public String getAllCategoriesHeader() {
        return find(By.cssSelector("h1.conform-heading.display-inline")).getText();
    }

    public String getItemHeader(){return find(By.cssSelector(".float-left>h1")).getText();}

    public String getPageTitle(){return PageTitleText.waitUntilPresent().getText(); }
}
