import java.util.*;

public class Assignment1
{
    public static void main(String[] args)                      //Minimal main method.
    {
        Assignment1 main = new Assignment1();
        main.printOutput();
    }

    public void printInitials()                        //Prints initials in block letters.
    {
        String initials = "VVV              VVV      BBBBBBBBB\n" +
                          " VVV            VVV       BBB    BBB\n" +
                          "  VVV          VVV        BBB     BBB\n" +
                          "   VVV        VVV         BBB    BBB\n" +
                          "    VVV      VVV          BBBBBBBBB\n" +
                          "     VVV    VVV           BBB    BBB\n" +
                          "      VVV  VVV            BBB     BBB\n" +
                          "       VVVVVV             BBB    BBB\n" +
                          "        VVVV              BBBBBBBBB\n";

        System.out.println(initials);
    }

    public double tempConversion(Scanner scanner)    //Accepts integer user input and converts to celsius. Returns double
    {
        int userIn;
        System.out.println("Please enter a temperature in Fahrenheit. Input must be an integer.");
        userIn = scanner.nextInt();
        scanner.nextLine();
        return ((userIn - 32) * (5/9.0));
    }

    public String trimString(Scanner scanner)      //Accepts string user input and returns trimmed and reversed string.
    {
        String userIn = "";
        String output = "";
        System.out.println("Please enter a 5 character string.");
        userIn = scanner.nextLine();
        userIn = userIn.substring(1,4);
        for(int i = userIn.length() - 1; i >= 0; i--)
        {
            output += userIn.charAt(i);
        }
        return output;
    }

    public int generateRandomInt()                 //Generates and returns random integer 0 - 16384
    {
        Random rand = new Random();
        int output;
        output = rand.nextInt(16352) + 32;
        System.out.println("Generating random value...");
        return output;
    }

    public void printOutput()              //Contains function calls for all methods and displays output.
    {
        Scanner scanner = new Scanner(System.in);
        printInitials();
        System.out.println("Your new string is: " + tempConversion(scanner) + trimString(scanner) + generateRandomInt());
        scanner.close();
    }

}
