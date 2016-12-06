import java.io.*;
public class EncodeWord
{
    public static void main(String args[]) throws IOException
    {

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("\nEnter the string : ");
        String w = br.readLine();
        System.out.print("\nEnter move value : ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("\n 1. Forward \n 2.Backward \n Enter your option : ");
        int opt = Integer.parseInt(br.readLine());
        EncodeWord dw = new EncodeWord();
        String r = "";
        if (opt == 1)
            r = dw.encodef(w, n);
        else if (opt==2)
            r = dw.encodeb(w, n);

        System.out.print("\nEncoded string : " + r);
    } 

    public String encodef(String s, int m)
    {
        String rw = "";
        int ch = 0;
        for (int i= 0; i< s.length(); i++)
        {
            ch = s.charAt(i);
            if((ch >= 97) && (ch <= 122))
            {
                ch = ch + m;
                if(ch > 122)
                    ch = 96 + (ch - 122);
            }
            else if((ch >= 65) && (ch <= 90))
            {                
                ch = ch + m;
                if(ch > 90)
                    ch = 64 + (ch - 90);
            }
            rw = rw + (char)ch;
        }
        return rw;
    }

    public String encodeb(String s, int m)
    {
        String rw = "";
        int ch = 0;
        for (int i= 0; i< s.length(); i++)
        {
            ch = s.charAt(i);
            if((ch >= 97) && (ch <= 122))
            {
                ch = ch - m;
                if (ch<97)
                    ch = 122 + ( ch - 96);
            }
            else if((ch >= 65) && (ch <= 90))
            {                
                ch = ch - m;
                if(ch < 65)
                    ch = 90 + (ch - 64);
            }
            rw = rw + (char)ch;
        }
        return rw;
    }
}
