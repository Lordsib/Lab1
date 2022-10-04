import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number of arguments: ");
        int size = sc.nextInt();
        System.out.println('\n');
        int[] integers = new int[size];
        for(int i = 0; i < size; i++)
        {
            integers[i] = sc.nextInt();
        }

        float medie = 0;
        int num = 0;
        int n = 0;
        for (int arg : integers) {
            n += 1;
            medie = medie + arg;
        }
        medie = medie / n;
        System.out.println(medie);
    }
}