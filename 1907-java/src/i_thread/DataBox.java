package i_thread;

public class DataBox {
	private String data;

	public synchronized String getData() {
		if(this.data==null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String v = data;
		System.out.println("ConsumerThread가 읽은 데이터:"+v);
		data = null;
		notify();
		return v;
	}

	public synchronized void setData(String data) {
		if(this.data !=null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.data =data;
			System.out.println("ProducerThread가 생성된 데이타"+data);
			notify();
			
		}
	}
	

}
