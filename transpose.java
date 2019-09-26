import java.util.Scanner;
import java.lang.StringBuilder;

public class transpose{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        StringBuilder s=new StringBuilder();
        String[] split=input.split(" ");
        StringBuilder result=new StringBuilder();

        for(int i=0;i<split.length;i++){
                StringBuilder sb=new StringBuilder();

                sb.append(split[i]);  
                sb=sb.reverse();
                split[i]=sb.toString();
                result.append(split[i]);
                result.append(" ");
        }
        
        System.out.println(result);
    }
}