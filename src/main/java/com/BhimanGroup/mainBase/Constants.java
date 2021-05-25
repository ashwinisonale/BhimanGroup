package com.BhimanGroup.mainBase;

import java.awt.Robot;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import ru.yandex.qatools.ashot.AShot;

public class Constants {


	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	public static Actions action;
	public static AShot ashot;
	public  static Select select;
	public static Alert alert;
	public static Robot robot;
	public static FluentWait wait;
	public static WebElement element;


}


