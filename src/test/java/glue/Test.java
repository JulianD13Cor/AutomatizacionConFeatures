package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class Test {
    private ChromeDriver driver;
    private WebElement usuario;
    private WebElement contrasenia;
    private WebElement botonIngreso;
    private String usu,contra;
    private WebElement scroll;
    @Given("el usuario se encuentra en la pagina principal")
    public void el_usuario_se_encuentra_en_la_pagina_principal() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ZIP-B205-E-020\\eclipse-workspace\\Automatizacion2\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
    }
    @When("el ingresa usuario y contraseña")
    public void el_ingresa_usuario_y_contraseña() {
        usu="standard_user";
        contra="secret_sauce";

        usuario=driver.findElement(By.id("user-name"));
        contrasenia=driver.findElement(By.id("password"));
        botonIngreso=driver.findElement(By.id("login-button"));



    }
    @Then("deberia hacer el proceso de login")
    public void deberia_hacer_el_proceso_de_login() {
        usuario.sendKeys(usu);
        contrasenia.sendKeys(contra);
        botonIngreso.click();
        scroll= driver.findElement(By.className("footer"));
        WheelInput.ScrollOrigin scroll2 = WheelInput.ScrollOrigin.fromElement(scroll);
        new Actions(driver)
                .scrollFromOrigin(scroll2, 0,200)
                .perform();

    }
}
