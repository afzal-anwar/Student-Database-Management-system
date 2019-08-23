                         ///DONE///
package student_database_project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Boolean.FALSE;
import javafx.scene.layout.Border;
import javax.swing.*;
import javax.swing.border.BevelBorder;

class Home_page {

    
    public static void main(String[] b) {
    FirstFrame a=new FirstFrame();
    
    }
  }



class FirstFrame{
    JFrame A;
    JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9;
    JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16;
    JPanel P,P1;
    
    
    
   
public FirstFrame()
{
     
    A=new JFrame("Welcome To Delhi Public School");
           
              ///BACKGROUND
    L1=new JLabel(new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\trial\\src\\student_database_project\\Images\\cccc.jpeg"));
        L1.setBounds(0,0,1366,768);
        A.add(L1);
        
        
            ///PANEl AND BUTTONS         
    P=new JPanel();
    B1=new JButton("About");
    B2=new JButton("Student Database");
    B3=new JButton("Academics");
    B4=new JButton("Teachesr Login");
    B5=new JButton("DPS Society");
    B6=new JButton("Admission");
    B7=new JButton("Pay Fees");
    B8=new JButton("Get Notifications");
    L2=new JLabel("Contact---(033)24317652");
    L3=new JLabel("    ");
    L4=new JLabel("Email----info@dpskolkata.com");
        P.setBackground(Color.ORANGE);
        P.setBounds(50,0,1250,40);
        L1.add(P,BorderLayout.NORTH);
        P.add(B1);
        P.add(B2);
               B2.addActionListener( new ActionListener()
             {
                   public void actionPerformed (ActionEvent ae)
               {
                   
                      new Selection();
                      A.dispose();
                 
               }
           });
        P.add(B3);
        P.add(B4);
        P.add(B5);
        P.add(B6);
        P.add(B7);
        B8.setBackground(Color.yellow);
        P.add(B8);
        P.add(L2);
        P.add(L3);
        P.add(L4);
                
      
        
              ///SCHOOL NAME        
     L5=new JLabel("Delhi Public School");
            L5.setFont(new Font("ALGERIAN",Font.BOLD,80));
            L5.setForeground(Color.WHITE);
            L5.setBounds(300,90,900,80);
            L1.add(L5);
        
            
              ///SCHOOL LOGO
    L6=new JLabel(new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\trial\\src\\student_database_project\\Images\\adc3.jpg"));
        L6.setBounds(50,70,200,200); 
        L1.add(L6);
       
        
              ///School Motto
    L7=new JLabel("Building a Just and Excellent Educational Foundation");  
        L7.setFont(new Font("PALATINO",Font.BOLD,30));
        L7.setForeground(Color.WHITE);
        L7.setBounds(300,180,900,40);
        L1.add(L7);
       
       
       
                  ///Photo of Principal and Button
    ImageIcon a=new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\trial\\src\\student_database_project\\Images\\prin1.jpg");
    B9=new JButton(a);
       B9.setBounds(1100, 390, 250, 300);
       B9.addActionListener( new ActionListener()
           {
               public void actionPerformed (ActionEvent ae)
               {
                   
                   new Prin();
                   A.dispose();
                 
               }
           });
       L1.add(B9);
      
     
              ///Principal's Desk Label
    L8=new JLabel("From The Principal's Desk");
       L8.setForeground(Color.WHITE);
       L8.setFont(new Font("PALATINO",Font.ITALIC,30));
       L8.setBounds(980,340,400,30);
       L1.add(L8); 
       
       
    
   
    
           ///Lower False Buttons
    B10=new JButton("Location");
    B10.setBackground(Color.cyan);
    B10.setBounds(30,500,150,25);
    B11=new JButton("Notice Board");
    B11.setBackground(Color.cyan);
    B11.setBounds(30,530,150,25);
    B12=new JButton("Faculties");
    B12.setBackground(Color.cyan);
    B12.setBounds(30,560,150,25);
    B13=new JButton("Alumni");
    B13.setBackground(Color.cyan);
    B13.setBounds(30,590,150,25);
    B14=new JButton("FAQ");
    B14.setBackground(Color.cyan);
    B14.setBounds(30,620,150,25);
    B15=new JButton("Terms and conditions");
    B15.setBackground(Color.cyan);
    B15.setBounds(30,650,150,25);
    L1.add(B10);
    L1.add(B11);
    L1.add(B12);
    L1.add(B13);
    L1.add(B14);
    L1.add(B15);
    
    
 
    
          ///Frame Settings
    A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    A.setLayout(null);
    A.setVisible(true);
    A.setSize(1366,768);
   
    A.setResizable(FALSE);
            
}
}
             
    
    
    
    
    
 
    
    
  
   
    
    
    
    
    
    
      
        
       
        
        
     
       
         
        
        
     
          
           
            
           
            
           
            
           
            
        
            
    
            
          
           
           
                
                
                
          
  
