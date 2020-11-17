package com.myLibrary.pages;

import com.myLibrary.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BookManagementPage {
    public BookManagementPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "book_categories")
    public WebElement dropdown;

    @FindBy(xpath = "//tbody/tr/td[5]")
    public List<WebElement> categoryName;

    @FindBy(xpath = "//option[@value='500']")
    public WebElement recordValue;

    @FindBy(xpath = "//li[@class='page-item next'][1]")
    public WebElement nextPage;
}
