                               /////DONE//////
package student_database_project;

import datechooser.beans.DateChooserCombo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Boolean.FALSE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

public class Student_Login {
    public static void main(String[] r) {
        Student d=new Student();
          }
}


class Student {
    JFrame A,B,C,D;
    JButton B1,B2,B3,B4,B5,B6;
    JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,L16,L17,L18,L19,L20,L21,L22,L23;
    JTextField T1,T2,T3,T4,T5;
    JPasswordField P,P1;
    JTable J;
    DateChooserCombo DOB;
    JComboBox Blood_Group;
    
    
    
    
                  //////Method-->>> Defined To Retrive Password(Set New Password)/////
     public void Retrive_Password() throws ClassNotFoundException, SQLException
     {
             
                 ///////Update New Password Frame
                D=new JFrame("Forgot Password");
                D.getContentPane().setBackground(Color.cyan);
                D.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                D.setLayout(null);
                D.setVisible(true);  
                D.setBounds(350,250,400,300);
                D.setResizable(false);
                
                  /////Label and PasswordField
                L23=new JLabel("Enter Your New Password");
                L23.setBounds(100,50,250,40);
                L23.setFont(new Font("Times New Roman",Font.BOLD,20));
                L23.setForeground(Color.darkGray);
                P1=new JPasswordField();
                P1.setBounds(100,120,200,40);
                P1.setFont(new Font("Times New Roman",Font.BOLD,20));
                P1.setForeground(Color.BLACK);
                 
                
                     ////Update Button in Update Frame
                B5=new JButton("UPDATE");
                 B5.setBackground(Color.YELLOW);
                  B5.setBounds(150,190,100,30);
                  D.add(L23);
                  D.add(P1);
                  D.add(B5);
                 
                   
                 B5.addActionListener( new ActionListener()  { 
              
                  public void actionPerformed (ActionEvent ae)
                  {
         
                  try{
                    Class.forName("com.mysql.jdbc.Driver");
                    String url ="jdbc:mysql://localhost:3306/student_info"; //update connection string
                    String user = "root";//add your db user id here
                    String password = "";//add your db password here
                    Connection conn = DriverManager.getConnection(url, user, password);
                    System.out.println("Successfully connected");
                    String sql_2="Update user Set Password=? where User_Name=?";
                    PreparedStatement psst=conn.prepareStatement(sql_2);
                       psst.setString(1,P1.getText());
                       psst.setString(2,T2.getText());
                       psst.executeUpdate();
                       JOptionPane.showMessageDialog(null, "Password changed Successfully");
                       A.dispose();
                       C.dispose();
                       D.dispose();
                       new Student();
                       
                  }
                  catch(Exception e)
                  {
                      JOptionPane.showMessageDialog(null, e);
                  }
         
         
     }
                 });
     }
       
     
     
    
           
