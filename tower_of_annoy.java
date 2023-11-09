package recursion;

public class tower_of_annoy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		
		print(n,"A","B","C");

	}

 static void print(int n, String S, String H, String D) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		print(n-1,S,D,H);
		System.out.println("Move "+ n+"th disc from "+S+" TO "+D);
		print(n-1,H,S,D);
	}

}
