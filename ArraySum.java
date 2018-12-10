import java.util.Scanner;

public class ArraySum {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)  {
		System.out.println("Enter length of array : ");
		int len=scanner.nextInt();
		int[] array=new int[len];
		System.out.println("Enter elements of array :");
		for(int i=0;i<array.length;i++){
			array[i]=scanner.nextInt();
		}
		System.out.println(simpleArraySum(array));
	}

	private static int simpleArraySum(int[] ar) {
		int sum=0;
		for(int item : ar){
			sum=sum+item;
		}
		return sum;
	}

}
