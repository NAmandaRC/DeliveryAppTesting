package DeliveryApp;

import control.Button;
import control.TextBox;

import org.openqa.selenium.By;

public class Location {

public TextBox Address=new TextBox(By.xpath("//android.widget.EditText[@text='UBICACIÓN ACTUAL']"));
public Button SaveAddress=new Button(By.xpath("//android.widget.Button"));


}
