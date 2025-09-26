import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("---Welcome to notes manager---");
        int choice;
        do{
            System.out.println("To write note Press-1");
            System.out.println("To read note Press-2");
            System.out.println("To exit Press-0");
            System.out.println();
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:{
                    System.out.print("Enter Note name you want to write: ");
                    String fileName = input.nextLine();
                    writeFile(fileName);
                    break;
                }
                case 2:{
                    System.out.print("Enter Note name you want to read: ");
                    String fileName = input.nextLine();
                    readFile(fileName);
                    break;
                }
                case 0:{
                    System.out.println("Exiting...");
                    break;
                }
                default:{
                    System.out.println("Invalid choice");
                    break;
                }
            }
        }
        while(choice!=0);
        input.close();
    }

    public static void writeFile(String fileName){
        try(FileWriter writer = new FileWriter(fileName)){
            System.out.print("Enter your note in string: ");
            String data = input.nextLine();
            System.out.println("Writing...");
            writer.write(data);
            writer.flush();
            System.out.println("---File successfully created!!---");
            System.out.println();
        }
        catch(IOException e){
            System.out.println("Exception occurred: "+e.getMessage());
            System.out.println();
        }
    }

    public static void readFile(String fileName){
        try(FileReader reader = new FileReader(fileName)){
            System.out.print("Reading...");
            int read;
            do{
                read = reader.read();
                System.out.print((char)read);

            }
            while(read!=-1);
            System.out.println();
            System.out.println("---File successfully read!!---");
            System.out.println();
        }
        catch(IOException e){
            System.out.println("Exception occurred: "+e.getMessage());
            System.out.println();
        }
    }
}
