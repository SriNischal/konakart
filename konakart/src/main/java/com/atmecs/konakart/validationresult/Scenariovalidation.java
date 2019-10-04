package com.atmecs.konakart.validationresult;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import com.atmecs.konakart.constatnts.ProjectBaseConstantPaths;
import com.atmecs.konakart.rerports.LogReport;
import com.atmecs.konakart.testsuite.TestBase;
import com.atmecs.konakart.utils.ReadLocatorsFile;

public class Scenariovalidation extends TestBase{
	static Properties properties, properties1;

	public static void validation() throws IOException {
		LogReport log = new LogReport();
		properties = ReadLocatorsFile.loadProperty(ProjectBaseConstantPaths.LOCATORS_FILE1);
		properties1 = ReadLocatorsFile.loadProperty(ProjectBaseConstantPaths.TESTDATA_FILE);
		String actualtitle = driver.findElement(By.xpath(properties.getProperty("explorepage.searchtext.txt"))).getText();
		ValidateTestResult.validateData(actualtitle, properties1.getProperty("expectedproducttitle"),"actual not equal to expected");
		log.info("Successfully validated title");
		
	}
	public static void validationtitle() throws IOException {
		LogReport log = new LogReport();
		properties = ReadLocatorsFile.loadProperty(ProjectBaseConstantPaths.LOCATORS_FILE1);
		properties1 = ReadLocatorsFile.loadProperty(ProjectBaseConstantPaths.TESTDATA_FILE);
		String actualtitle = driver.findElement(By.xpath(properties.getProperty("explorepage.searchtext.txt"))).getText();
	ValidateTestResult.validateData(actualtitle, properties1.getProperty("expectedproduct1title"),"actual not equal to expected");
	log.info("Successfully validated title");
}
}