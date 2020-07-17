/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    private static int size1 = 0;
    private static int size2 = 0;
    private static double arr1[];
    private static double arr2[];
    
    private static boolean whoIsGreater(int size1, int size2){
        if(size1>=size2){
            return true;
        }
        else{
            return false;
        }
    }
    private static void compute(double arr1[], double arr2[]){
        int count=0;
        int[] sum = new int[arr2.length];
        for(int i=0; i<arr1.length; i++){
            sum[i] = (int)(arr1[i] + arr2[i]);
            count++;
        }
        for(int j=count; j<arr2.length; j++){
            sum[j] = (int)arr2[j];
        }
        System.out.println("After computation:");
        for(int i=0; i<sum.length; i++){
            System.out.println(sum[i]+"\t");
        }
        System.out.println("Terminated Successfully.");
    }
	public static void main(String[] args) {
	    
		System.out.println("Hello World");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of first array:");
		size1 = s.nextInt();
		arr1 = new double[size1];
		System.out.println("Enter the size of second array:");
		size2 = s.nextInt();
		arr2 = new double[size2];
		System.out.println("Enter the elements of first array:");
		for(int i=0; i<size1; i++){
		    arr1[i] = s.nextDouble();
		}
		System.out.println("Enter the elements of second array:");
		for(int i=0; i<size2; i++){
		    arr2[i] = s.nextDouble();
		}
		if(whoIsGreater(size1,size2))
		{
		    compute(arr2,arr1);
		}
		else{
		    compute(arr1,arr2);
		}
	}
}
 

