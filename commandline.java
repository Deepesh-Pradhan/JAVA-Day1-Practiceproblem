import java.sql.SQLOutput;
import java.util.Scanner;

public class commandline {
    public static void main(String args[])
    {
        String name ;
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter Name");
        name = scn.nextLine();
        System.out.println("name is " + name);
    }
}