package com.amafis;
import com.amafis.model.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to AMAFIS Console App");
        Car zephyrus = new Zephyrus(1, "Zephyrus");
        System.out.println("Created: " + zephyrus);
        Car aether = new Aether(2, "Aether");
        System.out.println("Created: " + aether);
        Car luminous = new Luminous(3, "Luminous");
        System.out.println("Created: " + luminous);
        Car rapidus = new Rapidus(4, "Rapidus");
        System.out.println("Created: " + rapidus);
        Car velox = new Velox(5, "Velox");
        System.out.println("Created: " + velox);
        Part part1 = new Part(101, "Engine", 10, 5000.0);
        zephyrus.addPart(part1);
        System.out.println("Added Part: " + part1);
        User manufacturer = new Manufacturer(1, "manufacturer1", "password");
        System.out.println("Created User: " + manufacturer);

        scanner.close();
    }
}
