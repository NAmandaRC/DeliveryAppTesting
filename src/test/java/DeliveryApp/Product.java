package DeliveryApp;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class Product {
    public TextBox order=new TextBox(By.xpath("//android.widget.TextView[@text=\"%s\"]"));
    public Button ClickButton=new Button(By.xpath("//android.widget.Button"));
    public Button EmptyOrder=new Button(By.xpath("//android.widget.TextView[@text=\"Vaciar pedido\"]"));




}
