package BIT_WISE;

public class BitWiseOperator {
    public static void main(String[] args) {
       int x=5;//00000000000000000000000000110010  == 5
       x=~x;   //11111111111111111111111111001101  == -6
        System.out.println(x); // -6
  /*
 Decimal value of 5 in binary represent
 00000000000000000000000000101     =5
 ~ (invert operator) result 👇
 11111111111111111111111111111010  =-6
 Inverted valueWill be converted to decimal automatically
 during run time it results -6 in decimal value as we know
 every decimal values are stored in binary format in computer
 we're using bitwise invert operator ~ to  modify binary value
  Show that
  0 's are converted to 1's
  1's are converted to 0's
         */
        System.out.println(5&1);
    }
}
