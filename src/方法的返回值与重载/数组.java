package �����ķ���ֵ������;

import java.util.Arrays;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������ֶ��壬����һ��Ҫ�г���
		int[] nums=new int[10];
		
		int[] nums2;
		nums2=new int[10];
		
		int[] nums3=new int[] {1,2,3,4};
		System.out.println(nums.length);
		
		int[] nums4= {1,2,3,4};
		int[][] num22=new int[][]{{1,2,3},{3,4,5}};
		//foreach jdk1.5֮����ǿforѭ��
		for(int x:nums4) {
			System.out.println(x);
		}
		//print(nums3);
		//print3(nums4);
		//print3(null);//�����ָ���쳣java.long.NullPointerException
		//��һ������Ϊnull(û�и���)������ȥ�����˸ñ��������Ժͷ���
		int[] num= {23,45,43,12,67,34};
		
		//���ַ�����
		int index=Arrays.binarySearch(num, 43);
		System.out.println(index);
		System.out.println(Arrays.toString(num));
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		//���Ƶ�ָ������
		num=Arrays.copyOf(num, 10);//��������������գ����ý����µ�����
		System.out.println(Arrays.toString(num));//����Ĭ��ֵ��0
		
		int[] numnew = new int[10];//Ҫ����һ���µ�����
		System.arraycopy(num, 0, numnew, 0, numnew.length);
		System.out.println(Arrays.toString(numnew));
		
		//С�� ���鸴��Ч���ɸߵ�������arraycopy,copyof,for
		
		//�ж����������Ƿ���ȣ�ֵ
		Arrays.equals(num, numnew);
		
		//�������
		Arrays.fill(numnew,0);
		System.out.println(Arrays.toString(numnew));
	
	}
	
	//jdk1.5֮��Ŀɱ����
	//�ɱ����ֻ���ǲ����б��е����һ��
	//�ɱ������Ϊ����ʹ��
	public static void print(int...x) {
		int len = x.length;
		for(int i=0;i<len+1;i++) {
			System.out.println(x[i]);
		}
	}
	//��ָ���쳣������Խ���쳣java.lang.ArrayIndexOutOfBoundsException:
	//����������쳣
	public static void print3(int[] x) {
		System.out.println("����ĳ��ȣ�"+x.length);
	}
}
//arrays������
//toString�����飩sort(����) binarySearch����