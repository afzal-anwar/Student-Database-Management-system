                          //////Done/////
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
import java.util.logging.Level;
import java.util.logging.Logger;



public class Student_signup_Page {
    public static void main(String[] s) {
        Student_info d=new  Student_info();    
    }
}

class Student_info {
    JFrame A;
    JButton B1,B2,B3;
    JLabel L1,L2,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,L16,L17;
    JTextField Name,Mothers_Name,Fathers_Name,Year_Of_Admission,ADDRESS,User_Name,Password,T9,T10,T11,T12,T13,T14;
    DateChooserCombo DOB;
    JRadioButton RB1,RB2;
    ButtonGroup BG;
    JComboBox STD,School_House,Blood_Group;
    String Gender,male,female;
    
    
  
                    /////Method--->To Check Username///
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
    
    
    public Student_info()
    {
        A=new JFrame("Student Registration Form");

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
            L17=new JLabel("Student Registration Form");
           L17.setFont(new Font("Times New Roman",Font.BOLD,20));
           L17.setForeground(Color.GREEN);
           L17.setBounds(800,60,400,30);
           L1.add(L17);
           
           
         ////School Logo
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
             
           L7=new JLabel("Date Of Birth");
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
          
           
                ///Text Area
           
               Name=new JTextField();
                 Name.setBounds(500,90,300,30);
                 
               Mothers_Name=new JTextField();
                Mothers_Name.setBounds(500,130,300,30);
                
              Fathers_Name=new JTextField();
                Fathers_Name.setBounds(500,170,300,30);
                
                DOB=new DateChooserCombo();
                 DOB.setBounds(500,210,300,30);
                 
                 RB1=new JRadioButton("Male");
                    RB1.setBounds(500,250,100,30);
                 RB2=new JRadioButton("Female");
                     RB2.setBounds(620,250,100,30);
                 BG=new ButtonGroup();
                 BG.add(RB1);
                 BG.add(RB2);
                 L1.add(RB1);
                 L1.add(RB2);
                 
                 
               String B_G[]={ "A+","B+", "A-", "B-", "AB+", "AB-", "O+", "0-"};
                Blood_Group=new JComboBox(B_G);
                Blood_Group.setBounds(500,290,50,30);
                
                
                Year_Of_Admission=new JTextField();
                Year_Of_Admission.setBounds(500,330,300,30);
                
                String Course[]={ "I","II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
                STD=new JComboBox(Course);
                STD.setBounds(500,370,50,30);
                 
                ADDRESS=new JTextField();
                ADDRESS.setBounds(500,410,300,30);
                
                
                String House[]={ "Red","Blue", "Green", "Yellow"};
                School_House=new JComboBox(House);
                School_House.setBounds(500,450,100,30);
                
                 User_Name=new JTextField();
                User_Name.setBounds(500,490,300,30);
               
                 Password=new JTextField();
                Password.setBounds(500,530,300,30);
                
                
                   L1.add(Name); 
                   L1.add(Mothers_Name);
                   L1.add(Fathers_Name);
                   L1.add(DOB);
                   L1.add(RB1);
                   L1.add(RB2);
                   L1.add(Blood_Group);
                   L1.add(Year_Of_Admission);
                   L1.add(STD);
                   L1.add(ADDRESS);
                   L1.add(School_House);
                   L1.add(User_Name);
                   L1.add(Password);
                 
                      
          
                 ///Button To Register
               B1=new JButton("Register");
                  B1.setBackground(Color.cyan);
                  B1.setBounds(430,600,200,30);
                  B1.addActionListener( new ActionListener()
                  {
               
                   public void actionPerformed (ActionEvent ae){
                  
                       
                    try {
                        
                       Check_username();  ////////Calling the method to check Username
                       
                   } catch (ClassNotFoundException ex) {
                       Logger.getLogger(Student_Reg_by_Admin.class.getName()).log(Level.SEVERE, null, ex);
                   } catch (SQLException ex) {
                       Logger.getLogger(Student_Reg_by_Admin.class.getName()).log(Level.SEVERE, null, ex);
                   }    
               
                           ////////////Checking If any field is empty before Registering 
                    
                   if (Name.getText().trim().isEmpty()&&Mothers_Name.getText().trim().isEmpty()&&Fathers_Name.getText().trim().isEmpty()&&
                        ADDRESS.getText().trim().isEmpty()&&User_Name.getText().trim().isEmpty()&&Password.getText().trim().isEmpty())
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
                   
                           //////Entering the data to database if username matches and none of the field is Empty
                   else
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    String url ="jdbc:mysql://localhost:3306/student_info"; //update connection string
                    String user = "root";//add your db user id here
                    String password = "";//add your db password here
                    Connection conn = DriverManager.getConnection(url, user, password);
                    System.out.println("Successfully connected");
                      String query=("insert into user(Name,Mothers_Name,Fathers_Name,DOB,Gender,Blood_Group,Year_Of_Admission,STD,ADDRESS,School_House,User_Name,Password) values(?,?,?,?,?,?,?,?,?,?,?,?)");
                    
                    PreparedStatement st=conn.prepareStatement(query);
                       st.setString(1,Name.getText());
                       st.setString(2,Mothers_Name.getText());
                       st.setString(3,Fathers_Name.getText());
                       st.setString(4,DOB.getText());
                      
                       if (RB1.isSelected())
                       {
                           Gender="male";
                       }
                      else if (RB2.isSelected())
                       {
                           Gender="female";
                       }
                       st.setString(5,Gender);
                       
                       String Blood;
                       Blood=Blood_Group.getSelectedItem().toString();
                       st.setString(6,Blood);
                       st.setString(7,Year_Of_Admission.getText());
                       
                       String Class;
                       Class=STD.getSelectedItem().toString();
                       st.setString(8,Class);
                       
                       st.setString(9,ADDRESS.getText());
                       
                       String House;
                       House=School_House.getSelectedItem().toString();
                       st.setString(10,House);
                       
                       st.setString(11,User_Name.getText());
                       st.setString(12,Password.getText());
                       st.executeUpdate();
                       JOptionPane.showMessageDialog(null,"Thank You For Registration");
                       JOptionPane.showMessageDialog(null,"You can view your Data by Login in database using Your Username and Password");
                       new Student();
                       A.dispose();
                       
                       /////Setting all field to Blank after Registration
                       Name.setText("");
                       Mothers_Name.setText("");
                       Fathers_Name.setText("");
                       DOB.setText("");
                       ADDRESS.setText("");
                       User_Name.setText("");
                       Password.setText("");
                       Year_Of_Admission.setText("");
                       
                }
                
                catch(Exception e)
                {
                 JOptionPane.showMessageDialog(null,e);
                 
                 
               }
               }
           });              
                    L1.add(B1);
                  
                    
                    
                //////Frame Settings
 A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 A.setLayout(new FlowLayout());
 A.setVisible(true);
 A.setSize(1366,768);  
 A.setResizable(FALSE);
           
           
    }
}
        
    

