package com.ict03.class01;

public class Ex01 {
	public static void main(String[] args) {
		// Ŭ����
		// ���� : ��ü(������Ʈ, �ν��Ͻ�ȭ)�� ����� ���� ��� ������ ������ �ִ� ��
		//		  (���赵��, ��Ǫ�������� ǥ���Ѵ�.)
		//		  ���� ���·� �Ǿ� ������ *** Ŭ������ ��ü�� �����߸� ��� �����ϴ�!!!
		
		// Ŭ������ ������ �ִ� �͵� : ������(���°�, �Ӽ�, ����), ���(����), ������
		// - ������(���°�, �Ӽ�) = ������ ��� => ��� �ʵ�
		// - ���(����, �۵�) = �޼ҵ� 			=> ��� �޼ҵ�
		// - ������ = Ŭ������ ��ü�� ���� �� ȣ��ȴ�.
		// 			  �����ڴ� Ŭ���� �̸��� ����. Ŭ���� �̸� = �����̸�
		//			  ������ Ŭ�����̸�() *** ()�� �����Ƿ� �޼ҵ�(���)�ε� Ŭ������ ��ü�� ����� �� �� ����ϴ°� ������
		//			  �������� ������ ����ʵ�(������)�� �ʱ�ȭ!
		
		// Ŭ������ ���� : ���, ����ʵ�, ����޼ҵ�, ������
		// 1. ��� : "[����������][Ŭ��������] class Ŭ�����̸� { " �κ�  (���ȣ�� �ִ°� ��������)
		// 		- ���������� : �ܺο��� ������ �� �ִ� ������ ���Ѵ�. (���� public�� ����������)
		// 						   Ŭ����, ����ʵ�, ����޼ҵ�, ������ ����� �� �տ� ���� �� �ִ�. (��������, main�� public) 
		//		1) public : ������ �� ���ٰ���(����)	
		//		2) protected : ���� ��Ű���� ��Ӱ���(�θ��ڽİ���)������ ���ٰ���
		//		3) ����(default) : �ƹ��͵� �Ⱦ��� �������� ���� ��Ű���� ���ٰ���
		//		4) private : �ܺο����� ������ ������ �Ұ�, �ƹ��͵� ���� ����
		//					 ���θ��(�ʵ�, �޼ҵ�)������ ���ٰ���              * ppt�׸� ����!
		//		- Ŭ���� ���� : �Ϲ����� Ŭ�������� �� �κ��� ����
		//						Ư�� Ŭ������ �ش� ���� ���(final, abstract)
		//		- class : Ŭ�������� ��Ÿ���� �����
		//		- Ŭ�����̸� : Ŭ�����̸� = �����̸� = ������
		//					   ù���� �빮�� ������ �ҹ���, �� �ܾ� �̻��� �� �ܾ���� ù���ڴ� �빮��, ���� �Ұ�,
		//					   Ư������ ���Ұ�, ���ڴ� �߰��̳� ���� ��밡�� ��) JavaTest01, Button01Test
		
		// 2. ����ʵ�
		// 		- ���� : �������� ���� �� �ִ� �����͸� �����ϴ� ����
		//				 ù���� �ҹ���, �� �ܾ� �̻��� �� �ܾ���� ù���ڴ� �빮��	
		//				 Ư������ ���Ұ�, ���ڴ� �߰��̳� ���� ��밡�� ��) javaTest01, button01Test
		//		- ��� : �ѹ� �����ϸ� ������ �� ���� �����͸� �����ϴ� ����
		//				 ��� ���ڰ� �빮��, �ܾ�� �ܾ� ���̿� _(underscore)�� ��� �� �� �ִ�.
		//				 ��) JAVA_TEST_01, BUTTON_01_TEST
		
		// 3. ����޼ҵ� : ����, ���, �۵��ϴ� ��
		//				   �޼ҵ��̸� �ڿ� ������ '( )' �� �����Ѵ�.
		//			 	   ** �ش� �޼ҵ带 ȣ���ϸ� �ش� �޼ҵ尡 ����ȴ�.
		//				   ** ������ ���� �޼ҵ�� �ڱ⸦ ȣ���� ������ �ǵ��ư���.
		//				   main()�� JVM�� ȣ���Ѵ�. (main()�� ������ JVM���� �ǵ��ư���.)
		//				   JVM���� �ǵ��ư��� ���α׷��� ����ȴ�.
		//		- �޼ҵ� ���� : [����������][�޼ҵ�����] ��ȯ�� �޼ҵ��̸�([���� = �Ű�����]){���೻��;}
		//		1) ���������� : Ŭ���� ���������ڿ� ����. (public > protected > ���� > private)
		//		2) �޼ҵ����� : instance �޼ҵ�� static �޼ҵ�� ��������.
		//						instance �޼ҵ尡 �Ϲݸ޼ҵ�� �� �κ��� �����Ѵ�.(�޼ҵ������κ� ����)
		//						static �޼ҵ�� �ݵ�� static�̶�� ���� ����ؾ��Ѵ�.
		//	 ** 3) ��ȯ�� : �޼ҵ�� �ڱ⸦ ȣ���� ������ �ǵ��ư���.
		//					�� �� ������ ����� ������ �� ���� �ڷ����� ��ȯ���̶�� �Ѵ�!
		//					����� ������ ���� ���� ���� ��ȯ���� void��� ����.
		//					��) public static void main(String[] args){}
		//					= ������ �� ������ �� �ְ�, static �޼ҵ��̸�, �ǵ��� �� �� ���𰡸� ������ ���� �ʴ´�.
		//		4) ����(= �Ű�����) : �޼ҵ尡 ������ �� �� �ʿ��� ������ ���ο��� �޾Ƽ� ����� �� ���ڰ� 
		//							  �ʿ��ϴ�. �ܺο��� ������ ���� ���� �ʿ���.
		//			**	- �����ε�(~Of) : ���� Ŭ���� �ȿ��� �޼ҵ��̸��� ����, ������ ������ ������ �ڷ����� 
		//								  �ٸ� �޼ҵ带 ���Ѵ�. ������ �޶� �����ε���.
		//		5) getter() / setter() 
		//			- getter() : ȣ���ϴ� ���忡�� �޼ҵ带 �̿��ؼ� ����ʵ��� �����͸� �� �� �ִ�.
		//			- setter() : ȣ���ϴ� ���忡�� �޼ҵ带 �̿��ؼ� ����ʵ��� �����͸� ������ �� �ִ�.
		
		// 4. ������ : Ŭ������ ��ü�� ���� �� �ѹ� ȣ��Ǵ� ��
		//		- ���� : ����ʵ�(������ ���)�� �ʱⰪ�� �����ϴ� ���� �����̴�.
		//		- ���� : Ŭ�����̸��� �����ڴ� ����. ( Ŭ�����̸�() )
		//				 ��ȯ���� ���� �޼ҵ�� ����.
		//		- Ŭ������ ��ü�� ����� ���� ��� 
		//		  Scanner   sc      =    new       			Scanner(System.in);
		//		  Ŭ���� ��������   =  ��ü����     ������(Ŭ������ �̸��� ���� ��� ��ȣ�� ����, ���ڰ� ���� ���� �ְ� ���� ���� ����)
		//		  ** �����ڰ� ������ ��ü���� �Ұ�
		//	 	  ���������� �̿��ؼ� ��ü�� ������ �ִ� ����ʵ峪 ����޼ҵ带 ����� �� �ִ�.
		// 		  ��ü�� ����� ���ؼ��� �����ڸ� ȣ���ؾ� ������ 
		// 	      �ݵ�� �ش� Ŭ������ ������ �ִ� �����ڸ� ȣ���� �����ϴ�.
		// 		- ��� Ŭ������ �ݵ�� �����ڸ� ������ �ִ�.(�������̽��� ����)
		//		  �����ڰ� ������ �ʴ� Ŭ������ �⺻�����ڷ� ��ü�� �����ϰ� �ȴ�.
		//		  �⺻�����ڶ�? ���ڰ� ���� �����ڸ� �ǹ��Ѵ�. ��) 'Ŭ�����̸�()'
		//		- �����ڵ� �����ε��� �����ϴ�. ��, ���ڸ� �ٸ��� �ϳ��� Ŭ���� �ȿ� ���� ���� �����ڰ� ������ �� �ִ�.
		
		//		- ������� ��ü �ȿ� �����ϴ� ����ʵ峪 ����޼ҵ带 ����ϴ� ���
		// 		  ��������.����ʵ�, ��������.����޼ҵ�
		//		  ��) Scanner scan = new Scanner(System.in); �� ��
		//			�� �� scan�� ��������. scan.next(), scan.nextInt() => �޼ҵ带 ȣ�� 
		
		// ����޼ҵ�� ����ʵ�� ũ�� �� ���� ������ �ִ�.
		// instance �޼ҵ�, instance �ʵ�, static �޼ҵ�, static �ʵ�
		// ** Ŭ�������� �Ϲ������� static�� ����� �� ����.(����Ŭ������ ����)
		// - instance : �Ϲ����� �޼ҵ峪 �ʵ带 ���Ѵ�.
		//				** ��ü�� ������ �� ���� �����Ǵ� �޼ҵ峪 �ʵ带 ���Ѵ�.
		//	ȣ���� : ��ü�� ���� �� ���������� ��� = ��������.�޼ҵ�, ��������.�ʵ�
		// - static : static�� �پ��ִ� �޼ҵ峪 �ʵ带 ���Ѵ�.
		//				** ��ü ������ ������� �̸� ������� �޼ҵ峪 �ʵ带 ���Ѵ�.
		//	ȣ���� : Ŭ�����̸�.�޼ҵ�, Ŭ�����̸�.�ʵ�
	}
}