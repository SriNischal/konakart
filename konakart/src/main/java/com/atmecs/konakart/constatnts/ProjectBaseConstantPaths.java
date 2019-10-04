package com.atmecs.konakart.constatnts;

import java.io.File;

public class ProjectBaseConstantPaths {

	public final static String USER_HOME = System.getProperty("user.dir") + File.separator;

	public final static String CHROME_FILE = USER_HOME + "lib"+File.separator+"chromedriver.exe";

	public final static String FIREFOX_FILE = USER_HOME + "lib"+File.separator+"geckodriver.exe";

	public final static String IE_FILE = USER_HOME + "lib"+File.separator+"IEDriverServer.exe";

	public final static String CONFIG_FILE = USER_HOME + "src/test/resources" + File.separator+"config.properties";
	
	public final static String LOCATORS_FILE1 = USER_HOME + "src/test/resources" + File.separator + "locators" + File.separator+"ExplorePage.properties";
	
	public final static String LOCATORS_FILE2 = USER_HOME + "src/test/resources" + File.separator + "locators" + File.separator+"Validationresult.properties";

	public final static String LOG$J_FILE = USER_HOME + "Resources" + File.separator + "ConfigProperties" + File.separator+"log4j.properties";
	
	public final static String TESTDATA_FILE = USER_HOME + "src/test/resources" + File.separator + "testdata" + File.separator+"Validation.properties";

}
