package BookStore;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scanner = new Scanner(System.in);
	        BookStore_implementation bookStore = new BookStore_implementation();


	        int option;
	        
	        do {
	            System.out.println("Welcome to the Book Store!");
	            System.out.println("1. Admin");
	            System.out.println("2. User");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            option = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (option) {
	                case 1:
	                	
	                    // Admin operations
	                    System.out.print("Enter admin username: ");
	                    String adminUsername = scanner.nextLine();
	                    System.out.print("Enter admin password: ");
	                    String adminPassword = scanner.nextLine();
	                    
	                    

	                    // Perform admin authentication
	                    if (adminUsername.equals("admin") && adminPassword.equals("admin123")) {
	                        System.out.println("Admin authentication successful.");
	                        System.out.println("Admin Options:");
	                        System.out.println("1. Add Book");
	                        System.out.println("2. Remove Book");
	                        System.out.println("3. Update Book");
	                        System.out.println("4. Display Books");
	                        System.out.println("5. Add User");
	                        System.out.println("6. Remove User");
	                        System.out.println("7. Display Users");
	                        System.out.println("8. Update User");
	                        System.out.println("9. Search Books");
	                        System.out.println("10. Search Users");
	                        
	                        System.out.println("0. Go back");
	                        
	                        String ch;
							do {
	                        
	                        System.out.print("Enter your choice: ");
	                        int adminOption = scanner.nextInt();
	                        scanner.nextLine(); // Consume the newline character

	                        switch (adminOption) {
	                            case 1:
	                                // Add Book
	                                System.out.print("Enter book title: ");
	                                String title = scanner.nextLine();
	                                System.out.print("Enter book author: ");
	                                String author = scanner.nextLine();
	                                System.out.print("Enter book price: ");
	                                double price = scanner.nextDouble();
	                                System.out.print("Enter book quantity: ");
	                               
	                                int quantity = scanner.nextInt();
	                                scanner.nextLine(); // Consume the newline character
	                                bookStore.addBook(title, author, price, quantity);
	                                System.out.println("Book added successfully.");
	                                break;
	                                
	                            case 2:
	                                // Remove Book
	                                System.out.print("Enter the index of the book to remove: ");
	                                int removeIndex = scanner.nextInt();
	                                bookStore.removeBook(removeIndex - 1);
	                                System.out.println("remove process Successfully completed");
	                                break;

	                            case 3:
	                                // Update Book
	                                System.out.print("Enter the index of the book to update: ");
	                                int updateIndex = scanner.nextInt();
	                                
	                                scanner.nextLine(); // Consume the newline character
	                                
	                                System.out.print("Enter new title: ");
	                                String newTitle = scanner.nextLine();
	                                
	                                System.out.print("Enter new author: ");
	                                String newAuthor = scanner.nextLine();
	                                
	                                System.out.print("Enter new price: ");
	                                double newPrice = scanner.nextDouble();
	                                
	                                System.out.print("Enter new quantity: ");
	                                int newQuantity = scanner.nextInt();
	                                
	                                bookStore.updateBook(updateIndex - 1, newTitle, newAuthor, newPrice, newQuantity);
	                                System.out.println("Book updated successfully.");
	                                break;
	                          
	                            case 4:
	                                // Display Books
	                                bookStore.displayBooks();
	                                break;
	                                
	                            case 5:
	                                // Add User
	                                System.out.print("Enter username: ");
	                                String username = scanner.nextLine();
	                                System.out.print("Enter password: ");
	                                String password = scanner.nextLine();
	                                System.out.print("Enter phone number: ");
	                                String phone_number = scanner.nextLine();
	                                bookStore.addUser(username, password, phone_number);
	                                System.out.println("User added successfully.");
	                                break;

	                            case 6:
	                                // Remove User
	                                System.out.print("Enter the index of the user to remove: ");
	                                int removeUserIndex = scanner.nextInt();
	                                bookStore.removeUser(removeUserIndex - 1);
	                                System.out.println("remove process Successfully completed");
	                                break;

	                            case 7:
	                                // Display Users
	                                bookStore.displayUsers();
	                                break;
	                                
	                            case 8:
	                                // Update User
	                                System.out.print("Enter the index of the user to update: ");
	                                int updateUserIndex = scanner.nextInt();
	                                scanner.nextLine(); // Consume the newline character
	                                System.out.print("Enter new user: ");
	                                String UserUpdate = scanner.nextLine();
	                                System.out.print("Enter new password: ");
	                                String PasswordUpdate = scanner.nextLine();
	                                System.out.print("Enter new phone number: ");
	                                String phone_nummber = scanner.nextLine();
	                                
	                                bookStore.updateUser(updateUserIndex -1, UserUpdate, PasswordUpdate, phone_nummber);
	                                System.out.println("User updated successfully.");
	                                break;
	                                
	                            case 9:
	                                // Search Books
	                                System.out.print("Enter a keyword to search for books: ");
	                                String bookKeyword = scanner.nextLine();
	                                bookStore.searchBooks(bookKeyword);
	                                break;
	                            case 10:
	                                // Search Users
	                                System.out.print("Enter a keyword to search for users: ");
	                                String userKeyword = scanner.nextLine();
	                                bookStore.searchUsers(userKeyword);
	                                break;

	                          
	                            case 0:
	                                // Go back
	                                break;
	                            default:
	                                System.out.println("Invalid option. Please try again.");
	                                break;
	                        }
	                        
	                        System.out.println("Do you want to continue in admin page [yes] or [no]");
	                        ch=scanner.next();
	                		
	                		}while(ch.equals("yes") || ch.equals("YES"));
	                        
	                        
	                        
	                        
	                    } else {
	                        System.out.println("Admin authentication failed. Access denied.");
	                    }
	                    break;
	                    
	                    
	                    
	                case 2:
	                    // User operations
	                    System.out.print("Enter username: ");
	                    String username = scanner.nextLine();
	                    System.out.print("Enter password: ");
	                    String password = scanner.nextLine();

	                    // Perform user authentication
	                    bookStore.loginUser(username, password);

	                    if (bookStore.isLoggedIn()) {
	                    	
	                        System.out.println("User authentication successful.");
	                        System.out.println("User Options:");
	                        System.out.println("1. Display Books");
	                        System.out.println("2. Purchase Book");
	                        System.out.println("0. Go back");
	                        
	                        
	                        String ch;
	                        do {
	                        
	                        System.out.print("Enter your choice: ");
	                        int userOption = scanner.nextInt();
	                        scanner.nextLine(); // Consume the newline character
	                        
	                       

	                        switch (userOption) {
	                            case 1:
	                                // Display Books
	                                bookStore.displayBooks();
	                                break;
	                            case 2:
	                                // Purchase Book
	                                System.out.print("Enter the index of the book to purchase: ");
	                                int purchaseIndex = scanner.nextInt();
	                                scanner.nextLine(); // Consume the newline character
	                                System.out.print("Enter the quantity to purchase: ");
	                                int purchaseQuantity = scanner.nextInt();
	                                scanner.nextLine(); // Consume the newline character
	                                bookStore.purchaseBook(purchaseIndex - 1, purchaseQuantity);
	                                break;
	                            case 0:
	                                // Go back
	                                break;
	                            default:
	                                System.out.println("Invalid option. Please try again.");
	                                break;
	                        }
	                        
	                        System.out.println("Do you want to continue in User page [yes] or [no]");
	                        ch=scanner.next();
	                		
	                		}while(ch.equals("yes") || ch.equals("YES"));
	                        
	                        
	                        
	                    } else {
	                        System.out.println("User authentication failed. Access denied.");
	                    }
	                    break;
	                    
	                    
	                    
	                case 0:
	                    // Exit
	                    System.out.println("Thank you for using the Book Store ...");
	                    break;
	                    
	               
	                default:
	                    System.out.println("Invalid option. Please try again.");
	                    break;
	            }
	        } while (option != 0);

	        scanner.close();
	        
	        
	        

	}

}
