package recursion;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		
		int b=3;
		
	System.out.println(print(a,b));

	}
public static int print(int a,int b) {
	if(b==0) {
		return 1;
	}
	int p=print(a,b-1);
	return a*p;
}
}
