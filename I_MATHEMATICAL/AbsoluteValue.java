package MATHEMATICAL;

public class AbsoluteValue {
    static public int absolute(int I) {
        // code here
        if (I < 0) {
            return I * -1;
        }
        return I;
    }

    public static void main(String[] args) {
        System.out.println(absolute(-23));
    }
}
