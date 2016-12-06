import java.util.*;
class TimeProcessing
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("\n Enter number of jobs : ");
        int job = sc.nextInt();
        System.out.print("\n Enter total CPU time : ");
        double time = sc.nextDouble();
        double arr[] = new double[job];
        int c[] = new int[job];
        for (int i =0;i<job;i++)
        {
            System.out.print("\n Enter time for job " + (i+1) + " : ");
            arr[i] = sc.nextDouble();
            c[i]=1;
        }
        System.out.println();
        for (int i =0;i<job;i++)
            System.out.print("Job " + (i+1) + "\t\t");
        System.out.println();
        for (int i =0;i<job;i++)
            System.out.print(arr[i] + "\t\t");
        System.out.println();  
        while (job>0)
        {
            double it = (double)(time/job);

            for (int i=0;i<arr.length;i++)
            {
                if (arr[i]>0)
                {
                    arr[i] = arr[i] - it;
                    if (arr[i]<=0) arr[i]=0.0;
                }
                System.out.print(arr[i] + "\t\t");
            }
            for (int i=0;i<arr.length;i++)
            {
                if (arr[i]<=0 && c[i]==1)
                {
                    System.out.print("Job " + (i+1) + " complete! ");
                    job--;
                    c[i]=0;
                }
            }
            System.out.println();
        }
    }
}
