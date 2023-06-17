import java.util.Scanner;
class Reverse{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write a number to reverse");
		int num = scanner.nextInt();
		int revnum = 0;

	while (num > 0) {
    		int digit = num % 10;
    		revnum = revnum * 10 + digit;
    		num /= 10;
	}
	System.out.println(revnum);
}
}
	