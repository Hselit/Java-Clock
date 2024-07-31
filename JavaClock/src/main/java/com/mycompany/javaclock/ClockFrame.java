package com.mycompany.javaclock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClockFrame extends Frame{
    JFrame frame;
    JPanel timePanel;
    JPanel datePanel;
    JLabel timelabel;
    JLabel dateLabel;
    String time,date;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;
    
    ClockFrame(){
        frame = new JFrame();
        frame.setSize(300,150);
        frame.setTitle("My Clock");
        frame.setResizable(false);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        
        
        timePanel = new JPanel();
        datePanel = new JPanel();
        
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        
        
        timelabel = new JLabel();
        timelabel.setFont(new Font("verdana",Font.BOLD,20));
        timelabel.setForeground(Color.CYAN);
        timelabel.setBackground(Color.black);
        timelabel.setOpaque(true);
        
        dateFormat = new SimpleDateFormat("dd/MM/yyyy - EEEE");
        
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("MV Boli",Font.BOLD,20));
        dateLabel.setForeground(Color.MAGENTA);
        
        timePanel.add(timelabel);
        datePanel.add(dateLabel);
        
        frame.add(datePanel);
        frame.add(timePanel);
        frame.setVisible(true);
        
        
        setTime();
    }
    
    public void setTime(){
        while(true){
        time = timeFormat.format(Calendar.getInstance().getTime());
        timelabel.setText("Time : "+time);
    
        date = dateFormat.format(Calendar.getInstance().getTime());
        dateLabel.setText(date);
        
        }
    }
}
