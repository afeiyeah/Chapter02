package floatdemo;

public class Cone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����radius����Բ׶����뾶
		//����������ʽ��ת��Ϊ������������Ҫ��f
		float radius=4;
		//����height����Բ׶�ĸ߶�
		//Type mismatch: cannot convert from double to float
		//�Ⱥ��Ҳ��С��Ĭ��Ϊdouble��
		//doubleռ��64λ��floatռ��32λ�ڴ�ռ�
		//float height=6.5;
		//float�ĸ�����Ҫ��f
		float height=6.5f;
		//����һ������volumn�������
		//Java��Ĭ�ϸ�ֵ��=�Ҳม������Ϊdouble
		//�����double����ֵ��ֵ��float�ͱ���������Ҫǿ��ת����ǿת���ܻᶪʧһ����ȷ��
		//3.14Ĭ��Ϊdouble
		//Ҳ����(float)(3.14f*radius*radius*height/3);
		float volumn=3.14f*radius*radius*height/3;
		//��ӡ�����Ϣ
		System.out.println("Բ׶�������"+volumn);
		//�ַ����ͣ������ַ�������
		
	}

}










