package chardemo;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ַ����ʹ洢һ��������ֻ�ܴ�һ����ʾ�Ա�
		//�ַ��ǵ�����
		char gender='��';
		//���ַ��ͱ����洢һ����ֻ�ܴ�һ��Ӣ����ĸ
		char letter='A';
		//���������ַ�����ַ���
		//�ַ�����˫����
		String name="��˹";
		//�ַ��ͱ������Ժ�֤���໥ת��,����ascii�����ת��
		int num=letter;
		System.out.println(letter+"ת��Ϊ���������ֵ��"+num);
		int word=gender;
		System.out.println(gender+"ת��Ϊ���������ֵ��"+word);
		//���ε��ñ���num�����Ҹ�������ֵ
		num=gender;
		System.out.println("�ַ�"+gender+"תΪ���������ֵΪ"+num);
		System.out.println(letter+gender);
		System.out.println(letter+""+gender);
		//unicode����16����
		char symbol='\u03A6';
		
		
		
		
		
		
	}

}
