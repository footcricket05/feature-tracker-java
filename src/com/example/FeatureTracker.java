package com.example;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FeatureTracker {
    public static void main(String[] args) {
        addFeature("Login functionality");
    }

    public static void addFeature(String feature) {
        try (FileWriter writer = new FileWriter("features.txt", true)) {
            writer.write(feature + "\n");
            System.out.println("Feature added: " + feature);
        listFeatures();
    }

    public static void listFeatures() {
        try (BufferedReader reader = new BufferedReader(new FileReader("features.txt"))) {
            String line;
            System.out.println("Feature List:");
            while ((line = reader.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}