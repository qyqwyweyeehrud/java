package z_exam;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;

public class FileStreamExam {
	
	protected FileStreamExam()throws Exception{//���������ڰ�protected �� ������Ű��,��Ӱ� ���� �����ڰ�ü�� �����ϴ°� ����ϰڴ� //����Ʈ�̸� ���� ��Ű��
		
		JFileChooser jc = new JFileChooser();//Ž���⸦ �����
		int flag = jc.showOpenDialog(null);//â���������Ҷ� �������� �̸�������ȴ�
		//�����޴ٴ¿�Ҵ� ��� �񱳸��Ҽ��ֳĸ�
		if(flag != JFileChooser.APPROVE_OPTION) {//â�̶ߴµ� ���⿡�� �����ư �������� �׿ɼ��� ������ȯ�ǳĸ� �����κ�ɼ��� ��ȯ��
		
			return;//�� �����ư���� �ٸ����̶�� ����
		}
		String fileName = jc.getSelectedFile()/*����Ƽ�������ϰԵǸ� �� ��ȯ���� ����Ÿ���̴�*/.getPath();//���н����ϸ� �����̸��̵ȴ�
		System.out.println(fileName);//������ ��ΰ����� / <�������� �̸�>
		
		
		//����Ʈ������ �о ����Ʈ������ ����غ���
		//��Ʈ���� ���� ��ǲ���� �ƿ�ǲ����
		//��Ʈ���� ������ ������� �ְ� ���۸� ��������ִ�
		File file = new File(fileName);//���񾾴� ������������ ��ο� �־���Ѵ�
		FileInputStream readFile = new FileInputStream(file);//��ȣ���� ����̽���ġ ��ȣ���� ����̽��� ��� ��ǲ�������//��� ����Ʈ������ ����
		//InputStreamReader fileReader = new InputStreamReader(readFile);//����̽��κ��� ��ǲ��Ʈ������� ������ �������//�Ȱ����ǵ� ������ ����� ���ڴ����� �����͸� �аԵȴ�
		//BufferedInputStream bis = new BufferedInputStream(readFile);//����� �����ġ ���̶�� �ϴ°��� �ְ� �ϵ��� �ϴ°����ִµ� �ӵ����̰� ��û����
		//���۸����� ������� �ӵ��� �ξ��� ���������� �ִ�            ���� ����ؾߵ� ������ ���ۿ������� �����Ϳ����ָ޸���ġ�� ���̱� ������ ����̵ȴ� 
		//                                                             cpu�� �ٸ��۾��� �ϸ鼭�� �������� ������� �Ҽ��ֱ⶧���� ����̵ȴ�
		
		flag = jc.showSaveDialog(null);//�̹����� ������� �����
		if(flag != JFileChooser.APPROVE_OPTION) {//�����ư�������� ����
			return;
		}
		
		
		String filename2 = jc.getSelectedFile().getPath();
		
		
		//���� �����͸������� ���ο� ���Ϸ� ����ٴ� ��, out put���� �������ڴ�
		File file2 = new File(filename2);//���� ������
		FileOutputStream writefile = new FileOutputStream(file2);
		
		//1����Ʈ���������� ������ ũ�⸸ŭ ������
		byte[] readByte = new byte[4096];//4096���� �����ؾߵǴ°��� �ѹ濡 �аڴ�//������ �÷������� �ֱ����ġ�� �޸𸮿� �й��� ���°ű⶧���� �����Ǵø��°� ����� �ƴϴ�
		int readSize = 0;
		
		//������о�� abc������ ���д��� �𸣱⿡
		//�������� �������� -1�� �ȴ�.
		while((readSize = readFile.read(readByte)) != -1) {//���������� �о�� (4096��) �о��//ó���� ����� -1�� �ƴҶ����� �о��
			writefile.write(readByte, 0, readSize);//������ ù��° ����Ʈ���� readSize�� 4096�������
													//�������� ��������Ʈ�� ������������ 0���� ��������Ʈ(���������)���� �����϶�
		}
		writefile.flush();//�Ǹ��������� �޸𸮸� �����//���� �޸𸮸� ������
		writefile.close();//������������ ���������� �ٸ����� �������� Ȧ���̵�
		readFile.close();
		
	}

	public static void main(String[] args) throws Exception{//����������� ����ӽ��� �޴´� (class loader= Ŭ������ �޸𸮿� �ø��³�)�� �޴´�
		
		FileStreamExam fs = new FileStreamExam();//fs�����ؼ� ��3�� �۾��� �ϱ����� �������/��ü�� �������
		
		new FileStreamExam();//��3�� �۾��� ��������/��ü�� ����������
	}

}
