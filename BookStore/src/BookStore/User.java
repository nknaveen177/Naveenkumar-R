package BookStore;

public class User {
	
		private String username;
	    private String password;
	    private String phone_number;
	    
	    
		public User(String username, String password, String phone_number) {
			super();
			this.username = username;
			this.password = password;
			this.phone_number = phone_number;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getPhone_number() {
			return phone_number;
		}


		public void setPhone_number(String phone_number) {
			this.phone_number = phone_number;
		}
	    
		
	    

}
