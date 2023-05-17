package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_searchResult {

    public P02_searchResult(){
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className="page-title")
    public WebElement pageHeader;

    @FindBy(className="right")
    public WebElement lessonTitle;

    @FindBy(className="question-preview")
    public WebElement WorksheetIcon;


}
