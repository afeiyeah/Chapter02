package operatordemo;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������/������%
		//�������ķ��ӷ�ĸ�����������������Ĭ��Ϊ����
		int x=10;
		int y=3;
		//�������ķ��ӷ�ĸ��һ���Ǹ��������������Ĭ��Ϊ������
		double z=12.5;
		System.out.println("x����y��������"+x/y);
		System.out.println("x����y��������"+x%y);
		System.out.println("z����y��������"+z/y);
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
		//++������--�Լ�
		int v=w++;
		//++д�ڱ���w֮ǰ��w�ȱ����ã������������㣬���������w������
		System.out.println("v=w++��������"+v+", wĿǰ����ֵ��"+w);
		v=++w;
		System.out.println("v=w++��������"+v+", wĿǰ����ֵ��"+w);
		//wΪ4
		w=w++;
		System.out.println("w=w++��������"+w);
		w=++w;
		System.out.println("w=++w��������"+w);

		


	}

}
