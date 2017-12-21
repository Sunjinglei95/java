package 面向对象上;
/*1构造方法私有化
 * 2声明一个本类对象
 * 3给外部提供一个静态方法获取对象实例
 * 
 * 1.饿汉
 * 2.懒汉
 * 
 * 单例的好处。为什么要是用单例
 * 		1在使用一些工具类的时候，只有功能方法，没有属性，2.工具类可能会被频繁调用
 * 3.目的为了节省重复创建对象所带来的内存的消耗，从而提高效率、
 * 能不能实用构造方法私有化+静态方法来替代单例呢？
 * 
 * */
public class 单例设计模式 {
	public static void main(String[] args) {
		Singleton1 s = Singleton1.getInstance();
	}
}

//e han 占用内存的时间长，效率高
class Singleton1{
	
	private Singleton1() {}
	private static Singleton1 s = new Singleton1();
	public static Singleton1 getInstance() {
		return s;
	}
}
 //lanhan 占用内存的时间短，效率低（懒加载,延迟加载概念，后面学习框架）
//多线程访问时会有安全问题
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

//Math类中
class Tools{
	private Tools() {}
	public static void print1() {}
	//方法占用内存
}