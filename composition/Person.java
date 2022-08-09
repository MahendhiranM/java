public class Person{

	private String name;
	private DateOfBirth dob;
	private String town;

	public Person(String name, DateOfBirth dob, String town){
		this.name = name;
		this.dob = dob;
		this.town = town;
	}

	public String toString(){
		return "Name : "+this.name+"\n"+
			   "Age : "+dob.getAge()+"\n"+
			   "Date Of Birth : "+dob.getDataOfBirth("/")+"\n"+
			   "Home Town : "+this.town;
	}
}
