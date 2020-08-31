package naveen;

public class FindMissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[]={1,3,4,5,6};
		int sum=0;
		
		for(int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
		}
		
           System.out.println(sum);
	
	int sumOriginal=0;
	for(int j=1;j<=6;j++)
	{
		sumOriginal=sumOriginal+j;
		
	}
	
	System.out.println(sumOriginal-sum);
	
	}

}
