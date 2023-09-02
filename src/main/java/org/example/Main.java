package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    private static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ZIP-B205-E-020\\eclipse-workspace\\Automatizacion2\\src\\main\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();

        String usuario="standard_user";
        String pass="secret_sauce";

        //ubicar elementos

        WebElement usuarioEntrada= driver.findElement(By.id("user-name"));
        WebElement passEntrada= driver.findElement(By.id("password"));
        WebElement btnLogin= driver.findElement(By.id("login-button"));

        //hacer acciones

        usuarioEntrada.sendKeys(usuario);
        passEntrada.sendKeys(pass);
        btnLogin.click();



    }




}