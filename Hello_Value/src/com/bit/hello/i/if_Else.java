package com.bit.hello.i;
  public class if_Else {
	public static void main(String[] args) {
		
		int intNum = 0;
		
		// 1���� 10���� ������ ¦��,Ȧ�� ����
		for(int i = 0; i <=10; i++) {
		int temp = (i/2)*2;
        if(temp == i) {
			System.out.println(i+"�� ¦��");
        }else {
        	System.out.println(i+"�� Ȧ��");
        }
	  }
		// 1���� 10���� ������ ¦��, Ȧ�� ����
		// ������ �����ڸ� ����ؼ� ����
		for(int i = 0; i<= 10; i++) {
			// ������ ������
			if(i%2 ==0) {
				System.out.println(i+"�� ¦��");
			}else {
				System.out.println(i+"�� Ȧ��");
			}
		}

	}

}
