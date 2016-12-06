import java.util.*;
class Queue
{
    int arr[];
    int f,r;
    Queue(int n)
    {
        arr = new int[n];
        for (int i =0;i<n;i++)
            arr[i]=0;
        f=-1;
        r=-1;
    }

    boolean isFull()
    {
        return (r==arr.length-1);
    }

    boolean isEmpty()
    {
        return ((f==-1 && r==-1));

    }

    void enqueue(int x)
    {
        if (!isFull()) 
        {
            if (f==-1 && r==-1)
                ++f;
            arr[++r] = x;
        }
        else System.out.print("\n Overflow");
    }

    void dequeue()
    {
        if (isEmpty()) System.out.print("\n Underflow");

        else 
        {
            System.out.print("\nElement to be deleted : " + arr[f]);
            if (f==r)
            {
                f=-1;
                r=-1;
            }
            else f=f+1;
        }
    }

    void display()
    {
        if (!isEmpty())
            for (int i=f;i<=r;i++)
                System.out.print(arr[i] + " ");
        else System.out.print("\n Empty queue");
    }

    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("\n Enter maximum length : ");
        Queue obj = new Queue(sc.nextInt());
        char ch =' ';
        int opt=0;
        do
        {
            System.out.print("\n 1.Insert \n 2.Delete \n 3.Display \n 4.End \nEnter your option : ");
            opt=sc.nextInt();
            if (opt==1)
            {
                System.out.print("\n Enter element : ");
                int num = sc.nextInt();
                obj.enqueue(num);
            }

            else if(opt==2)
            {
                obj.dequeue();
            }

            else if (opt==3)
            {
                obj.display();
            }

            else if (opt==4)
                System.exit(0);
            else System.out.print("\n Wrong option!");
            System.out.print("\n Do you want to continue? Y/N : ");
            ch = sc.next().charAt(0);
        } while(ch=='y' || ch=='Y');
    }
}
