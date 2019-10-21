package operatordemo;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//运算符除法/和求余%
		//若除法的分子分母都是整数，求的商数默认为整数
		int x=10;
		int y=3;
		//若除法的分子分母有一个是浮点数，求的商数默认为浮点数
		double z=12.5;
		System.out.println("x除以y的商数是"+x/y);
		System.out.println("x除以y的余数是"+x%y);
		System.out.println("z除以y的商数是"+z/y);
		System.out.println(29/10);
		int w=15;
		w+=5;
		System.out.println(w);
		w*=2;
		System.out.println(w);
		w/=5;
		System.out.println(w);
		w%=3;
		System.out.println(w);
		//++自增，--自减
		int v=w++;
		//++写在变量w之前，w先被调用，用于其他计算，计算结束后w再自增
		System.out.println("v=w++运算结果是"+v+", w目前的数值是"+w);
		v=++w;
		System.out.println("v=w++运算结果是"+v+", w目前的数值是"+w);
		//w为4
		w=w++;
		System.out.println("w=w++运算结果是"+w);
		w=++w;
		System.out.println("w=++w运算结果是"+w);

		


	}

}
