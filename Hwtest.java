package hello;

public class Hwtest {

	public static void main(String[] args) {
		/* ����1) ������ ���� 2���� ���� �� ���� 37�� 91�� ���� �ʱ�ȭ �� ������ ����϶�. 
		   ��¿���) "������1: ������, ������2: ������" */
		int i = 37;
		int j = 91;
		System.out.println(i);
		System.out.println(j);

		
		/* ����2) ���� 1���� ������ �̿��Ͽ� �� ������ ������ ����� ����϶�.
		   2.1) 91 ���ϱ� 37
		   2.2) 91 ���� 37
		   2.3) 91 ���ϱ� 37
		   2.4) 91 ������ 37 */
		System.out.println(j+i);
		System.out.println(j-i);
		System.out.println(j*i);
		System.out.println(j/i);
		

		/* ����3) �� ������ ���� �°� ����Ÿ���� ���� �� ���� ����Ÿ���� printf()�� ����Ͽ� ����ϼ���.
		    ��¿���) int a = 10; �� ��� "10, int"�� ���. */
		
		int var1 = 128;
		System.out.printf("%d,int\n",var1);
		
		String var2 = "B";
		System.out.printf("%s,String\n",var2);
		
		int var3 = 44032;
		System.out.printf("%d,int\n",var3);		
		
		long var4 = 100000000000L;
		System.out.printf("%d,long\n",var4);	
		
		double var5 = 43.93106;
		System.out.printf("%f,double\n",var5);
		
		double var6 = 301.3;
		System.out.printf("%f,double\n",var6);	
		
		// ����4) �Ʒ��� ���� ������ �ʱ�ȭ�Ǿ����� ��� ������� ������ ������ Ÿ���� �����ϰ� ���� �������� ����ϼ���.
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;
		
		long result1 = a + c + d;
		System.out.println(result1);
		
		int result2 = a + b + c;
		System.out.println(result2);


		double e = 45.31;
		double result3 = c + d + e;
		System.out.println(result3);	
		  
		/* ����5) �Ʒ��� ���� ������ �ʱ�ȭ�Ǿ����� ��� ������ ���� ��õȵ��� ����ϼ���.
		    ��¿���) A278����10.0 */
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "����";
		
		String charvalue = String.valueOf(charValue);
		System.out.println(charvalue + (intValue1+intValue2) + intValue3 + strValue + (double)intValue4);
		
		    
	    /* �߰�����) �Ʒ��� ���� ���� ���� �־��� ��� �� �ڸ��� ���� ���� ����ϼ���. 
		    ����) 373 �� ��� 3 + 7 + 3 = 13 ���� ����� 13�Դϴ�.
		    ��Ʈ) ���ϱ� ������ (*), ������ ������( / ) �� ���� ������ ( - ) �� �̿��ϼ���. */
		int value = 485;
		
		int q = value-480;
		System.out.println(q);
		int w = value/10-40;
		System.out.println(w);
		int r = value/100;
		System.out.println(r);
		
		System.out.println(q+w+r);
			    

	}



}
