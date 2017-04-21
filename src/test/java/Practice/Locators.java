

package Practice;

public interface Locators {

    String INPUT_FIELD = "//input[@placeholder='$1']";
    String BUTTON = "//button[contains(text(),'$1')]";
    String ADD_ROOM_BTN = "//a[@class='add-room-button']/i";
    String PUBLIC_RADIOBUTTON = "//input[@value='private']";
    String SUBBMIT = "//button[@type='submit']";
    String ADD_ROOM = "//h4[contains(text(),'Add Room')]";
    String CHANNELS = "//li[@class='b-room room-private grey']/a";
    String FIRST_CHANNEL = "(//li[@class='b-room room-private grey']/a)[4]";
    String COG = "//div[@class='chat-container active']//li[@class='b-channel-param-control dropdown']//i[@class='glyphicon glyphicon-cog']";
    String DELETE = "//a[contains(text(),'Delete Room')]";
    String YES_DELETE = "//button[contains(text(),'Yes, delete this room')]";
    String DELETE_TITLE = "//h4[contains(text(),'Delete Room')]";
    String TEXTAREA = "//div[@class='chat-container active']//div[@class='bottom-text']//textarea[@placeholder='Enter message']";
    String ROOM = "//span[@class='ccss' and contains(text(),'$1') ]";

    String INVITE = "//input[@aria-autocomplete='list']";

}

