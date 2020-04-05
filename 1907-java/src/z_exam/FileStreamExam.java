package z_exam;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;

public class FileStreamExam {
	
	protected FileStreamExam()throws Exception{//접근제한자가protected 면 같은패키지,상속과 같은 생정자객체를 생성하는걸 허용하겠다 //디폴트이면 같은 패키지
		
		JFileChooser jc = new JFileChooser();//탐색기를 만든다
		int flag = jc.showOpenDialog(null);//창에띄울려고할때 프레임의 이름을쓰면된다
		//선택햇다는요소는 어떻게 비교를할수있냐면
		if(flag != JFileChooser.APPROVE_OPTION) {//창이뜨는데 여기에서 열기버튼 을누르면 그옵션이 뭐가반환되냐면 어프로브옵션이 반환됨
		
			return;//그 열기버튼말고 다른것이라면 리턴
		}
		String fileName = jc.getSelectedFile()/*셀렉티드파일하게되면 이 반환형이 파일타입이다*/.getPath();//겟패스를하면 파일이름이된다
		System.out.println(fileName);//파일의 경로가나옴 / <가변적인 이름>
		
		
		//바이트단위로 읽어서 바이트단위로 출력해보자
		//스트림을 얻어내자 인풋따로 아웃풋따로
		//스트림은 리더를 씌울수도 있고 버퍼를 씌울수도있다
		File file = new File(fileName);//에비씨는 프로젝스안의 경로에 있어야한다
		FileInputStream readFile = new FileInputStream(file);//괄호안이 디바이스장치 괄호안의 디바이스를 얻고 인풋을만들고//얘는 바이트단위로 읽음
		//InputStreamReader fileReader = new InputStreamReader(readFile);//디바이스로부터 인풋스트림을얻고 리더를 만들었다//똑같은건데 리더를 씌우면 문자단위로 데이터를 읽게된다
		//BufferedInputStream bis = new BufferedInputStream(readFile);//고속의 기억장치 램이라고 하는것이 있고 하드라고 하는것이있는데 속도차이가 엄청나다
		//버퍼를쓰면 입출력의 속도가 훨씬더 높아질수도 있다            램은 출력해야될 문장을 버퍼에넣으면 프린터에들어가있메모리장치는 램이기 때문에 고속이된다 
		//                                                             cpu는 다른작업을 하면서도 램에서는 입출력을 할수있기때문에 고속이된다
		
		flag = jc.showSaveDialog(null);//이번에는 저장모드로 열어라
		if(flag != JFileChooser.APPROVE_OPTION) {//저장버튼을눌러야 저장
			return;
		}
		
		
		String filename2 = jc.getSelectedFile().getPath();
		
		
		//읽은 데이터를가지고 새로운 파일로 만들겟다 즉, out put으로 내보내겠다
		File file2 = new File(filename2);//복사 될파일
		FileOutputStream writefile = new FileOutputStream(file2);
		
		//1바이트씩읽지말고 일정한 크기만큼 만들자
		byte[] readByte = new byte[4096];//4096번을 루핑해야되는것을 한방에 읽겠다//무조건 늘려버리면 주기억장치인 메모리에 압박이 들어가는거기때문에 무조건늘리는건 방법이 아니다
		int readSize = 0;
		
		//몇번을읽어야 abc파일을 다읽는지 모르기에
		//리드사이즈가 다읽으면 -1이 된다.
		while((readSize = readFile.read(readByte)) != -1) {//리드파일을 읽어라 (4096씩) 읽어라//처리된 결과가 -1이 아닐때까지 읽어라
			writefile.write(readByte, 0, readSize);//기준이 첫번째 바이트부터 readSize의 4096까지써라
													//마지막은 남은바이트가 리드사이즈에들어가고 0부터 남은바이트(리드사이즈)까지 저장하라
		}
		writefile.flush();//맨마지막꺼만 메모리를 비워라//남은 메모리를 지워라
		writefile.close();//열려진파일을 닫지않으면 다른데서 쓰질못함 홀딩이됨
		readFile.close();
		
	}

	public static void main(String[] args) throws Exception{//받을놈없으면 가산머신이 받는다 (class loader= 클래스를 메모리에 올리는놈)가 받는다
		
		FileStreamExam fs = new FileStreamExam();//fs를통해서 제3의 작업을 하기위해 만들어논것/객체를 만들어논것
		
		new FileStreamExam();//제3의 작업을 하지못함/객체를 만들지않음
	}

}
