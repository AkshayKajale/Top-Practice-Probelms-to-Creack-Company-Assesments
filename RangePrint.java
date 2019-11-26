


public class RangePrint {
	
	public static void main(String[] args) {
		
		
		
		
		String str = "2?:?8";
		
		if(str.contains("??:??"))
		{
			System.out.println("23;59");
		}
		
		char[] arr = str.toCharArray();
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			if(arr[i] == '?')
			{
				if(i == 0)
				{
					if(Character.getNumericValue(arr[i+1])<=3)
					{
						arr[i] = '2';
					}
					else
					{
						arr[i] = '1';
					}
				}
				if(i == 1)
				{
					if(Character.getNumericValue(arr[i-1]) == 1)
					{
						arr[i] = '9';
					}
					else
					{
						arr[i] = '3';
					}
				}
				
				if(i == 3)
				{
					arr[i] ='5';
				}
				
				if(i == 4)
				{
					arr[i] = '9';
				}
			}
		}
		
		String str1 = new String(arr);
		
		System.out.println(str1);
		
}
}
