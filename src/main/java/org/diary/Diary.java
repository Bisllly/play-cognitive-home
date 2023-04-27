package org.diary;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoConfigurationException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Diary {
    public static void main(String[] args) {
        try {
            // Disable INFO-level logging
            Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);

            // Connect to MongoDB
            String connectionString = "mongodb+srv://cuongnguyen-oceansmart:Thankgodigotin14423@cluster0.mz2ezys.mongodb.net/admin?retryWrites=true&replicaSet=atlas-vtn1hh-shard-0&readPreference=primary&srvServiceName=mongodb&connectTimeoutMS=10000&authSource=admin&authMechanism=SCRAM-SHA-1";
            MongoClientURI uri = new MongoClientURI(connectionString);
            MongoClient mongoClient = new MongoClient(uri);

            MongoDatabase database = mongoClient.getDatabase("my_database");
            //        database.createCollection("diary");
            MongoCollection<Document> collection = database.getCollection("diary");

            // Get user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Note: indicate a new line by typing `<nl>`");
            System.out.println("Enter date today: ");
            String date = scanner.nextLine();

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Your deepest thoughts: ");
            String thoughts = scanner.nextLine();

            scanner.close();
            scanner1.close();

            date = date.replaceAll("<nl>", "\n");
            thoughts = thoughts.replaceAll("<nl>", "\n");


            // Create a new document with the user input
            Document document = new Document("date", date);
            document.append("thoughts", thoughts);

            // Insert the document into the MongoDB collection
            collection.insertOne(document);

            // Update the text file with the new data
            updateTextFile(date);
            updateTextFile(thoughts);

            System.out.println("Data imported to MongoDB and `my_diary.txt` updated.");
        } catch (MongoConfigurationException e) {};
    }

    private static void updateTextFile(String data) {
        // Specify the path of the text file
        String filePath = "/Users/cuongnguyen-oceansmart/Downloads/play-cognitive-home-master/my_diary.txt";

        // Append the new data to the text file
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
