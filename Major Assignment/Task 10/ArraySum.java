class ArraySum
{
	int sum(int[] a)
	{
		int sum = 0;
		for(int i =0; i < a.length; i++)
		{
			sum += a[i];
		}
		return sum;
	}
	
	int sum(int[] a, char c)
	{
		int sum = 0;
		if(c == 'E')
		{
			for(int i = 0; i < a.length; i++)
			{
				if(a[i] % 2 == 0)
				{
					sum += a[i];
				}
			}
			return sum;
		}
		else if(c == 'O')
		{
			for(int i =0; i < a.length; i++)
			{
				if(a[i] % 2 != 0)
				{
					sum += a[i];
				}
			}
			return sum;
		}
		else
		{
			return sum;
		}
	}
	public static void main(String[] args)
	{
		ArraySum a = new ArraySum();
		System.out.println(a.sum(new int[]{10,25,35,30}));
		System.out.println(a.sum(new int[]{10,25,35,30},'E'));
		System.out.println(a.sum(new int[]{10,25,35,30},'O'));
		System.out.println(a.sum(new int[]{10,25,35,30},'P'));
	}
}