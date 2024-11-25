package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class WaysToWriteNAsSum
{

    public static void main(String[] args)
    {
        int n=5;

        int table[] = new int[n + 1];

        Arrays.fill(table, 0);

        table[0] = 1;

        for (int i = 1; i < n; i++)
            for (int j = i; j <= n; j++)
                table[j] += table[j - i];

        System.out.println(table[n]);
    }

}
