package project1;

public class RemoveDuplicateInArray {
	public static int removeDuplicateElement(int arr[], int n)
    {
        if (n==0 || n==1)
            return n;
      
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
         
        temp[j++] = arr[n-1];   
         
        // Changing original array
        for (int i=0; i<j; i++)
            arr[i] = temp[i];
      
        return j;
    }
     
    public static void main (String[] args) 
    {
        int arr[] = {20,33,22,22,11,14,14,12,28,28,22,22};
        int length = arr.length;
         
        length = removeDuplicateElement(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
           System.out.print(arr[i]+" ");
    }

}
