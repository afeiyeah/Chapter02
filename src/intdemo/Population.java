package intdemo;

public class Population {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The literal(��ֵ���Ҳ����ֵ) 11400000000 of type int is out of range
		//�������ռ��32λ��2^31-1
		//int mount=11400000000;
		//long �����ͣ�ռ���ڴ�64λ
		//JAVA��Ĭ�ϸ�ֵ���Ҳ������ֵ����int��
		//114���Ѿ�����int��Χ,���Իᱨ������L�䳤���ͣ�ϵͳ����ȷʶ��
		//�����͵Ľ�β��־�����ô�дL��Сдl���ױ�����1
		long mount=11400000000L;
		long x=15;
		long newmount = mount*15;
		System.out.println("�˿�����15�������ֵ��"+newmount);
	}

}










