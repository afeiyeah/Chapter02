package operatordemo;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JAVA�еĺ�&&��&��JAVA�еĻ�||��|
		//�����Ǻͻ��ǻ򣬵õ��Ľ���������ֵ
		System.out.println(10>3&&100>50);
		System.out.println(10>3&&100<50);
		System.out.println(10>3||100>50);
		System.out.println(10>3||100<50);
		System.out.println(10<3||100<50);
		//��˫�������������Ƿ���ڶ�·�ж�
		int x=10;
		int y=3;
		int u=20;
		int v=15;
		//&&�Ƕ�·������������һ�����ʽ�Ǽ٣��ڶ������ʽ��������
		//��·���������Ч�ʸ���
		//&�ǷǶ�·������������һ��Ϊ�٣��ڶ������ʽ��Ȼ����
		//||�Ƕ�·������������һ�����ʽ���棬�ڶ������ʽ��������
		System.out.println(x<3&++u>v);
		System.out.println("uĿǰ����ֵ��"+u);
		System.out.println(x>3||++u>v);
		System.out.println("uĿǰ����ֵ��"+u);

	}

}
