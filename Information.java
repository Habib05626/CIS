import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Information extends JFrame{
	JLabel lblRadarF=new JLabel("Radar Frequency: ");
	JLabel lblBackF=new JLabel("Back Frequency: ");
	JLabel lblOutput=new JLabel("Output: ");
	//JButton btnMatching=new JButton("Matching: ");
	//JLabel lblActiveDrone=new JLabel("Activation Drone: ");
	
	JTextField txtRadarF=new JTextField(15);
	JTextField txtBackF=new JTextField(15);
	JTextField txtOutput=new JTextField(15);
	//JTextField txtActiveDrone=new JTextField(15);
	
	JButton btnMatching=new JButton("Matching");
	JButton btnActiveDrone=new JButton("Active Drone");
	
	JPanel mainPanel=new JPanel();
	JPanel panelCenter=new JPanel();
	JPanel panelSouth=new JPanel();
	
	public Information(){
		cmp();
		init();
		btnAction();
	}
	int temp;
	

	private void btnAction() {
		btnMatching.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			
				String s1=txtRadarF.getText();
				float x=Float.valueOf(s1);
				String s2=txtBackF.getText();
				float y=Float.valueOf(s2);
				if(y<=30.315&&y<=30.00)
				{
					txtOutput.setText("This is granades");
					temp=1;
				}
				else if(y>=48.03&&y<=49.07){
					txtOutput.setText("This is boms");
					temp=1;
				}
				else
				{
					txtOutput.setText("This is Normal person");
					temp=0;
					
				}
				
			}
		});
	btnActiveDrone.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				if(temp==1){
					JOptionPane.showMessageDialog(null, "Finally Robot active for final scanning for ensure & sending message after detecting");
					
				}
				else{
					JOptionPane.showMessageDialog(null, "Its a Normal person");
				}
				
			}
		});
	}


	public void cmp(){
		add(mainPanel);
		BorderLayout b=new BorderLayout();
		mainPanel.setLayout(b);
		mainPanel.add(panelCenter,BorderLayout.CENTER);
		panelCenterWork();
		mainPanel.add(panelSouth,BorderLayout.SOUTH);
		panelSouthWork();
	
	}
	public void panelCenterWork(){
		panelCenter.setBorder(BorderFactory.createLoweredBevelBorder());
		GridBagConstraints c=new GridBagConstraints();
		panelCenter.setBackground(Color.GRAY);
		panelCenter.setLayout(new GridBagLayout());
		c.fill=GridBagConstraints.BOTH;
		c.insets=new Insets(5, 5, 5, 5);
		
		c.gridx=0;
		c.gridy=0;
		panelCenter.add(lblRadarF,c);
		
		c.gridx=1;
		c.gridy=0;
		panelCenter.add(txtRadarF,c);
		
		c.gridx=0;
		c.gridy=1;
		panelCenter.add(lblBackF,c);
		
		c.gridx=1;
		c.gridy=1;
		panelCenter.add(txtBackF,c);
		
		c.gridx=0;
		c.gridy=2;
		panelCenter.add(lblOutput,c);
		
		c.gridx=1;
		c.gridy=2;
		panelCenter.add(txtOutput,c);

	}
	public void panelSouthWork(){
		//panelSouth.setBorder(BorderFactory.createLoweredBevelBorder());
		panelSouth.setPreferredSize(new Dimension(0,120));
		panelSouth.setBackground(Color.GRAY);
		FlowLayout f=new FlowLayout();
		panelSouth.setLayout(f);
		panelSouth.add(btnMatching);
		panelSouth.add(btnActiveDrone);
	
		
	}
	private void init(){
		setSize(350,300);
		setLocation(200,250);
		setVisible(true);
		setTitle("Criminal Identification System");
		setLocationRelativeTo(null);
		setResizable(false);
	}
	


	public static void main(String[] args) {
		Information object=new Information();
	}

}
