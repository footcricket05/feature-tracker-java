package com.example;
import java.io.FileWriter;
import java.io.IOException;

public class FeatureTracker {
    public static void main(String[] args) {
        addFeature("Login functionality");
    }

    public static void addFeature(String feature) {
        try (FileWriter writer = new FileWriter("features.txt", true)) {
            writer.write(feature + "\n");
            System.out.println("Feature added: " + feature);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}