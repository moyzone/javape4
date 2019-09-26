import java.util.Scanner;

public class alphabetical{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String[] split=input.split(" ");


        for (int i = 0; i < split.length; i++){
            for (int j = i + 1; j < split.length; j++){
                if (split[i].compareTo(split[j])>0) 
                {
                    String temp = split[i];
                    split[i] = split[j];
                    split[j] = temp;
                }
            }
        }
        for (int i = 0; i < split.length; i++){
            System.out.println(split[i]);
        }
    }
}