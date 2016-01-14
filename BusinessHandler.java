package businessHandler;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import medicalLabDao.ObjectionDao;
import medicalLabDao.ProfileDao;
import medicalLabDao.TestDao;
import medicalLabDao.TestTypeDao;
import medicalLabEntities.Objection;
import medicalLabEntities.Profile;
import medicalLabEntities.Test;
import medicalLabEntities.TestType;
import userInterface.UserInterface;

public class BusinessHandler implements ActionListener
{
	private UserInterface theGui;
	private ProfileDao mlDao;
	private TestDao tDao;
	private ObjectionDao oDao;
	private TestTypeDao ttDao;
	public BusinessHandler()
	{
		super();
	}
	public BusinessHandler(UserInterface t)
	{
		super();
		this.theGui=t;
		this.mlDao=new ProfileDao();
		this.tDao=new TestDao();
		this.oDao=new ObjectionDao();
		this.ttDao=new TestTypeDao();
	}
	

	public UserInterface getTheGui() 
	{
		return theGui;
	}
	public void setTheGui(UserInterface theGui) 
	{
		this.theGui = theGui;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		
		// TODO Auto-generated method stub
		if (event.getActionCommand().equals("Add Profile"))
		{
			Profile p=new Profile();
			String strId=theGui.text1.getText();
			int Id=Integer.parseInt(strId);
			String strName=theGui.text2.getText();
			String strAdress=theGui.text3.getText();
			String strContact=theGui.text4.getText();
			String strEmail=theGui.text5.getText();
			String strCnic=theGui.text6.getText();
			p.setProfileId(Id);
			p.setName(strName);
			p.setAddress(strAdress);
			p.setContactNo(strContact);
			p.setEmail(strEmail);
			p.setCnic(strCnic);
			mlDao.insert(p);
			clearFields();
			JOptionPane.showMessageDialog(null, "New Profile Created");		
		}
		else if (event.getActionCommand().equals("Add Test"))
		{
			Test t=new Test();
			String strpid=theGui.text7.getText();
			int pid=Integer.parseInt(strpid);
			String strtcode=theGui.text8.getText();
			int tcode=Integer.parseInt(strtcode);
			t.setProfileId(pid);
			t.setTestCode(tcode);
			tDao.insertTest(t);
			clearFields();
			JOptionPane.showMessageDialog(null, "New Test Created");	
		}
		else if (event.getActionCommand().equals("Add Objection"))
		{
			Objection o=new Objection();
			String stroid=theGui.oidtxt.getText();
			int oid=Integer.parseInt(stroid);
			String strpid=theGui.pidtxt.getText();
			int pid=Integer.parseInt(strpid);
			String des=theGui.destxt.getText();
			o.setObjectionId(oid);
			o.setProfileId(pid);
			o.setDescription(des);
			oDao.insertObjection(o);
			clearFields();
			JOptionPane.showMessageDialog(null, "New Objection Created");
		}
		else if (event.getActionCommand().equals("Add TestType"))
		{
			TestType tt=new TestType();
			String strtcode=theGui.ttidt.getText();
			int tcode=Integer.parseInt(strtcode);
			String strtrate=theGui.ttratet.getText();
			int trate=Integer.parseInt(strtrate);
			String des=theGui.ttdest.getText();
			tt.setTestCode(tcode);
			tt.setTestRate(trate);
			tt.setDescription(des);
			ttDao.insertObjection(tt);
			clearFields();
			JOptionPane.showMessageDialog(null, "New TestType Created");
		}
		
	}
	public void clearFields()
	{
		theGui.text1.setText("");
		theGui.text2.setText("");
		theGui.text3.setText("");
		theGui.text4.setText("");
		theGui.text5.setText("");
		theGui.text6.setText("");
		theGui.text7.setText("");
		theGui.text8.setText("");
		theGui.oidtxt.setText("");
		theGui.pidtxt.setText("");
		theGui.destxt.setText("");
		theGui.ttidt.setText("");
		theGui.ttratet.setText("");
		theGui.ttdest.setText("");
	}

}

