package romanNumerals;
import java.util.Scanner;

public class romanNumerals {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What's your number? (0-99) ");
		int n = in.nextInt();
		int j = n;
		do{
			n = n/10;
			romanDigit(n, "X", "L");
		}while(n>0);
		romanDigit(j,"I", "V");
	}
	public static String romanDigit(int n, String ones, String fives){
		String x = "";
		if ((n%10 < 5)&&(n%10>0)){
			for (int i = 1; i<=n%10; i++){
				System.out.print(ones);
			}
		}else if (n%10>=5){
			System.out.print(fives);
			for (int i = 1; i <= ((n%10)-5); i++){
				System.out.print(ones);
			}
		}
		return x;
	}
}
