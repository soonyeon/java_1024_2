package Etc;

public class Test02 {

	public static void main(String[] args) {
		
		int arr1[] = new int [3];
		int arr2[];
		
		arr2 = arr1; //얕은 복사
		
	arr2[2] = 5;	
	for(int i = 0; i < arr1.length; i++) {
		System.out.println("arr1["+i+"] = "+arr1[i]+", arr2["+i+"] = "+arr2[i]);
		
	}	
	int tmpArr[] = new int [arr1.length];
		
	
	
	

	}

}
