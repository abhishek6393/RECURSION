package recursion;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		String qes="abc";
		print(qes,"");
		

	}
	public static void print(String qes,String ans) {
		if(qes.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<qes.length();i++) {
			String s1=qes.substring(0,i);
			String s2=qes.substring(i+1);
			char ch=qes.charAt(i);
			print(s1+s2,ans+ch);
		}
		
		
	}

}
