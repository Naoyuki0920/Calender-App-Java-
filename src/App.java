import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new App();
	}

	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button10;
	JButton button11;
	JButton button12;

	App() {
		getContentPane().setLayout(new GridLayout(4, 3));

		button1 = new JButton("1");
		button1.addActionListener(this);
		getContentPane().add(button1);

		button2 = new JButton("2");
		button2.addActionListener(this);
		getContentPane().add(button2);

		button3 = new JButton("3");
		button3.addActionListener(this);
		getContentPane().add(button3);

		button4 = new JButton("4");
		button4.addActionListener(this);
		getContentPane().add(button4);

		button5 = new JButton("5");
		button5.addActionListener(this);
		getContentPane().add(button5);

		button6 = new JButton("6");
		button6.addActionListener(this);
		getContentPane().add(button6);

		button7 = new JButton("7");
		button7.addActionListener(this);
		getContentPane().add(button7);

		button8 = new JButton("8");
		button8.addActionListener(this);
		getContentPane().add(button8);

		button9 = new JButton("9");
		button9.addActionListener(this);
		getContentPane().add(button9);

		button10 = new JButton("10");
		button10.addActionListener(this);
		getContentPane().add(button10);

		button11 = new JButton("11");
		button11.addActionListener(this);
		getContentPane().add(button11);

		button12 = new JButton("12");
		button12.addActionListener(this);
		getContentPane().add(button12);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calendar");
		setSize(600, 450);
		setVisible(true);
		button1.setForeground(new Color(219, 65, 37));
		button2.setForeground(new Color(44, 112, 173));
		button3.setForeground(new Color(231, 117, 117));
		button4.setForeground(new Color(131, 180, 39));
		button5.setForeground(new Color(11, 162, 153));
		button6.setForeground(new Color(156, 62, 138));
		button7.setForeground(new Color(51, 161, 220));
		button8.setForeground(new Color(227, 131, 28));
		button9.setForeground(new Color(58, 107, 41));
		button10.setForeground(new Color(166, 119, 13));
		button11.setForeground(new Color(133, 69, 34));
		button12.setForeground(new Color(73, 76, 147));

		button1.setBackground(Color.WHITE);
		button2.setBackground(Color.WHITE);
		button3.setBackground(Color.WHITE);
		button4.setBackground(Color.WHITE);
		button5.setBackground(Color.WHITE);
		button6.setBackground(Color.WHITE);
		button7.setBackground(Color.WHITE);
		button8.setBackground(Color.WHITE);
		button9.setBackground(Color.WHITE);
		button10.setBackground(Color.WHITE);
		button11.setBackground(Color.WHITE);
		button12.setBackground(Color.WHITE);

		button1.setBorderPainted(false);
		button2.setBorderPainted(false);
		button3.setBorderPainted(false);
		button4.setBorderPainted(false);
		button5.setBorderPainted(false);
		button6.setBorderPainted(false);
		button7.setBorderPainted(false);
		button8.setBorderPainted(false);
		button9.setBorderPainted(false);
		button10.setBorderPainted(false);
		button11.setBorderPainted(false);
		button12.setBorderPainted(false);

		button1.setFont(new Font("Droid Sans", Font.PLAIN, 32));
		button2.setFont(new Font("Droid Sans", Font.PLAIN, 32));
		button3.setFont(new Font("Droid Sans", Font.PLAIN, 32));
		button4.setFont(new Font("Droid Sans", Font.PLAIN, 32));
		button5.setFont(new Font("Droid Sans", Font.PLAIN, 32));
		button6.setFont(new Font("Droid Sans", Font.PLAIN, 32));
		button7.setFont(new Font("Droid Sans", Font.PLAIN, 32));
		button8.setFont(new Font("Droid Sans", Font.PLAIN, 32));
		button9.setFont(new Font("Droid Sans", Font.PLAIN, 32));
		button10.setFont(new Font("Droid Sans", Font.PLAIN, 32));
		button11.setFont(new Font("Droid Sans", Font.PLAIN, 32));
		button12.setFont(new Font("Droid Sans", Font.PLAIN, 32));
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == button1) {
			JFrame frame = new JFrame();
			frame.setSize(300, 200);
			frame.setVisible(true);
			frame.setTitle("Janualy");
			JLabel lbl = new JLabel();
			lbl.setHorizontalAlignment(JLabel.CENTER);
			lbl.setText("1月です。あけましておめでとう！");
			lbl.setOpaque(true);
			frame.add(lbl);
		} else if (ae.getSource() == button2) {
			JFrame frame = new JFrame();
			frame.setSize(300, 200);
			frame.setVisible(true);
			frame.setTitle("February");
			JLabel lbl = new JLabel();
			lbl.setHorizontalAlignment(JLabel.CENTER);
			lbl.setText("2月です。鬼は外～福は内～！");
			lbl.setOpaque(true);
			frame.add(lbl);
		} else if (ae.getSource() == button3) {
			JFrame frame = new JFrame();
			frame.setSize(300, 200);
			frame.setVisible(true);
			frame.setTitle("March");
			JLabel lbl = new JLabel();
			lbl.setHorizontalAlignment(JLabel.CENTER);
			lbl.setText("3月です。明かりをつけましょ雪洞に～");
			lbl.setOpaque(true);
			frame.add(lbl);
		} else if (ae.getSource() == button4) {
			JFrame frame = new JFrame();
			frame.setSize(300, 200);
			frame.setVisible(true);
			frame.setTitle("April");
			JLabel lbl = new JLabel();
			lbl.setHorizontalAlignment(JLabel.CENTER);
			lbl.setText("4月です。新学期！");
			lbl.setOpaque(true);
			frame.add(lbl);
		} else if (ae.getSource() == button5) {
			JFrame frame = new JFrame();
			frame.setSize(300, 200);
			frame.setVisible(true);
			frame.setTitle("May");
			JLabel lbl = new JLabel();
			lbl.setHorizontalAlignment(JLabel.CENTER);
			lbl.setText("5月です。梅雨入りでじめじめ～");
			lbl.setOpaque(true);
			frame.add(lbl);
		} else if (ae.getSource() == button6) {
			JFrame frame = new JFrame();
			frame.setSize(300, 200);
			frame.setVisible(true);
			frame.setTitle("June");
			JLabel lbl = new JLabel();
			lbl.setHorizontalAlignment(JLabel.CENTER);
			lbl.setText("6月です。稽古始めなんだってー知らなかった。");
			lbl.setOpaque(true);
			frame.add(lbl);
		} else if (ae.getSource() == button7) {
			JFrame frame = new JFrame();
			frame.setSize(300, 200);
			frame.setVisible(true);
			frame.setTitle("July");
			JLabel lbl = new JLabel();
			lbl.setHorizontalAlignment(JLabel.CENTER);
			lbl.setText("7月です。七夕だ！天の川見えるかな？");
			lbl.setOpaque(true);
			frame.add(lbl);
		} else if (ae.getSource() == button8) {
			JFrame frame = new JFrame();
			frame.setSize(300, 200);
			frame.setVisible(true);
			frame.setTitle("August");
			JLabel lbl = new JLabel();
			lbl.setHorizontalAlignment(JLabel.CENTER);
			lbl.setText("8月です。お祭りわっしょい！");
			lbl.setOpaque(true);
			frame.add(lbl);
		} else if (ae.getSource() == button9) {
			JFrame frame = new JFrame();
			frame.setSize(300, 200);
			frame.setVisible(true);
			frame.setTitle("September");
			JLabel lbl = new JLabel();
			lbl.setHorizontalAlignment(JLabel.CENTER);
			lbl.setText("9月です。秋分だね。");
			lbl.setOpaque(true);
			frame.add(lbl);
		} else if (ae.getSource() == button10) {
			JFrame frame = new JFrame();
			frame.setSize(300, 200);
			frame.setVisible(true);
			frame.setTitle("October");
			JLabel lbl = new JLabel();
			lbl.setHorizontalAlignment(JLabel.CENTER);
			lbl.setText("10月です。トリックオアトリート！！");
			lbl.setOpaque(true);
			frame.add(lbl);
		} else if (ae.getSource() == button11) {
			JFrame frame = new JFrame();
			frame.setSize(300, 200);
			frame.setVisible(true);
			frame.setTitle("November");
			JLabel lbl = new JLabel();
			lbl.setHorizontalAlignment(JLabel.CENTER);
			lbl.setText("11月です。勤労に感謝(__)");
			lbl.setOpaque(true);
			frame.add(lbl);
		} else if (ae.getSource() == button12) {
			JFrame frame = new JFrame();
			frame.setSize(300, 200);
			frame.setVisible(true);
			frame.setTitle("December");
			JLabel lbl = new JLabel();
			lbl.setHorizontalAlignment(JLabel.CENTER);
			lbl.setText("12月です。一年早いね。よいお年を～");
			lbl.setOpaque(true);
			frame.add(lbl);
		}
	}
}
