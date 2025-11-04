package com.nttdata.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage {

    private WebDriver driver;

    //declaramos nuestros locators

    By usuariofield = By.id("field-email");
    By passwordfield = By.id("field-password");
    By loginbutton = By.id("submit-login");

    //Constructor que recibe el driver

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Metodo que realiza la acción en el login
    public void login(String usuario, String password){

        driver.findElement(usuariofield).sendKeys(usuario);
        driver.findElement(passwordfield).sendKeys(password);
        driver.findElement(loginbutton).click();
    }

    //Metodos de validación
     public boolean HomeVisible(){
        //le decimos a Selenium que espere 10 segundos para que el elemento aparezca antes de hacer la verificación
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("hidden-sm-down")));
         return driver.findElement(By.id("hidden-sm-down")).isDisplayed();
    }
}


