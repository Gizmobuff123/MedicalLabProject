package userInterface;

import java.awt.HeadlessException;

import javax.swing.*;

import businessHandler.BusinessHandler;
public class UserInterface extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel label1=new JLabel();
	public JLabel label2=new JLabel();
	public JLabel label3=new JLabel();
	public JLabel label4=new JLabel();
	public JLabel label5=new JLabel();
	public JLabel label6=new JLabel();
	public JLabel header=new JLabel();
	public JLabel header2=new JLabel();
	public JTextField text1=new JTextField();
	public JTextField text2=new JTextField();
	public JTextField text3=new JTextField();
	public JTextField text4=new JTextField();
	public JTextField text5=new JTextField();
	public JTextField text6=new JTextField();
	public JTextField text7=new JTextField();
	public JTextField text8=new JTextField();
	public JButton ok1=new JButton();
	public JLabel label7=new JLabel();
	public JLabel label8=new JLabel();
	public JButton ok2=new JButton();
	public JTextField text9=new JTextField();
	
	public JLabel newobj=new JLabel();
	public JLabel objid=new JLabel();
	public JLabel objpid=new JLabel();
	public JLabel objdes=new JLabel();
	public JTextField oidtxt=new JTextField();
	public JTextField pidtxt=new JTextField();
	public JTextField destxt=new JTextField();
	public JButton addobj=new JButton();
	
	public JLabel newtt=new JLabel();
	public JLabel ttid=new JLabel();
	public JLabel ttrate=new JLabel();
	public JLabel ttdes=new JLabel();
	public JTextField ttidt=new JTextField();
	public JTextField ttratet=new JTextField();
	public JTextField ttdest=new JTextField();
	public JButton addtt=new JButton();
	public JLabel ml=new JLabel();
	public UserInterface() throws HeadlessException 
	{
		
		super();
		interface1();
	}
	
	@SuppressWarnings("deprecation")
	public void interface1()
	{
		ml.setText("MEDICAL LAB");
		ml.setBounds(500,100,100,50);
		ok1.setText("Add Profile");
		ok1.setBounds(100,550,100,50);
		ok2.setText("Add Test");
		ok2.setBounds(400,350,100,50);
		header.setText("New Profile");
		header.setBounds(100, 200, 100, 50);
		header2.setText("New Test");
		header2.setBounds(400,200,100,50);
		label1.setText("Profile Id:");
		label1.setBounds(50, 250, 100, 30);
		text1.setBounds(150, 250, 100, 30);
		
		label2.setText("Name:");
		label2.setBounds(50, 300, 100, 30);
		text2.setBounds(150,300,100,30);
		
		label3.setText("Address:");
		label3.setBounds(50, 350, 100, 30);
		text3.setBounds(150,350,100,30);
		
		label4.setText("Contact No:");
		label4.setBounds(50, 400, 100, 30);
		text4.setBounds(150,400,100,30);
		
		label5.setText("Email:");
		label5.setBounds(50, 450, 100, 30);
		text5.setBounds(150,450,100,30);
		
		label6.setText("CNIC:");
		label6.setBounds(50, 500, 100, 30);
		text6.setBounds(150,500,100,30);
		
		label7.setText("Profile Id:");
		label7.setBounds(350,250,100,30);
		text7.setBounds(450,250,100,30);
		
		label8.setText("Test Code:");
		label8.setBounds(350,300,100,30);
		text8.setBounds(450,300,100,30);
		
		newobj.setText("New Objection");
		newobj.setBounds(700, 200, 100, 50);
		objid.setText("Objection Id:");
		objid.setBounds(650,250,100,30);
		objpid.setText("Profile Id:");
		objpid.setBounds(650,300,100,30);
		objdes.setText("Description:");
		objdes.setBounds(650,350,100,30);
		oidtxt.setBounds(750,250,100,30);
		pidtxt.setBounds(750,300,100,30);
		destxt.setBounds(750,350,100,100);
		addobj.setText("Add Objection");
		addobj.setBounds(700,500,150,50);
		
		newtt.setText("New TestType");
		ttid.setText("Id:");
		ttrate.setText("Rate:");
		ttdes.setText("Description");
		addtt.setText("Add TestType");
		newtt.setBounds(1000, 200, 100, 50);
		ttid.setBounds(950,250,100,30);
		ttrate.setBounds(950,300,100,30);
		ttdes.setBounds(950,350,100,30);
		addtt.setBounds(1000,500,150,50);
		ttidt.setBounds(1050,250,100,30);
		ttratet.setBounds(1050,300,100,30);
		ttdest.setBounds(1050,350,100,100);
		
		this.setSize(1400, 800);
		this.show();
		
		
		this.setLayout(null);
		this.add(ml);
		this.add(ok1);
		this.add(header);
		this.add(header2);
		this.add(text1);
		this.add(text2);
		this.add(text3);
		this.add(text4);
		this.add(text5);
		this.add(text6);
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(label5);
		this.add(label6);
		this.add(label7);
		this.add(text7);
		this.add(label8);
		this.add(text8);
		this.add(ok2);
		this.add(newobj);
		this.add(objid);
		this.add(objpid);
		this.add(objdes);
		this.add(oidtxt);
		this.add(pidtxt);
		this.add(destxt);
		this.add(addobj);
		this.add(newtt);
		this.add(ttid);
		this.add(ttrate);
		this.add(ttdes);
		this.add(ttidt);
		this.add(ttratet);
		this.add(ttdest);
		this.add(addtt);
		
		
		BusinessHandler Blobj = new BusinessHandler(this);
		ok1.addActionListener(Blobj);
		ok2.addActionListener(Blobj);
		addobj.addActionListener(Blobj);
		addtt.addActionListener(Blobj);	
	}
	public static void main(String[] args) 
	{
		UserInterface theFrame=new UserInterface();
		theFrame.validate();
	}	
}
