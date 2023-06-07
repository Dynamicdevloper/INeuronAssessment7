package in.ineuron;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isEqual("ab#ca#a#b", "a#ad#cb"));
	}
	
	public static boolean isEqual(String s, String t) {
		
		
		int i= s.length()-1;
		int j=t.length()-1;
		
		String str1="";
		String str2="";
		
		for(int ind=i; ind>=0; ind--) {
			if((s.charAt(ind)!='#')) str1=s.charAt(ind)+str1;
			else ind--;
		}
		
		for(int ind=j; ind>=0; ind--) {
			if((t.charAt(ind)!='#')) str2=t.charAt(ind)+str2;
			else ind--;
		}
		
		return str1.equals(str2);
	}

}
