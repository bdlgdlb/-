class Demo
{
	public static void main(String[] args)
	{
		
		for(int x = 0; x < 5; x++)
		{
			for(int y = 0; y < x ; y++)
			{
				System.out.print(" ");
			}
			
			for (int z = x; z < 5; z++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}