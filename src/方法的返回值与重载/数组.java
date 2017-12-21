package 方法的返回值与重载;

import java.util.Arrays;

public class 数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组的四种定义，数组一定要有长度
		int[] nums=new int[10];
		
		int[] nums2;
		nums2=new int[10];
		
		int[] nums3=new int[] {1,2,3,4};
		System.out.println(nums.length);
		
		int[] nums4= {1,2,3,4};
		int[][] num22=new int[][]{{1,2,3},{3,4,5}};
		//foreach jdk1.5之后，增强for循环
		for(int x:nums4) {
			System.out.println(x);
		}
		//print(nums3);
		//print3(nums4);
		//print3(null);//输出空指针异常java.long.NullPointerException
		//当一个变量为null(没有复制)，我们去调用了该变量的属性和方法
		int[] num= {23,45,43,12,67,34};
		
		//二分法查找
		int index=Arrays.binarySearch(num, 43);
		System.out.println(index);
		System.out.println(Arrays.toString(num));
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		//复制到指定数组
		num=Arrays.copyOf(num, 10);//或者永新数组接收，不用建立新的数组
		System.out.println(Arrays.toString(num));//整数默认值是0
		
		int[] numnew = new int[10];//要创建一个新的数组
		System.arraycopy(num, 0, numnew, 0, numnew.length);
		System.out.println(Arrays.toString(numnew));
		
		//小姐 数组复制效率由高到低排序：arraycopy,copyof,for
		
		//判断两个数组是否相等，值
		Arrays.equals(num, numnew);
		
		//填充数组
		Arrays.fill(numnew,0);
		System.out.println(Arrays.toString(numnew));
	
	}
	
	//jdk1.5之后的可变参数
	//可变参数只能是参数列表中的最后一个
	//可变参数作为数组使用
	public static void print(int...x) {
		int len = x.length;
		for(int i=0;i<len+1;i++) {
			System.out.println(x[i]);
		}
	}
	//空指针异常。数组越界异常java.lang.ArrayIndexOutOfBoundsException:
	//测试数组的异常
	public static void print3(int[] x) {
		System.out.println("数组的长度："+x.length);
	}
}
//arrays工具类
//toString（数组）sort(数组) binarySearch（）