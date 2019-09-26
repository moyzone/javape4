import java.util.Scanner;

public class occurences{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String search=scanner.nextLine();
        int count = input.length() - input.replace(search, "").length();
        System.out.println("Number of occurances are="+count);
    }
}