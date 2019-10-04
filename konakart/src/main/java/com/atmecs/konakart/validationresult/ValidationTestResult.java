package com.atmecs.konakart.validationresult;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;


import com.atmecs.konakart.constatnts.ProjectBaseConstantPaths;
import com.atmecs.konakart.rerports.LogReport;
import com.atmecs.konakart.testsuite.TestBase;
import com.atmecs.konakart.utils.ReadLocatorsFile;

public class ValidationTestResult extends TestBase {
	static Properties properties, properties1;
	public static void validation() throws IOException {
		LogReport log = new LogReport();
		properties = ReadLocatorsFile.loadProperty(ProjectBaseConstantPaths.LOCATORS_FILE2);
		properties1 = ReadLocatorsFile.loadProperty(ProjectBaseConstantPaths.TESTDATA_FILE);
		 String actualtitle=driver.findElement(By.xpath(properties.getProperty("validate.title.txt"))).getText();
		 ValidateTestResult.validateData(actualtitle,properties1.getProperty("expectedtitle"),"actual not equal to expected");
		 log.info("Successfully validated title");
	}
		 public static void validationproduct() throws IOException {
				LogReport log = new LogReport();
				properties = ReadLocatorsFile.loadProperty(ProjectBaseConstantPaths.LOCATORS_FILE2);
				properties1 = ReadLocatorsFile.loadProperty(ProjectBaseConstantPaths.TESTDATA_FILE);
		 String actualproduct=driver.findElement(By.xpath(properties.getProperty("validate.product.txt"))).getText();
		 ValidateTestResult.validateData(actualproduct,properties1.getProperty("expectedproduct"),"actual not equal to expected");
		 log.info("Successfully validated product");
		 } 
		 public static void validationspecifications() throws IOException {
				LogReport log = new LogReport();
				properties = ReadLocatorsFile.loadProperty(ProjectBaseConstantPaths.LOCATORS_FILE2);
				properties1 = ReadLocatorsFile.loadProperty(ProjectBaseConstantPaths.TESTDATA_FILE);
		 String actualspecifications=driver.findElement(By.xpath(properties.getProperty("validate.specification.txt"))).getText();
		 ValidateTestResult.validateData(actualspecifications,properties1.getProperty("expectedspecification"),"actual not equal to expected");
		 log.info("Successfully validated specification");
		 }
		 public static void validationreview() throws IOException {
				LogReport log = new LogReport();
				properties = ReadLocatorsFile.loadProperty(ProjectBaseConstantPaths.LOCATORS_FILE2);
				properties1 = ReadLocatorsFile.loadProperty(ProjectBaseConstantPaths.TESTDATA_FILE);
		 String actualreview=driver.findElement(By.xpath(properties.getProperty("validate.review.txt"))).getText();
		 ValidateTestResult.validateData(actualreview,properties1.getProperty("expectedreview"),"actual not equal to expected");
		 log.info("Successfully validated review");
	}
}
