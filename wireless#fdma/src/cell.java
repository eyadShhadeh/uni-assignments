import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class cell  {

	private JFrame frmCell;
	public static int counter1 ;
	public static int counter2 ;
	public static int counter3 ;

	
	Timer connectTimer ; 
	TimerTask task ;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cell window = new cell();
					window.frmCell.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}

	/**
	 * Create the application.
	 */
	public cell () {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCell = new JFrame();
		frmCell.setTitle("FDMA");
		frmCell.setBounds(100, 100, 587, 430);
		frmCell.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCell.getContentPane().setLayout(null);
		
		Label label_7 = new Label("base station");
		label_7.setFont(new Font("Dialog", Font.BOLD, 12));
		label_7.setBounds(360, 34, 92, 22);
		frmCell.getContentPane().add(label_7);
		
		Label label_6 = new Label("frequency spectrum");
		label_6.setBounds(37, 0, 112, 22);
		frmCell.getContentPane().add(label_6);
		
		Label label = new Label("\u2022 \u2022 \u2022");
		label.setFont(new Font("Dialog", Font.PLAIN, 14));
		label.setAlignment(Label.CENTER);
		label.setBounds(182, 42, 62, 22);
		frmCell.getContentPane().add(label);
		
		Label onUser1 = new Label("");
		onUser1.setAlignment(Label.CENTER);
		onUser1.setBounds(250, 34, 85, 43);
		frmCell.getContentPane().add(onUser1);
		
		
		Label onUser2 = new Label("");
		onUser2.setAlignment(Label.CENTER);
		onUser2.setBounds(250, 149, 85, 43);
		frmCell.getContentPane().add(onUser2);
		
		Label onUser3 = new Label("");
		onUser3.setAlignment(Label.CENTER);
		onUser3.setBounds(250, 258, 85, 43);
		frmCell.getContentPane().add(onUser3);
		
		Label label_4 = new Label("\u2022 \u2022 \u2022");
		label_4.setFocusTraversalKeysEnabled(false);
		label_4.setFocusable(false);
		label_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_4.setAlignment(Label.CENTER);
		label_4.setBounds(182, 161, 62, 22);
		frmCell.getContentPane().add(label_4);
		
		Label label_5 = new Label("\u2022 \u2022 \u2022");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_5.setAlignment(Label.CENTER);
		label_5.setBounds(182, 271, 62, 22);
		frmCell.getContentPane().add(label_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("");
		panel_1.setBorder(new LineBorder(Color.GRAY, 2, true));
		panel_1.setBounds(10, 11, 160, 364);
		frmCell.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		
		Label label_1 = new Label("channel 1");
		label_1.setBounds(47, 10, 62, 22);
		panel_1.add(label_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		panel_4.setBounds(4, 4, 153, 119);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		
		Panel freq_1 = new Panel();
		freq_1.setBounds(6, 16, 141, 96);
		panel_4.add(freq_1);
		freq_1.setLayout(null);
		
		Button user_1 = new Button("user 1");
		
		user_1.setBounds(29, 10, 70, 22);
		freq_1.add(user_1);
		
		Button user_2 = new Button("user 2");
		user_2.setBounds(29, 38, 70, 22);
		freq_1.add(user_2);
		
		Button user_3 = new Button("user 3");
		user_3.setBounds(29, 64, 70, 22);
		freq_1.add(user_3);
		

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_2.setBounds(349, 48, 194, 246);
		frmCell.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(6, 16, 182, 223);
		panel_2.add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel_3.setBounds(4, 236, 153, 119);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		Label label_8 = new Label("online user");
		label_8.setFont(new Font("Cambria Math", Font.PLAIN, 19));
		label_8.setAlignment(Label.CENTER);
		label_8.setBounds(10, 24, 162, 59);
		panel.add(label_8);
		
		Label label_9 = new Label("online user");
		label_9.setFont(new Font("Cambria Math", Font.PLAIN, 19));
		label_9.setAlignment(Label.CENTER);
		label_9.setBounds(10, 89, 162, 59);
		panel.add(label_9);
		
		Label label_10 = new Label("online user");
		label_10.setFont(new Font("Cambria Math", Font.PLAIN, 19));
		label_10.setAlignment(Label.CENTER);
		label_10.setBounds(10, 154, 162, 59);
		panel.add(label_10);
		
		
		user_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
//					user_1.setBackground(Color.black);
//					user_2.setBackground(null);
//					user_3.setBackground(null);
//					
//					user_1.setForeground(Color.white);
//					user_2.setForeground(Color.black);
//					user_3.setForeground(Color.black);
//					
					mainAction(user_1, user_2, user_3);
					
					// user_1.setEnabled(false);
					
					taskImp(onUser1 , user_1,label_8, user_2, user_3);
					//onUser1.setText("connecting");
					// label_8.setText("USER #1");
				
				
				
				
				
			}
		});
		user_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
