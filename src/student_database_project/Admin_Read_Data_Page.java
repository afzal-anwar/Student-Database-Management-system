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
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Admin_Read_Data_Page {
    public static void main(String[] x) throws ClassNotFoundException, SQLException{
        Admin_1 d=new  Admin_1();     
      }
   }

class Admin_1{
 
    JFrame A;
    JButton B1,B2,B3,B4,B5,B6,B7;
    JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,L16,L17;
    JTextField T1,T2,T3;
    DateChooserCombo DOB;
    JRadioButton RB1,RB2;
    ButtonGroup BG;
    JComboBox STD,School_House,Blood_Group;
    JScrollPane SP;
    JTable J,J1;
    String Gender,male,female;
    
    
                      /////Method--->>> to Display Table///
     public void Display_Table() throws ClassNotFoundException, SQLException
    {
        try
        {
                    Class.forName("com.mysql.jdbc.Driver");
                    String url ="jdbc:mysql://localhost:3306/student_info"; //update connection string
                    String user = "root";//add your db user id here
                    String password = "";//add your db password here
                    Connection conn = DriverManager.getConnection(url, user, password);
                    System.out.println("Successfully connected");
                    String sql="select* from user";
                    PreparedStatement st=conn.prepareStatement(sql);
                    ResultSet rs=st.executeQuery();
                    J.setModel(DbUtils.resultSetToTableModel(rs));
                    
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
    }
     
     
                    /////Method--->to Delete Data///
     public void Delete_Data() throws ClassNotFoundException, SQLException
    {
        try
        {
                    Class.forName("com.mysql.jdbc.Driver");
                    String url ="jdbc:mysql://localhost:3306/student_info";
                    String user = "root";//add your db user id here
                    String password = "";//add your db password here
                    Connection conn = DriverManager.getConnection(url, user, password);
                    System.out.println("Successfully connected");
                    String sql="Delete from user where ID=?";
                    PreparedStatement stmt =conn.prepareStatement(sql);
                    stmt.setString(1,T2.getText());
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Deleted Successfully");
                    T2.setText("");
                    
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
    }
      
    
    public Admin_1()
            {
                
                  A=new JFrame("View Student Data(Admin)");

                     ///Background
       L1=new JLabel(new ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\trial\\src\\student_database_project\\Images\\Simple.jpeg"));
           L1.setBounds(0,0,1366,768);
           A.add(L1);
            
                      //////School Name
       L2=new JLabel("Delhi Public School(ADMIN SITE)");
           L2.setFont(new Font("ALGERIAN",Font.BOLD,30));
           L2.setForeground(Color.WHITE);
           L2.setBounds(650,30,600,30);
           L1.add(L2);
           
                     ///JTable
           J=new JTable();
           J.setBounds(290,90,1300,500);
           J.setBackground(Color.WHITE);
            L1.add(J);
            
                   ///Labels
            L6=new JLabel("ID");
            L6.setFont(new Font("Times New Roman",Font.BOLD,15));
            L6.setForeground(Color.WHITE);
            L6.setBounds(300,60,80,25);
            L1.add(L6);
            
            L7=new JLabel("Name");
            L7.setFont(new Font("Times New Roman",Font.BOLD,15));
            L7.setForeground(Color.WHITE);
            L7.setBounds(400,60,80,25);
            L1.add(L7);
            
            L8=new JLabel("M_Name");
            L8.setFont(new Font("Times New Roman",Font.BOLD,15));
            L8.setForeground(Color.WHITE);
            L8.setBounds(500,60,80,25);
            L1.add(L8);
            
            L9=new JLabel("F_Name");
            L9.setFont(new Font("Times New Roman",Font.BOLD,15));
            L9.setForeground(Color.WHITE);
            L9.setBounds(600,60,80,25);
            L1.add(L9);
            L10=new JLabel("DOB");
            L10.setFont(new Font("Times New Roman",Font.BOLD,15));
            L10.setForeground(Color.WHITE);
            L10.setBounds(700,60,80,25);
            L1.add(L10);
            L11=new JLabel("Gender");
            L11.setFont(new Font("Times New Roman",Font.BOLD,15));
            L11.setForeground(Color.WHITE);
            L11.setBounds(800,60,80,25);
            L1.add(L11);
            L12=new JLabel("B_Group");
            L12.setFont(new Font("Times New Roman",Font.BOLD,15));
            L12.setForeground(Color.WHITE);
            L12.setBounds(900,60,80,25);
            L1.add(L12);
            L13=new JLabel("ADM Year");
            L13.setFont(new Font("Times New Roman",Font.BOLD,15));
            L13.setForeground(Color.WHITE);
            L13.setBounds(1000,60,80,25);
            L1.add(L13);
            L14=new JLabel("Class");
            L14.setFont(new Font("Times New Roman",Font.BOLD,15));
            L14.setForeground(Color.WHITE);
            L14.setBounds(1100,60,80,25);
            L1.add(L14);
            L15=new JLabel("Address");
            L15.setFont(new Font("Times New Roman",Font.BOLD,15));
            L15.setForeground(Color.WHITE);
            L15.setBounds(1200,60,80,25);
            L1.add(L15);
            L16=new JLabel("House");
            L16.setFont(new Font("Times New Roman",Font.BOLD,15));
            L16.setForeground(Color.WHITE);
            L16.setBounds(1300,60,80,25);
            L1.add(L16);
            L17=new JLabel("User ID");
            L17.setFont(new Font("Times New Roman",Font.BOLD,15));
            L17.setForeground(Color.WHITE);
            L17.setBounds(1400,60,80,25);
            L1.add(L17);
            L3=new JLabel("Password");
            L3.setFont(new Font("Times New Roman",Font.BOLD,15));
            L3.setForeground(Color.WHITE);
            L3.setBounds(1500,60,80,25);
            L1.add(L3);
            
            
            
            
            
                     /////////PRINT DATABASE TABLE
            B7=new JButton("Print Data Table");
            B7.setBounds(400,640,200,30);
            B7.setBackground(Color.LIGHT_GRAY);
            L1.add(B7);
            B7.addActionListener( new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
            
            MessageFormat header= new MessageFormat("Report Print");
            MessageFormat footer= new MessageFormat("Page{0,number,integer}");
            try
            {
                J.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            }
            catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            });
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
             
               /////////Button to go to Update Page
                  B2=new JButton("Update");
                  B2.setBackground(Color.GREEN);
                  B2.setBounds(400,600,200,30);
                  
                 B2.addActionListener( new ActionListener()  { 
              
                  public void actionPerformed (ActionEvent ae)
                          
               {
                   new Student_info_by_admin();
                   A.dispose();
                         
                }
           });
                
                 
                 /////Button To Delete Data of given ID
                  B3=new JButton("Delete");
                  B3.setBackground(Color.RED);
                  B3.setBounds(1250,640,200,30);
                  L5=new JLabel("ENTER ID NO TO DELETE");
                  L5.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
                   L5.setForeground(Color.WHITE);
                  L5.setBounds(1150,600,250,30);
                  T2=new JTextField();
                  T2.setBounds(1420,600,80,30);
                  B3.addActionListener( new ActionListener()
           {
               public void actionPerformed (ActionEvent ae)
               {
                   if(T2.getText().trim().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"Please Give an ID No to Delete");
                   }
                   else 
                   try { 
                       
                       Delete_Data();  ////Calling The Delete Data Method
                       
                   } catch (ClassNotFoundException ex) {
                       Logger.getLogger(Admin_1.class.getName()).log(Level.SEVERE, null, ex);
                   } catch (SQLException ex) {
                       Logger.getLogger(Admin_1.class.getName()).log(Level.SEVERE, null, ex);
                   }
                 
               }
           });
                  
                  
                  
                  
                  /////Log Out Button
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
                    
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                     //////Button to Read All Data from the Database
                  B4=new JButton("Read All Data");
                  B4.setBackground(Color.YELLOW);
                  B4.setBounds(825,640,200,30);
                  B4.addActionListener(new ActionListener()
                  {
                      public void actionPerformed (ActionEvent ae)
                      {
                          try { 
                              
                              Display_Table();   /////Calling The Display Table Method
                              
                          } catch (ClassNotFoundException ex) {
                              Logger.getLogger(Admin_1.class.getName()).log(Level.SEVERE, null, ex);
                          } catch (SQLException ex) {
                              Logger.getLogger(Admin_1.class.getName()).log(Level.SEVERE, null, ex);
                          }
                      }
                      });
                    
                                 
                          ////Button to go to the Registration Page
                  B1=new JButton("New Registration");
                  B1.setBackground(Color.CYAN);
                  B1.setBounds(825,600,200,30);
                  B1.addActionListener(new ActionListener()
                  {
                          public void actionPerformed (ActionEvent ae)
                          {
                              new Student_Reg_by_Admin();
                              A.dispose();
                          }
                          
                          
                  
                  
                  });
                         
                  L1.add(B1);
                  L1.add(B4);
                  L1.add(B2);
                  L1.add(B3);
                  L1.add(L5);
                  L1.add(T2); 
            
      
                      ////Frame Settings
 A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 A.setLayout(new FlowLayout());
 A.setVisible(true);
 A.setSize(1366,768);
 A.setResizable(FALSE);
            
        }
    }



