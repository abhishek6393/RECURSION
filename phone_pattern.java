package recursion;

public class phone_pattern {
	static String[] map= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="23";
		
		print(s,"");

	}
	public static void print(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		
		
			char ch=s.charAt(0);
			
			String ns=map[ch-'0'];
			for(int j=0;j<ns.length();j++) {
				print(s.substring(1),ans+ns.charAt(j));
			}
		
		
		
	}

}
