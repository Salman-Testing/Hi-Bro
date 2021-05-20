package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReportGeneration {
	
	public static void jvmReportNew(String json) {
		
		File f = new File(System.getProperty("user.dir")+"\\REPORTS\\JVMFolder");
		
		Configuration c = new Configuration(f, "Social Media Application");
		
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Version", "4.8.0");
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder r = new ReportBuilder(li, c);
		
		r.generateReports();
		
		

	}

}
