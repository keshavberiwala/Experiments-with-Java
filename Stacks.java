/*
 * WAP to execute a stack. Use functions to implement insertion, deletion, and display for the stack.
 */
import java.util.*;
class Stack
{
    int arr[];
    int top;
    Stack(int n)
    {
        arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=0;
        top=-1;
    }

    boolean isEmpty()
    {
        return top==-1;
    }

    boolean isFull()
    {
        return top==(arr.length-1);
    }

    void push(int x)
    {
        if (!(isFull()))
            arr[++top] = x;
        else System.out.print("\n Overflow!");
    }

    int peek()
    {
        return arr[top];
    }

    void pop()
    {
        if (isEmpty()==false)
        {
            System.out.print("\n Element to be deleted : " + peek());
            top--;
        }
        else System.out.print("\n Underflow");
    }

    void display()
    {
        for (int i=0;i<=top;i++)
            System.out.print(arr[i] + " ");
    }

    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("\n Enter maximum length : ");
        Stack obj = new Stack(sc.nextInt());
        char ch =' ';
        int opt=0;
        do
        {
            System.out.print("\n 1.Insert \n 2.Delete \n 3.Display \n 4.End \n\nEnter your option : ");
            opt=sc.nextInt();
            if (opt==1)
            {
                System.out.print("\n Enter element : ");
                int num = sc.nextInt();
                obj.push(num);
            }

            else if(opt==2)
            {
                obj.pop();
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
