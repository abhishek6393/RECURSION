package recursion;

public class dublicate_permuttion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String qes="abca";
		print(qes,"");
		

	}
	public static void print(String qes,String ans) {
		if(qes.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<qes.length();i++) {
			char ch=qes.charAt(i);
			boolean val=true;
			for(int j=i+1;j<qes.length();j++) {
				if(qes.charAt(j)==ch) {
					val=false;
					break;
				}
			}
			if(val==true) {
			String s1=qes.substring(0,i);
			String s2=qes.substring(i+1);
	
			print(s1+s2,ans+ch);
			}
		}
		
		
	}

}



