package recursion;

public class two_D_array_destination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int m=4;
		print(n-1,m-1,0,0,"");
		

	}
	public static void print(int n,int m,int cr,int cc,String ans) {
		if(cr==n&&cc==m) {
			System.out.println(ans);
			return;
		}
		
		if(cr<n) {
		print(n,m,cr+1,cc,ans+"V");
		}
		if(cc<m) {

		print(n,m,cr,cc+1,ans+"H");
		}
		
		
	}

}
