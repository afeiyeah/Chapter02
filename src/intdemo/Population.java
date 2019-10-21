package intdemo;

public class Population {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The literal(赋值号右侧的数值) 11400000000 of type int is out of range
		//整型最大占据32位，2^31-1
		//int mount=11400000000;
		//long 长整型，占据内存64位
		//JAVA中默认赋值号右侧的整数值都是int型
		//114亿已经超过int范围,所以会报错，加上L变长整型，系统会正确识别
		//长整型的结尾标志建议用大写L，小写l容易被当做1
		long mount=11400000000L;
		long x=15;
		long newmount = mount*15;
		System.out.println("人口膨胀15倍后的数值是"+newmount);
	}

}










