package com.myLibrary.step_definitions;

import com.myLibrary.pages.LoginPage;
import com.myLibrary.utilities.ConfigurationReader;
import com.myLibrary.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginLogoutStepdefs {

    LoginPage loginPage = new LoginPage();

    @When("user login as a {string}")
    public void user_login_as_a(String userRole) throws InterruptedException {
        String username = userRole + "@library";
        String password = "";
        if(userRole.contains("student")) {
            password = ConfigurationReader.get("student_password");
        }else if(userRole.contains("librarian")){
            password = ConfigurationReader.get("librarian_password");
        }

        loginPage.login(username,password);

    }

    @Then("user on  {string}")
    public void user_on(String page) {
        Assert.assertEquals(loginPage.pageOpened.getText(),page);
    }

    @When("the user clicks userDropdown and clicks the logout button")
    public void the_user_clicks_and_clicks_the_logout_button() {
       loginPage.userDropdown.click();
       loginPage.logout.click();

    }

    @Then("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Assert.assertTrue(Driver.get().getCurrentUrl().contains("login"));
    }





}
