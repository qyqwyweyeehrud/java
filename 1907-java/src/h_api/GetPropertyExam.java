package h_api;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;
import java.awt.event.ActionEvent;

public class GetPropertyExam extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GetPropertyExam frame = new GetPropertyExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void view() {
		String msg ="";
		
		String osName = System.getProperty("os.name");
		
		msg += "운영체제 이름:" + osName +"\n";
		msg += "사용자 이름"+ System.getProperty("user.name")+"\n";
		msg += "사용자 홈 " + System.getProperty("user.home")+"\n";
		msg +="------------------------------------------\n";
		msg +="[key] value \n";
		msg +="------------------------------------------\n";
		Properties props = System.getProperties();//프로퍼티의 반환타입은 프로퍼티들 이다.
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String)objKey;
			String value = System.getProperty(key);
			msg +="[" + key + "]" +value +"\n";
			msg += String.format("[%s] %s \n",key,value);
			
		}
		
		textArea.setText(msg);
	}
	
	public void viewClass() {
		String msg ="";
		Car car = new Car("a");
		Class clazz1 = car.getClass();
		
		msg+= clazz1.getName()+"\n";
		msg+= clazz1.getSimpleName()+"\n";;
		msg+= clazz1.getPackage().getName()+"\n";
		
		try {
			Class clazz2 = Class.forName("h_api.Car");
			msg+= clazz2.getName()+"\n";
			msg+= clazz2.getSimpleName()+"\n";;
			msg+= clazz2.getPackage().getName()+"\n";
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
	}
	public void viewReflect() throws ClassNotFoundException {
		String msg ="";
		Class clazz = Class.forName("h_api.Car");
		
		msg+="[클래스 이름]"+"\n";
		msg+=clazz.getName()+"\n";
		
		msg+="[생성자정보]";
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			msg+= constructor.getName()+"(";
			Class[] parameters = constructor.getParameterTypes();
			msg += printParameters(parameters);
			msg+=")";
			msg+="\n";
		}
			msg+="[핑드 정보]";
			Field[] fields = clazz.getDeclaredFields();
			for(Field field : fields) {
				msg += field.getType().getSimpleName() +" " + field.getName();
			}
			msg += "\n";
			
			msg+="[메소드 정보]";
			Method[] methods = clazz.getDeclaredMethods();
			for(Method method : methods) {
				msg += method.getName() + "(";
				Class[] parameters = method.getParameterTypes();
				msg += printParameters(parameters);
				msg += "\n";
			}
		}
		
		public String printParameters(Class[] parameters) {
			String r ="";
			for(int i=0;i<parameters.length;i++) {
				r += parameters[i].getName();
				if(i<(parameters.length-1)) {
					r += ",";
				}
			}
			return r;
		}
	
	
	


	

	/**
	 * Create the frame.
	 */
	public GetPropertyExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel(), BorderLayout.NORTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
			panel.add(getBtnNewButton_2());
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC18D\uC131\uBCF4\uAE30");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					view();
				}
			});
			btnNewButton.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Class");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					viewClass();
				}
			});
			btnNewButton_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uB9AC\uD50C\uB809\uC158");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						viewReflect();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnNewButton_2.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		}
		return btnNewButton_2;
	}
}
