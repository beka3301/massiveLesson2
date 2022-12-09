import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Scanner in = new Scanner( System.in );
        int a = in.nextInt();
        String numberConvertToString = String.valueOf( a );
        String strings = numberConvertToString.substring( numberConvertToString.length() / 2 );
        String string = numberConvertToString.substring( 0, numberConvertToString.length() / 2 );
        int count = 0;
        int count1 = 0;
        char[] chars = string.toCharArray();
        char[] chars1 = strings.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            count += Integer.parseInt( String.valueOf( chars[i] ) );
        }
        for (int i = 0; i < chars1.length; i++) {
            count1 += Integer.parseInt( String.valueOf( chars1[i] ) );
        }
        if (count == count1) {
            System.out.println( "\nYES" );
        } else {
            System.out.println( "\nNO" );
        }

        }
    }

