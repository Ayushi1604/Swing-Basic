import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;
class login2 extends JFrame implements ItemListener
{
	JComboBox[] cb=new JComboBox[5];
	JLabel l1;
	int i;
	login2()
	{
		setContentPane(new JLabel(new ImageIcon("D:\\java2\\Swing\\Swing basic\\bank-of-india.png")));
		String a[]={"Products","Loan","Cards","Insurance"};
		String b[]={"Making Payments","Pay Bills and Shop Online","Pay Bills PhoneBanking","Pay Bills ATM","Pay Credit Card Bills","Online Tax Payment","Fund Transfer"};
		String c[]={"Locate Us","Branch","ATM"};
		String d[]={"Customer Care","Contact us","Queries","How do I block lost credit/debit card"};
		String e1[]={"Login","NetBanking","Credit Card"};
		cb[0]=new JComboBox(a);
		cb[1]=new JComboBox(b);
		cb[2]=new JComboBox(c);
		cb[3]=new JComboBox(d);
		cb[4]=new JComboBox(e1);
		l1=new JLabel("Bank Of India");
		cb[0].setBounds(410,180,120,30);
		cb[1].setBounds(530,180,170,30);
		cb[2].setBounds(700,180,120,30);
		cb[3].setBounds(820,180,200,30);
		cb[4].setBounds(630,130,120,30);
		for(i=0;i<4;i++)
		{
			add(cb[i]);
			cb[i].setForeground(Color.blue);
			cb[i].addItemListener(this);
		}
		cb[4].setForeground(Color.red);
		add(cb[4]);
		cb[4].addItemListener(this);
		Font f=new Font("Serif",Font.BOLD,25);
		Font f1=new Font("Serif",Font.BOLD,15);
		Font f2=new Font("SansSerif",Font.ITALIC,30);
		
		l1.setBounds(580,20,400,80);
		l1.setFont(f2);
		l1.setForeground(Color.black);
		add(l1);
		setSize(640,600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent e)
	{
		String E1=(String)cb[4].getSelectedItem();
		String D=(String)cb[3].getSelectedItem();
		if(E1.equals("NetBanking"))
		{
			new netbanking();
		}
		if(E1.equals("Credit Card"))
		{
			new c_card();
		}
		if(D.equals("Contact us"))
		{
			new contact();
		}
	}
	public static void main(String...s)
	{
		new login2();
	}
}
class netbanking extends JFrame implements ActionListener
{
	JTextField[] tf=new JTextField[3];
	int i;
	JLabel[] l=new JLabel[3];
	JLabel l1,l2;
	JButton[] b=new JButton[4];
	netbanking()
	{
		setContentPane(new JLabel(new ImageIcon("D:\\java2\\Swing\\Swing basic\\bank-of-india.png")));
		l[1]=new JLabel("User_id");
		l[2]=new JLabel("Password");
		l1=new JLabel("BOI");
		l2=new JLabel("NetBanking");
		tf[1]=new JTextField();
		tf[2]=new JTextField();
		b[1]=new JButton("Submit");
		b[2]=new JButton("New Registration");
		b[3]=new JButton("HomePage");
		Font f=new Font("Serif",Font.BOLD,25);
		Font f1=new Font("Serif",Font.BOLD,30);
		Font f2=new Font("SansSerif",Font.ITALIC,50);
		for(i=1;i<3;i++)
		{
			l[i].setBounds(100,100+(50*i),150,50);
			l[i].setFont(f);
			l[i].setForeground(Color.yellow);
			add(l[i]);
		}
				for(i=1;i<3;i++)
		{
			tf[i].setBounds(250,100+(50*i),150,50);
			add(tf[i]);
		}
		for(i=1;i<4;i++)
		{
			b[i].setBounds(10+(140*i),300,140,40);
			add(b[i]);
			b[i].setForeground(Color.red);
			b[i].addActionListener(this);
		}
		l1.setBounds(10,10,450,80);
		l2.setBounds(100,80,450,50);
		l1.setFont(f2);
		l2.setFont(f1);
		l1.setForeground(Color.red);
		l2.setForeground(Color.blue);
		add(l1);add(l2);
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b[1])
		{
			JOptionPane.showMessageDialog(this,"You are successfully logged in");
		}
		if(e.getSource()==b[2])
		{
			new register2();
		}
	    if(e.getSource()==b[3])
		{
			new login2();
		}
	}
	public static void main(String...s)
	{
		new netbanking();
	}
}
class c_card extends JFrame implements ActionListener
{
	JTextField[] tf=new JTextField[3];
	int i;
	JLabel[] l=new JLabel[3];
	JLabel l1,l2;
	JButton[] b=new JButton[4];
	c_card()
	{
		setContentPane(new JLabel(new ImageIcon("D:\\java2\\Swing\\Swing basic\\bank-of-india.png")));
		l[1]=new JLabel("User_id");
		l[2]=new JLabel("Password");
		l1=new JLabel("BOI");
		l2=new JLabel("Credit Card");
		tf[1]=new JTextField();
		tf[2]=new JTextField();
		b[1]=new JButton("Submit");
		b[2]=new JButton("New Registration");
		b[3]=new JButton("HomePage");
		Font f=new Font("Serif",Font.BOLD,25);
		Font f1=new Font("Serif",Font.BOLD,30);
		Font f2=new Font("SansSerif",Font.ITALIC,50);
		for(i=1;i<3;i++)
		{
			l[i].setBounds(100,100+(50*i),150,50);
			l[i].setFont(f);
			l[i].setForeground(Color.yellow);
			add(l[i]);
		}
				for(i=1;i<3;i++)
		{
			tf[i].setBounds(250,100+(50*i),150,50);
			add(tf[i]);
		}
		for(i=1;i<4;i++)
		{
			b[i].setBounds(10+(140*i),300,140,40);
			add(b[i]);
			b[i].setForeground(Color.red);
			b[i].addActionListener(this);
		}
		l1.setBounds(10,10,450,80);
		l2.setBounds(100,80,450,50);
		l1.setFont(f2);
		l2.setFont(f1);
		l1.setForeground(Color.red);
		l2.setForeground(Color.blue);
		add(l1);add(l2);
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b[1])
		{
			JOptionPane.showMessageDialog(this,"You are successfully logged in");
		}
		if(e.getSource()==b[2])
		{
			new register3();
		}
	    if(e.getSource()==b[3])
		{
			new login2();
		}
	}
	public static void main(String...s)
	{
		new c_card();
	}
}
class register2 extends JFrame implements ActionListener
{
	JTextField[] tf=new JTextField[5];
	JLabel[] l=new JLabel[5];
	JButton[] b=new JButton[3];
	JTextArea ta;
	JLabel l1,l2,l3;
	int i;
	String msg;
	register2()
	{
		setContentPane(new JLabel(new ImageIcon("D:\\java2\\Swing\\Swing basic\\bank-of-india.png")));
		l[1]=new JLabel("u_name");
		l[2]=new JLabel("mob no");
		l[3]=new JLabel("password");
		l[4]=new JLabel("retype password");
		l1=new JLabel("BOI");
		l2=new JLabel("NetBanking");
		l3=new JLabel("Unique_ID");
		tf[1]=new JTextField();
		tf[2]=new JTextField();
		tf[3]=new JTextField();
		tf[4]=new JTextField();
		b[1]=new JButton("sign up");
		b[2]=new JButton("Back");
		ta=new JTextArea();
		Font f=new Font("Serif",Font.BOLD,25);
		Font f1=new Font("Serif",Font.BOLD,30);
		Font f2=new Font("SansSerif",Font.ITALIC,50);
		ta.setBounds(350,350,100,30);
		add(ta);
		for(i=1;i<5;i++)
		{
			l[i].setBounds(150,100+50*i,180,30);
			l[i].setFont(f);
			l[i].setForeground(Color.yellow);
			add(l[i]);
		}
		for(i=1;i<5;i++)
		{
			tf[i].setBounds(350,100+50*i,100,30);
			add(tf[i]);
		}
		for(i=1;i<3;i++)
		{
			b[i].setBounds(150*i,400,80,40);
			b[i].setForeground(Color.blue);
			add(b[i]);
			b[i].addActionListener(this);
		}
			l1.setBounds(10,10,450,80);
		l2.setBounds(100,80,450,50);
		l3.setBounds(150,350,150,30);
		l1.setFont(f2);
		l2.setFont(f1);
		l3.setFont(f);
		l1.setForeground(Color.red);
		l2.setForeground(Color.blue);
		l3.setForeground(Color.yellow);
		add(l1);add(l2);add(l3);
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b[1])
		{
			Random rand=new Random();
			int r=rand.nextInt(1000);
			String r1=Integer.toString(r);
			ta.setText(r1);
		}
		else if(e.getSource()==b[2])
		{
			new netbanking();
		}
	}
	public static void main(String...s)
	{
		new register2();
	}
}
class register3 extends JFrame implements ActionListener
{
	JTextField[] tf=new JTextField[5];
	JLabel[] l=new JLabel[5];
	JButton[] b=new JButton[3];
	JTextArea ta;
	JLabel l1,l2,l3;
	int i;
	String msg;
	register3()
	{
		setContentPane(new JLabel(new ImageIcon("D:\\java2\\Swing\\Swing basic\\bank-of-india.png")));
		l[1]=new JLabel("u_name");
		l[2]=new JLabel("mob no");
		l[3]=new JLabel("password");
		l[4]=new JLabel("retype password");
		l1=new JLabel("BOI");
		l2=new JLabel("Credit Card");
		l3=new JLabel("Unique_ID");
		tf[1]=new JTextField();
		tf[2]=new JTextField();
		tf[3]=new JTextField();
		tf[4]=new JTextField();
		b[1]=new JButton("sign up");
		b[2]=new JButton("Back");
		ta=new JTextArea();
		Font f=new Font("Serif",Font.BOLD,25);
		Font f1=new Font("Serif",Font.BOLD,30);
		Font f2=new Font("SansSerif",Font.ITALIC,50);
		ta.setBounds(350,350,100,30);
		add(ta);
		for(i=1;i<5;i++)
		{
			l[i].setBounds(150,100+50*i,180,30);
			l[i].setFont(f);
			l[i].setForeground(Color.yellow);
			add(l[i]);
		}
		for(i=1;i<5;i++)
		{
			tf[i].setBounds(350,100+50*i,100,30);
			add(tf[i]);
		}
		for(i=1;i<3;i++)
		{
			b[i].setBounds(150*i,400,80,40);
			b[i].setForeground(Color.blue);
			add(b[i]);
			b[i].addActionListener(this);
		}
		l1.setBounds(10,10,450,80);
		l2.setBounds(100,80,450,50);
		l3.setBounds(150,350,150,30);
		l1.setFont(f2);
		l2.setFont(f1);
		l3.setFont(f);
		l1.setForeground(Color.red);
		l2.setForeground(Color.blue);
		l3.setForeground(Color.yellow);
		add(l1);add(l2);add(l3);
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b[1])
		{
			Random rand=new Random();
			int r=rand.nextInt(1000);
			String r1=Integer.toString(r);
			ta.setText(r1);
		}
		else if(e.getSource()==b[2])
		{
			new c_card();
		}
	}
	public static void main(String...s)
	{
		new register3();
	}
}
class contact extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b;
	JTextArea ta1,ta2,ta3,ta4,ta5;
	contact()
	{
		setContentPane(new JLabel(new ImageIcon("D:\\java2\\Swing\\Swing basic\\bank-of-india.png")));
		l1=new JLabel("BOI");
		l2=new JLabel("Contact us");
		l3=new JLabel("North India");
		l4=new JLabel("South India");
		l5=new JLabel("East India");
		l6=new JLabel("West India");
		l7=new JLabel("Mail Us AT");
		ta1=new JTextArea("9814752365");
		ta2=new JTextArea("9632147856");
		ta3=new JTextArea("9874563214");
		ta4=new JTextArea("8521479632");
		ta5=new JTextArea("info@boi.com");
		b=new JButton("HomePage");
		Font f=new Font("Serif",Font.BOLD,25);
		Font f1=new Font("Serif",Font.BOLD,30);
		Font f2=new Font("SansSerif",Font.ITALIC,50);
		b.setBounds(300,300,180,30);
		l1.setBounds(10,10,450,80);
		l2.setBounds(100,80,450,50);
		l3.setBounds(100,150,150,30);
		l4.setBounds(260,150,150,30);
		l5.setBounds(420,150,150,30);
		l6.setBounds(580,150,150,30);
		l7.setBounds(100,250,150,30);
		ta1.setBounds(100,200,130,30);
		ta2.setBounds(260,200,130,30);
		ta3.setBounds(420,200,130,30);
		ta4.setBounds(580,200,130,30);
		ta5.setBounds(260,250,130,30);
		l1.setFont(f2);
		l2.setFont(f1);
		l3.setFont(f);
		l4.setFont(f);
		l5.setFont(f);
		l6.setFont(f);
		l7.setFont(f);
		l1.setForeground(Color.red);
		l2.setForeground(Color.blue);
		l3.setForeground(Color.yellow);
		l4.setForeground(Color.yellow);
		l5.setForeground(Color.yellow);
		l6.setForeground(Color.yellow);
		l7.setForeground(Color.yellow);
		add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);
		add(ta1);add(ta2);add(ta3);add(ta4);add(ta5);
		add(b);
		b.addActionListener(this);
		setSize(740,600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			new login2();
		}
	}
	public static void main(String...s)
	{
		new contact();
	}
}
