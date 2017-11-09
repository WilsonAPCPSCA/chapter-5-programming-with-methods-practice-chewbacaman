package timeEnglish;
import java.util.Scanner;

public class timeEnglish {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What hour is it? ");
		int hour = in.nextInt();
		System.out.print("How many minutes? ");
		int minutes = in.nextInt();
		getTimeName(hour,minutes);
	}
	public static String getTimeName(int hours, int minutes){
		String x = "";
		if (minutes == 0){
			System.out.print("It's " + hours + " o'clock");
		}else if (minutes == 15){
			System.out.print("It's a quarter past " + hours);
		}else if (minutes == 30){
			System.out.print("It's half past " + hours);
		}else if (minutes == 45){
			System.out.print("Its a quarter to " + hours);
		}else {
			System.out.print("It's " + minutes + " past " + hours);
		}
		return x;
	}

}