//				user_2.setBackground(Color.black);
//				user_1.setBackground(null);
//				user_3.setBackground(null);
//				
//				user_1.setForeground(Color.black);
//				user_2.setForeground(Color.white);
//				user_3.setForeground(Color.black);
//				
				
				mainAction(user_2, user_1, user_3);
				taskImp(onUser1 , user_2,label_8, user_1, user_3);
				
//				onUser1.setText("connecting");
//				label_8.setText("USER #2");
			}
		});
		user_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
//				user_3.setBackground(Color.black);
//				user_2.setBackground(null);
//				user_1.setBackground(null);
//				
//				user_1.setForeground(Color.black);
//				user_2.setForeground(Color.black);
//				user_3.setForeground(Color.white);
				
				mainAction(user_3, user_1, user_2);
				taskImp(onUser1 , user_3,label_8, user_1, user_2);

//				onUser1.setText("connecting");
//				label_8.setText("USER #3");
			}
		});
		
		
		
		
		Label label_2 = new Label("channel 2");
		label_2.setBounds(47, 129, 62, 22);
		panel_1.add(label_2);
		
		Panel freq_2 = new Panel();
		freq_2.setBounds(10, 138, 141, 96);
		panel_1.add(freq_2);
		freq_2.setLayout(null);
		
		Button user_4 = new Button("user 4");
		user_4.setBounds(33, 10, 70, 22);
		freq_2.add(user_4);
		
		Button user_5 = new Button("user 5");
		user_5.setBounds(33, 38, 70, 22);
		freq_2.add(user_5);
		
		Button user_6 = new Button("user 6");
		user_6.setBounds(33, 64, 70, 22);
		freq_2.add(user_6);
		
		user_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				user_4.setBackground(Color.darkGray);
//				user_5.setBackground(null);
//				user_6.setBackground(null);
//				
//				user_4.setForeground(Color.white);
//				user_5.setForeground(Color.black);
//				user_6.setForeground(Color.black);
//				
				
				mainAction(user_4, user_5, user_6);
				taskImp2(onUser2 , user_4,label_9, user_5, user_6);
				
				
//				
//				onUser2.setText("connecting");
//				label_9.setText("USER #4");
//				
			}
		});
		
		user_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				user_5.setBackground(Color.darkGray);
//				user_4.setBackground(null);
//				user_6.setBackground(null);
//				
//				user_5.setForeground(Color.white);
//				user_4.setForeground(Color.black);
//				user_6.setForeground(Color.black);
//				
				
				mainAction(user_5, user_4, user_6);
				taskImp2(onUser2 , user_5,label_9, user_4, user_6);
				
				
//				
//				onUser1.setText("connecting");
//				label_9.setText("USER #5");
			}
		});
		
		user_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				user_6.setBackground(Color.darkGray);
//				user_5.setBackground(null);
//				user_4.setBackground(null);
//				
//				user_6.setForeground(Color.white);
//				user_5.setForeground(Color.black);
//				user_4.setForeground(Color.black);
//				
				

				mainAction(user_6, user_4, user_5);
				taskImp2(onUser2 , user_6,label_9, user_4, user_5);
				
				
