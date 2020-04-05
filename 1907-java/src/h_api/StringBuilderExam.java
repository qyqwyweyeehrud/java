package h_api;
//��Ʈ���� �۵��� ��Ʈ�������� �ӵ���
public class StringBuilderExam {
	public StringBuilderExam(){
		//String �ӵ�
		long sTime = 0 , eTime =0;
		String str = "";
		
		sTime = System.nanoTime();
		for(int i =0;i<50000;i++) {
			str +="a";
		}
		eTime = System.nanoTime();
		
		System.out.println("String ó���ð�:" + (eTime - sTime));
		
		//��Ʈ�� ����
		StringBuilder sb = new StringBuilder(100);
		sTime = System.nanoTime();
		for(int i =0 ;i<50000 ; i++) {
			sb.append("a");
		}
		eTime = System.nanoTime();
		
		System.out.println("StringBuilder ����ð�:"+(eTime-sTime));
	}

	public static void main(String[] args) {
		new StringBuilderExam();

	}

}
