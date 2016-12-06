import java.util.*;
class QuickSort
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        do
        {
            System.out.print("\nEnter the number of elements : ");
            n = sc.nextInt();
        } while (n<=0);
        int arr[] = new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.print("\nEnter element " + (i+1) + " : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("\nThe original array is : ");
        for (int i=0;i<n;i++)
            System.out.print(arr[i] + " " );
        QuickSort obj = new QuickSort();
        obj.quickSort(arr,0,arr.length-1);
        System.out.print("\nThe sorted array is : ");
        for (int i=0;i<n;i++)
            System.out.print(arr[i] + " " );
    }

    void quickSort(int array[],int start, int end)
    {
        int i = start;
        int k = end;
        if (end - start >=1)
        {
            int pivot = array[start];
            while (k>i)
            {
                while (array[i] <= pivot && i<=end && k>i)
                    i++;
                while (array[k] > pivot && k >= start && k>=i)
                    k--;
                if (k>i)
                    swap(array,i,k);
            }

            swap(array,start,k);
            quickSort(array,start,k-1);
            quickSort(array,k+1,end);
        }
    }

    void swap(int array[], int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

