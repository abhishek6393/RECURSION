 package recursion;

public class subsequence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="abc";
		sub(st,"");

	}
	public static void sub(String st,String ans) {
		if(st.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=st.charAt(0);
		sub(st.substring(1),ans);
		sub(st.substring(1),ans+ch);
		
	}

}
