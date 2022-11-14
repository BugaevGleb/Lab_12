import java.io.*;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        try
        {

            Scanner scan = new Scanner(new File("E:\\Innopolis\\Programming\\ITP\\Java\\Lab_12_14.07.2022\\input2.txt"));

            int a, b;

            String s1 = scan.next();
            a = Integer.parseInt(s1);

            String s2 = scan.next();
            b = Integer.parseInt(s2);

            int c = a / b;
            System.out.println(c);

        } catch(NumberFormatException ex){
            System.out.println("Troubles with parsing");
        } catch(ArithmeticException ex){
            System.out.println("Division by zero");
        } catch(IOException ex){
            System.out.println("Troubles with file");
        }


    }

}
