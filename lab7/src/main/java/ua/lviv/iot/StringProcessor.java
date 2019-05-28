package ua.lviv.iot;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {
 


  public static String readInputText() throws IOException {
    Scanner sc = new Scanner(new InputStreamReader(System.in));
    System.out.print("Enter String");
    return sc.nextLine();

  }
  public String showResults(final String st) {

    Pattern patern = Pattern.compile("(\\d+)+(\\d+)|(\\d+\\s\\d+\\s\\d+\\s\\d+)|"
    		+ " ([0-9]{1} [(]{1}[0-9]{3}[)]{1} [0-9]{3} [0-9]{3}$)");
   
    Matcher matcher = patern.matcher(st);
    while (matcher.find()) {
        String result = matcher.replaceAll(" HOT_LINE ");
        System.out.println(result);
 

    }
    return null;
  }

  public static void main(final String[] args) throws IOException {
    StringProcessor sp = new StringProcessor();
     
    String st = new String();
    st = sp.readInputText();
    sp.showResults(st);

  }

}