package com.sachin4java.rabbitmqconsumer.listener;

public interface MessageListener {
	
	public void onMessage(String message);
}
