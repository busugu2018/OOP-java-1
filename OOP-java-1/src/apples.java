
public class apples {

	public static void main(String[] args) {
		
		tuna member1 = new tuna("Meghan","Fox");
		tuna member2 = new tuna("Nathalie","Portland");
		tuna member3 = new tuna("Dua","Lipa");
		
		System.out.println();
		System.out.println(member1.getFirst());
		System.out.println(member1.getLast());
		System.out.println(member1.getMembers());
		
		System.out.println();
		System.out.println(member2.getFirst());
		System.out.println(member2.getLast());
		System.out.println(member2.getMembers());
			
		System.out.println();
		System.out.println(tuna.getMembers());
		
	}

}
