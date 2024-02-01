package testSuite;

import DeliveryApp.*;

import control.Label;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import session.Session;
import factoryDevice.Android;
import io.appium.java_client.AppiumDriver;
import java.time.Duration;


public class DeliveryTest {

    MainScreen mainScreen=new MainScreen();
    Permissions permissions=new Permissions();
    Login login=new Login();
    Location location=new Location();
    Product product=new Product();
    SearchFood searchFood=new SearchFood();
    WebDriverWait wait;

    @Test
    public void openApp() throws InterruptedException {

        Android androidDevice = new Android();
        AppiumDriver driver = androidDevice.create();
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));

        try {
            permission();
            login();
            address();
            FoodOrder();
        } catch (Exception e) {
            e.printStackTrace();
            // Puedes agregar un bloque para cerrar la sesión aquí si es necesario
        } finally {
            // Cerrar la sesión incluso si hay excepciones
            Session.getSession().closeSession();
        }
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeSession();
    }

    public void permission(){
        permissions.AproxLocation.click();
        permissions.AppInUse.click();
        permissions.AllowMultimedia.click();
        permissions.ContinueAproxLocation.click();

    }
    public void login(){
        String email="testing.app.delivery@hotmail.com";
        String password="Test-123!";

        mainScreen.RegisterLogIn.click();
        mainScreen.RecoverAccount.click();
        mainScreen.AnotherOption.click();
        login.email.setText(email);
        login.password.setText(password);
        login.loginButton.click();
    }
    public void address() throws InterruptedException {
        String direction="Av. Arce 2355, La Paz";
        //location.Address.clear();
        //location.Address.setTextEnter(direction);
        location.SaveAddress.click();
    }
    public void FoodOrder(){
        //SEARCH RESTAURANT
        String food="Sillpichs";
        String pickfood="Sillpichs - Sopocachi";
        searchFood.Restaurant.click();
        searchFood.SearchIcon.click();
        searchFood.SearchBar.setTextEnter(food);

        Label foodLabel = new Label(By.xpath(String.format(searchFood.FoodName.getText(), pickfood)));
        foodLabel.click();

        //PICK FOOD
        String FoodPlate="Sopa de pollo";
        Label FoodPlateName = new Label(By.xpath(String.format(product.order.getText(), FoodPlate)));
        FoodPlateName.click();
        product.ClickButton.click();
    }

}