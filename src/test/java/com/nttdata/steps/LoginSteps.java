package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginSteps {

    private WebDriver driver;

    //constructor
    public LoginSteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Escribir el usuario
     * @param correo el usuario
     */
    public void typeUser(String correo){
        WebElement userInputElement = driver.findElement(LoginPage.userInput);
        userInputElement.sendKeys(correo);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){
        this.driver.findElement(LoginPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login(){
        this.driver.findElement(LoginPage.loginButton).click();
    }


    public void loginOption(){
        this.driver.findElement(LoginPage.loginOption).click();
    }

    public void validarAutentificacion (String cliente) {
       String usuarioLogeado = this.driver.findElement(LoginPage.userNameLogin).getText();
        Assertions.assertEquals(cliente, usuarioLogeado);
    }

}
