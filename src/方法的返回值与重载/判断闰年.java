package �����ķ���ֵ������;
import java.util.*;
public class �ж����� {
	public static void main(String[] args) {
		Scanner out=new Scanner(System.in);
	System.out.println("��������ݣ�");
	int year=out.nextInt();
	System.out.println(isRunnian(year));
	}
	public static boolean isRunnian(int year) {
		if(year%4==0 && year%100!=0 || year %400==0) {
			return true;
		}
		return false;
	}
}
