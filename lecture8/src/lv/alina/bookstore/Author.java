package lv.alina.bookstore;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	
	
	
	public Author(String name, String email, char gender) { //source-> generate constructor using fields-> automātiski izveido  konstruktoru
		this.name = name;
		this.email = email;
		if(checkGender(gender)){
			this.gender = gender;
		}else{
			this.gender = 'x';
		}
	}
	
	public Author(String name){
		this.name = name;
	}

	
	public static boolean checkGender(char gender){
		char m = 'm';
		char f = 'f';
		
		if(m == gender || f == gender){
			return true;
			
		}else{
			return false;
		}
	}
	// source-> generate getters and setters -> automātiski izveido geterus un seterus
		//(seterus šajā gadījumā vajag tikai e-pastam, jo name un gender ir nemainīgs
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}

	//source-> generate toString
//	@Override
//	public String toString() {
//		return "Author [name=" + name + ", email=" + email + ", gender="
//				+ gender + "]";
//	}
	public String toString(){
		return "Name "+this.name;
	}
	
}
