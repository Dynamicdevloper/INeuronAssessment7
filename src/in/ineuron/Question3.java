package in.ineuron;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sum("1234", "432"));
	}
	
	public static String sum(String num1, String num2) {
	
		int i= num1.length()-1;
		int j= num2.length()-1;
		int carry=0;
		StringBuilder result= new StringBuilder();
		
		while(i>=0 || j>=0) {
			int digit1= i>=0 ? num1.charAt(i)-'0': 0;
			int digit2= j>=0 ? num2.charAt(j)-'0': 0;
			
			int ans= digit1+digit2+carry;
			result.append(ans%10);
			carry= ans/10;
			i--; 
			j--;
		}
		
		
		return result.reverse().toString();
	}

}
