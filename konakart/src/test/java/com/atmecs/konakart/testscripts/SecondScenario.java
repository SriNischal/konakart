package com.atmecs.konakart.testscripts;
import java.io.IOException;
import org.testng.annotations.Test;
import com.atmecs.konakart.rerports.LogReport;
import com.atmecs.konakart.testsuite.KonaKartPageActions;
import com.atmecs.konakart.testsuite.TestBase;
import com.atmecs.konakart.utils.KonaKartProperties;
import com.atmecs.konakart.validationresult.ValidationTestResult;
public class SecondScenario extends TestBase{
    @Test
	public static void second() throws IOException, InterruptedException {
    	LogReport log=new LogReport();
    	KonaKartProperties konakart=new KonaKartProperties();
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.item.btn"));
    	//ValidationTestResult.validation();
    	log.info("Item is clicked...");
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.specifications.btn"));
    	//ValidationTestResult.validationspecifications();
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.product.btn"));
    	//ValidationTestResult.validationproduct();
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.customer.btn"));
    	//ValidationTestResult.validationreview();
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.rating5.btn"));
    	//ValidationTestResult.validation();
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.rating4.btn"));
    	//ValidationTestResult.validation();
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.quantity.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.numRevs.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order1.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order2.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order3.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.numRevs1.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order1.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order2.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order3.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.numRevs2.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order1.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order2.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order3.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.numRevs3.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order1.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order2.btn"));
    	KonaKartPageActions.clickOnElement(konakart.readExplorePagePropertiesFile("explorepage.order3.btn"));
    }
}
