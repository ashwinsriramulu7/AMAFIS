package com.amafis;
import com.amafis.model.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to AMAFIS Console App");
        Car modelX = new ModelX(1, "Model X");
        System.out.println("Created: " + modelX);
        Part part1 = new Part(101, "Engine", 10, 5000.0);
        modelX.addPart(part1);
        System.out.println("Added Part: " + part1);
        User user = new User(1, "manufacturer1", "password", "manufacturer");
        System.out.println("Created User: " + user);
        scanner.close();
    }
}