//				onUser1.setText("connecting");
//				label_9.setText("USER #6");
			}
		});
		
		Label label_3 = new Label("channel 3");
		label_3.setBounds(47, 240, 62, 22);
		panel_1.add(label_3);
		
		
		Panel freq_3 = new Panel();
		freq_3.setBounds(6, 16, 141, 96);
		panel_3.add(freq_3);
		freq_3.setLayout(null);
		
		Button user_7 = new Button("user 7");
		user_7.setBounds(27, 10, 70, 22);
		freq_3.add(user_7);
		
		Button user_8 = new Button("user 8");
		user_8.setBounds(27, 38, 70, 22);
		freq_3.add(user_8);
		
		Button user_9 = new Button("user 9");
		user_9.setBounds(27, 64, 70, 22);
		freq_3.add(user_9);
		
		
		
		user_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				user_7.setBackground(Color.lightGray);
//				user_8.setBackground(null);
//				user_9.setBackground(null);
//				
//				user_7.setForeground(Color.white);
//				user_8.setForeground(Color.black);
//				user_9.setForeground(Color.black);
//				
//				
//				onUser3.setText("connecting");
//				label_10.setText("USER #7");
				
				mainAction(user_7, user_8, user_9);
				taskImp3(onUser3 , user_7,label_10, user_8, user_9);
				
			}
		});
		
		user_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				user_8.setBackground(Color.lightGray);
//				user_7.setBackground(null);
//				user_9.setBackground(null);
//				
//				user_8.setForeground(Color.white);
//				user_7.setForeground(Color.black);
//				user_9.setForeground(Color.black);
//				
//				
//				onUser3.setText("connecting");
//				label_10.setText("USER #8");
				
				mainAction(user_8, user_7, user_9);
				taskImp3(onUser3 , user_8,label_10, user_7, user_9);
				
			}
		});
		user_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				user_9.setBackground(Color.lightGray);
