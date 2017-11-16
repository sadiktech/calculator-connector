package org.mule.modules.calculator;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.calculator.config.ConnectorConfig;

@Connector(name="calculator", friendlyName="Calculator")
public class CalculatorConnector {

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     */
    @Processor
    public String greet(String friend) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return config.getGreeting() + " " + friend + ". " + config.getReply();
    }
    
    @Processor
    public String getCalculation(int value1,int value2,String action) {
    	
    	String finalValue = "";
    	
    	if("SUBS".equalsIgnoreCase(action)){
    		  
    		finalValue = ""+(value1 - value2);
    		
    	  }else if ("ADD".equalsIgnoreCase(action)){
    		  
    		  finalValue = ""+(value1 + value2);
    	  }
    	
        return finalValue;
    }
    
    

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}