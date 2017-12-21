package 面向对象上;
/**
 面向过程
 面向对象
 私有只能在本类中访问
 public可以再类外部的其他类访问。提供公有的方法简介访问
 属性都私有化，geter，setter
 */
public class 封装 {
	public static void main(String[] args) {
		
	}
	class Person{
		private String neme;
		private int age;
		public void setName(String name) {
			this.neme=name;
		}
	}
}
