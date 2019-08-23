                    ///DONE///
package student_database_project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Boolean.FALSE;
import javax.swing.*;

class Principal_desk_page {
    
    public static void main(String[] c) {
        Prin b=new Prin();
        }
   }
class Prin
{
   JFrame A;
   JLabel L1,L2,L3,L4,L5,L6,L7,L8;
   JButton B1;
   
   
 public Prin()
 {
     A=new JFrame("Principal's Desk");
     
           ///Background
    L1=new JLabel(new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\trial\\src\\student_database_project\\Images\\Simple.jpeg"));
    L1.setBounds(0, 0,1366,768);
       A.add(L1);
     
    
          //////School Name
    L2=new JLabel("Delhi Public School");
       L2.setFont(new Font("ALGERIAN",Font.BOLD,80));
       L2.setForeground(Color.LIGHT_GRAY);
       L2.setBounds(300,90,900,80);
       L1.add(L2);
       
            ////School Logo
    L3=new JLabel(new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\trial\\src\\student_database_project\\Images\\adc3.jpg"));
    L3.setBounds(1300,70,200,200);
    L1.add(L3);  
       
             ///Dear Parents Label
     L4=new JLabel("Dear Parents");
        L4.setFont(new Font("Times Roman",Font.BOLD,40));
        L4.setForeground(Color.WHITE);
        L4.setBounds(300,180,900,60);
        L1.add(L4);
      
    
             ///Paragraph
    L5=new JLabel("<html><p>Delhi Public School’s mission is to provide excellence and justice<br/> \n" +
                     "in education for school children through a common foundation. We <br/>\n" +
                     "teach students a contextual body of organized knowledge, the skills  <br/>\n" +
                     "of learning within a classical framework, and the values of a democratic <br/>\n" +
                     "We recognize the value of providing access to a broad cross-section of<br/>\n" +
                     " our community, so that students from all backgrounds can benefit from <br/>\n" +
                     "DPS School’s education. The school day is structured around teacher<br/>\n" +
                     "-led instruction during which every educational minute matters. We believe <br/> \n" +
                     "in knowledge centered education rather than learner-centered education.<br/>\n" +
                     "We acknowledge teachers’ classroom leadership and hold each student <br/>\n" +
                     "responsible for his or her academic effort.</html></p>");
        
        L5.setFont(new Font("ARIAL",Font.ITALIC,20));  
        L5.setForeground(Color.CYAN);
        L5.setBounds(300,230,800,270);
        L1.add(L5);
        
        
            ///Principal Name Label
    L6=new JLabel("Thomas Edwin");
        L6.setFont(new Font("ARIAL",Font.ITALIC,30));  
        L6.setForeground(Color.GREEN);
        L6.setBounds(300,520,300,40);
        L1.add(L6);   
        
        
             ///Principal Label
     L7=new JLabel("PRINCIPAL");
        L7.setFont(new Font("ARIAL",Font.ITALIC,20));  
        L7.setForeground(Color.WHITE);
        L7.setBounds(300,560,300,40);
        L1.add(L7); 
        
        
           ///Principal Photo
        
    L8=new JLabel(new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\trial\\src\\student_database_project\\Images\\acdc.jpg")); 
        L8.setBounds(970,270,620,413);
        L1.add(L8);
        
      
              ///Go Back Button
    B1=new JButton("Go Back");
       B1.setBackground(Color.cyan);
       B1.setBounds(300, 40, 150, 25);
       B1.addActionListener( new ActionListener()
           {
               public void actionPerformed (ActionEvent ae)
               {
                   
                   new FirstFrame();
                   A.dispose();
                 
               }
           });
        L1.add(B1);
        
        
           ///Frame Setting
    A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    A.setLayout(new FlowLayout());
    A.setVisible(true);
    A.setSize(1366,768); 
    A.setResizable(FALSE);
     
 }
}    
     
     
     
     
  
   
