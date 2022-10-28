import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class urinals {
    public static boolean goodString(char[] s)
    {
        return false;
    }
    public static int countUrinals(char[] inp)
    {
        return 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        Scanner inFile=new Scanner(new FileReader("urinal.dat"));
        String finp=inFile.useDelimiter("\\A").next(); //For reading input from file and converting the content into a string
        char[] fileinp=finp.toCharArray();
        String input=sc.next(); //for reading input from keyboard.
        char[] inp=input.toCharArray();
    }
}