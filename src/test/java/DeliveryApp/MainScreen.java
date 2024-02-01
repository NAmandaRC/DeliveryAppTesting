package DeliveryApp;
import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button RegisterLogIn = new Button(By.xpath(" //android.widget.Button"));

    public Button RecoverAccount = new Button(By.xpath("//android.widget.TextView[@text=\"Recupera tu cuenta\"]"));
    public Button AnotherOption= new Button(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]"));

}
