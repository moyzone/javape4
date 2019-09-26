import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class multipleoccur{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        String inputCharSeq = sc.nextLine();
        String searchstring=sc.nextLine();
        String regex = searchstring;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputCharSeq);

        /*
         * Returns: true if, and only if, a subsequence of the input sequence
         * matches this matcher's pattern
         */
        while (matcher.find())
        {
            System.out.println("Found at: " + matcher.start() + " - " + matcher.end());
        }
    }
}
