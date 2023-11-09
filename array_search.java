package recursion;

public class array_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,5,8,4,9,11,55,22,44,78,96};
		int item=55;
		System.out.println(print(arr,item,0));
		

	}
public static int print(int arr[],int item,int i) {
	
	
	if(i==arr.length) {
		return -1;
	}
	
	if(arr[i]==item) {
		return i;
	}
	return print(arr,item,i+1);
	
}
}
