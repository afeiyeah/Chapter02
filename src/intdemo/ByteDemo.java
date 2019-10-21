package intdemo;

public class ByteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//字符型整数，占8位内存
		//最大值为127，最小值为-127
		byte b1=65;
		byte b2=37;
		//Type mismatch: cannot convert from int to byte
		//系统在完成整数运算的时候，会把小于int型的整数升级成int型
		//所以b1+b2的结果是int型，把int型结果存储到byte型变量中去需要强制转换
		byte b3=(byte)(b1+b2);
		System.out.println(b3);
		b1=1;
		b2=127;
		//典型的数值溢出过程
		//byte字节型整数最大为2^7-1
		b3=(byte)(b1+b2);
		System.out.println(b3);
		//当两个字节型数值运算结果为大于或等于128的数x，对应的字节值结果为（x-128）+（-128）
		//字节型整数将来会和数组结果组成字节型数组，应用于文件读写过程
		//短整型，占16位内存。最小值为-2^15,最大值为2^15-1
		//short s1=89;
		//short s2=100;
		//short s3=(short)(s1+s2);
		//char也是16位，没有负数
		
		
		
	}

}
