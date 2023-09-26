package recursion;
import java.util.*;

public class parenthises {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List<String>ll=new ArrayList<>();
		print(n, 0,0,"",ll);

	}
     public static void print(int n,int o,int c, String ans,List<String>ll) {
    	 if(o==n&& c==n) {
//    		 System.out.println(ans);
    		 ll.add(ans);
    		 return;
    	 }

    	 
    	 
    	if(o<n) { print(n,o+1,c,ans+"(",ll);}
    	 if(o>c) {
    	 print(n,o,c+1,ans+")",ll);}
    	 
    	 
     }
}
