package intdemo;

public class ByteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ַ���������ռ8λ�ڴ�
		//���ֵΪ127����СֵΪ-127
		byte b1=65;
		byte b2=37;
		//Type mismatch: cannot convert from int to byte
		//ϵͳ��������������ʱ�򣬻��С��int�͵�����������int��
		//����b1+b2�Ľ����int�ͣ���int�ͽ���洢��byte�ͱ�����ȥ��Ҫǿ��ת��
		byte b3=(byte)(b1+b2);
		System.out.println(b3);
		b1=1;
		b2=127;
		//���͵���ֵ�������
		//byte�ֽ����������Ϊ2^7-1
		b3=(byte)(b1+b2);
		System.out.println(b3);
		//�������ֽ�����ֵ������Ϊ���ڻ����128����x����Ӧ���ֽ�ֵ���Ϊ��x-128��+��-128��
		//�ֽ������������������������ֽ������飬Ӧ�����ļ���д����
		//�����ͣ�ռ16λ�ڴ档��СֵΪ-2^15,���ֵΪ2^15-1
		//short s1=89;
		//short s2=100;
		//short s3=(short)(s1+s2);
		//charҲ��16λ��û�и���
		
		
		
	}

}
