import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        multTable();
        plus10pers();
    }

    public static void multTable()
    {
        System.out.println("multiplication table");
        for (int i = 1; i < 10; i ++)
        {
            for (int j = 1; j < 10; j ++)
            {
                System.out.print((i * j) + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("reverse multiplication table");

        for (int i = 9; i > 0; i--)
        {
            for (int j = 9; j > 0; j--)
            {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }

    public static void plus10pers()
    {
        Scanner in = new Scanner(System.in);
        float f = in.nextFloat();
        retPlus10Her(f);
        System.out.println(f);
    }

    public static void retPlus10Her(float f)
    {
        f = f + f / 100 * 10;
        System.out.println(f);
    }
}
