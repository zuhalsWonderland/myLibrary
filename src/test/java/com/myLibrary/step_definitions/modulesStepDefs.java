package com.myLibrary.step_definitions;

import com.myLibrary.pages.BookManagementPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class modulesStepDefs {
    @Then("user should see {string}")
    public void user_should_see(String expected) {
        BookManagementPage bookManagementPage = new BookManagementPage();
        List<WebElement> moduleNames = bookManagementPage.modules;
        List<String> modules = new ArrayList<>();
        String actual = "";
        for (int i = 0; i < moduleNames.size(); i++) {
            modules.add(moduleNames.get(i).getText());
            actual = actual + modules.get(i) + " ";

        }
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
        expected = expected + " ";
        Assert.assertEquals(expected,actual);
    }

}
