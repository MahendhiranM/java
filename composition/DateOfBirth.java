public class DateOfBirth{

	private int date;
	private int month;
	private int year;

	public DateOfBirth(int date, int month, int year){
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public int getAge(){
		int currentYear = 2022;
		return currentYear - this.year;
	}

	public String getDataOfBirth(String type){
		return this.date+type+this.month+type+this.year;
	}
}
