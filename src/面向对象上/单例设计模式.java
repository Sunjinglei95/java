package ���������;
/*1���췽��˽�л�
 * 2����һ���������
 * 3���ⲿ�ṩһ����̬������ȡ����ʵ��
 * 
 * 1.����
 * 2.����
 * 
 * �����ĺô���ΪʲôҪ���õ���
 * 		1��ʹ��һЩ�������ʱ��ֻ�й��ܷ�����û�����ԣ�2.��������ܻᱻƵ������
 * 3.Ŀ��Ϊ�˽�ʡ�ظ������������������ڴ�����ģ��Ӷ����Ч�ʡ�
 * �ܲ���ʵ�ù��췽��˽�л�+��̬��������������أ�
 * 
 * */
public class �������ģʽ {
	public static void main(String[] args) {
		Singleton1 s = Singleton1.getInstance();
	}
}

//e han ռ���ڴ��ʱ�䳤��Ч�ʸ�
class Singleton1{
	
	private Singleton1() {}
	private static Singleton1 s = new Singleton1();
	public static Singleton1 getInstance() {
		return s;
	}
}
 //lanhan ռ���ڴ��ʱ��̣�Ч�ʵͣ�������,�ӳټ��ظ������ѧϰ��ܣ�
//���̷߳���ʱ���а�ȫ����
class Singleton2{
	private Singleton2() {}
	private static Singleton2 s2 = new Singleton2();
	public static Singleton2 getInstence() {
		if(s2==null) {
			s2=new Singleton2();
		}
		return s2;
	}
}

//Math����
class Tools{
	private Tools() {}
	public static void print1() {}
	//����ռ���ڴ�
}