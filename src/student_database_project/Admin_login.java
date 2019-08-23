                                  /////DONE//////
package student_database_project;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Boolean.FALSE;
import javax.swing.*;

public class Admin_login {
     public static void main(String[] w) {
        Admin d=new Admin();
    
}
    }



class Admin  {
    JFrame A;
    JButton B1,B2;
    JLabel L1,L2,L3,L4,L5;
    JTextField T1;
    JPasswordField P;
     
    
    public Admin()
    {
        A=new JFrame("Login Page(Admin)");

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
        L3=new JLabel(new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\trial\\src\\student_database_project\\Images\\adc3.jpg."));
            L3.setBounds(1550,190,200,200);
            L1.add(L3); 
            
            
            
            ///Labels_Id_Password
            
        L4=new JLabel("USER ID");
          L4.setBounds(1300,400,300,30);
           L4.setFont(new Font("ALGERIAN",Font.BOLD,30));
           L4.setForeground(Color.DARK_GRAY);
        L5=new JLabel("PASSWORD");
          L5.setBounds(1300,450,300,30);
          L5.setFont(new Font("ALGERIAN",Font.BOLD,30));
          L5.setForeground(Color.DARK_GRAY);
             L1.add(L4); 
              L1.add(L5);
            
           
                ///Text Area
           
               T1=new JTextField();
                 T1.setBounds(1500,400,300,30);
               P=new JPasswordField();
                 P.setBounds(1500,450,300,30);
         
                   L1.add(T1); 
                   L1.add(P);
           
               

                 ///Buttons
               B1=new JButton("Admin Login");
                  B1.setBackground(Color.cyan);
                  B1.setBounds(1600,500,150,30);
                  B1.addActionListener(new ActionListener()
                          {
                              public void actionPerformed (ActionEvent ae){
                                  
                                          /////Conditions ToCheck if any Field is Empty
                                  if(T1.getText().trim().isEmpty())
                                  {
                                      JOptionPane.showMessageDialog(null,"Please give UserId");
                                  }
                                 else if(P.getText().trim().isEmpty())
                                 {
                                      JOptionPane.showMessageDialog(null,"Please Give Password");
                                 }
                                 else if(T1.getText().trim().isEmpty() && P.getText().trim().isEmpty())
                                 {
                                  JOptionPane.showMessageDialog(null,"Please Give UseId and password");
                                 }
                                 
                                 
                                 
                                 
                                       /////Checking the Inbuilt UserID and Password of ADMIN
                           else
                           {
                                  String Userid=T1.getText();
                                  String Password=P.getText();
                                  if(Userid.equals("Admin")&&Password.equals("Password"))
                                  {
                                      
                                      new Admin_1();
                                      A.dispose();
                                      
                                  }
                                  else
                                  {
                                      JOptionPane.showMessageDialog(null,"Incorrect User ID or Password");
                                      T1.setText("");
                                      P.setText("");
                                  }   
                            } 
                          }
                       });
                          
                         
                  //////Button To Go Back to Last Page
               B2=new JButton("Go Back");
                  B2.setBackground(Color.YELLOW);
                  B2.setBounds(1600,600,150,30);
                  B2.addActionListener( new ActionListener()
           {
               public void actionPerformed (ActionEvent ae)
               {
                   
                   new Selection();
                   A.dispose();
                 
               }
           });
                  
                    L1.add(B1);
                    L1.add(B2);
                         
         
                  
           ////////Settings of the Frame
 A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 A.setLayout(new FlowLayout());
 A.setVisible(true);
 A.setSize(1366,768);   
 A.setResizable(FALSE);
           
           
    }
}
        

