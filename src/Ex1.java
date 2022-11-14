import java.io.*;
import java.nio.file.AccessDeniedException;

public class Ex1 {

    public static void main(String[] args) {

        try(FileInputStream input = new FileInputStream("E:\\Innopolis\\Programming\\ITP\\Java\\Lab_12_14.07.2022\\input.txt");
            FileOutputStream output = new FileOutputStream("E:\\Innopolis\\Programming\\ITP\\Java\\Lab_12_14.07.2022\\output.txt"))
        {
            byte[] transfer = new byte[input.available()];
            input.read(transfer, 0, transfer.length);
            output.write(transfer, 0, transfer.length);
        }
        catch (AccessDeniedException ex) {
            System.out.println("No permission");
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }

}
