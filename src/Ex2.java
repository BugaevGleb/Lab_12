import java.io.*;

public class Ex2 {

    public static void main(String[] args) {

        try
        {
            BufferedReader input = new BufferedReader(new FileReader("E:\\Innopolis\\Programming\\ITP\\Java\\Lab_12_14.07.2022\\input2.txt"));

            int a, b;

            String s1 = input.readLine();
            a = Integer.parseInt(s1);

            String s2 = input.readLine();
            b = Integer.parseInt(s2);

            int c = a / b;
            System.out.println(c);

        } catch(IOException ex){
            System.out.println("Troubles with file");
        } catch(NumberFormatException ex){
            System.out.println("Troubles with parsing");
        } catch(ArithmeticException ex){
            System.out.println("Division by zero");
        }


    }

}
