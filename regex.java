import java.util.Scanner;   
import javax.swing.plaf.synth.SynthSplitPaneUI;
import java.lang.StringBuilder;
import java.util.regex.Pattern;  
import java.util.Scanner;  
import java.util.regex.Matcher;    

public class regex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter search string:");  
        Pattern pattern = Pattern.compile(sc.nextLine());    
        System.out.println("Enter string:");  
        Matcher matcher = pattern.matcher(sc.nextLine());    
        boolean found = false;    
        while (matcher.find()) {    
                
            found = true;    
        }    
        if(!found){    
            System.out.println("No match found.");    
        }    
        else
            System.out.println("Match found");
    }
}