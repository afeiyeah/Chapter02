package booldemo;

public class BooleanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag1=true;
		boolean flag2=false;
		System.out.println(flag1?"flag1存储的是真值":"flag1存储的是假值");
		System.out.println(flag2?"flag2存储的是真值":"flag2存储的是假值");
		System.out.println(flag1?1000:50);
		System.out.println(flag1?1+0:1*0);
		
		int x=100;
		int y=50;
		boolean flag3=(x>y);
		System.out.println(flag3);
		x=10;
		flag3=(x>y);
		System.out.println(flag3);
		flag3=(x!=y);
		System.out.println(flag3);
	}

}











