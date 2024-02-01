package testSuite;

import CalendarApp.MainScreen;
import CalendarApp.AddEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;


public class CalendarTest {

    MainScreen mainScreen = new MainScreen();
    AddEvent addEvent = new AddEvent();

    @Test
    public void createNewTaskTest(){
        String title="UCB event"+new Date().getTime();
        mainScreen.addButton.click();
        addEvent.titleTxtBox.setText(title);
        addEvent.ALlDay.click();
        addEvent.saveButton.click();
        mainScreen.Menu.click();
        mainScreen.MenuDay.click();
        Assertions.assertFalse(mainScreen.getTaskName(title).isControlDisplayed(),
                "ERROR el evento no fue creado");
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeSession();
    }

}
