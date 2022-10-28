
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class urinals {
    public static boolean goodString(char[] s)
    {
        for (int i=0;i<s.length-1;i++)
        {
            if(s[i]=='1'&&s[i+1]=='1')
            {
                return false;
            }
        }
        return true;
    }
    public static int countUrinals(char[] inp)
    {
        int free=0;
        for(int i=0;i<inp.length;i++)
        {
            if(i==0)
            {
                if(inp[1]=='1')
                {
                    continue;
                }
                else
                {
                    if(inp[i]=='0')
                    {
                        inp[i]='1';
                        free++;
                    }

                }
            }
            else if(i==inp.length-1)
            {
                if(inp[inp.length-2]=='1')
                {
                    continue;
                }
                else
                {
                    if(inp[i]=='0')
                    {
                        inp[i]='1';
                        free++;
                    }
                }
            }
            else
            {
                if(inp[i-1]=='0'&&inp[i+1]=='0'&&inp[i]=='0')
                {
                    inp[i]='1';
                    free++;
                }

            }
        }
        return free;
    }

    public static void main(String[] args) throws IOException {

        Scanner inFile=new Scanner(new FileReader("urinal.dat"));

        String input=inFile.useDelimiter("\\A").next();

        String[] s=input.split("\r\n");
        FileWriter fw = new FileWriter("rule.txt");


        for(int i=0;i<s.length;i++)
        {
            char[] inp=s[i].toCharArray();
            int free=0;
            if(!goodString(inp))
            {
                free=-1;
            }
            else
            {
                free=countUrinals(inp);
            }



            String x= String.valueOf(free);
            fw.write(x);
            fw.write("\n");

            System.out.println(free);
    }
        fw.close();
}}