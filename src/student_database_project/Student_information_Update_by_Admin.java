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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Student_information_Update_by_Admin {
    

    public static void main(String[] y) {
        Student_info_by_admin e=new  Student_info_by_admin();     
    }
}



class Student_info_by_admin {
    JFrame A;
    JButton B1,B2,B3,B4,B5;
    JLabel L1,L2,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,L16,L17;
    JTextField Name,Mothers_Name,Fathers_Name,Year_Of_Admission,ADDRESS,User_Name,Password,ID,T9,T10,T11,T12,T13,T14,T15,DOB,STD,School_House,Blood_Group,Gender;
     String Umi;
  
 
                  ///Method--->To Check If User Name Already
    public void Check_username() throws ClassNotFoundException, SQLException
    {
                    Class.forName("com.mysql.jdbc.Driver");
                    String url ="jdbc:mysql://localhost:3306/student_info"; //update connection string
                    String user = "root";//add your db user id here
                    String password = "";//add your db password here
                    Connection conn = DriverManager.getConnection(url, user, password);
                    System.out.println("Successfully connected");
                    String usid=User_Name.getText();
                    String sql="select* from user where User_Name='" + usid + "'";
                    PreparedStatement pst=conn.prepareStatement(sql);
                    ResultSet r1=pst.executeQuery();
                    if(r1.next())
                    {
                     JOptionPane.showMessageDialog(null,"This Username Already Exists");   
                     User_Name.setText("");
                    }                 
    }
    
    
    
 
    public Student_info_by_admin()
    {
        A=new JFrame("Update Studentn Data (Admin)");

            ///Background
       L1=new JLabel(new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\trial\\src\\student_database_project\\Images\\Simple.jpeg"));
           L1.setBounds(0,0,1366,768);
           A.add(L1);
           
          //////School Name
       L2=new JLabel("Delhi Public School");
           L2.setFont(new Font("ALGERIAN",Font.BOLD,30));
           L2.setForeground(Color.WHITE);
           L2.setBounds(750,30,400,30);
           L1.add(L2);
           
           ///Student_Registration_Form
            L17=new JLabel("Student Update Form (ADMIN SITE)");
           L17.setFont(new Font("Times New Roman",Font.BOLD,20));
           L17.setForeground(Color.GREEN);
           L17.setBounds(750,60,700,30);
           L1.add(L17);
           
           
        ///School Logo
          L15=new JLabel(new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\trial\\src\\student_database_project\\Images\\adc3.jpg"));
          L15.setBounds(1100,150,400,400);
          L1.add(L15);
       
            
         ///Labels_Id_Password and all
            
        L4=new JLabel("Name");
        L4.setFont(new Font("Times Roman",Font.BOLD,20));
           L4.setForeground(Color.WHITE);///Date Of Birth   
          L4.setBounds(300,90,300,40);
           
        L5=new JLabel("Mothers Name");
          L5.setBounds(300,130,300,40);
          L5.setFont(new Font("Times Roman",Font.BOLD,20));
          L5.setForeground(Color.WHITE);
          
          L6=new JLabel("Father Name");
          L6.setBounds(300,170,300,40);
          L6.setFont(new Font("Times Roman",Font.BOLD,20));
          L6.setForeground(Color.WHITE);
             
           L7=new JLabel("Date Of Birth(MM/DD/YY)");
          L7.setBounds(300,210,300,40);
          L7.setFont(new Font("Times Roman",Font.BOLD,20));
          L7.setForeground(Color.WHITE);
          
           L8=new JLabel("Gender");
          L8.setBounds(300,250,300,40);
          L8.setFont(new Font("Times Roman",Font.BOLD,20));
          L8.setForeground(Color.WHITE);
          
           L9=new JLabel("Blood Group");
          L9.setBounds(300,290,300,40);
          L9.setFont(new Font("Times Roman",Font.BOLD,20));
          L9.setForeground(Color.WHITE);
          
           L10=new JLabel("Year Of Admission");
          L10.setBounds(300,330,300,40);
          L10.setFont(new Font("Times Roman",Font.BOLD,20));
          L10.setForeground(Color.WHITE);
          
           L11=new JLabel("Class");
          L11.setBounds(300,370,300,40);
          L11.setFont(new Font("Times Roman",Font.BOLD,20));
          L11.setForeground(Color.WHITE);
          
          
           L12=new JLabel("Address");
          L12.setBounds(300,410,300,40);
          L12.setFont(new Font("Times Roman",Font.BOLD,20));
          L12.setForeground(Color.WHITE);
          
           L13=new JLabel("House");
          L13.setBounds(300,450,300,40);
          L13.setFont(new Font("Times Roman",Font.BOLD,20));
          L13.setForeground(Color.WHITE);
          
           L14=new JLabel("User Name");
          L14.setBounds(300,490,300,40);
          L14.setFont(new Font("Times Roman",Font.BOLD,20));
          L14.setForeground(Color.WHITE);
          
          L15=new JLabel("Password");
          L15.setBounds(300,530,300,40);
          L15.setFont(new Font("Times Roman",Font.BOLD,20));
          L15.setForeground(Color.WHITE);
          
          L16=new JLabel("ID To Update");
          L16.setBounds(900,90,300,40);
          L16.setFont(new Font("Times Roman",Font.BOLD,20));
          L16.setForeground(Color.WHITE);
          
          
          
          L1.add(L4); 
          L1.add(L5);;
          L1.add(L6);
          L1.add(L7);
          L1.add(L8);
          L1.add(L9);
          L1.add(L10);
          L1.add(L11); 
          L1.add(L12);
          L1.add(L13); 
          L1.add(L14);
          L1.add(L15);
          L1.add(L16);
       
          
          
             //////New Logout Button
          B5=new JButton("Log Out");
           B5.setBounds(1500,20,100,30);
                  B5.addActionListener(new ActionListener()
                  {
                      public void actionPerformed (ActionEvent ae)
                      {
                          
                          new Admin();
                          A.dispose();
                          
                      }
                      });
                  L1.add(B5);
          
          
          
          
           
                ///Text Area
           
               Name=new JTextField();
                 Name.setBounds(500,90,300,30);
                 
               Mothers_Name=new JTextField();
                Mothers_Name.setBounds(500,130,300,30);
                
              Fathers_Name=new JTextField();
                Fathers_Name.setBounds(500,170,300,30);
                
                DOB=new JTextField();
                 DOB.setBounds(550,210,250,30);
                 
                 
                 Gender=new JTextField();
                  Gender.setBounds(500,250,250,30);
                 L1.add(Gender);
                 
                 
               
                Blood_Group=new JTextField();
                Blood_Group.setBounds(500,290,50,30);
                
                
                
                Year_Of_Admission=new JTextField();
                Year_Of_Admission.setBounds(500,330,300,30);
                
                STD=new JTextField();
                STD.setBounds(500,370,50,30);
                 
                ADDRESS=new JTextField();
                ADDRESS.setBounds(500,410,300,30);
                
                School_House=new JTextField();
                School_House.setBounds(500,450,100,30);
                
                 User_Name=new JTextField();
                User_Name.setBounds(500,490,300,30);
               
                 Password=new JTextField();
                Password.setBounds(500,530,300,30);
                
                  ID=new JTextField();
                ID.setBounds(1100,90,300,30);
                
                
                
                   L1.add(Name); 
                   L1.add(Mothers_Name);
                   L1.add(Fathers_Name);
                   L1.add(DOB); 
                   L1.add(Blood_Group);
                   L1.add(Year_Of_Admission);
                   L1.add(STD);
                   L1.add(ADDRESS);
                   L1.add(School_House);
                   L1.add(User_Name);
                   L1.add(Password);
                   L1.add(ID);      
                  
                  
                    ////////Button to get Data of the given ID
                   B3=new JButton("Get Data");
                   B3.setBackground(Color.GREEN);
                   B3.setBounds(1220,130,100,30);
                   L1.add(B3);
                   B3.addActionListener(new ActionListener()
                   {
                       public void actionPerformed(ActionEvent ae)
                       {
                           
                              
                           try{
                    Class.forName("com.mysql.jdbc.Driver");
                    String url ="jdbc:mysql://localhost:3306/student_info"; //update connection string
                    String user = "root";//add your db user id here
                    String password = "";//add your db password here
                    Connection conn = DriverManager.getConnection(url, user, password);
                    System.out.println("Successfully connected");
                    String sql_2="Select * from user where ID=?";
                    PreparedStatement pist=conn.prepareStatement(sql_2);
                    pist.setString(1,ID.getText());
                    ResultSet rs=pist.executeQuery();
                    if(rs.next())
                    {
                    String name=rs.getString("Name");
                    Name.setText(name);
                    String F_Name=rs.getString("Fathers_Name");
                    Fathers_Name.setText(F_Name);
                    String M_Name=rs.getString("Mothers_Name");
                    Mothers_Name.setText(M_Name);
                    String dob=rs.getString("DOB");
                    DOB.setText(dob);
                    String BG=rs.getString("Blood_Group");
                    Blood_Group.setText(BG);
                    String std=rs.getString("STD");
                    STD.setText(std);
                    String house=rs.getString("School_House");
                    School_House.setText(house);
                    String ym=rs.getString("Year_Of_Admission");
                    Year_Of_Admission.setText(ym);
                    String um=rs.getString("User_Name");
                    Umi=um;
                    User_Name.setText(um);
                    String pw=rs.getString("Password");
                    Password.setText(pw);
                    String gn=rs.getString("Gender");
                    Gender.setText(gn);
                    String ad=rs.getString("ADDRESS");
                    ADDRESS.setText(ad);
                    }
                           }
                       catch(Exception e)
                       {
                           JOptionPane.showMessageDialog(null, e);
                       }
                           
                       }
                   });
                  
                   
                       ///Button To Update The Data
                  B2=new JButton("Update");
                  B2.setBackground(Color.CYAN);
                  B2.setBounds(700,600,100,30);
                  B2.addActionListener( new ActionListener()
                  {
               public void actionPerformed (ActionEvent ae){
                   
                                   ///If username reamins same it will not check for username_Already_Exists_Method
                   if(User_Name.getText().equals(Umi))
                   
                  {
                      
                  
                   
                          /////Checking that the input of Blood field is Entered Wrong
                   String bg=Blood_Group.getText();
                   if(bg.equals("A+")||bg.equals("B+")||bg.equals("A-")||bg.equals("B-")||bg.equals("AB+")||bg.equals("AB-")||bg.equals("O+")||bg.equals("O-"))
                   {
                   
                     ////Checking that the input of class field is Entered Wrong  
                   String cla=STD.getText();
                   if(cla.equals("I")||cla.equals("II")||cla.equals("III")||cla.equals("IV")||cla.equals("V")||cla.equals("VI")||cla.equals("VII")||cla.equals("VIII")||cla.equals("IX")||cla.equals("X"))
                       
                   {
                   
                       /////Checking that the input of House  field is Entered Wrong
                   String hou=School_House.getText();
                   if(hou.equals("Red")||hou.equals("Green")||hou.equals("Yellow")||hou.equals("Blue"))
                   {
                   
                   
                         ////Checking that the input of Gender field is Entered Wrong
                   String gnu=Gender.getText();
                   if(gnu.equals("male")||gnu.equals("female"))
                   {
                       
                      
                     //////Checking if any Field is Empty
                   if (Name.getText().trim().isEmpty()&&Mothers_Name.getText().trim().isEmpty()&&Fathers_Name.getText().trim().isEmpty()&&
                       ADDRESS.getText().trim().isEmpty()&&User_Name.getText().trim().isEmpty()&&Password.getText().trim().isEmpty() && ID.getText().trim().isEmpty())
                                {
                                    JOptionPane.showMessageDialog(null,"Please Fill All Fields");
                                }
                   
                   else if(Name.getText().trim().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"Please Fill Name Field");
                   }
                   
                    
                   else if(Mothers_Name.getText().trim().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"Please Fill Mothers_Name Field");
                   }
                   
                    
                   else if(Fathers_Name.getText().trim().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"Please Fill Fathers_Name Field");
                   }
                    
                   else if(ADDRESS.getText().trim().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"Please Fill Address Field");
                   }
                    
                   else if(User_Name.getText().trim().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"Please Fill UserName Field");
                   }
                    
                   else if(Password.getText().trim().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"Please Fill Password Field");
                   }
                   else if( ID.getText().trim().isEmpty())
                                {
                                    JOptionPane.showMessageDialog(null,"Please Fill ID Field");
                                }
                           
                   else
                       
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    String url ="jdbc:mysql://localhost:3306/student_info"; //update connection string
                    String user = "root";//add your db user id here
                    String password = "";//add your db password here
                    Connection conn = DriverManager.getConnection(url, user, password);
                    System.out.println("Successfully connected");
                    String sql="Update user Set Name=?,Mothers_Name=?,Fathers_Name=?,DOB=?,Gender=?,Blood_Group=?,Year_Of_Admission=?,STD=?,ADDRESS=?,School_House=?,User_Name=?,Password=? where ID=?";
                    PreparedStatement st=conn.prepareStatement(sql);
                       st.setString(1,Name.getText());
                       st.setString(2,Mothers_Name.getText());
                       st.setString(3,Fathers_Name.getText());
                       st.setString(4,DOB.getText());
                       st.setString(5,Gender.getText());
                       st.setString(6,Blood_Group.getText());
                       st.setString(7,Year_Of_Admission.getText());
                       st.setString(8,STD.getText());
                       st.setString(9,ADDRESS.getText());
                       st.setString(10,School_House.getText());
                       st.setString(11,User_Name.getText());
                       st.setString(12,Password.getText());
                       st.setString(13,ID.getText());
                       st.executeUpdate();
                       JOptionPane.showMessageDialog(null,"Updated Successfully");
                       
                       
                    ///////Setting all fields to blank after Update
                       Name.setText("");
                       Mothers_Name.setText("");
                       Fathers_Name.setText("");
                       DOB.setText("");
                       ADDRESS.setText("");
                       User_Name.setText("");
                       Password.setText("");
                       Year_Of_Admission.setText("");
                       Blood_Group.setText("");
                       Gender.setText("");
                        ID.setText("");
                         STD.setText("");
                        School_House.setText("");
                      
                       
     
               }   catch (Exception e) {
                   JOptionPane.showMessageDialog(null,e);
               }
                   }
                   
                   else
                   {
                    JOptionPane.showMessageDialog(null, "Please Provide Gender as male or Female");
                    }
                   }
                   else
                   {
                    JOptionPane.showMessageDialog(null, "Please Provide House as Red ,Blue, Green or Yellow");
                   }
                   }
                    else
                   {
                    JOptionPane.showMessageDialog(null, "Please Provide Class in Roman Numeral");
                   }
                   }
                    else
                   {
                    JOptionPane.showMessageDialog(null, "Please Provide Valid Blood Group");
                   }
                  }
                   
                   
                   
                   
                   
                   
                   
                   
                    ///If username does not reamins same it will check by username_Already_Exists_Method
                   else
                   {
                    try {
                       
                       Check_username();  /////Calling the checkusername Method
                       
                   } catch (ClassNotFoundException ex) {
                       Logger.getLogger(Student_Reg_by_Admin.class.getName()).log(Level.SEVERE, null, ex);
                   } catch (SQLException ex) {
                       Logger.getLogger(Student_Reg_by_Admin.class.getName()).log(Level.SEVERE, null, ex);
                   }
                    
                    
                    
                         
                          /////Checking that the input of Blood field is Entered Wrong
                   String bg=Blood_Group.getText();
                   if(bg.equals("A+")||bg.equals("B+")||bg.equals("A-")||bg.equals("B-")||bg.equals("AB+")||bg.equals("AB-")||bg.equals("O+")||bg.equals("O-"))
                   {
                   
                     ////Checking that the input of class field is Entered Wrong  
                   String cla=STD.getText();
                   if(cla.equals("I")||cla.equals("II")||cla.equals("III")||cla.equals("IV")||cla.equals("V")||cla.equals("VI")||cla.equals("VII")||cla.equals("VIII")||cla.equals("IX")||cla.equals("X"))
                       
                   {
                   
                       /////Checking that the input of House  field is Entered Wrong
                   String hou=School_House.getText();
                   if(hou.equals("Red")||hou.equals("Green")||hou.equals("Yellow")||hou.equals("Blue"))
                   {
                   
                   
                         ////Checking that the input of Gender field is Entered Wrong
                   String gnu=Gender.getText();
                   if(gnu.equals("male")||gnu.equals("female"))
                   {
                       
                      
                     //////Checking if any Field is Empty
                   if (Name.getText().trim().isEmpty()&&Mothers_Name.getText().trim().isEmpty()&&Fathers_Name.getText().trim().isEmpty()&&
                       ADDRESS.getText().trim().isEmpty()&&User_Name.getText().trim().isEmpty()&&Password.getText().trim().isEmpty() && ID.getText().trim().isEmpty())
                                {
                                    JOptionPane.showMessageDialog(null,"Please Fill All Fields");
                                }
                   
                   else if(Name.getText().trim().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"Please Fill Name Field");
                   }
                   
                    
                   else if(Mothers_Name.getText().trim().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"Please Fill Mothers_Name Field");
                   }
                   
                    
                   else if(Fathers_Name.getText().trim().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"Please Fill Fathers_Name Field");
                   }
                    
                   else if(ADDRESS.getText().trim().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"Please Fill Address Field");
                   }
                    
                   else if(User_Name.getText().trim().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"Please Fill UserName Field");
                   }
                    
                   else if(Password.getText().trim().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"Please Fill Password Field");
                   }
                   else if( ID.getText().trim().isEmpty())
                                {
                                    JOptionPane.showMessageDialog(null,"Please Fill ID Field");
                                }
                           
                   else
                       
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    String url ="jdbc:mysql://localhost:3306/student_info"; //update connection string
                    String user = "root";//add your db user id here
                    String password = "";//add your db password here
                    Connection conn = DriverManager.getConnection(url, user, password);
                    System.out.println("Successfully connected");
                    String sql="Update user Set Name=?,Mothers_Name=?,Fathers_Name=?,DOB=?,Gender=?,Blood_Group=?,Year_Of_Admission=?,STD=?,ADDRESS=?,School_House=?,User_Name=?,Password=? where ID=?";
                    PreparedStatement st=conn.prepareStatement(sql);
                       st.setString(1,Name.getText());
                       st.setString(2,Mothers_Name.getText());
                       st.setString(3,Fathers_Name.getText());
                       st.setString(4,DOB.getText());
                       st.setString(5,Gender.getText());
                       st.setString(6,Blood_Group.getText());
                       st.setString(7,Year_Of_Admission.getText());
                       st.setString(8,STD.getText());
                       st.setString(9,ADDRESS.getText());
                       st.setString(10,School_House.getText());
                       st.setString(11,User_Name.getText());
                       st.setString(12,Password.getText());
                       st.setString(13,ID.getText());
                       st.executeUpdate();
                       JOptionPane.showMessageDialog(null,"Updated Successfully");
                       
                       
                    ///////Setting all fields to blank after Update
                       Name.setText("");
                       Mothers_Name.setText("");
                       Fathers_Name.setText("");
                       DOB.setText("");
                       ADDRESS.setText("");
                       User_Name.setText("");
                       Password.setText("");
                       Year_Of_Admission.setText("");
                       Blood_Group.setText("");
                       Gender.setText("");
                       ID.setText("");
                       School_House.setText("");
                       STD.setText("");
                       
                       
     
               }   catch (Exception e) {
                   JOptionPane.showMessageDialog(null,e);
               }
                   }
                   
                   else
                   {
                    JOptionPane.showMessageDialog(null, "Please Provide Gender as male or Female");
                    }
                   }
                   else
                   {
                    JOptionPane.showMessageDialog(null, "Please Provide House as Red ,Blue, Green or Yellow");
                   }
                   }
                    else
                   {
                    JOptionPane.showMessageDialog(null, "Please Provide Class in Roman Numeral");
                   }
                   }
                    else
                   {
                    JOptionPane.showMessageDialog(null, "Please Provide Valid Blood Group");
                   }
                  }  
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                   
                           
               
                   }
                  });
                  
       
                  
                 ////Button To Read All Data
                  B3=new JButton("Read All Data");
                  B3.setBackground(Color.YELLOW);
                  B3.setBounds(930,600,150,30);
                  B3.addActionListener( new ActionListener()
                  {
               public void actionPerformed (ActionEvent ae){
                   new Admin_1();
                   A.dispose();
               }
                  });
             
                    L1.add(B2);
                    L1.add(B3);
                    
                    
                /////Frame Setting
 A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 A.setLayout(new FlowLayout());
 A.setVisible(true);
 A.setSize(1366,768);   
 A.setResizable(FALSE);
 
    }
}
    


