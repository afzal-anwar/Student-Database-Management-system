                                        ///DONE///
package student_database_project;

import com.toedter.calendar.JCalendar;
import datechooser.beans.DateChooserCombo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Boolean.FALSE;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import org.jdatepicker.JDatePicker;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Admin_Student_Option {
     
    public static void main(String[] d) {
        Selection c=new Selection();
         }
   }


class Selection {
    JFrame A;
    JButton B1,B2,B3,B4;
    JLabel L1,L2,L3;
    
    
    
    
    public Selection()
    {
        
       A=new JFrame("Database");

                  ///Background
       L1=new JLabel(new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\trial\\src\\student_database_project\\Images\\add.jpeg"));
           L1.setBounds(0,0,1366,768);
           A.add(L1);


   
   
               //////School Name
       L2=new JLabel("Delhi Public School");
           L2.setFont(new Font("ALGERIAN",Font.BOLD,80));
           L2.setForeground(Color.DARK_GRAY);
           L2.setBounds(1230,90,900,80);
           L1.add(L2);
           
           
           
               ////School Logo
        L3=new JLabel(new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\trial\\src\\student_database_project\\Images\\adc3.jpg"));
            L3.setBounds(1550,190,200,200);
            L1.add(L3); 
            
            
                  //BUTTONS
        B1=new JButton("STUDENT LOGIN");
            B1.setBackground(Color.cyan);
            B1.setBounds(1520,400,250,30);
            B1.addActionListener( new ActionListener()
           {
               public void actionPerformed (ActionEvent ae)
               {
                   
                   new Student();
                   A.dispose();
                 
               }
           });
            
        B2=new JButton("ADMIN LOGIN");
            B2.setBackground(Color.cyan);
            B2.setBounds(1520,460,250,30);
            
             B2.addActionListener( new ActionListener()
           {
               public void actionPerformed (ActionEvent ae)
               {
                   
                   new Admin();
                   A.dispose();
                 
               }
           });
             
        B3=new JButton("SIGN UP");
           B3.setBackground(Color.ORANGE);
           B3.setBounds(1520,520,250,30);
              B3.addActionListener( new ActionListener()
           {
               public void actionPerformed (ActionEvent ae)
               {
                   
                   new Student_info();
                   A.dispose();
                 
               }
           });
              
            B4=new JButton("GO BACK");
           B4.setBackground(Color.YELLOW);
           B4.setBounds(1520,580,250,30);
              B4.addActionListener( new ActionListener()
           {
               public void actionPerformed (ActionEvent ae)
               {
                   
                   new FirstFrame();
                   A.dispose();
                 
               }
           });  
           
           
           
        L1.add(B1);
        L1.add(B2);
        L1.add(B3);
        L1.add(B4);
        
        
      
        
           ////////Frame Settings
 A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 A.setLayout(new FlowLayout());
 A.setVisible(true);
 A.setSize(1366,768);   
 A.setResizable(FALSE);       
    }
    
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 








 
