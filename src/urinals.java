import java.io.FileNotFoundException;
import java.io.FileReader;
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

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile=new Scanner(new FileReader("urinal.dat"));
        String finp=inFile.useDelimiter("\\A").next(); //For reading input from file and converting the content into a string



    }
}