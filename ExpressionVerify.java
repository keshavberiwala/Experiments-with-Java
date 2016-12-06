import java.util.*;
class BracketCheck
{
    char arr[];
    int top,c;

    BracketCheck(String x)
    {
        for (int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if (ch=='(' || ch=='{' || ch=='[')
                c++;
        }
        arr = new char[c];
        top=-1;
    }

    void push(char x)
    {
        arr[++top]=x;
    }

    void pop()
    {
        top--;
    }

    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        char ch=' ', opt=' ';
        int c=0,i=0,cb=0;
        boolean flag = true;
        do
        {
            cb=0;
            c=0;
            System.out.print("\n Enter expression : ");
            String s = sc.nextLine();
            BracketCheck obj = new BracketCheck(s);

            for (i=0;i<s.length();i++)
            {
                ch=s.charAt(i);
                if (ch=='(' || ch=='{' || ch=='[')
                    obj.push(ch);

                else if (ch==')' || ch=='}' || ch==']')
                {
                    cb++;
                    if (obj.arr.length!=0)
                    {
                        if ((ch==')' && obj.arr[obj.top]=='(') || (ch=='}' && obj.arr[obj.top]=='{') || (ch==']' && obj.arr[obj.top]=='['))
                            obj.pop();
                        else break;
                    }

                }
            }
            if (obj.top==-1 && cb==obj.arr.length)
                System.out.print("\n Valid");
            else System.out.print("\n Not Valid");
            System.out.print("\n Do you want to continue? Y/N : ");
            opt = sc.nextLine().charAt(0);
        } while (opt=='y' || opt=='Y');

    }

}
