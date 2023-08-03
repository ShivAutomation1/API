package JavaConcept;

public class StringConcept {

	public static void main(String[] args) {
		
		String s= "Automation";  // string not datatype this is a class
		String s1= "Automation";
		
		int i= s.length();
		System.out.println(i);
		
		char c= s.charAt(3);
		System.out.println(c);
		
		String s2= s.toLowerCase();
		String s3= s1.toUpperCase();
		System.out.println(s3);
		
		System.out.println(s2.equals(s1));
		
		System.out.println(s.equals(s1));
		
	System.out.println(s.equalsIgnoreCase(s1));	
	
	System.out.println(s.contains(s1));
		
		System.out.println(s+s1);
		
     System.out.println(s.concat(s1)); //  add method


		

	}

}
