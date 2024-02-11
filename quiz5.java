
import java.util.Scanner;

public class Main{
    public static Contacts[] contactList;
    public static int counter;
    public static Boolean found = false;
    public static int i; // Loop variable, array access
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName, lastName, number, email, relation, companyName, occupation;
        int menu = 0;
        Boolean invalid = false;

        System.out.println("----MENU---");
        System.out.println("1. Add a Personal Contact");
        System.out.println("2. Add a Professional Contact");
        System.out.println("3. Search for Contact");
        System.out.println("4. Delete Contact");
        System.out.println("5. Print Address Book");
        System.out.println("6. Exit");
        System.out.println("-------------------\n");


        do{
            do {
                invalid = false;
                System.out.println("\nPlease enter a number (1-6):");

                if(!sc.hasNextInt()){
                    System.out.println("YOU DID NOT ENTER AN INTERGER - TRY AGAIN!");
                    invalid = true;
                }
                menu = sc.nextInt();
                if (menu < 0 && menu > 6){
                    System.out.println("YOU DID NOT ENTER AN INTEGER BETWEEN 1 - 6. TRY AGAIN!");
                    invalid = true;
                }
    
            }while(invalid);

            switch(menu){
                case 1:
                System.out.println("Enter firstName, lastName, telephone, email, relation");
                firstName = sc.next();
                lastName = sc.next();
                number = sc.next();
                email = sc.next();
                relation = sc.nextLine();
            
                Personal contact = new Personal(relation);
                contact.createContact(firstName, lastName, number, email);
                AddPersonal(contact);
                break;
                case 2:
                    System.out.println("Enter firstName, lastName, telephone, email, occupation, company");
                    firstName = sc.next();
                    lastName = sc.next();
                    number = sc.next();
                    email = sc.next();
                    occupation = sc.next();
                    companyName = sc.nextLine();

                    Professional contact1 = new Professional(occupation, companyName);
                    contact1.createContact(firstName, lastName, number, email);
                    AddProfessional(contact1);
                    break;
                case 3:
                    System.out.println("Enter firstName lastName");
                    firstName = sc.next();
                    lastName = sc.next();
                    Search(firstName, lastName);
                    break;
                case 4:
                    System.out.println("Enter firstName lastName");
                    firstName = sc.next();
                    lastName = sc.next();
                    Delete(firstName, lastName);
                    break;
                case 5:
                    PrintAll();
                    break;
            }

        }while(menu != 6);
        
        sc.close();
    }
        
        public static void AddPersonal(Personal o){
            contactList[counter] = o;
            counter++;
        }
    
        public static void AddProfessional(Professional o){
            contactList[counter] = o;
            counter++;
        }
    
        public static void Search(String firstName, String lastName){
            while(!found && i < counter - 1){
                if(contactList[i].getFirstName() == firstName && contactList[i].getLastName() == lastName ){
                    found = true;
                    System.out.println("Contact found:\n");
                    contactList[i].printContact();
                }
                else{
                    i++;
                }
            }
            if(!found){
                System.out.println("Contact not found\n");
            }
            i = 0;
    
        }
    
        public static void Delete(String firstName, String lastName){
            while(!found && i < counter - 1){
                if(contactList[i].getFirstName() == firstName && contactList[i].getLastName() == lastName ){
                    found = true;
                    contactList[i].setFirstName("deleted");
                    System.out.println("Contact deleted.\n");
                }
                else{
                    i++;
                }
            }
            if(!found){
                System.out.println("Contact not found");
            }
            i = 0;
    
        }
    
        public static void PrintAll(){
    
            System.out.println("--Address Book--");
            while(i < counter - 1){
                if(contactList[i].getFirstName() != "deleted"){
                    contactList[i].printContact();
                    System.out.println();
                }
                i++;
            }
            i = 0;
    
            System.out.println("--END--");
        }
    
    }