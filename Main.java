import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int choice = 99;

        while (choice != 6) {
            choice = menu();
            switch (choice) {
                case 1:

                    break;
            }
        }
    }

    //simple menu to loop through examples
    public static int menu()
    {
        int choice = 99;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to add contact" +
                "\nEnter 2 to find a contact" +
                "\nEnter 3 to display current contact" +
                "\nEnter 4 to restore from disk" +
                "\nEnter 5 to print the Address Book" +
                "\nEnter 6 to clear Address Book" +
                "\nEnter 7 to write to disk");
        System.out.print("Enter choice: ");
        try
        {
            choice = sc.nextInt();
            while(choice < 1 || choice >7)
            {
                System.out.println("Please enter a valid menu choice: ");

                choice = sc.nextInt();
            }
        }
        catch(java.util.InputMismatchException e)
        {
            System.out.println("!!Non Integer entered!!");
            sc.next();
            choice=99;
        }

        System.out.println(); //prints blank line
        return choice;
    }
}
