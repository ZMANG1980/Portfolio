import java.util.Scanner;
import java.lang.Math;

public classComboRevJava4.java{
    public static void main(String[] args) {
        String allOrderSummaries = "";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String answer;
            int count = 1;
            double subtotal = 0.0; // Initialize subtotal
            double tax;
            double total;
            int orderNumber = 1;
            String finalSandwich = "";
            String finalFry = "";
            String finalDrink = "";
          // Counting variable for answers makes it so they have to input something; 0 makes it so they can bypass an input
             // Variable to store all order summaries
            // For sandwiches
            // Variables for each item
            int numOfSandwiches = 0;
            String sandwichType = "";
            int numOfFries = 0;
            String friesSize = "";
            int numOfDrinks = 0;
            String drinkSize = "";
            int ketchup = 0;

             // Flags for tracking whether each item is ordered in order to calculate the discount later on
            boolean orderedSandwich = false;
            boolean orderedFries = false;
            boolean orderedDrink = false;

            // Sandwich ordering station
            System.out.print("Would you like a sandwich? (y)es/(n)o): "); // ask user if the wnat a sandwhich
            answer = scanner.next();

            while (!"yYnN".contains(answer)) {
                System.out.print("Not a valid answer, try again... ");// this checks to see if the input contains certain letters and then if it does then it reads it as the awnser if not then it makes the user try it again
                answer = scanner.next();
            }

            if (answer.equals("y") || answer.equals("Y")) {  // if the awnser is equal to yes then it adds the number of sandwhiches to one 
                numOfSandwiches = 1;
                if (numOfSandwiches < 0) {
                    System.out.println("Sandwich " + count + ":\tNone"); //if the awsner is none then it puts it as none 
                    count++;
                }

                while (numOfSandwiches > 0) {
                    orderedSandwich = true;               // if orderd sandwhich  then it puts it at true then at the bottom it keeps tally if you ordered sandwhich fry and drink and makes it subtract one
                    System.out.print("What sandwich would you like: (c)hicken $5.25, (b)eef $6.25, or (t)ofu $5.75? ");
                    sandwichType = scanner.next();

                    while (!"cCbBtT".contains(sandwichType)) {   // this checks to see if the input contains certain letters and then if it does then it reads it as the awnser if not then it makes the user try it again
                        System.out.print("Not a valid option, try again... ");
                        sandwichType = scanner.next();
                    }

                    if (sandwichType.equals("c") || sandwichType.equals("C")) {
                        subtotal += 5.25;
                        numOfSandwiches = 0;
                        finalSandwich = "chicken";
                        System.out.println("Sandwich " + count + ":\tChicken");
                        count++;
                    } else if (sandwichType.equals("b") || sandwichType.equals("B")) {
                        subtotal += 6.25;
                        numOfSandwiches = 0;
                        finalSandwich = "beef";
                        System.out.println("Sandwich " + count + ":\tBeef");
                        count++;
                    } else if (sandwichType.equals("t") || sandwichType.equals("T")) {
                        subtotal += 5.75;
                        numOfSandwiches = 0;
                        finalSandwich = "tofu";
                        System.out.println("Sandwich " + count + ":\tTofu");
                        count++;
                    }
                }
            } else {
                System.out.println("Sandwich " + count + ":\tNone");
            }

            // Fries
            count = 1;
            System.out.print("Would you like fries? (y)es/(n)o): ");
            answer = scanner.next();

            while (!"yYnN".contains(answer)) {
                System.out.print("Not a valid answer, try again... ");
                answer = scanner.next();
            }

            if (answer.equals("y") || answer.equals("Y")) {
                numOfFries = 1;

                if (numOfFries < 0) {
                    System.out.println("Fries " + count + ":\tNone");
                    count++;
                }

                while (numOfFries > 0) {
                    orderedFries = true;
                    System.out.print("What Fry size would you like: (s)mall $1.00, (m)edium $1.75, or (l)arge $large? ");
                    friesSize = scanner.next();

                    while (!"sSmMlL".contains(friesSize)) {
                        System.out.print("Not a valid option, try again... ");
                        friesSize = scanner.next();
                    }

                    if (friesSize.equals("s") || friesSize.equals("S")) {
                        subtotal += 1.25;
                        numOfFries = 0;
                        finalFry = "small";
                        System.out.println("Fries " + count + ":\tSmall");
                        count++;
                    }
                    if (friesSize.equals("m") || friesSize.equals("M")) {
                        subtotal += 1.75;
                        numOfFries = 0;
                        finalFry = "medium";
                        System.out.println("Fries " + count + ":\tMedium");
                        count++;
                    }
                    if (friesSize.equals("l") || friesSize.equals("L")) {
                        subtotal += 2.00;
                        numOfFries = 0;
                        finalFry = "large";
                        System.out.println("Fries " + count + ":\tLarge");
                        count++;
                    }
                }
            } else {
                System.out.println("Fries " + count + ":\tNone");
            }

            // Drinks
            count = 1;
            System.out.print("Would you like a drink? ((y)es/(n)o): ");
            answer = scanner.next();

            while (!"yYnN".contains(answer)) {
                System.out.print("Not a valid answer, try again... ");
                answer = scanner.next();
            }

            if (answer.equals("y") || answer.equals("Y")) {
                numOfDrinks = 1;

                if (numOfDrinks < 0) {
                    System.out.println("Drink " + count + ":\tNone");
                    count++;
                }

                while (numOfDrinks > 0) {
                    orderedDrink = true;
                    System.out.print("What size drink would you like: (s)mall/(m)edium/(l)arge)? ");
                    drinkSize = scanner.next();

                    while (!"sSmMlL".contains(drinkSize)) {
                        System.out.print("Not a valid option, try again... ");
                        drinkSize = scanner.next();
                    }

                    if (drinkSize.equals("s") || drinkSize.equals("S")) {
                        subtotal += 1.00;
                        numOfDrinks = 0;
                        finalDrink = "small";
                        System.out.println("Drink " + count + ":\tSmall");
                        count++;
                    } else if (drinkSize.equals("m") || drinkSize.equals("M")) {
                        subtotal += 1.50;
                        numOfDrinks = 0;
                        finalDrink = "medium";
                        System.out.println("Drink " + count + ":\tMedium");
                        count++;
                    } else if (drinkSize.equals("l") || drinkSize.equals("L")) {
                        System.out.print("Would you like to child-size that for $0.38 more? (y)es/(n)o): ");
                        answer = scanner.next();
                        while (!"yYnN".contains(answer)) {
                            System.out.print("Not a valid answer, try again... ");
                            answer = scanner.next();
                        }

                        if (answer.equals("y") || answer.equals("Y")) {
                            subtotal += 2.38;
                            numOfDrinks = 0;
                            finalDrink = "childsize";
                            System.out.println("Drink " + count + ":\tChild");
                            count++;
                        } else {
                            subtotal += 2.00;
                            numOfDrinks = 0;
                            finalDrink = "large";
                            System.out.println("Drink " + count + ":\tLarge");
                            count++;
                        }
                    }
                }
            } else {
                System.out.println("Drink " + count + ":\tNone");
            }

            // Ketchup
            System.out.print("Would you like ketchup with that? (y)es/(n)o): ");
            answer = scanner.next();

            while (!"yYnN".contains(answer)) {
                System.out.print("Not a valid answer, try again... ");
                answer = scanner.next();
            }

            if (answer.equals("y") || answer.equals("Y")) {
                System.out.print("How many packets of ketchup would you like? ($0.25 per packet) ");

                while (!scanner.hasNextInt()) {
                    System.out.print("Please enter a valid number... ");
                    scanner.next();
                }

                ketchup = scanner.nextInt();

                while (ketchup < 0) { //if the ketchup value is less than 0 then it is negative and  it is not acliable and the user has to type it again 
                    System.out.print("Please choose a positive number... ");
                    while (!scanner.hasNextInt()) {//makes it so that if it is not an integer it is not a valid input it also will not except decimals because it is  onal taking in integers 
                        System.out.print("Please enter a valid number... ");
                        scanner.next();
                    }
                    ketchup = scanner.nextInt();
                }

                if (ketchup > 0) {
                    subtotal += ketchup * 0.25;
                }
            } else {
                System.out.println("Ketchup:\tNone");
            }

            // Calculate subtotal
            System.out.printf("Subtotal: $%.2f%n", subtotal);// %.2f formats the subtotal with 2 decimal places
            // Apply discount if all items are ordered

            // Apply discount if all items are ordered
            if (orderedSandwich && orderedFries && orderedDrink) {
                subtotal -= 1.0; // Apply a $1.00 discount
            }

            // Calculate tax and total
            double taxRate = 0.07; // 7% tax rate
            tax = subtotal * taxRate;
            total = subtotal + tax;

            // Round the total to the nearest whole number
            total = Math.round(total);

            // Print tax and total with formatted strings
            System.out.printf("Tax: $%.2f%n", tax);// %.2f formats the tax with 2 decimal places
            System.out.printf("Total: $%.2f%n", total);// %.2f formats the total with 2 decimal places

            // Store the individual order summary
            String orderSummary = "Order " + orderNumber + ":\n";
            orderSummary += "Sandwich: " + (orderedSandwich ? finalSandwich : "None") + "\n";
            orderSummary += "Fries: " + (orderedFries ? finalFry : "None") + "\n";
            orderSummary += "Drink: " + (orderedDrink ? finalDrink : "None") + "\n";
            orderSummary += "Ketchup Packets: " + ketchup + "\n\n"; // adds up each item in to order summery so it can list out everyhing in each summary

            // Append the individual order summary to the overall order summaries
            allOrderSummaries += orderSummary;

            // Ask if the user wants to place another order
            System.out.print("Do you want to place another order? (y)es/(n)o): ");
            answer = scanner.next();

            if (!"yY".contains(answer)) {
                // Exit the loop if the user does not want to place another order
                break;
            }

            orderNumber++; // Increment the order number
        }

        // Print all order summaries
        System.out.println("All Order Summaries:");
        System.out.println(allOrderSummaries);
    }
}









