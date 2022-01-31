package com.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class open_browser {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        //chrome_launch();
        //chrome_close();
        //firefox_launch();
        //firefox_close();
        //edge_launch();
        //edge_close();
        //opera_launch();
        //open_website();
        //duration();
        //opera_close();


    }
    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

    }
    public static void chrome_close(){
        driver.close();
    }


    public static void open_website(){
        driver.get("https://www.cricbuzz.com/");
    }

    public static void firefox_launch() {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    public static void firefox_close() {
        driver.close();
    }
    public static void opera_launch() {
        System.setProperty("webdriver.opera.driver", "./src/main/resources/operadriver.exe");
        driver = new OperaDriver();
    }
    public static void opera_close() {
        driver.close();

    }
    public static void edge_launch() {
        System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
    }
    public static void duration() throws InterruptedException {
        Thread.sleep(20000);
    }
    public static void edge_close() {

        driver.close();
    }


}
