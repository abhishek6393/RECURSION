package home_work;
import java.util.*;

public class PHONE_KEYBOARD {
	static String[] map= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>ll=new ArrayList<>();
		
		String s="";
		if(s.length()==0) {
			System.out.println(ll);
			return;
		}
		print(s,"",ll);
		

	}
   public static void print(String s,String ans,List<String>ll) {
	   
	   
	   if(s.length()==0) {
//		   System.out.println(ans);
		   ll.add(ans);
		   return;
	   }
	   
	   char ch=s.charAt(0);
	   String press=map[ch-'0'];
	   for(int i=0;i<press.length();i++) {
		   print(s.substring(1),ans+press.charAt(i),ll);
	   }
	   
   }
}
