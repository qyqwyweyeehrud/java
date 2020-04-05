package homwork;

public class ProductExam {
	public static void main(String[] args) {
		Product ra = new Radio();
		Product vi = new Vidio();
		Product tv = new TV();
		
		ra.getProductName();
		vi.getProductName();
		tv.getProductName();
		
		try {
		Radio a = new Radio();
		//Vidio r = (Vidio)a;
		}catch(Exception ex) {
			System.out.println("형변환을 할수 없음");
		}
		
		Radio rad = new Radio();
		Vidio vid = new Vidio();
		TV tel = new TV();
		
		Product p =(Product)rad;
		Product p1 =(Product)vid;
		Product p2 =(Product)tel;
		System.out.println("형변환 가능");
		
	}

}
