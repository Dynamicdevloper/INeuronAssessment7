package in.ineuron;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "69";
		System.out.println(isStrobogrammatic(s));
	}
	
	public static boolean isStrobogrammatic(String s) {
		
		if(s.length()%2!=0) return false;
		
		int i=0;
		int j=s.length()-1;
		
		while(i<j) {
			if(s.charAt(i)=='6' && s.charAt(j)=='9' || s.charAt(i)=='9' && s.charAt(j)=='6') {
				i++;
				j--;
			}else {
				return false;
			}
		}
			
		return true;
	}

}
