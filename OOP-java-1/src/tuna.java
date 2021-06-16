
public class tuna {
	
	private String firstName;
	private String lastName;
	private static int members = 0;
	
	public tuna(String fN, String lN) {
		firstName = fN;
		lastName = lN;
		members++;
		System.out.printf("Constructors for %s %s, members in the club: %d\n", firstName, lastName, members);
		
	}
	
	public String getFirst(){
		 return firstName;
	}
	public String getLast(){
		 return lastName;
	}
	
	public static int getMembers() {
		return members;
	}
	
}
