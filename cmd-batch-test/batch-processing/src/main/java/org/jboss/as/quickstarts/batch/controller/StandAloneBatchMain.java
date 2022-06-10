package org.jboss.as.quickstarts.batch.controller;

import java.util.Properties;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;

public class StandAloneBatchMain {
	// C:\Users\lanig\AppData\Local\Temp\temp-file.txt
	
    public static void main(String... args) {
        JobOperator job = BatchRuntime.getJobOperator();
        Properties jobParameters = new Properties();
        
        jobParameters.setProperty("fileName", "temp-file.txt");
        long execID = job.start("import-file", jobParameters);
        
//        obOperator operator = BatchRuntime.getJobOperator();
//        Batches.waitForEnd(operator, operator.start("jackson-reader", new Properties()));
    }    
}