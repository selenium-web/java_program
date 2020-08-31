package naveen;

public class FindSmallestAndLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[]={53,14,56,75,14};
		int largest = number[0];
		int smallest = number[0];
		
		for(int i=0;i<number.length;i++)
		{
			if(number[i]>=largest)
			{
				largest=number[i];
			}
			else if(number[i]<=smallest)
			{
				smallest=number[i];
			}
		}
		
		System.out.println("smallest number is::" + smallest);
		System.out.println("largest number is::" + largest);

	}

}
