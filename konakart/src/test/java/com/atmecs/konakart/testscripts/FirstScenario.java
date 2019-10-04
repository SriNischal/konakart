package com.atmecs.konakart.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.konakart.testsuite.KonaKartPageActions;
import com.atmecs.konakart.testsuite.TestBase;
import com.atmecs.konakart.utils.KonaKartProperties;
import com.atmecs.konakart.utils.KonakartpagexlsxReader;
import com.atmecs.konakart.validationresult.Scenariovalidation;

public class FirstScenario extends TestBase{
	@Test(dataProvider = "destination", dataProviderClass = KonakartpagexlsxReader.class)
	public static void first(String[] values) throws IOException {
		KonaKartProperties konakart=new KonaKartProperties();
		KonaKartPageActions.selectDropdown(driver,konakart.readExplorePagePropertiesFile("explorepage.select.btn"),values[2]);
		KonaKartPageActions.sendKeys(konakart.readExplorePagePropertiesFile("explorepage.searchtext.txt"), values[0]);
		Scenariovalidation.validation();
		KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.search.txt"));
		KonaKartPageActions.sendKeys(konakart.readExplorePagePropertiesFile("explorepage.searchtext1.txt"), values[1]);
		Scenariovalidation.validationtitle();
		KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.search.txt"));
	}
}