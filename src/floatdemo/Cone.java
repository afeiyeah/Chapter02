package floatdemo;

public class Cone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义radius代表圆锥底面半径
		//整数可以隐式地转化为浮点数，不需要加f
		float radius=4;
		//定义height代表圆锥的高度
		//Type mismatch: cannot convert from double to float
		//等号右侧的小数默认为double型
		//double占用64位，float占用32位内存空间
		//float height=6.5;
		//float的浮点数要加f
		float height=6.5f;
		//声明一个变量volumn代表体积
		//Java中默认赋值号=右侧浮点数均为double
		//如果把double型数值赋值给float型变量，则需要强制转换，强转可能会丢失一定精确度
		//3.14默认为double
		//也可以(float)(3.14f*radius*radius*height/3);
		float volumn=3.14f*radius*radius*height/3;
		//打印体积信息
		System.out.println("圆锥的体积是"+volumn);
		//字符类型，不是字符串类型
		
	}

}










