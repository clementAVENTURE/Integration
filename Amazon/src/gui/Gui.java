package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import amazon.Query1Amazon;
import amazon.Query6Amazon;
import amazon.Query7Amazon;




public class Gui extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private static QueryPanel qp = new QueryPanel();
	private static DescriptionPanel dp = new DescriptionPanel();
	private static ResultPanel rp = new ResultPanel();
	private static ConverterPanel cp = new ConverterPanel();
	private JPanel title = new JPanel();

	private JLabel label = new JLabel("Amazon");

	private Font police = new Font(Font.MONOSPACED, Font.ITALIC, 16);
	private Color amazon = new Color(0,0,80);
	
	public Gui() {
		this.setTitle("Amazon");
		this.setSize((int)getToolkit().getScreenSize().getWidth(), ((int)getToolkit().getScreenSize().getHeight() - 40));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		this.getContentPane().add(rp, BorderLayout.CENTER);
		this.getContentPane().add(qp, BorderLayout.WEST);
		this.getContentPane().add(dp, BorderLayout.SOUTH);
		this.getContentPane().add(cp, BorderLayout.EAST);
		this.add(title, BorderLayout.NORTH);
		
		
		label.setFont(police);
        label.setForeground(Color.WHITE);
		
		title.setBackground(amazon);
		label.setFont(new Font(Font.SERIF,Font.BOLD,34));
		title.setBorder(BorderFactory.createEmptyBorder(40,40,40,40)); 
        title.add(label);
        
        
		title.add(label);
        
        
		this.setVisible(true);
 	    	  
	}
	

	public static ResultPanel getRp() {
		return rp;
	}

	public static void setRp(ResultPanel rp) {
		Gui.rp = rp;
	}


	public static QueryPanel getQp() {
		return qp;
	}


	public static void setQp(QueryPanel qp) {
		Gui.qp = qp;
	}


		
}
