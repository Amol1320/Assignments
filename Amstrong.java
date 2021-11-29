// WAP To find Amstronng NUmber
class Amstrong{
	public static void main(String[] args){
		
		int num=153,sum=0;
		int temp=num;
		while(temp!=0)
		{
			int rem = temp%10;
			 sum = sum+(rem*rem*rem);
			temp= temp/10;
		}
	
		if(sum==num)
		{
			System.out.println("It is a amstromg number"+num);
		}			
		else{
			System.out.println("Its not An AMstrong Number"+num);
		}
			
			
			
		
	}
}