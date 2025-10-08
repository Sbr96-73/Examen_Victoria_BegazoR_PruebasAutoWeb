package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {

    //Localizadores de elementos
    public static By loginOption = By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span");
    public static By userInput = By.id("field-email");
    public static By passInput = By.id("field-password");
    public static By loginButton = By.id("submit-login");
    public static By userNameLogin = By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]/span");

}
