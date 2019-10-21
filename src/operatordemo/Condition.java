package operatordemo;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JAVA中的和&&，&；JAVA中的或||，|
		//无论是和还是或，得到的结果都是真假值
		System.out.println(10>3&&100>50);
		System.out.println(10>3&&100<50);
		System.out.println(10>3||100>50);
		System.out.println(10>3||100<50);
		System.out.println(10<3||100<50);
		//单双符号区别在于是否存在短路判断
		int x=10;
		int y=3;
		int u=20;
		int v=15;
		//&&是短路运算符，如果第一个表达式是假，第二个表达式不再运算
		//短路运算符运算效率更高
		//&是非短路运算符，即便第一个为假，第二个表达式仍然运算
		//||是短路运算符，如果第一个表达式是真，第二个表达式不再运算
		System.out.println(x<3&++u>v);
		System.out.println("u目前的数值是"+u);
		System.out.println(x>3||++u>v);
		System.out.println("u目前的数值是"+u);

	}

}
