import java.util.*;
class MergeSort
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
        MergeSort obj = new MergeSort();
        obj.mergeSort(arr);
        System.out.print("\nThe sorted array is : ");
        for (int i=0;i<n;i++)
            System.out.print(arr[i] + " " );

    }

    public void mergeSort(int a[])
    {
        if (a.length>1)
        {
            int elementsInA1 = a.length/2;
            int elementsInA2 = a.length - elementsInA1;
            int arr1[] = new int[elementsInA1];
            int arr2[] = new int[elementsInA2];

            for (int i=0;i<elementsInA1;i++)
                arr1[i] = a[i];
            for (int i=0;i<elementsInA2;i++)
                arr2[i] = a[elementsInA1 + i];

            mergeSort(arr1);
            mergeSort(arr2);

            int i=0,j=0,k=0;
            while (arr1.length != j && arr2.length!=k)
            {
                if (arr1[j] < arr2[k])
                    a[i++] = arr1[j++];
                else a[i++] = arr2[k++];
            }
            while (arr1.length!=j)
                a[i++] = arr1[j++];

            while (arr2.length!=k)
                a[i++] = arr2[k++];

        }
    }
}

