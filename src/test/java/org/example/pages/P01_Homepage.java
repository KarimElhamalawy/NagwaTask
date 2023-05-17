package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.openqa.selenium.By.cssSelector;

public class P01_Homepage {
    public P01_Homepage(){
        PageFactory.initElements(Hooks.driver,this);
    }


    @FindBy(className="dropdown-menu languages")
    public WebElement langListToggle;

    @FindBy(className="home-landing__banner__info__title")
    public WebElement banner;

    @FindAll({
            @FindBy(className="dropdown-menu languages")
    })
    public List<WebElement> langList;

    @FindBy(className="f-icon search-icon")
    public WebElement searchToggle;

    @FindBy(id="txt_search_query")
    public WebElement searchBar;

    @FindBy(className="f-icon search-icon")
    public WebElement searchButton;


}
