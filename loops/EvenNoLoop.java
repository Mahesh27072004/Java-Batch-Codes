class EvenNoLoop//odd also
{
	public static void main(String[] args)
	{
		//Even
		System.out.print("Even Numbers From 1 to 100: ");
		for(int i = 1; i <= 100; i++)
		{
			if(i%2 == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println("\n");
		
		System.out.print("odd Numbers From 1 to 100: ");
		//odd
		for(int i = 1; i <= 100; i++)
		{
			if(i%2 != 0){
				System.out.print(i+" ");
			}
		}
		
		
	}
}