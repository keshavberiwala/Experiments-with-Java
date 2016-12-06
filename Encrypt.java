import java.util.*;
class Encrypt
{
    public static void main()
    {
        Encrypt obj = new Encrypt();
        Scanner sc = new Scanner (System.in);
        System.out.print("\n Enter sentence : ");
        String s = sc.nextLine();
        int space=0;
        String s2="";
        for (int i =0;i<s.length();i++)
            if (s.charAt(i)==' ') space++;
        int i1,i2;
        i1= obj.input(sc,(space+1),1);
        i2= obj.input(sc,(space+1),2);

        int p = 0,i=0;
        String word = "";
        do
        {
            p=s.indexOf(' ');
            if (p!=-1)
            {
                word = s.substring(0,p);
                s = s.substring(p+1);

            }
            else word = s;
            ++i;
            if (i1==i || i2==i)
                word = obj.encrypt(word);
            s2 = s2 + word + " ";
        } while (p!=-1);

        System.out.print("\n Modified sentence is : " + s2);
    }

    String encrypt(String x)
    {
        String res="";
        int ch = 0,nch=0;
        for (int i=0;i<x.length();i++)
        {
            ch = x.charAt(i);
            nch=ch+1;
            if ((Character.isLowerCase(ch) && nch>122) || (Character.isUpperCase(ch) && nch>90))
                ch=nch-26;
            else ch=nch; 
            res+= (char)ch;
        }

        return res;
    }

    int input(Scanner sc,int word, int i)
    {
        int n = 0;
        do
        {
            System.out.print("\n Enter Integer " + (i) + " (lesser than total no. of words) : ");
            n = sc.nextInt();
        } while (n<1 || n>word);
        return n;
    }
}
