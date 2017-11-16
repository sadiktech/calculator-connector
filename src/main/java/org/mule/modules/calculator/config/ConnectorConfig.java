package org.mule.modules.calculator.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

    /**
     * Greeting message
     */
    @Configurable
    @Default("Hello")
    private String greeting;

    /**
     * Reply message
     */
    @Configurable
    @Default("How are you?")
    private String reply;
    
    
    public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	/**
     * Reply message
     */
    @Configurable
    @Default("5")
    private String value1;
    
    /**
     * Reply message
     */
    @Configurable
    @Default("6")
    private String value2;
    
    /**
     * Reply message
     */
    @Configurable
    @Default("SUBS")
    private String action;
    

    /**
     * Set greeting message
     *
     * @param greeting the greeting message
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    /**
     * Get greeting message
     */
    public String getGreeting() {
        return this.greeting;
    }

    /**
     * Set reply
     *
     * @param reply the reply
     */
    public void setReply(String reply) {
        this.reply = reply;
    }

    /**
     * Get reply
     */
    public String getReply() {
        return this.reply;
    }

}