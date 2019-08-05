import java.util.*;

public class TelTest{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		    int num = scanner.nextInt();
			int first = num%10;
			int second = num/10%10;
			int third = num/100%10;
			int forth = num/1000;
			first = (first+5)%10;
			second = (second+5)%10;
			third = (third+5)%10;
			forth = (forth+5)%10;
			int resulf = first*1000+third*10+second*100+forth;
			System.out.print(resulf);
	}
}