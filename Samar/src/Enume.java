

public class Enume {
	public enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	Day day;
	
	public Enume(Day day) {
		this.day = day;
	}
	
	
	
	public void tellItLikeItIs() {
		
		switch(day) {
		case MONDAY  :
			System.out.println("Monday is the worst!");
			break;
		case FRIDAY :
			System.out.println("Friday is better!");
			break;
		case SATURDAY : case SUNDAY :
			System.out.println("weekend is the best");
			break;
		default :
			System.out.println("weekdays are so-so");
		}
		
	
			
		}
		
		
	

	
	
}
