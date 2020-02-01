package com.napier.sem;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
* <h1>SEM Coursework</h1>
* <p>Program to provide a simple source of population data.</p>
* 
* @author Group 16
* @version 0.1.0.2
* @since 2020/27/01
*/
public class App {

    public static void main(String[] args) {
        //Create interface with MongoDB
        MongoClient mongoClient = new MongoClient("mongo-dbserver");

        //Get a database
        MongoDatabase database = mongoClient.getDatabase("mydb");

        //Get a collection from the database
        MongoCollection<Document> collection = database.getCollection("test");

        //Create test document
        Document doc = new Document("name", "Batman")
                .append("superpower", "Inheritance money")
                .append("rival", "The mentally handicapped")
                .append("alterego", new Document("Name", "Bruce Wayne")
                        .append("occupation", "businessman"));

        //Add document to collection
        collection.insertOne(doc);

        //Check that the document is in the collection
        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());
    }
}
