package in.ineuron;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ans=canShift("abcde", "cbaer");
		
		System.out.println(ans);
	}
	
	public static boolean canShift(String s, String goal) {
		
		int[] arr1= new int[26];
		int[] arr2= new int[26];
		for(int i=0; i<s.length(); i++) {
			arr1[s.charAt(i)-'a']++;
		}
		
		for(int i=0; i<goal.length(); i++) {
			arr2[goal.charAt(i)-'a']++;
		}
		
		for(int i=0; i<26; i++) if(arr1[i] !=arr2[i]) return false;
		
		return true;
	}

}
