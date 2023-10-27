import java.util.Scanner;
import java.util.Arrays;

public class InvetoryArrayList{
    public static void main(String[] args) {
        //  creates an  array to store pet names with a maximum limit of 100 pets
        String[] petList = new String[100];

        // Create a Scanner object to read user input
        Scanner ui = new Scanner(System.in);
        String userInput = "";
        int petCount = 0; // Keeps track of the number of pets in the list

        // Main loop for ui
        while (!userInput.equals("q")) {
System.out.println("What would you like to do? (a)dd, (i)nsert, (r)emove, Re(p)lace, (c)lear, (v)iew, or (q)uit");
            userInput = ui.nextLine();

            if (userInput.equals("a")) {
                // Add a pet to the list if there's room
                if (petCount < petList.length) {
                    System.out.println("Enter the name of the pet: ");
                    String petName = ui.nextLine();
                    petList[petCount] = petName;
                    petCount++;
                    System.out.println("Added: " + petName);
                } else {
                    System.out.println("The pet list is full. You can't add more pets.");
                }
            } else if (userInput.equals("i")) {
                // Insert a pet at a specific index
                System.out.println("Enter the name of the pet to insert: ");
                String petName = ui.nextLine();
                System.out.println("Enter the index to insert the pet: ");
                int index = Integer.parseInt(ui.nextLine());

                // Check for a valid index and available space
                if (index >= 0 && index <= petCount && petCount < petList.length) {
                    // Shift pets to make room for the new one
                    for (int i = petCount; i > index; i--) {
                        petList[i] = petList[i - 1];
                    }
                    petList[index] = petName;
                    petCount++;
                    System.out.println("Inserted: " + petName);
                } else {
                    System.out.println("Invalid index or the pet list is full. Pet not inserted.");
                }
            } else if (userInput.equals("r")) {
                // Remove a pet by its name
                System.out.println("Enter the name of the pet to remove: ");
                String petName = ui.nextLine();

                // Find the index of the pet to remove
                int indexToRemove = -1;
                for (int i = 0; i < petCount; i++) {
                    if (petList[i] != null && petList[i].equals(petName)) { //The code checks if the i in index in the  'petList' is not null aka making sure its nothign . it make ssure its empty  'petName' before comparing. You could also use zero instead of null whic is  saying the same thing /variable.https://www.upwork.com/resources/what-is-null-in-java 
                        indexToRemove = i;
                        break;
                    }
                }

                if (indexToRemove != -1) {
                    // Shift pets to fill the removed pet's place
                    for (int i = indexToRemove; i < petCount - 1; i++) {
                        petList[i] = petList[i + 1];
                    }
                    petList[petCount - 1] = null;
                    petCount--;
                    System.out.println("Removed: " + petName);
                } else {
                    System.out.println("Pet not found in the list.");
                }
            } else if (userInput.equals("p")) {
                // Replace a pet's name
                System.out.println("Enter the name of the pet to replace: ");
                String oldPetName = ui.nextLine();

                // Find the index of the old pet's name
                int index = -1;
                for (int i = 0; i < petCount; i++) {
                    if (petList[i] != null && petList[i].equals(oldPetName)) {
                        index = i;
                        break;
                    }
                }

                if (index != -1) {
                    // Get the new name for the pet
                    System.out.println("Enter the new name for the pet: ");
                    String newPetName = ui.nextLine();
                    petList[index] = newPetName;
                    System.out.println("Replaced " + oldPetName + " with " + newPetName);
                } else {
                    System.out.println("Pet not found in the list.");
                }
            } else if (userInput.equals("c")) {
                // Clear the pet list
                Arrays.fill(petList, 0, petCount, "");
                petCount = 0;
                System.out.println("Pet list cleared.");
            } else if (userInput.equals("v")) {
                // View the list of pets
                System.out.println("Pet List:");
                for (int i = 0; i < petCount; i++) {
                    System.out.println(petList[i]);
                }
            } else if (!userInput.equals("q")) {
                System.out.println("Please choose a valid option from the menu.");
            }
        }
        // End of the program
        System.out.println("bye bye");
    }
}
