import java.util.Scanner;

public class mean1 {
    public static void main(String[] args) {
        int n, i, sum=0, arithmean;
        int arr[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many numbers u want to calculate mean ?\n");
        n = sc.nextInt();
        System.out.print("Enter " +n+ " Numbers :\n ");

        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        arithmean = sum/n;
        System.out.print("Arithmetic Mean = " +arithmean);
    }
}
