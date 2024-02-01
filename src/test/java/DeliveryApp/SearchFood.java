package DeliveryApp;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class SearchFood {
    public Button Restaurant=new Button(By.xpath("//android.widget.TextView[@text=\"Restaurantes\"]"));
    public Button SearchIcon=new Button(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"));
    public TextBox SearchBar=new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"RNE__Input__text-input\"]"));
    public Label FoodName=new Label(By.xpath("//android.widget.TextView[@text=\"%s\"]"));



}
