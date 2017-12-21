package 方法的返回值与重载;
import java.util.*;
public class 判断闰年 {
	public static void main(String[] args) {
		Scanner out=new Scanner(System.in);
	System.out.println("请输入年份：");
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
