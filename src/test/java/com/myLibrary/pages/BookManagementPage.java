package com.myLibrary.pages;

import com.myLibrary.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BookManagementPage {
    public BookManagementPage(){
        PageFactory.initElements(Driver.get(), this);
    }


}
