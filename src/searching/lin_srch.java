package searching;
import java.sql.SQLOutput;
import java.util.Scanner;

public class lin_srch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaring the array
        System.out.println("Enter number of elements ");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements");
        for(int i = 0; i<size; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter element to search for: ");
        int item = input.nextInt();
        //working logic
        for(int i = 0; i<size; i++)
        {
            if(arr[i] == item ) {
                System.out.println(item + " is present at location " + (size + 1));
                break;
            }
        }
        if(item == size )
        {
            System.out.println("Item not found");
        }

    }
}
