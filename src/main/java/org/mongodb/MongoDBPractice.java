package org.mongodb;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import org.bson.Document;

import java.io.FileWriter;
import java.io.IOException;

public class MongoDBPractice {
    public static void main(String[] args) {
        // Set the MongoDB connection URI
        String connectionString = "mongodb+srv://cuongnguyen-oceansmart:Thankgodigotin14423@cluster0.mz2ezys.mongodb.net/admin?retryWrites=true&replicaSet=atlas-vtn1hh-shard-0&readPreference=primary&srvServiceName=mongodb&connectTimeoutMS=10000&authSource=admin&authMechanism=SCRAM-SHA-1";

        // Create a MongoClientURI object with the connection string
        MongoClientURI uri = new MongoClientURI(connectionString);

        // Create a MongoClient object with the MongoClientURI
        MongoClient mongoClient = new MongoClient(uri);

        // Access a database
        MongoDatabase database = mongoClient.getDatabase("my_database");

        MongoIterable<String> collectionNames = database.listCollectionNames();
        for (String collectionName : collectionNames) {
            System.out.println("====>"+collectionName);

        }
        MongoCollection<Document> collection = database.getCollection("student");
        Document newDocument = new Document();
        newDocument.append("date", "Apr 27")
                .append("content", "i love java so much");


        collection.insertOne(newDocument);
        String jsonString = newDocument.toJson();
        String outputPath = "/Users/cuongnguyen-oceansmart/Downloads/play-cognitive-home-master/my_diary.txt";

        // Write the JSON string to the text file
        try (FileWriter fileWriter = new FileWriter(outputPath)) {
            fileWriter.write(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

