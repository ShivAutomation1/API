package JavaConcept;

public class ReverseNumber {

	public static void main(String[] args) {
		int i=12345;
		int rev=0;
		
		while(i!=0) {
			int rem= i&10; //1
			rev=rev*10+rem;  //54321
			i=i/10; //1
			
			
		}
	System.out.println(rev);			
	}
}