import java.util.*;
import java.lang.Math;
class Interest1{
	int p=3000,R=30,t=5;
	
	public void simple()
	{
		
		int si=(p*R*t)/100;
		System.out.println("Simple Interest:"+si);
		//return 0;
	
	}
	/*public void COmpound()
	{
		int ci = p*(Math.pow((1+R/100),t));
		System.out.println("COmpound Interest:"+ci);
		//return 0;
	
	}*/

}
class Interest{
	public static void main(String[] args)
	{
	Interest1 a = new Interest1();
	
	a.simple();
	//a.COmpound();
	
	}

}