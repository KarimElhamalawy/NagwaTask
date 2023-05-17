package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Homepage;
import org.example.pages.P02_searchResult;
import org.testng.Assert;

public class D02_search {
    P01_Homepage link = new P01_Homepage();
    P02_searchResult link2 = new P02_searchResult();

    @Given("User clicks the search icon")
    public void userToggleSearch(){
        link.searchToggle.click();
    }

    @When("User inputs desired course")
    public void userInputsCourse(){
        link.searchBar.sendKeys("addition");
    }

    @And("clicks the search button")
    public void userClickSearch(){
        link.searchButton.click();
    }

    @And("User clicks the second lesson in results")
    public void lessonClick (){
        link2.lessonTitle.click();
    }

    @And("User navigates to the worksheet section")
    public void navigateToWorksheet() {
        link2.WorksheetIcon.click();
    }

}
