package org.example;
import java.util.Scanner;
public class Farm {
    CropHandler CropHandler = new CropHandler();
    AnimalHandler AnimalHandler = new AnimalHandler();

    public void MainMenu() {
        CropHandler.AnimalHandler = AnimalHandler;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. View Crops");
            System.out.println("2. Add Crops");
            System.out.println("3. Remove Crops");
            System.out.println("4. View Animals");
            System.out.println("5. Add Animals");
            System.out.println("6. Feed Animals");
            System.out.println("7. Remove Animals");
            System.out.println("8. Save and Quit");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                CropHandler.viewCrops();
            } else if (input.equals("2")) {
                CropHandler.addCrops();
            } else if (input.equals("3")) {
                CropHandler.removeCrops();
            } else if (input.equals("4")) {
                AnimalHandler.viewAnimals();
            } else if (input.equals("5")) {
                AnimalHandler.addAnimal();
            } else if (input.equals("6")) {
                CropHandler.feedAnimal();
            } else if (input.equals("7")) {
                AnimalHandler.removeAnimal();
            } else if (input.equals("8")) {
                AnimalHandler.saveAnimal();
                CropHandler.saveCrop();
                break;
            } else {
                System.out.println("Not a valid option");
            }
        }
    }
}

