                //////Method--->To Display the student Information////////
     public void Display_Table() throws ClassNotFoundException, SQLException
    {
                 /// Display Frame
            B=new JFrame("Student Data");
            B.getContentPane().setBackground(Color.YELLOW);
            B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            B.setLayout(null);
            B.setVisible(true);  
            B.setBounds(5,300,1400,180);
            B.setResizable(false);
            
            
            
            /////Log out Button
             B6=new JButton("Log Out");
           B6.setBounds(630,115,90,30);
                  B6.addActionListener(new ActionListener()
                  {
                      public void actionPerformed (ActionEvent ae)
                      {
                          
                          new Student();
                          B.dispose();
                          A.dispose();
                          
                          
                          
                      }
                      });
                  B.add(B6);
                  
                   
                    ///Display Table
            J=new JTable();
            J.setBounds(30, 80, 1300, 20);
            J.setBackground(Color.WHITE);
            B.add(J);
        try
        {
                    Class.forName("com.mysql.jdbc.Driver");
                    String url ="jdbc:mysql://localhost:3306/student_info"; //update connection string
                    String user = "root";//add your db user id here
                    String password = "";//add your db password here
                    Connection conn = DriverManager.getConnection(url, user, password);
                    System.out.println("Successfully connected");
                    String sql="select* from user where user_Name=? and Password=?";
                    PreparedStatement st=conn.prepareStatement(sql);
                    String Userid=T1.getText();
                    String pass=P.getText();
                    st.setString(1,Userid);
                    st.setString(2,pass);
                    ResultSet rs=st.executeQuery();
                    J.setModel(DbUtils.resultSetToTableModel(rs));
                            
                    
                    ///Labels in the Table
            L6=new JLabel("ID");
            L6.setFont(new Font("Times New Roman",Font.BOLD,15));
            L6.setForeground(Color.BLACK);
            L6.setBounds(30,20,100,25);
            B.add(L6);
            
            L7=new JLabel("Name");
            L7.setFont(new Font("Times New Roman",Font.BOLD,15));
            L7.setForeground(Color.BLACK);
            L7.setBounds(130,20,100,25);
            B.add(L7); 
            L8=new JLabel("M.Name");
            L8.setFont(new Font("Times New Roman",Font.BOLD,15));
            L8.setForeground(Color.BLACK);
            L8.setBounds(230,20,100,25);
            B.add(L8);
            L9=new JLabel("F.Name");
            L9.setFont(new Font("Times New Roman",Font.BOLD,15));
            L9.setForeground(Color.BLACK);
            L9.setBounds(330,20,100,25);
            B.add(L9);
            L10=new JLabel("DOB");
            L10.setFont(new Font("Times New Roman",Font.BOLD,15));
            L10.setForeground(Color.BLACK);
            L10.setBounds(430,20,100,25);
            B.add(L10);
            L11=new JLabel("Gender");
            L11.setFont(new Font("Times New Roman",Font.BOLD,15));
            L11.setForeground(Color.BLACK);
            L11.setBounds(530,20,100,25);
            B.add(L11);
            L12=new JLabel("B_Group");
            L12.setFont(new Font("Times New Roman",Font.BOLD,15));
            L12.setForeground(Color.BLACK);
            L12.setBounds(630,20,100,25);
            B.add(L12);
            L13=new JLabel("Year Of Adm");
            L13.setFont(new Font("Times New Roman",Font.BOLD,15));
            L13.setForeground(Color.BLACK);
            L13.setBounds(730,20,100,25);
            B.add(L13);
            L14=new JLabel("Class");
            L14.setFont(new Font("Times New Roman",Font.BOLD,15));
            L14.setForeground(Color.BLACK);
            L14.setBounds(830,20,100,25);
            B.add(L14);
            L15=new JLabel("Address");
            L15.setFont(new Font("Times New Roman",Font.BOLD,15));
            L15.setForeground(Color.BLACK);
            L15.setBounds(930,20,100,25);
            B.add(L15);
            L16=new JLabel("House");
            L16.setFont(new Font("Times New Roman",Font.BOLD,15));
            L16.setForeground(Color.BLACK);
            L16.setBounds(1030,20,100,25);
            B.add(L16);
            L17=new JLabel("User ID");
            L17.setFont(new Font("Times New Roman",Font.BOLD,15));
            L17.setForeground(Color.BLACK);
            L17.setBounds(1130,20,100,25);
            B.add(L17);
            L18=new JLabel("Password");
            L18.setFont(new Font("Times New Roman",Font.BOLD,15));
            L18.setForeground(Color.BLACK);
            L18.setBounds(1230,20,100,25);
            B.add(L18);
           
                    
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
    } 
     
     
     
     
    public Student()
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
           
               

                     ///Login Button
               B1=new JButton("STUDENT LOGIN AND VIEW DATA");
                  B1.setBackground(Color.cyan);
                  B1.setBounds(1520,500,250,30);
                     B1.addActionListener( new ActionListener()
           {
               public void actionPerformed (ActionEvent ae)
               {
                   if(T1.getText().trim().isEmpty() && P.getText().trim().isEmpty())
                           {
                              JOptionPane.showMessageDialog(null, " Please give Username and Password"); 
                           }
                   else if (T1.getText().trim().isEmpty())
                           {
                              JOptionPane.showMessageDialog(null, "Please give Username"); 
                           }
                   else if (P.getText().trim().isEmpty())
                           {
                              JOptionPane.showMessageDialog(null, "Please give Password"); 
                           }
                   else
                    {
                   try{
                    Class.forName("com.mysql.jdbc.Driver");
                    String url ="jdbc:mysql://localhost:3306/student_info"; //update connection string
                    String user = "root";//add your db user id here
                    String password = "";//add your db password here
                    Connection conn = DriverManager.getConnection(url, user, password);
                    System.out.println("Successfully connected");
                    String sql="Select * from user where User_Name=? and Password=?";
                    PreparedStatement st=conn.prepareStatement(sql);
                    String Userid=T1.getText();
                    String pass=P.getText();
                    st.setString(1,Userid);
                    st.setString(2,pass);
                    ResultSet rs=st.executeQuery();
                    if(rs.next())
                    {
                    
                   Display_Table();     ////////calling The Display Table Method if Login Details Matches
                   
                   T1.setText("");
                   P.setText("");
                   
                    
                    }
                    else{
                      
                    JOptionPane.showMessageDialog(null, "Incorrect User ID or Password");
                      T1.setText("");
                      P.setText("");
                    }
                     conn.close();
                     
                   } catch (Exception e) {
                     JOptionPane.showMessageDialog(null, e);  
                   }
                            }
                 
               }
           });



                  ////////Forgot Password Button
                  B2=new JButton("Forgot Password");
                  B2.setBackground(Color.YELLOW);
                  B2.setBounds(1520,550,250,30);
                   
                 B2.addActionListener( new ActionListener()  { 
              
                  public void actionPerformed (ActionEvent ae)
               {
                   
                   ///Forgot Password Frame
                C=new JFrame("Forgot Password");
                C.getContentPane().setBackground(Color.WHITE);
                C.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                C.setLayout(null);
                C.setVisible(true);  
                C.setBounds(250,250,800,400);
                C.setResizable(false);
                
                L19=new JLabel("USER ID");
                L19.setBounds(100,50,200,40);
                L19.setFont(new Font("Times New Roman",Font.BOLD,20));
                L19.setForeground(Color.darkGray);
 
                L20=new JLabel("MOTHERS NAME");
                L20.setBounds(100,100,200,40);
                L20.setFont(new Font("Times New Roman",Font.BOLD,20));
                L20.setForeground(Color.DARK_GRAY);
                
                L21=new JLabel("D.O.B (MM/DD/YYYY)");
                L21.setBounds(100,150,200,40);
                L21.setFont(new Font("Times New Roman",Font.BOLD,20));
                L21.setForeground(Color.DARK_GRAY);

                L22=new JLabel("BLOOD GROUP");
                L22.setBounds(100,200,200,40);
                L22.setFont(new Font("Times New Roman",Font.BOLD,20));
                L22.setForeground(Color.DARK_GRAY);
                C.add(L19);
                C.add(L20);
                C.add(L21);
                C.add(L22);
                 
                 T2=new JTextField();
                 T2.setBounds(350,50,200,30);
                T3=new JTextField();
                 T3.setBounds(350,100,200,30);
                 
                String B_G[]={ "A+","B+", "A-", "B-", "AB+", "AB-", "O+", "0-"};
                Blood_Group=new JComboBox(B_G);
                Blood_Group.setBounds(350,200,50,30);
                
                 DOB=new DateChooserCombo();
                 DOB.setBounds(350,150,100,30);
                 
                 
                 C.add(T2);
                 C.add(T3);
                 C.add(Blood_Group);
                 C.add(DOB);
                 
                 
                 
                 /////Button to Check the forgot password details matching or Not
                B4=new JButton("CHECK");
                  B4.setBackground(Color.YELLOW);
                  B4.setBounds(450,250,100,30);
                  C.add(B4);
                   
                 B4.addActionListener( new ActionListener()  { 
              
                  public void actionPerformed (ActionEvent ae)
               {
                 
                 try{
                   
                    Class.forName("com.mysql.jdbc.Driver");
                    String url ="jdbc:mysql://localhost:3306/student_info"; //update connection string
                    String user = "root";//add your db user id here
                    String password = "";//add your db password here
                    Connection conn = DriverManager.getConnection(url, user, password);
                    System.out.println("Successfully connected");
                    String sql_1="Select * from user where User_Name=? and Mothers_Name=? and DOB=? and Blood_Group= ?";
                    PreparedStatement pst=conn.prepareStatement(sql_1);
                    pst.setString(1,T2.getText());
                    pst.setString(2,T3.getText());
                    pst.setString(3,DOB.getText());
                      String Blood;
                       Blood=Blood_Group.getSelectedItem().toString();
                       pst.setString(4,Blood);
                    
                    
                    ResultSet rs=pst.executeQuery();
                    if(rs.next())
                    {
                     Retrive_Password();   ////Calling the retrive password Frame and Method if Forgot password Details Matches
                    
                    }
                 else
                         JOptionPane.showMessageDialog(null, "Incorrect Details");
                        }
                   catch(Exception e)
                {
                   JOptionPane.showMessageDialog(null, e);
                }
                   
                 
                 
                 
               }
                 });
               }});
                 
                   /////////Button To Go Back
                  B3=new JButton("Go Back");
                  B3.setBackground(Color.LIGHT_GRAY);
                  B3.setBounds(1520,600,250,30);
                   
                 B3.addActionListener( new ActionListener()  { 
              
                  public void actionPerformed (ActionEvent ae)
               {
                   
                   new Selection ();
                   A.dispose();
                 
               }
           });
                  
                    L1.add(B1);
                    L1.add(B2);
                    L1.add(B3);
                               
           
           
           
      ////////Main Frame Settings
 A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 A.setLayout(new FlowLayout());
 A.setVisible(true);
 A.setSize(1366,768);   
 A.setResizable(FALSE);
    } }
                 
           
    

        
