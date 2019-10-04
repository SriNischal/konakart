package com.atmecs.konakart.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.atmecs.konakart.constatnts.ProjectBaseConstantPaths;

public class KonaKartProperties {
	public String readExplorePagePropertiesFile(String elements) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(ProjectBaseConstantPaths.LOCATORS_FILE1);
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;
	}

	public String readValidationPagePropertiesFile(String elements) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(ProjectBaseConstantPaths.LOCATORS_FILE2);
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;
	}

	public static String readConfig(String elements) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(ProjectBaseConstantPaths.CONFIG_FILE);
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;
	}
}