//				user_7.setBackground(null);
//				user_8.setBackground(null);
//				
//				user_9.setForeground(Color.white);
//				user_7.setForeground(Color.black);
//				user_8.setForeground(Color.black);
//				
//				
//			//	onUser3.setText("connecting");
//				label_10.setText("USER #9");
				
		//	Thread1 testThread_9 = new Thread1() ;
			//testThread_9.start();		
				
				mainAction(user_9, user_8, user_7);
			taskImp3(onUser3 , user_9,label_10, user_8, user_7);
				
			}
		});
		
		
		
		
		
	}
	
	
	
	public void taskImp(Label targetLable , Button onBtn,Label onlineLbl, Button secendry, Button other) {
		randomGenreater(1);
	//	connectTimer = new Timer() ; 
	Timer firstTimer = new Timer() ;
		
		
		task = new TimerTask() {
			
			@Override
			public void run() {
			if (counter1 > 0 )
			{
				counter1 -- ;
					targetLable.setText(timeTransfer(counter1));
					onlineLbl.setText(onBtn.getLabel());
					
				}
				else
				{
				//	connectTimer.cancel();
					firstTimer.cancel();	
					
					
				targetLable.setText("finished");
				
				onBtn.setForeground(Color.black);
				onBtn.setBackground(null);
				onBtn.setEnabled(true);
				secendry.setEnabled(true);
				other.setEnabled(true);
				
				
				
				onlineLbl.setText("Avilable");
				}
				
			}
		};  // the end of the task 
		
		firstTimer.scheduleAtFixedRate(task, 0, 1000);
		
	}
	
	public void taskImp2(Label targetLable , Button onBtn,Label onlineLbl, Button secendry, Button other) {
		randomGenreater(2);
		//connectTimer = new Timer() ; 
		Timer secandTimer = new Timer() ;
		
		task = new TimerTask() {
			
			@Override
			public void run() {
			if (counter2 > 0 )
			{
				counter2 -- ;
					targetLable.setText(timeTransfer(counter2));
					onlineLbl.setText(onBtn.getLabel());
					
				}
				else
				{
				//connectTimer.cancel();
				
				targetLable.setText("finished");
				
				onBtn.setForeground(Color.black);
				onBtn.setBackground(null);
				onBtn.setEnabled(true);
				secendry.setEnabled(true);
				other.setEnabled(true);
				
				
				
				onlineLbl.setText("Avilable");
				}
				
			}
		};  // the end of the task 
		
		secandTimer.scheduleAtFixedRate(task, 0, 1000);
		
	}
	public void taskImp3(Label targetLable , Button onBtn,Label onlineLbl, Button secendry, Button other) {
		randomGenreater(3);
		connectTimer = new Timer() ; 
		Timer thirdTimer = new Timer() ;
		
		task = new TimerTask() {
			
			@Override
			public void run() {
			if (counter3 > 0 )
			{
				counter3 -- ;
					targetLable.setText(timeTransfer(counter3));
					onlineLbl.setText(onBtn.getLabel());
					
				}
				else
				{
				//	connectTimer.cancel();
					thirdTimer.cancel();
					
				targetLable.setText("finished");
				
				onBtn.setForeground(Color.black);
				onBtn.setBackground(null);
				onBtn.setEnabled(true);
				secendry.setEnabled(true);
				other.setEnabled(true);
				
				
				
				onlineLbl.setText("Avilable");
				}
				
			}
		};  // the end of the task 
		
		thirdTimer.scheduleAtFixedRate(task, 0, 1000);
		
	}
	
	
	/*
	 * // not used public boolean availabilityCheck() { boolean status = false ; if
	 * (counter == 0 ) {
	 * 
	 * return status = true ; } else return status ;
	 * 
	 * }
	 */
	
	public void mainAction(Button onBtn, Button secendry, Button other) {
		
		
		onBtn.setBackground(Color.lightGray);
		secendry.setBackground(null);
		other.setBackground(null);
		
		onBtn.setForeground(Color.white);
		secendry.setForeground(Color.black);
		other.setForeground(Color.black);
		
		onBtn.setEnabled(false);
		secendry.setEnabled(false);
		other.setEnabled(false);
		
	}
	
	public void name() {
		
	} String timeTransfer(int counter){

	    long minutes = counter / 60 ;
	    long seconds = (counter) %60 ;
	   
	    
	    
	    
	     return minutes + " : " + seconds ;      //+ " : "  + milliseconds;
	 }
	
	public void randomGenreater (int counter) {
		
		//random genreat between 30 sec and 5 min
//	counter =(int) (Math.random() * ((300 - 30) + 1)) + 30; 
		switch (counter) {
		
			case 1:
			counter1 = 10 ;
			break;
			
			case 2:
				counter2 = 10 ;
				break;
				
			case 3:
				counter3 = 10 ;
				break;	

		default:
			break;
		}
	}
	
}




/*// thread class 
 class Thread1 implements Runnable{
	 public static int counterThread ;
	

	 public void threadMeth(Label targetLable , Button onBtn,Label onlineLbl) {
		
	
		 
	 }


	@Override
	public void run() {
		// TODO Auto-generated method stub
		 
		 cell oldMethod = new cell ();
		 oldMethod.randomGenreater(counterThread);
		 oldMethod.connectTimer = new Timer() ; 
		
			
			TimerTask task = new TimerTask() {
				
			@Override
			public void run() {
				
				
				
			if (counterThread > 0 )
				{
					counterThread -- ;
						targetLable.setText(oldMethod.timeTransfer(counterThread));
					onlineLbl.setText(onBtn.getLabel());
						
					}
					else
					{
					
				targetLable.setText("finished");
					
				onBtn.setForeground(Color.black);
					onBtn.setBackground(null);
					onBtn.setEnabled(true);
					
					
					
				onlineLbl.setText("Avilable");
				}
					
				}
		};  // the end of the task 
			
			oldMethod.connectTimer.scheduleAtFixedRate(task, 0, 1000);
			
	}
		
	}
	
} */
