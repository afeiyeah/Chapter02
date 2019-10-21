package chardemo;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//用字符类型存储一个汉字且只能存一个表示性别
		//字符是单引号
		char gender='男';
		//用字符型变量存储一个且只能存一个英文字母
		char letter='A';
		//两个以上字符组成字符串
		//字符串是双引号
		String name="汉斯";
		//字符型变量可以和证书相互转换,按照ascii码进行转换
		int num=letter;
		System.out.println(letter+"转换为整数后的数值是"+num);
		int word=gender;
		System.out.println(gender+"转换为整数后的数值是"+word);
		//二次调用变量num，并且赋予新数值
		num=gender;
		System.out.println("字符"+gender+"转为整数后的数值为"+num);
		System.out.println(letter+gender);
		System.out.println(letter+""+gender);
		//unicode编码16进制
		char symbol='\u03A6';
		
		
		
		
		
		
	}

}
