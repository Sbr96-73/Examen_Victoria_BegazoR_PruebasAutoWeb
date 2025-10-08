package com.nttdata.steps;

import com.nttdata.page.HomePage;
import com.nttdata.page.LoginPage;
import org.openqa.selenium.WebDriver;

public class HomeSteps {

    private WebDriver driver;

    public HomeSteps(WebDriver driver){
        this.driver = driver;
    }

    public void navegarCategoriasSubCategorias(String category, String subcategory){

        this.driver.findElement(HomePage.category).click();

        this.driver.findElement(HomePage.subcategory).click();

    }


}
