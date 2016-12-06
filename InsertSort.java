import java.util.*;
class InsertionSort
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

        System.out.println();
        new InsertionSort().insertSort(arr);
    }

    void insertSort(int arr[])
    {
        int n = arr.length;
        int i,j,temp;
        for (i=0;i<n;i++)
        {
            temp=arr[i];
            for (j=i-1;j>=0 && arr[j]>temp;j--)
                arr[j+1] = arr[j];
            arr[j+1] = temp;

        }

        System.out.print("\nThe sorted array is : ");
        for (i=0;i<n;i++)
            System.out.print(arr[i] + " " );
    }

}
