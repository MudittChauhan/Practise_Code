import java.io.*;
 
class ArrayDuplFreq {
     
	public static void main(String[] args)
    {
        int[] arr = {1,2,3,5,2,1,1,5,4,5,3,10,11,11,12,13,14,15,15};
        int[] freq = new int[arr.length];
        
        // update frequency of each element
        for (int e: arr) {
            freq[e]++;
        }
 
        // iterate through the array to print frequencies
        for (int i = 0; i < arr.length; i++)
        {
            if (freq[i] > 1) {
                System.out.printf("%d appears %d times\n", i, freq[i]);
            }
        }
    }
}