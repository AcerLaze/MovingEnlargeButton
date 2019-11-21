
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main{
	
	private int mod;
	
	Main(){
		
		SwingUtilities.invokeLater(new Runnable(){
			
			public void run(){
				
				mod = 0;
				JFrame frame = new JFrame("O _ O");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(400, 300);
				frame.setLayout(null);
				
				JButton button1 = new JButton("CLICK ME !!!!");
				
				button1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
						mod+= 1;
						button1.setSize(button1.getWidth() + mod, button1.getHeight() + mod);
						
					}
				});
				
				frame.add(button1);
				frame.addMouseMotionListener(new MouseMotionListener() {
					
					@Override
					public void mouseMoved(MouseEvent e) {
						// TODO Auto-generated method stub
						
						button1.setBounds(e.getXOnScreen() - 50, e.getYOnScreen() - 50, 100, 20);
						mod = 0;
						
					}
					
					@Override
					public void mouseDragged(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				
				
				frame.setVisible(true);
				
			}
			
		});
		
	}
	
	public static void main(String[] args){
		
		new Main();
		
	}

}
