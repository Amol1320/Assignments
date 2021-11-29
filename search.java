class search{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int num=19;
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("Number is Present in Arrey"+" "+num);
				break;
			}
			else{
				System.out.println("Number is not present"+" "+i);
			}
		}
		
		
	
	}
	

}