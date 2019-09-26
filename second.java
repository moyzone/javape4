import java.util.Scanner;

public class second{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        input=input.replaceAll("d", "f");
        input=input.replaceAll("l", "t");
        System.out.println(input);
    }
}