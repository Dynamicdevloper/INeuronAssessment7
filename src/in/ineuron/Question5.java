package in.ineuron;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseK("abcdefghijklm", 4));
	}
	
	public static String reverseK(String word, int k) {
		
		String result="";
		String output="";
		
		System.out.println(word.length());
		int temp=0;
		
		for(int i=0; i<word.length(); i++) {
			if(temp <k) {
				result=word.charAt(i)+result;
			}else {
				result+=word.charAt(i);
			}
			temp++;
			if(temp==2*k) {
				output+=result;
				temp=0;
				result="";
			}
		}
		
		if(!result.equals("")) output+=result; 
		
		return output;
	}

}
