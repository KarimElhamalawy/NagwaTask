package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Homepage;
import org.testng.Assert;

public class D01_selectLanguage {
P01_Homepage link = new P01_Homepage();


    @Given("User clicks language dropdown list")
        public void selectLanguageList(){
        link.langListToggle.click();
    }

    @When("User clicks language dropdown")
    public void selectLanguage(){
        link.langList.get(0).click();
    }

    @Then("User clicks language dropdown")
    public void langSelected(){
        Assert.assertTrue(link.banner.getText().contains("Transforming Education"));
    }

}