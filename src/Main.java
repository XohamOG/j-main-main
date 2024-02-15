import Model.Clients.*;
import java.util.Scanner;

/**
 * Identification comments:
 *   Name: soham patil
 *   System: Health Monitoring System
 *   Experiment Title:
 *   Experiment Date:
 *   @version 1.0
 *
 *
 * Beginning comments:
 * Filename: Main.java
 * @author:  Richard Joseph
 * Overview: This is the main class used to create objects for Client Class, Records class; Menu Driven Program. In this file we have achieved the following
 * - Object Creation
 * - Calling Setters and Getters
 * - Creating Object Arrays
 * - Looping through Object Array
 * - Displaying contents of object array
 *
 */

public class Main {
    public static void main(String[] args) {

        //Creating a single Object
        Client c1 = new Client();

        // Using setters to set the values

        c1.setClient_name("Soham Patil");
        c1.setClient_age(18);
        c1.setClient_email("2023.soham.patil@ves.ac.in");
        c1.setClient_gender("Male");

        //Display client data
        c1.display();

        //Creating client object array
        Client clientArr[] = new Client[3];

        //Creating a Scanner Object to take input
        Scanner sc = new Scanner(System.in);

        //Using For Loop to Take user input for each client object
        do{
            System.out.println("1 - add client");
            System.out.println("2 - edit client");
            System.out.println("3 - delete client");
            System.out.println("4 -  display clients");
            System.out.println("5 - exit");
            System.out.print("Enter Choice of Operation : ");

            int ch;
            ch = sc.nextInt();

            if (ch==1){
                for (int i = 0; i < clientArr.length; i++) {
                    clientArr[i] = new Client();


                    sc.nextLine();

                    System.out.println("Enter Client Name: ");
                    String name = sc.nextLine();
                    clientArr[i].setClient_name(name);


                    System.out.println("Enter Client Age: ");
                    int age = sc.nextInt();
                    clientArr[i].setClient_age(age);
                    sc.nextLine();

                    System.out.println("Enter Client Email: ");
                    String email = sc.nextLine();
                    clientArr[i].setClient_email(email);

                    System.out.println("Enter Client Gender: ");
                    String gender = sc.nextLine();
                    clientArr[i].setClient_gender(gender);
                }
            }
            else if (ch == 2) {
                // Displaying existing clients for selection
                System.out.println("Existing Clients:");
                for (int i = 0; i < clientArr.length; i++) {
                    System.out.println((i + 1) + ". " + clientArr[i].getClient_name());
                }

                // Prompting user to select a client to edit
                System.out.println("Enter the client number you want to edit:");
                int userChoice = sc.nextInt();
                sc.nextLine();

                if (userChoice > 0 && userChoice <= clientArr.length) {
                    int index = userChoice - 1;
                    Client selectedClient = clientArr[index];

                    System.out.println("Selected Client Information:");
                    selectedClient.display();

                    System.out.println("Enter new information for the selected client:");
                    System.out.print("Enter Client Name: ");
                    String name = sc.nextLine();
                    selectedClient.setClient_name(name);

                    System.out.print("Enter Client Age: ");
                    int age = sc.nextInt();
                    selectedClient.setClient_age(age);
                    sc.nextLine();

                    System.out.print("Enter Client Email: ");
                    String email = sc.nextLine();
                    selectedClient.setClient_email(email);

                    System.out.print("Enter Client Gender: ");
                    String gender = sc.nextLine();
                    selectedClient.setClient_gender(gender);

                    System.out.println("Updated Client Information:");
                    selectedClient.display();
                } else {
                    System.out.println("Invalid client number.");
                }
            }

            else if (ch==3){
                for(int i=0;i<clientArr.length;i++){

                    System.out.print("Enter Index of client to delete : ");
                    int user = sc.nextInt();
                    sc.nextLine();
                    clientArr[user].setClient_name(null);
                    clientArr[user].setClient_age(0);
                    clientArr[user].setClient_email(null);
                    clientArr[user].setClient_gender(null);


                }



            }

            else if(ch==4){

                for(int i=0;i<clientArr.length;i++){

                    System.out.print("");
                    clientArr[i].display();
                 }
                }
            else if(ch == 5){
                return ;
            }

            else{

                System.out.println("invalid input");
            }
        } while (true);
    }
}
