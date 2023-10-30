import java.util.Scanner; 
import java.util.ArrayList; 

public class InvetoryArray { 
    public static void main(String[] args) { 
        // Create an ArrayList to store pet names
        ArrayList<String> petList = new ArrayList<String>();

        // Create a Scanner object to read user input
        Scanner ui = new Scanner(System.in);

        // Initialize a variable to store user input
        String userInput = "";

        // Main loop 
        while (!userInput.equals("q")) { // Continue as long as the user doesn't quit
            // Display the various options
            System.out.println("What would you like to do? (a)dd, (i)nsert, (r)emove, Re(p)lace, (c)lear, (v)iew, or (q)uit");
            userInput = ui.nextLine();

            if (userInput.equals("a")) { // If the  adds a pet it adds a pet to the list
                System.out.println("Enter the name of the pet: ");
                String petName = ui.nextLine();
                petList.add(petName); // Adds the pet's name to the list
                System.out.println("Successfully added: " + petName); 
            } else if (userInput.equals("i")) { 
                // Insert a pet at a specific index
                System.out.println("Enter the name of the pet to insert: ");
                String petName = ui.nextLine();
                System.out.println("Enter the index to insert the pet: ");
                int index = Integer.parseInt(ui.nextLine());

                if (index >= 0 && index <= petList.size()) { // Check if the index is valid
                    petList.add(index, petName); 
                    System.out.println("Successfully inserted: " + petName); 
                } else {
                    System.out.println("Invalid index. Pet not inserted."); // notes an invalid index
                }
            } else if (userInput.equals("r")) { // If the user chooses to remove a pet
                // Remove a pet by name
                System.out.println("Enter the name of the pet to remove: ");
                String petName = ui.nextLine();

                if (petList.remove(petName)) { 
                    System.out.println("Successfully removed: " + petName); // varifies the removal
                } else {
                    System.out.println("Pet not found in the list."); // tell user if the pet is not in the list
                }
            } else if (userInput.equals("p")) { // If the user chooses to replace a pet's nameit will eplace a pet's name
                System.out.println("Enter the name of the pet to replace: ");
                String oldPetName = ui.nextLine();
                int index = petList.indexOf(oldPetName); // Find the index of the old pet name

                if (index != -1) { // Check if their is a  pet to replace in the index
                    System.out.println("Enter the new name for the pet: ");
                    String newPetName = ui.nextLine();
                    petList.set(index, newPetName); // Replace the old pet name with the new one
                    System.out.println("Successfully replaced " + oldPetName + " with " + newPetName); // confirms the replacement
                } else {
                    System.out.println("Pet not found in the list."); // tels tge user if the old pet name is not in the list
                }
            } else if (userInput.equals("c")) { // input so taht the user chooses to clear the entire list
                petList.clear(); // removes  all pet names from the list
                System.out.println("All pet information cleared."); // 
            } else if (userInput.equals("v")) {
                // View the list of pets
                System.out.println("Pet List:");
                for (String pet : petList) { // Iterate through the list and print each pet name
                    System.out.println(pet);
                }
            } else if (!userInput.equals("q")) {
                System.out.println("Please select a valid option.");
            }
        }
        System.out.println("bye bye"); 
    }
}
