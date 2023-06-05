package BookStore;

public interface BookStore_services {
	
	 public void addBook(String title, String author, double price, int quantity);
	 public void displayBooks();
	 public void removeBook(int index);
	 public void updateBook(int index, String title, String author, double price, int quantity);
	 
	  public void addUser(String username, String password, String Phone_number);
	  public void removeUser(int index);
	  public void updateUser(int index, String name, String password, String phone_number);
	  public void displayUsers();
	  
	  public void loginUser(String username, String password);
	  
	  public void purchaseBook(int index, int quantity);

}
