package com.bit.hello.i;
  public class ifElse {
 	public static void main(String[] args) {
		boolean booValue = true ;// false
		// 10�ϰ� 1�� ����?
		//������ true�� ���� �ٸ��� false�� ����
		booValue = (10 == 1) ; //false
		
		//if�� ��ȣ ���� ��,��, ������ true �ΰ� ,false�ΰ�
		//{} ���� ������� �����Ұ��ΰ�, ���� ���ΰ� ����
		if(booValue) {
			System.out.println("10�� 1�� �����ϴ�");
		// if ��ȣ ���� ��,��,������ false�̸� ����Ǵ�
		}else {
			System.out.println("10�� 1�� �ٸ��ϴ�");
		}
		

	}

}
