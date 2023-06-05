package BookStore;

import java.util.ArrayList;
import java.util.List;

public class BookStore_implementation implements BookStore_services {
	
	  private List<Book> books;
	   private List<User> users;
	   private User loggedInUser;

	@Override
	public void addBook(String title, String author, double price, int quantity) {
		// TODO Auto-generated method stub
		
		 Book book = new Book(title, author, price, quantity);
	        books.add(book);
		
	}

	public BookStore_implementation() {
		super();
		
		  books = new ArrayList<>();
		  users = new ArrayList<>();
		  loggedInUser=null;
	}

	@Override
	public void displayBooks() {
		// TODO Auto-generated method stub
		
	
		
		  System.out.println("Available Books:");
	        for (int i = 0; i < books.size(); i++) {
	            Book book = books.get(i);
	            System.out.println((i + 1) + ". " + book.getTitle() + " by " + book.getAuthor() +
	                    " | Price: $" + book.getPrice() + " | Quantity: " + book.getQuantity());
	        }
		
	}

	public void removeBook(int index) {
		// TODO Auto-generated method stub
		
		  if (index >= 0 && index < books.size()) {
	            books.remove(index);
	        } else {
	            System.out.println("Invalid book index.");
	        }
		
	}

	public void updateBook(int index, String title, String author, double price, int quantity) {
		// TODO Auto-generated method stub
		
		   if (index >= 0 && index < books.size()) {
	            Book book = books.get(index);
	            book.setTitle(title);
	            book.setAuthor(author);
	            book.setPrice(price);
	            book.setQuantity(quantity);
	        } else {
	            System.out.println("Invalid book index.");
	        }
		
	}

	@Override
	public void addUser(String username, String password, String Phone_number) {
		// TODO Auto-generated method stub
		
		   User user = new User(username, password, Phone_number);
	        users.add(user);
		
	}

	@Override
	public void removeUser(int index) {
		// TODO Auto-generated method stub
		
		  if (index >= 0 && index < users.size()) {
	            users.remove(index);
	        } else {
	            System.out.println("Invalid user index.");
	        }
		
	}

	@Override
	public void updateUser(int index, String name, String password, String phone_number) {
		// TODO Auto-generated method stub
		
		 if (index >= 0 && index < users.size()) {
			  User user = users.get(index);
	            user.setUsername(name);
	            user.setPassword(password);
	            user.setPhone_number(phone_number);
	            System.out.println("User updated successfully.");
	        } else {
	            System.out.println("Invalid user index.");
	        }
		 
		 
		 
		
		
	}

	@Override
	public void displayUsers() {
		// TODO Auto-generated method stub
		
		
		 System.out.println("Registered Users:");
	        for (int i = 0; i < users.size(); i++) {
	            User user = users.get(i);
	            System.out.println((i + 1) + ". Username: " + user.getUsername() + " Password: "+ user.getPassword()+" number: "+user.getPhone_number());
	            
	        }
	      
		
		
	}

	@Override
	public void purchaseBook(int index, int quantity) {
		// TODO Auto-generated method stub
		
		  if (index >= 0 && index < books.size()) {
	            Book book = books.get(index);
	            if (book.getQuantity() >= quantity) {
	                double totalPrice = book.getPrice() * quantity;
	                book.setQuantity(book.getQuantity() - quantity);
	                System.out.println("Purchase successful.");
	                System.out.println("Book: " + book.getTitle());
	                System.out.println("Quantity: " + quantity);
	                System.out.println("Total Price: $" + totalPrice);
	            } else {
	                System.out.println("Insufficient quantity. Please try again.");
	            }
	        } else {
	            System.out.println("Invalid book index.");
	        }
	    }
	    

	@Override
	public void loginUser(String username, String password) {
		// TODO Auto-generated method stub
		
		  for (User user : users) {
	            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
	                loggedInUser = user;
	                System.out.println("Login successful. Welcome, " + loggedInUser.getUsername() + "!");
	                return;
	            }
	        }
	        System.out.println("Invalid username or password. Please try again.");
		
	}
	
	 public boolean isLoggedIn() {
	        return loggedInUser != null;
	    }
	 
	 
	 
	  public void searchBooks(String keyword) {
	        System.out.println("Search Results for '" + keyword + "':");
	        for (Book book : books) {
	            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
	                    book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
	                System.out.println("Title: " + book.getTitle());
	                System.out.println("Author: " + book.getAuthor());
	                System.out.println("Price: $" + book.getPrice());
	                System.out.println("Quantity: " + book.getQuantity());
	                System.out.println("----------------------");
	            }
	        }
	    }

	    public void searchUsers(String keyword) {
	        System.out.println("Search Results for '" + keyword + "':");
	        for (User user : users) {
	            if (user.getUsername().toLowerCase().contains(keyword.toLowerCase())) {
	                System.out.println("Username: " + user.getUsername());
	                System.out.println("password: " + user.getPassword());
	                System.out.println("phone: " + user.getPhone_number());
	                System.out.println("----------------------");
	            }
	        }
	    }
	
	
	
		
	}

