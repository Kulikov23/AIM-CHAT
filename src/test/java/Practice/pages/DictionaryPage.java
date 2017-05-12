package Practice.pages;

import Practice.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


import com.sun.mail.imap.IMAPStore;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;

import javax.mail.*;
import javax.mail.search.AndTerm;
import javax.mail.search.FlagTerm;
import javax.mail.search.SearchTerm;
import java.io.File;
import java.io.FilenameFilter;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Folder;
import javax.mail.MessagingException;

@DefaultUrl("https://chat.aimprosoft.com")
public class DictionaryPage extends PageObject {

    String pass;

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
        for (int i = 0; i < 330; i++) {
            withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated((By.xpath(Locators.ADD_ROOM_BTN))));
            $(Locators.ADD_ROOM_BTN).click();
            withTimeoutOf(5, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated((By.xpath(Locators.PUBLIC_RADIOBUTTON))));
            enterRandomValue();
            $(Locators.PUBLIC_RADIOBUTTON).click();
            $(Locators.INVITE).sendKeys("r.konivec");
            $(Locators.INVITE).sendKeys(Keys.ENTER);
            withTimeoutOf(5, TimeUnit.SECONDS).waitFor(ExpectedConditions.elementToBeClickable((By.xpath(Locators.SUBBMIT))));
            waitABit(500);
            $(Locators.SUBBMIT).click();
            waitABit(500);
            withTimeoutOf(5, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated((By.xpath(Locators.ADD_ROOM))));
            waitABit(500);
        }
    }

    public void enterRandomValue() {
        int sizeName = 30; // size of random string
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
//        int channels = findAll(Locators.CHANNELS).size();
        for (int i = 0; i < 500; i++) {
            withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated((By.xpath(Locators.FIRST_CHANNEL))));
            $(Locators.FIRST_CHANNEL).click();
            withTimeoutOf(5, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated((By.xpath(Locators.COG))));
            $(Locators.COG).click();
            withTimeoutOf(5, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated((By.xpath(Locators.DELETE))));
            $(Locators.DELETE).click();
            withTimeoutOf(5, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated((By.xpath(Locators.YES_DELETE))));
            $(Locators.YES_DELETE).click();
            withTimeoutOf(5, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated((By.xpath(Locators.DELETE_TITLE))));
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

//TODO://///////////////////////////            GET REQUEST          ////////////////////////////////////////////////////////

    public void getRequest() throws ClientProtocolException, IOException {
        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet("https://chat.aimprosoft.com");
        HttpResponse response = client.execute(request);
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line = "";
        while ((line = rd.readLine()) != null) {
            System.out.println(line);
        }
    }

    public void getRequestTwo() throws IOException {
        try {

            URL url = new URL("https://vk.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;

            System.out.println(conn.getPermission());
            System.out.println(conn.getInstanceFollowRedirects());
            System.out.println(conn.getRequestMethod());

            System.out.println("Output from Server .... \n" + conn.getResponseCode());
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public void postRequest() throws ClientProtocolException, IOException {
        try {

            URL url = new URL("https://vk.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            String input = "{\"qty\":100,\"name\":\"iPad 4\"}";

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

//            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
//                throw new RuntimeException("Failed : HTTP error code : "
//                        + conn.getResponseCode());
//            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

    public void enterToMail() throws Exception_for_email {
//        WebElement invite2Button = getDriver().findElement(By.id("template_x002e_invitationlist_x002e_invite_x0023_default-invite-button-button"));
//
//        invite2Button.click();

        String username = null, password = null;
        int time = 0;

        do {
            Message message = null;
            Properties properties = new Properties();
            properties.put("mail.imaps.host", "imap.mail.ru");
            String mailStoreType = "imaps";
            String mailUser = "mike-miller-90@mail.ru";
            String mailPassword = "guettamaster15028819";

            Session emailSession = Session.getDefaultInstance(properties);

            try {
                IMAPStore emailStore = (IMAPStore) emailSession.getStore(mailStoreType);
                emailStore.connect(mailUser, mailPassword);

                Folder emailFolder = emailStore.getFolder("INBOX");
                emailFolder.open(Folder.READ_WRITE);

                SearchTerm seenTerm = new FlagTerm(new Flags(Flags.Flag.SEEN), false);
                SearchTerm mailTerm = new SearchTerm() {
                    @Override
                    public boolean match(Message message) {
                        try {
                            Address[] fromArray = message.getFrom();
                            if (fromArray != null && fromArray.length > 0) {
                                System.out.println("From: " + fromArray[0]);
                                if (fromArray[0].toString().equals("notifications@secure.covi3.com")) {
                                    System.out.println("From was found: " + fromArray[0]);
                                    return true;
                                }
                            }
                        } catch (MessagingException ex) {
                            ex.printStackTrace();
                        }
                        return false;
                    }
                };

                System.out.println("Wait email " + time + "s...");
                time += 2;
                Thread.sleep(2000l);
                Message[] messages = emailFolder.search(new AndTerm(seenTerm, mailTerm));

                int length = messages.length;
                if (length > 0) {
                    message = messages[length - 1];
                }
                if (message != null) {
                    String content = ((String) message.getContent());
                    int posPasswordStr = ((String) message.getContent()).indexOf("Password (please change after first login):");
                    String passwordPartString = ((String) message.getContent()).substring(posPasswordStr + 43);
                    int posDivPassword = passwordPartString.indexOf("</div>");
                    password = passwordPartString.substring(0, posDivPassword).trim();
                }

                // mark as read
                emailFolder.setFlags(messages, new Flags(Flags.Flag.SEEN), true);

            } catch (Exception e) {
                throw new Exception_for_email(e.getMessage());
            }

        } while (password == null);
        pass = password;
        System.out.println("Received user: " + username);
        System.out.println("Received password: " + password);
    }


}





