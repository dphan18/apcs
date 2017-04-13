class Arrays{
	public static void main (String []args ){
		int[] A = {-1, 5, 0, 31, 12};
		
		}

	public static int [] reverse(int [] arr){
		int [] reversed=new int [arr.length];
		for (int i=0;i<arr.length;i++){
			reversed[i]=arr[arr.length-1-i];
		
			}
		
		return arr;

	}
	
	public static boolean contains(int m, int [] ar){
		for (int i=0;i<ar.length;i++){
			if (ar[i]==m){
				return true;
			}
		}
		return false;
}
}

