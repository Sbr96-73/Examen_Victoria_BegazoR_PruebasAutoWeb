package com.nttdata.stepsdefinitions;

import com.nttdata.page.HomePage;
import com.nttdata.steps.HomeSteps;
import com.nttdata.steps.LoginSteps;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;


public class LoginStepsDef {

    private WebDriver driver;



    @Given("estoy en la pagina de la tienda")
    public void estoyEnLaPaginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/");
        screenShot();
    }
    @When("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String correo, String password) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.loginOption();
        loginSteps.typeUser(correo);
        loginSteps.typePassword(password);
        loginSteps.login();
        screenShot();
    }


    @Entonces("valido autentificacion correcta de cliente {string}")
    public void validoAutentificacionCorrectaDeCliente(String cliente) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.validarAutentificacion(cliente);
        screenShot();
    }

    @Y("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String category, String subcategory) {
        HomeSteps homeSteps = new HomeSteps(driver);
        homeSteps.navegarCategoriasSubCategorias(category,subcategory);
        screenShot();
    }

    @Y("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(int cantidad) {
        screenShot();
    }

    @Entonces("valido en el popup la confirmación del producto agregado")
    public void validoEnElPopupLaConfirmaciónDelProductoAgregado() {

    }
}
