package com.napier.sem;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class App {

    public static void main(String[] args) {
        //Create interface with MongoDB
        MongoClient mongoClient = new MongoClient("mongo-dbserver");

        //Get a database
        MongoDatabase database = mongoClient.getDatabase("mydb");

        //Get a collection from the database
        MongoCollection<Document> collection = database.getCollection("test");

        //Create test document
        Document doc = new Document("name", "Connor Grattan")
                .append("module", "Software Engineering Methods")
                .append("year", "2018/19")
                .append("result", new Document("CW", 95)
                        .append("EX", 85));

        //Add document to collection
        collection.insertOne(doc);

        //Check that the document is in the collection
        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());
    }
}