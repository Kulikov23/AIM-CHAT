package Practice.pages;

import Practice.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

@DefaultUrl("https://chat.aimprosoft.com/index.html#/login")
public class DictionaryPage extends PageObject {

    public void writeAnd(String arg0, String arg1) {
        $(Locators.INPUT_FIELD.replace("$1", arg0)).sendKeys("");
        $(Locators.INPUT_FIELD.replace("$1", arg1)).sendKeys("");
    }

    public void clickButton(String arg0) {
        $(Locators.BUTTON.replace("$1", arg0)).click();
        waitABit(1500);
    }

//TODO://///////////////////////////            CREATE          ////////////////////////////////////////////////////////

    public void createChannel() {
        for (int i = 0; i < 200; i++) {
            $(Locators.ADD_ROOM_BTN).click();
            waitFor(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.PUBLIC_RADIOBUTTON))));
            enterRandomValue();
            $(Locators.PUBLIC_RADIOBUTTON).click();
            waitFor(ExpectedConditions.elementToBeClickable((By.xpath(Locators.SUBBMIT))));
            $(Locators.SUBBMIT).click();
            waitFor(ExpectedConditions.invisibilityOfElementLocated((By.xpath(Locators.ADD_ROOM))));
        }
    }

    public void enterRandomValue() {
        int sizeName = 6; // size of random string
        String charac = "abcdefghijklmnopqrstuvwxyz"; //Create the character set for random string
        Random r = new Random();
        String Name = generateString(r, charac, sizeName);
        $(Locators.INPUT_FIELD.replace("$1", "Room Name")).sendKeys(Name);
    }

    public static String generateString(Random rng, String characters, int length) //creating random string
    {
        char[] text = new char[length]; // Create list of chars
        for (int i = 0; i < length; i++) //Creating number of random symbols, size equals  variable length
        {
            text[i] = characters.charAt(rng.nextInt(characters.length())); //For current step create random character and saves in list
        }
        return new String(text);//return list
    }

//TODO://///////////////////////////            DELETE          ////////////////////////////////////////////////////////

    public void deleteChannel() {
        int channels = findAll(Locators.CHANNELS).size();
        for (int i = 0; i < channels; i++) {
            waitFor(ExpectedConditions.presenceOfElementLocated((By.xpath(Locators.FIRST_CHANNEL))));
            $(Locators.FIRST_CHANNEL).click();
            waitFor(ExpectedConditions.elementToBeClickable((By.xpath(Locators.COG))));
            $(Locators.COG).click();
            waitFor(ExpectedConditions.elementToBeClickable((By.xpath(Locators.DELETE))));
            $(Locators.DELETE).click();
            waitFor(ExpectedConditions.elementToBeClickable((By.xpath(Locators.YES_DELETE))));
            $(Locators.YES_DELETE).click();
            waitFor(ExpectedConditions.invisibilityOfElementLocated((By.xpath(Locators.DELETE_TITLE))));
        }
    }

//TODO://///////////////////////////            SPAM          ////////////////////////////////////////////////////////

    public void spam(String arg0, String arg1) {
        for (int i = 0; i < 100; i++) {
            $(Locators.ROOM.replace("$1", arg1)).click();
            $(Locators.TEXTAREA).sendKeys(arg0);
            $(Locators.TEXTAREA).sendKeys(Keys.ENTER);
        }
    }


}


