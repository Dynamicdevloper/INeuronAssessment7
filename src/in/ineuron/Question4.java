package in.ineuron;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence="Let's take LeetCode contest";
		System.out.println(reverseLetters(sentence));
	}

	private static String reverseLetters(String sentence) {
		
		int n= sentence.length();
		String s="";
		String rWord="";
		int i=0;
		
		while(i<n) {
			if(sentence.charAt(i)!=' ' ) {
				rWord=sentence.charAt(i)+rWord;
			}else {
				s+=rWord+' ';
				rWord="";
			}
			i++;
		}
		s+=rWord;
		return s;
	}

}
