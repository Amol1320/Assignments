import java.util.*;
class tax{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your CTC Ammount:");
		long ctc = sc.nextInt();
		
		if(ctc>0 && ctc <180000)
		{
			System.out.println("Nill");
		}
		else if(ctc>181000 && ctc<300000)
		{
			System.out.println(" You Have To Pay 10% Tax");
		}
		else if(ctc>300001 && ctc<500000)
		{
			System.out.println("You Have To Pay 20% Tax");
		}
		else if(ctc>500001 && ctc<1000000)
		{
			System.out.println("You Have To Pay 30% Tax");
		}
		
		
	
	
	
	}


}