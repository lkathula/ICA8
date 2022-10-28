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
        return 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile=new Scanner(new FileReader("urinal.dat"));
        String finp=inFile.useDelimiter("\\A").next(); //For reading input from file and converting the content into a string
        char[] c={'0','0','0','0'};
        System.out.println(goodString(c));


    }
}