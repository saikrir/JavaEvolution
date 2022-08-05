package javam.evolution;

interface Sport {}


class Basketball implements Sport{
	private String venue;
	
	public Basketball(String venue) {
		this.venue = venue;
	}
	
	public String getVenue() {
		return this.venue;
	}
	
}

class NFL implements Sport{
	
	private String teams;
	
	public NFL(String teams) {
		this.teams = teams;
	}
	
	public String getTeams() {
		return this.teams;
	}
}

public class PatternMatchingExample {
	
	
	static String processSport(Sport s) {
		
		if(s instanceof Basketball b) {
			return b.getVenue();
		}
		else if(s instanceof NFL n) {
			return n.getTeams();
		}
		return "";
	}
	
	
	public static void main(String[] args) {
		
		
		Sport sp = new Basketball("TD Ameritrade Stadium");
		Sport nfl = new NFL("Cowboys, Broncos");
		
		System.out.println(processSport(sp));
		System.out.println(processSport(nfl));
	}

}
