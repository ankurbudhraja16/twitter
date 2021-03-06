package com.uottawa.twittervisual.model;

import com.mongodb.MongoClient;

public enum ConnectionFactory {
    CONNECTION;
    private MongoClient client = null;

    private ConnectionFactory() {
        try {
            client = new MongoClient("localhost", 27017);
        } catch (Exception e) {
            // Log it.
        }
    }

    public MongoClient getClient() {
    	if (client == null)
        	client = new MongoClient("localhost", 27017);
        return client;
    }
    
    public void close() {
    	client.close();
    }
}