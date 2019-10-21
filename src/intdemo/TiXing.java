package intdemo;

public class TiXing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个类：梯形，上边长度为w=10，下边u长度为20，高h是15，求面积
		//主方法内的变量不能同名
		//变量必须先声明并且赋予初始值才能使用
		//未声明的变量不能使用
		int w=10;
		int u=20;
		int h=15;
		int s=(w+u)*h/2;
		System.out.println(s);
		System.out.println("梯形的面积是"+s);
		System.out.println("梯形的上边长度为"+w);
		System.out.println("梯形的下边长度为"+u);
		System.out.println("梯形的高为"+h);

	}

}
