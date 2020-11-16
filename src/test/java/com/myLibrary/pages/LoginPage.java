package com.myLibrary.pages;

import com.myLibrary.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="inputEmail")
    public WebElement userName;

    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement pageOpened;

    @FindBy(css = "#navbarDropdown>span")
    public WebElement userDropdown;

    @FindBy(xpath = "//a[.='Log Out']")
    public WebElement logout;

    public void login(String userNameStr, String passwordStr) throws InterruptedException {
        userName.sendKeys(userNameStr);
       // Thread.sleep(2000);
        password.sendKeys(passwordStr);
       // Thread.sleep(2000);
        submit.click();
       // Thread.sleep(2000);

    }




}
