package com.atmecs.konakart.testsuite;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
public class KonaKartPageActions extends TestBase {
	public static void selectDropdown(WebDriver driver,String xpath, String visibleText) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select noOfpeople = new Select(element);
		noOfpeople.selectByVisibleText(visibleText);
	}

	public static void clickOnElement(final String xpath) {
	
		@SuppressWarnings("deprecation")
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.ignoring(ElementClickInterceptedException.class).pollingEvery(3, TimeUnit.SECONDS)
				.withTimeout(30, TimeUnit.SECONDS);

		fluentWait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				WebElement element = driver.findElement(By.xpath(xpath));
				element.click();
				return true;
			}
		});
	}

	public static void sendKeys(String xpath, String value) {
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
}

