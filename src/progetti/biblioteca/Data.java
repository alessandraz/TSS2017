package progetti.biblioteca;

public class Data {

	private int day;
	private int month;
	private int year;
	static int dataCounter;
	
	public Data(){
		day = 0;
		month = 0;
		year = 0;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	//giorno successivo
	public void nextDay(){
		
		if (day < 30) {
			day++;
			
			
		} else if ((day == 30) && (month < 12)) {
			day = 1;
			month++;
			
		} else if ((day == 30) && (month == 12)) {
			day = 1;
			month = 1;
			year++;
		}
		
		dataCounter++;

	}
	
	
//	public boolean isEqual(Data date) {
//		return false;
//	}
	
	
	@Override
	public String toString(){
		return day + "-" + month + "-" + year;
	}
	
	
}
