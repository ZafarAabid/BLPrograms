package com.bridgeLabz.functional;
import java.applet.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

public class StopWatchApplet extends Applet implements Runnable, ActionListener { 
		Panel p; 
	Label display; 

	Button start, stop, reset; 
	int hour, minute, second, millisecond; 
	String disp; 
	boolean on; 

	public void init() 
	{ 
		on = false; 

		p = new Panel(); 
		p.setLayout(new GridLayout(4, 1, 6, 10)); 
		hour = minute = second = millisecond = 0; 
		display = new Label(); 
		disp = "00 : 00 : 00 : 000"; 
		display.setText(disp); 
		p.add(display); 
		
		start = new Button("Start"); 
		start.addActionListener((ActionListener) this); 
		p.add(start); 

		reset = new Button("Reset"); 
		reset.addActionListener((ActionListener) this); 
		p.add(reset); 

		stop = new Button("Stop"); 
		stop.addActionListener((ActionListener) this); 
		p.add(stop); 

		add(p); 

		new Thread(this, "StopWatch").start(); 
	} 

	public void reset() 
	{ 
		try { 
			Thread.sleep(1); 
		} 
		catch (Exception e) { 
			System.out.println(e); 
		} 
		hour = minute = second = millisecond = 0; 
	} 

	public void update() 
	{ 
		millisecond++; 
		if (millisecond == 1000) { 
			millisecond = 0; 
			second++; 
			if (second == 60) { 
				second = 0; 
				minute++; 
				if (minute == 60) { 
					minute = 0; 
					hour++; 
				} 
			} 
		} 
	} 

	public void changeLabel() 
	{ 

		if (hour < 10) 
			disp = "0" + hour + " : "; 
		else
			disp = hour + " : "; 

		if (minute < 10) 
			disp += "0" + minute + " : "; 
		else
			disp += minute + " : "; 

		if (second < 10) 
			disp += "0" + second + " : "; 
		else
			disp += second + " : "; 

		if (millisecond < 10) 
			disp += "00" + millisecond; 
		else if (millisecond < 100) 
			disp += "0" + millisecond; 
		else
			disp += millisecond; 

		display.setText(disp); 
	} 

	public void run() 
	{ 

		while (on) { 
			try { 
				Thread.sleep(1); 
				update(); 
				changeLabel(); 
			} 
			catch (InterruptedException e) { 
				System.out.println(e); 
			} 
		} 
	} 

	public void actionPerformed(ActionEvent e) 
	{ 

		if (e.getSource() == start) { 
			on = true; 
			new Thread(this, "StopWatch").start(); 
		} 

		if (e.getSource() == reset) { 
			on = false; 
			reset(); 
			changeLabel(); 
		} 

		if (e.getSource() == stop) { 
			on = false; 
		} 
	} 
} 