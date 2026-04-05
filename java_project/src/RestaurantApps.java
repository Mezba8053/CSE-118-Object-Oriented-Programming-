import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantApps {
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
      RestaurantManager restaurantmanager = new RestaurantManager();
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Main Menu:");
            System.out.println("1) Search Restaurants");
            System.out.println("2) Search Food Items");
            System.out.println("3) Add Restaurant");
            System.out.println("4) Add Food Item to the Menu");
            System.out.println("5) Exit System");
            System.out.print("Enter option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {

                case 1:
                    int choice1;
                    scanner = new Scanner(System.in);
                    do{
                        System.out.println("Restaurant Searching Options:");
                        System.out.println("1)By Name");
                        System.out.println("2)By Score");
                        System.out.println("3)By Catagory");
                        System.out.println("4)By Price");
                        System.out.println("5)By Zip Code");
                        System.out.println("6) Different Category Wise List of Restaurants");
                        System.out.println("7)Back to Main Menu");
                        System.out.print("Enter option: ");
                        choice1 = scanner.nextInt();
                        scanner.nextLine();
                        if(choice1<1&&choice1>7){
                            System.out.println("Invalid Choice");
                        }
                        else {
                            switch (choice1) {
                                case 1:
                                    System.out.println("Enter Restaurant Name");
                                    String name = scanner.nextLine();
                                    restaurantmanager.searchByName(name);
                                    break;
                                case 2:
                                    System.out.print("Enter Restaurant Score:");
                                    double range1, range2;
                                    range1 = scanner.nextDouble();
                                    range2 = scanner.nextDouble();
                                    restaurantmanager.searchByScore(range1, range2);
                                    break;
                                case 3:
                                    System.out.println("Enter Restaurant Catagory");
                                    String catagory = scanner.nextLine();
                                    restaurantmanager.searchByCatagory(catagory);
                                    break;
                                case 4:
                                    System.out.println("Enter Restaurant Price");
                                    String price = scanner.nextLine();
                                    restaurantmanager.searchByPrice(price);
                                    break;
                                case 5:
                                    System.out.println("Enter Restaurant Zip Code");
                                    int zipcode = scanner.nextInt();
                                    restaurantmanager.searchByZipcode(zipcode);
                                    break;
                                case 6:
                                    System.out.println("Enter Restaurant Catagory");
                                    String catagory1 = scanner.nextLine();
                                    restaurantmanager.searchByCatagory(catagory1);
                                    break;
                                case 7:
                                    break;
                                default:
                                    System.out.println("Invalid option. Please try again.");
                            }
                        }
                        }while(choice1!=7);
                        break;
                        case 2:
                            int choice2;
                            scanner = new Scanner(System.in);
                            do{
                                System.out.println("Food Item Searching Options:");
                                System.out.println("1)By Name");
                                System.out.println("2) By Name in a Given Restaurant");
                                System.out.println("3) By Catagory");
                                System.out.println("4) By Category in a Given Restaurant");
                                System.out.println("5) By Price Range");
                                System.out.println("6) By Price Range in a Given Restaurant");
                                System.out.println("7) Costliest Food Item(s) on the Menu in a Given Restaurant");
                                System.out.println("8) List of Restaurants and Total Food Item on the Menu");
                                System.out.println("9) Back to Main Menu");
                                System.out.print("Enter option: ");
                                choice2 = scanner.nextInt();
                                scanner.nextLine();
                                 if(choice2<1&&choice2>7){
                            System.out.println("Invalid Choice");
                        }
                        else {
                            switch (choice2) {
                                case 1:
                                  String name = scanner.nextLine();
                                    restaurantmanager.searchByFoodname(name);
                                    break;
                                case 2:
                                String name1=scanner.nextLine();
                                    String name2 = scanner.nextLine();
                                   restaurantmanager.searchByFood_restaurant(name1,name2);
                                    break;
                                case 3:
                                    //System.out.println("Enter Restaurant Catagory");
                                    String catagory = scanner.nextLine();
                                    restaurantmanager.searchByCatagory(catagory);
                                    break;
                                case 4:
                                    //System.out.println("Enter Restaurant Price");
                                    String name4=scanner.nextLine();
                                    String namerest = scanner.nextLine();
                                    restaurantmanager.searchByCatagory_restaurant(name4,namerest);
                                    break;
                                case 5:
                                    double range1, range2;
                                    range1 = scanner.nextDouble();  
                                    range2 = scanner.nextDouble();
                                    restaurantmanager.searchByPricerange(range1, range2);
                                case 6:
                                  //  System.out.println("Enter Restaurant Catagory");
                                  double range3, range4;  
                                  String name5;
                                   range3 = scanner.nextDouble();
                                      range4 = scanner.nextDouble();
                                        name5=scanner.nextLine();
                                    restaurantmanager.searchByPricerange_restaurant(range3, range4,name5);
                                    break;
                                case 7:
                                String name6=scanner.nextLine();
                                restaurantmanager.costliestfood(name6);
                                    break;
                                    case 8:
                                    restaurantmanager.displaytotalfood();
                                    case 9:
                                    break;
                                default:
                                    System.out.println("Invalid option. Please try again.");
                            }
                        }
                        }while(choice1!=9);
                        break;
                        case 3:
                        


                            }

                    }


            }
        

    @Override
            public String toString() {
                return "RestaurantApps []";
            }