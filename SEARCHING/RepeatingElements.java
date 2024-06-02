package SEARCHING;

import java.awt.*;
import java.util.Arrays;
import java.util.Vector;

public class RepeatingElements {
    static Point sequence(Vector<Integer> a)
    {
        if (a.size() == 0)
            return new Point(0, 0);

        int s = 0;
        int e = a.size() - 1;
        while (s < e) {
            int m = (s + e) / 2;

            // if a[m] = m + a[0], there is no
            // repeating character in [s..m]
            if (a.get(m) >= m + a.get(0))
                s = m + 1;

                // if a[m] < m + a[0], there is a
                // repeating character in [s..m]
            else
                e = m;
        }
        return new Point(
                a.get(s),
                a.size() - (a.get(a.size() - 1) - a.get(0)));
    }

    // Driver code
    public static void main(String args[])
    {
        Integer array[]
                = new Integer[] { 0,0,1};

        // Function call
        Point p
                = sequence(new Vector<>(Arrays.asList(array)));
        System.out.println("Repeated element is " + p.x
                + ", it appears " + p.y
                + " times");
    }

}
