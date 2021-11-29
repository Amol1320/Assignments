class CUI
{
	public static void main(String[] args)
	{
		String user = "Absd123";
		String pass = "Abc@123";
		int count=0;
		//System.out.println(user+" "+pass);
		for(int i=0;i<3;i++)
		{
			
			if(user == "Abd123" && pass == "Abc@123")
			{
			
				System.out.println("Welcome");
				System.out.println("User Name:"+user);
				break;
			}
			count++;
		}
		if(count==3)
		{
			System.out.println("Visit Administartion");
		}
	
	}

}