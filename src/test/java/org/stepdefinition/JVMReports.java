package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	public static void generateJVMReport(String json) {

		// Mention target folder for JVM Reports
		File f = new File("src\\test\\resources\\Reports\\JVM Reports");

		// Add details to report
		Configuration con = new Configuration(f, "Login FB and Amazon");
		con.addClassifications("Platform", "Windows");
		con.addClassifications("Browser", "Chrome Browser");
		con.addClassifications("Browser Version", "v.83.0");
		con.addClassifications("Sprint", "1");

		// Add json files path to array list variable
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(json);

		// Generate jvm reports
		ReportBuilder r = new ReportBuilder(jsonFiles, con);
		r.generateReports();
	}

}
