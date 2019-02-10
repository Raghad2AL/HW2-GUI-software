import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.tools.Tool;
import java.awt.Toolkit;
public class TheFrame extends JFrame {
    private static final long serialVersionUID = 1L;
	private static ArrayList <Student> Stu= new ArrayList<Student>();
	int numS=0;
   JPanel Buttons;
   JButton add;
   JButton Delete;
   JButton set;
   JButton get;
   JButton getAverage;
   JButton addCourse;
   JButton setCourse;
   JButton print;
   JButton exit;
  
 
   public TheFrame() {
 setIconImage(Toolkit.getDefaultToolkit().getImage(TheFrame.class.getResource("rainbow.JPG")));
setLayout(null);
Color C = new Color(196,167,209);
Icon AddIcon=new ImageIcon(getClass().getResource("add.PNG"));
Icon DIcon=new ImageIcon(getClass().getResource("Delete.PNG"));
Icon c=new ImageIcon(getClass().getResource("set.PNG"));
Icon D=new ImageIcon(getClass().getResource("get.PNG"));
Icon e=new ImageIcon(getClass().getResource("addC.PNG"));
Icon f=new ImageIcon(getClass().getResource("setC.PNG"));
Icon g=new ImageIcon(getClass().getResource("av.PNG"));
Icon k=new ImageIcon(getClass().getResource("print.PNG"));
Icon l=new ImageIcon(getClass().getResource("exit.PNG"));

  add= new JButton(AddIcon);
  Delete= new JButton(DIcon);
  set= new JButton(c);
  get= new JButton(D);
  addCourse= new JButton(e);
  setCourse= new JButton(f);
  getAverage= new JButton(g);
  print= new JButton(k);
  exit= new JButton(l);
  add.setSize(290,87);add.setLocation(5,17); add.setBackground(C);
  add(add);
  Delete.setSize(290,87); Delete.setLocation(5,110); Delete.setBackground(C);
  add(Delete);
  set.setSize(290,87); set.setLocation(5,207); set.setBackground(C);
  add(set);
  get.setSize(290,87); get.setLocation(5,301); get.setBackground(C); add(get);
  addCourse.setSize(290,87);addCourse.setLocation(5,395); addCourse.setBackground(C); add(addCourse);
 setCourse.setSize(290,87);setCourse.setLocation(5,489); setCourse.setBackground(C); add(setCourse);
 getAverage.setSize(290,87);getAverage.setLocation(5,583); getAverage.setBackground(C); add(getAverage);
print.setSize(140,87); print.setLocation(5,677); print.setBackground(C); add(print);
exit.setSize(140,87); exit.setLocation(145,677); exit.setBackground(C); add(exit);

Icon bug=new ImageIcon(getClass().getResource("bugN.PNG"));
JPanel BK = new JPanel();
BK.add(new JLabel(bug));
BK.setSize(700,1000); BK.setLocation(300,0);
add(BK);
setResizable(false);
add.addMouseListener(new MouseHandler() );
Delete.addMouseListener(new MouseHandler());
set.addMouseListener(new MouseHandler());
get.addMouseListener(new MouseHandler());
addCourse.addMouseListener(new MouseHandler());
setCourse.addMouseListener(new MouseHandler());
getAverage.addMouseListener(new MouseHandler());
print.addMouseListener(new MouseHandler());
exit.addMouseListener(new MouseHandler());
add.addActionListener(new ActionHandler());
Delete.addActionListener(new ActionHandler());
set.addActionListener(new ActionHandler());
get.addActionListener(new ActionHandler());
addCourse.addActionListener(new ActionHandler());
setCourse.addActionListener(new ActionHandler());
getAverage.addActionListener(new ActionHandler());
print.addActionListener(new ActionHandler());
exit.addActionListener(new ActionHandler());

   }//Main_class_constructor 
   
   private class MouseHandler extends MouseAdapter{
	   Icon AddIcon=new ImageIcon(getClass().getResource("add.PNG"));
	   Icon DIcon=new ImageIcon(getClass().getResource("Delete.PNG"));
	   Icon c=new ImageIcon(getClass().getResource("set.PNG"));
	   Icon D=new ImageIcon(getClass().getResource("get.PNG"));
	   Icon e=new ImageIcon(getClass().getResource("addC.PNG"));
	   Icon f=new ImageIcon(getClass().getResource("setC.PNG"));
	   Icon g=new ImageIcon(getClass().getResource("av.PNG"));
	   Icon k=new ImageIcon(getClass().getResource("print.PNG"));
	   Icon l=new ImageIcon(getClass().getResource("exit.PNG"));

	   public void mouseExited(MouseEvent event) {
		   if(event.getSource()==add) { add.setIcon(AddIcon);}
			 else if (event.getSource()==Delete) { Delete.setIcon(DIcon);}
			 else if (event.getSource()==set){set.setIcon(c);}
			 else if (event.getSource()==get){get.setIcon(D);}
			 else if (event.getSource()==addCourse){addCourse.setIcon(e);}
			 else if (event.getSource()==setCourse){setCourse.setIcon(f);}
			 else if (event.getSource()==getAverage){getAverage.setIcon(g);}
			 else if (event.getSource()==print){print.setIcon(k);}	
			 else if (event.getSource()==exit){exit.setIcon(l);}	

	   }
	   public void mouseEntered (MouseEvent event) {
		   if(event.getSource()==add) {add.setIcon(null); add.setText("Add Student");}
			 else if (event.getSource()==Delete){Delete.setIcon(null); Delete.setText("Delete Student");}
			 else if (event.getSource()==set){set.setIcon(null); set.setText("Set Information For Any Student");}
			 else if (event.getSource()==get){get.setIcon(null);get.setText("Get Informations For Any Student");}
			 else if (event.getSource()==addCourse){addCourse.setIcon(null); addCourse.setText("Add Courses For Any Student");}
			 else if (event.getSource()==setCourse){setCourse.setIcon(null); setCourse.setText("Set Information For Any Course To A Student ");}
			 else if (event.getSource()==getAverage){getAverage.setIcon(null); getAverage.setText("Get Average For Any student");}
			 else if (event.getSource()==print){print.setIcon(null); print.setText("Print");}
			 else if (event.getSource()==exit){exit.setIcon(null); exit.setText("Exit");}	

	   }
	   
	   
   }//mouse-Handler
   
   //Event_Handling
   private class ActionHandler implements ActionListener{
	   public void actionPerformed(ActionEvent event){
		   Color C = new Color(133,227,158);
		   Icon Icon=new ImageIcon(getClass().getResource("back.JPG"));
		   Icon IconP=new ImageIcon(getClass().getResource("back2.JPG"));
		   JLabel background=new JLabel(Icon);
		   JLabel background2=new JLabel(IconP);
		   if(event.getSource()==add){ 
			   setVisible(false);
			   class addFrame extends JFrame implements ActionListener {
				   Color R = new Color(255,244,131);
				   private JLabel ID;
				   private JTextField id;
				   private JButton save, back;
				   //Color B= new Color(229,0,0);
				   public addFrame() {
					   setLayout(null);
					   setVisible(true);
					    background.setSize(400,400); background.setLocation(0,0);
					   add(background);
					   ID=new JLabel("ID Number");ID.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,14)); ID.setSize(100,40); ID.setLocation(100,100); ID.setForeground(R); add.addActionListener(this);
					   background.add(ID);
					   id=new JTextField(10);id.setSize(100,20); id.setLocation(180,110); id.setToolTipText("Enter the student ID"); id.addActionListener(this);
					   background.add(id);
					   save = new JButton("Save"); save.setSize(100,40); save.setLocation(100,170);save.setBackground(C); save.setToolTipText("Add stuent to the Array and save it");save.addActionListener(this);
					   background.add(save);
					   back=new JButton("Back to main screen"); back.setSize(400,40); back.setLocation(0,320);back.setBackground(C);back.addActionListener(this);
					   background.add(back);
				   }//cons
				   public void actionPerformed(ActionEvent event){
					   if(event.getSource()==save){ 
					   String Id=id.getText();
					   int flag=0;
						for(int i=0; i<Stu.size(); i++) 
						{
							if(Id.equals(Stu.get(i).getId())) 
							{flag++;}
						}//for
							if(flag!=0) {
								JOptionPane.showMessageDialog(null, "ID already exists, Try Again :)");
							}//if
							else {
								Student S=new Student();
								S.setId(Id);
								Stu.add(numS,S);
								numS++;
								JOptionPane.showMessageDialog(null, "The ID you wanted to add was added succefully :)");
								
							}//else
					   }//big_if
					   else {
						   TheFrame.this.setVisible(true);
						   setVisible(false);
						  // wrong.setVisible(false);
					   }//big_else
				   }//Innear_action
			   }//innear_innear_class_:)
			   addFrame frame1=new addFrame();
			   frame1.pack();
			   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			   int height = screenSize.height;
			   int width = screenSize.width;
			   frame1.setSize(width/2, height/2);
			   frame1. setSize(400,400);
			   frame1.setResizable(false);
			   frame1.setLocationRelativeTo(null);
			   
			   
			   
		   }//if
		   else if(event.getSource()==Delete){
			   setVisible(false);
			   class DFrame extends JFrame implements ActionListener {
				   private JTextField id;
				   private JButton Delete, back;
				   public DFrame() {
					   setLayout(null);
					   setVisible(true);
					    background.setSize(400,400); background.setLocation(0,0);
					   add(background);
					   id=new JTextField("Enter ID"); id.setSize(100,40); id.setLocation(150,100);id.setToolTipText("Enter the ID you wanna delete");id.addActionListener(this);
					   id.addFocusListener(new FocusListener() {
						   public void focusGained(FocusEvent e){
							  id= (JTextField)e.getSource();
							 id.selectAll();

						   }
						   public void focusLost(FocusEvent e){
							   //nothing 
							   
						   }
					   });
					   background.add(id);
					   Delete=new JButton("Delete ID"); Delete.setSize(100,50); Delete.setLocation(150,150);Delete.setBackground(C);Delete.addActionListener(this);
					   background.add(Delete);
					   back=new JButton("Back to main screen"); back.setSize(400,40); back.setLocation(0,320);back.setBackground(C);back.addActionListener(this);
					   background.add(back);
					   }//Constructor
				   public void actionPerformed(ActionEvent event){
					   if(event.getSource()==Delete) {
						   String Id=id.getText();
						   int index=-1;
							for(int i=0;i<Stu.size(); i++) {
								if(Stu.get(i).getId().equals(Id)) {index =i;}
							}//for
							if(index==-1) {JOptionPane.showMessageDialog(null, "The ID doesn't exist. Try again :)");}
							else {Stu.remove(index);
							numS--;
							JOptionPane.showMessageDialog(null, "The ID you wanted to delete was deleted succefully :)");
							}
					   }//if
					   else {
						   TheFrame.this.setVisible(true);
						   setVisible(false);
					   }
				   }//per
				   }//Class
			   DFrame frame1=new DFrame();
			   frame1.pack();
			   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			   int height = screenSize.height;
			   int width = screenSize.width;
			   frame1.setSize(width/2, height/2);
			   frame1. setSize(400,400);
			   frame1.setResizable(false);
			   frame1.setLocationRelativeTo(null); 
		   }//else_if_1
		   
		   else if(event.getSource()== set) {
			   setVisible(false);
			   class SFrame extends JFrame implements ActionListener {
				   Color R = new Color(255,244,131);
			  JLabel name, major, Date;
			  JTextField name1, major1, date, id;
			   private JButton back, save;
			   public SFrame () {
				   setLayout(null);
				   setVisible(true);
				    background.setSize(400,400); background.setLocation(0,0);
				   add(background);
				   id=new JTextField("Enter ID"); id.setSize(100,20); id.setLocation(100,80);id.setToolTipText("Enter the ID you wanna set attribute for");
				   id.addFocusListener(new FocusListener() {
					   public void focusGained(FocusEvent e){
						  id= (JTextField)e.getSource();
						 id.selectAll();

					   }
					   public void focusLost(FocusEvent e){
						   //nothing 
						   
					   }
				   });
				   background.add(id);
				   name=new JLabel("Name"); name.setSize(100,30); name.setLocation(100,110);name.setForeground(R); name.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,16));
				   background.add(name);
				   name1=new JTextField(); name1.setSize(100,20); name1.setLocation(150,120); name1.setToolTipText("Set Name");
				   background.add(name1);
				   major=new JLabel("Major"); major.setSize(100,30); major.setLocation(100,150); major.setForeground(R); major.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,16));
				   background.add(major);
				   major1=new JTextField(); major1.setSize(100,20); major1.setLocation(150,160); major.setToolTipText("Set Major");
				   background.add(major1);
				   Date=new JLabel("Date of Birth"); Date.setSize(100,30); Date.setLocation(100, 200); Date.setForeground(R); Date.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,16));
				   background.add(Date);
				   date=new JTextField(); date.setSize(100,20); date.setLocation(200,210); date.setToolTipText("Set Major");
				   background.add(date);
				   save=new JButton("Save Information"); save.setSize(200,40); save.setLocation(100,260); save.setBackground(C); save.addActionListener(this);
				   background.add(save);
				   back=new JButton("Back to main screen"); back.setSize(400,40); back.setLocation(0,320);back.setBackground(C);back.addActionListener(this);
				   background.add(back);
			   }//constructor
			   public void actionPerformed(ActionEvent event){
				   if(event.getSource()== save) {
				   int index=-1;
				   String ID=id.getText();
					for(int i=0;i<Stu.size(); i++) {
						if(Stu.get(i).getId().equals(ID)) {index =i;}
					}//for
					if(index==-1) {JOptionPane.showMessageDialog(null,"The ID you entered doesn't exist, please try again :)");}
					else {
						 Stu.get(index).setName(name1.getText());
						 Stu.get(index).setMajor(major1.getText());
						 Stu.get(index).setBirth(date.getText());
					 }
				   } 
				   if(event.getSource()==back) { TheFrame.this.setVisible(true);
				   setVisible(false);}
			   }//action

			   }//inner_class
			   SFrame frame1=new SFrame();
			   frame1.pack();
			   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			   int height = screenSize.height;
			   int width = screenSize.width;
			   frame1.setSize(width/2, height/2);
			   frame1. setSize(400,400);
			   frame1.setResizable(false);
			   frame1.setLocationRelativeTo(null); 
		   }//2nd_else_if
		   
		   else if(event.getSource()== get) {
			   setVisible(false);
			   class GFrame extends JFrame implements ItemListener, ActionListener {
				   private JComboBox artt;
				   private JTextField value, id;
				   private JButton back;
				   private String names[]= {" ","Name","Major","Birthdate"};
				   //boolean shown = false;
				   public GFrame () {
					   setLayout(null);
					   setVisible(true);
					    background.setSize(400,400); background.setLocation(0,0);
					   add(background);
					   artt=new JComboBox(names);artt.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,14)); artt.setSize(100,30);artt.setLocation(100,140); artt.setToolTipText("Choose the attribute you wanna set"); artt.setMaximumRowCount(2);artt.addItemListener(this);
					   background.add(artt);
					   value=new JTextField(10);value.setSize(100,30); value.setLocation(220,140); value.setEditable(false); value.addActionListener(this);
					   background.add(value);
					   id=new JTextField("Enter ID"); id.setSize(100,20); id.setLocation(100,100);id.setToolTipText("Enter the ID you wanna get attribute for");
					   id.addFocusListener(new FocusListener() {
						   public void focusGained(FocusEvent e){
							  id= (JTextField)e.getSource();
							 id.selectAll();

						   }
						   public void focusLost(FocusEvent e){
							   //nothing 
							   
						   }
					   });
					   background.add(id);
					   back=new JButton("Back to main screen"); back.setSize(400,40); back.setLocation(0,320);back.setBackground(C);back.addActionListener(this);
					   background.add(back);
				   }//constructor
				   public void itemStateChanged(ItemEvent event){
					   int index=-1; 
					   String ID=id.getText();
						for(int i=0;i<Stu.size(); i++) {
							if(Stu.get(i).getId().equals(ID)) {index =i;}
						}//for
						if(index==-1) {JOptionPane.showMessageDialog(null,"The ID you entered doesn't exist, please try again :)");//shown = true;
						}
						else {
							String val  ;//value.getText();
					   if(artt.getSelectedItem()=="Name"){
					   val= Stu.get(index).getName(); value.setText(val); //JOptionPane.showMessageDialog(null,"you selected name. please enter the value and press enter :)");
					   }//if
					   else if(artt.getSelectedItem()=="Major") {
						   val= Stu.get(index).getMajor(); value.setText(val); //JOptionPane.showMessageDialog(null,"you selected major. please enter the value and press enter :)");
					   }//else_if
					   else {
						   val= Stu.get(index).getBirth(); value.setText(val); //JOptionPane.showMessageDialog(null,"you selected birthdate. please enter the value and press enter:)");
					   }//small_else
				    }//else
						
				   }//Item
				   public void actionPerformed(ActionEvent event){
					   if(event.getSource()==back) { TheFrame.this.setVisible(true);
					   setVisible(false);}
					  // else { JOptionPane.showMessageDialog(null,"The attribute you selected was set");}
				   }//action
				   }//inner_class
			   GFrame frame1=new GFrame();
			   frame1.pack();
			   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			   int height = screenSize.height;
			   int width = screenSize.width;
			   frame1.setSize(width/2, height/2);
			   frame1. setSize(400,400);
			   frame1.setResizable(false);
			   frame1.setLocationRelativeTo(null); 
			   
		   }//3rd-else-if
		   else if(event.getSource()==addCourse) {
			   setVisible(false);
			   class CFrame extends JFrame implements ActionListener {
				   Color R = new Color(255,244,131);
				   JLabel cno;
				   JTextField id, no;
				   JButton save, back;
				   public CFrame() {
					   setLayout(null);
					   setVisible(true);
					   background.setSize(400,400); background.setLocation(0,0);
					   add(background);
					   id=new JTextField("Enter ID"); id.setSize(100,20); id.setLocation(90,80);id.setToolTipText("Enter the ID you wanna set courses for");
					   id.addFocusListener(new FocusListener() {
						   public void focusGained(FocusEvent e){
							  id= (JTextField)e.getSource();
							 id.selectAll();

						   }
						   public void focusLost(FocusEvent e){
							   //nothing 
							   
						   }
					   });
					   background.add(id);
					   cno=new JLabel("Course Number"); cno.setSize(100,30); cno.setLocation(80,120);cno.setForeground(R); cno.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,14));
					   background.add(cno);
					   no=new JTextField(); no.setSize(100,20); no.setLocation(190,130); no.setToolTipText("Set Name");
					   background.add(no);
					   save=new JButton("Save Information"); save.setSize(200,40); save.setLocation(100,200); save.setBackground(C); save.addActionListener(this);
					   background.add(save);
					   back=new JButton("Back to main screen"); back.setSize(400,40); back.setLocation(0,320);back.setBackground(C);back.addActionListener(this);
					   background.add(back);   
				   }//constructor 
				   public void actionPerformed(ActionEvent event){
					   if(event.getSource()==save) {
						   int index=-1; 
						   String ID=id.getText();
						   
							for(int i=0;i<Stu.size(); i++) {
								if(Stu.get(i).getId().equals(ID)) {index =i;}
							}//for
							if(index==-1) {JOptionPane.showMessageDialog(null,"The ID you entered doesn't exist, please try again :)");
							}
							else {
								String CNO=no.getText();
								int flag=0;
								for(int i=0; i<Stu.get(index).Course.size(); i++) {
									if(CNO.equals(Stu.get(index).Course.get(i).getCno())) {flag++;}
								}//for
									if(flag!=0) {
										JOptionPane.showMessageDialog(null,"The CNO you entered already exists, please try again :)");
												
									}//if
									else {
										Course S=new Course();
										S.setCno(CNO);
										Stu.get(index).Course.add(S);
										JOptionPane.showMessageDialog(null, "The CNO you wanted to add was added succefully :)");
									}//else
									
							}//outer_else   
					   }//big_if
					   if(event.getSource()==back) { TheFrame.this.setVisible(true);
					   setVisible(false);}//if 
				   }//action
			   }//class  
			   CFrame frame1=new CFrame();
			   frame1.pack();
			   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			   int height = screenSize.height;
			   int width = screenSize.width;
			   frame1.setSize(width/2, height/2);
			   frame1. setSize(400,400);
			   frame1.setResizable(false);
			   frame1.setLocationRelativeTo(null); 
		   }//4th_else_if
		   else if(event.getSource()==setCourse) {
			   setVisible(false);
			   class CFrame2 extends JFrame implements ActionListener {
				   Color R = new Color(255,244,131);
				   JLabel crh, grade;
				   JTextField id, no, CRH, Grade;
				   JButton save, back;
				   public CFrame2() {
					   setLayout(null);
					   setVisible(true);
					   background.setSize(400,400); background.setLocation(0,0);
					   add(background);
					   back=new JButton("Back to main screen"); back.setSize(400,40); back.setLocation(0,320);back.setBackground(C);back.addActionListener(this);
					   background.add(back);
					   id=new JTextField("Enter ID"); id.setSize(100,20); id.setLocation(90,80);id.setToolTipText("Enter the ID you want");
					   id.addFocusListener(new FocusListener() {
						   public void focusGained(FocusEvent e){
							  id= (JTextField)e.getSource();
							 id.selectAll();

						   }
						   public void focusLost(FocusEvent e){
							   //nothing 
							   
						   }
					   });
					   background.add(id);
					   no=new JTextField("Enter CNO"); no.setSize(100,20); no.setLocation(90,115);no.setToolTipText("Enter the CNO you wanna set attributes for");
					   no.addFocusListener(new FocusListener() {
						   public void focusGained(FocusEvent e){
							  no= (JTextField)e.getSource();
							no.selectAll();

						   }
						   public void focusLost(FocusEvent e){
							   //nothing 
							   
						   }
					   });
					   background.add(no);
					   crh=new JLabel("Credit Hours"); crh.setSize(100,30); crh.setLocation(85,145);crh.setForeground(R); crh.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,14));
					   background.add(crh);
					   CRH=new JTextField(); CRH.setSize(100,20); CRH.setLocation(180,150); CRH.setToolTipText("Set Credit Hours");
					   background.add(CRH);
					   grade=new JLabel("Course's Grade"); grade.setSize(100,30); grade.setLocation(85,185);grade.setForeground(R);grade.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,14));
					   background.add(grade);
					   Grade=new JTextField(); Grade.setSize(100,20); Grade.setLocation(185,190); Grade.setToolTipText("Set Grade for the course");
					   background.add(Grade);
					   save=new JButton("Save"); save.setSize(100,40); save.setLocation(150,240); save.setBackground(C); save.addActionListener(this);
					   background.add(save);
				   }//constructor
				   
				   public void actionPerformed(ActionEvent event){
					   if(event.getSource()==back) { TheFrame.this.setVisible(true);
					   setVisible(false);}//if 
					   if(event.getSource()==save) {
						   int index=-1; 
						   String ID=id.getText();
						   
							for(int i=0;i<Stu.size(); i++) {
								if(Stu.get(i).getId().equals(ID)) {index =i;}
							}//for
							if(index==-1) {JOptionPane.showMessageDialog(null,"The ID you entered doesn't exist, please try again :)");
							}
							else {
								String CNO=no.getText();
								int ind=-1;
								for(int i=0;i<Stu.get(index).Course.size();i++){
									if(Stu.get(index).Course.get(i).getCno().equals(CNO)) {ind =i;}//if
								}//for
									if(ind==-1) {
										JOptionPane.showMessageDialog(null,"The CNO you entered doesn't exists, please try again :)");			
									}//if
									else {
										Stu.get(index).Course.get(ind).setCrh(Integer.parseInt(CRH.getText()));
										Stu.get(index).Course.get(ind).setGrades(Double.parseDouble(Grade.getText()));
										//JOptionPane.showMessageDialog(null,"wopp wopp");

									}//else	
							}//else   
					   }//if
					   
				   }//action
			   }//class
			   CFrame2 frame1=new CFrame2();
			   frame1.pack();
			   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			   int height = screenSize.height;
			   int width = screenSize.width;
			   frame1.setSize(width/2, height/2);
			   frame1. setSize(400,400);
			   frame1.setResizable(false);
			   frame1.setLocationRelativeTo(null); 
		   }//5th_else_if
		   
		   else if(event.getSource()==getAverage) {
			   String ID=JOptionPane.showInputDialog("Please Enter Your ID");
			   setVisible(false);
			   double c1=0.0;
				double c2=0.0;
			   class GAFrame extends JFrame implements ActionListener {
				   JTextField AV;
				   JLabel Show;
				   JButton back;
				   Color R = new Color(255,244,131);
				   public GAFrame() {
					   setLayout(null);
					   setVisible(true);
					   background.setSize(400,400); background.setLocation(0,0);
					   add(background);
					   back=new JButton("Back to main screen"); back.setSize(400,40); back.setLocation(0,320);back.setBackground(C);back.addActionListener(this);
					   background.add(back);
					   Show =new JLabel("The Average"); Show.setSize(150,30); Show.setLocation(100,100); Show.setForeground(R); Show.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,20));
					   background.add(Show);
					   AV=new JTextField(); AV.setSize(100,30); AV.setLocation(200,130); AV.setToolTipText("Student's Average");
					   background.add(AV);
	   
				   }//constructor

				   public void actionPerformed(ActionEvent event){
					   if(event.getSource()==back) { TheFrame.this.setVisible(true);
					   setVisible(false);}//if 
					   
				   }//action
				   
			   }//class
			   GAFrame frame1=new GAFrame();
			   frame1.pack();
			   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			   int height = screenSize.height;
			   int width = screenSize.width;
			   frame1.setSize(width/2, height/2);
			   frame1. setSize(400,400);
			   frame1.setResizable(false);
			   frame1.setLocationRelativeTo(null);
			   int x=-1; 
				for(int i=0;i<Stu.size(); i++) {
					if(Stu.get(i).getId().equals(ID)) {x =i;}
				}//for
				if(x==-1) {JOptionPane.showMessageDialog(null,"The ID you entered doesn't exist, please try again :)");
				}
				else {
				for (int i=0;i<Stu.get(x).Course.size();i++) {
					c1+=Stu.get(x).Course.get(i).getCrh()*Stu.get(x).Course.get(i).getGrades();
					c2+=Stu.get(x).Course.get(i).getCrh();
				} 
				}
			   frame1.AV.setText(Double.toString(c1/c2));
		   }//6th_else_if
		   else if(event.getSource()==print) {
			   String ID=JOptionPane.showInputDialog("Please Enter Your ID");
			   setVisible(false);
			   double c1=0.0;
				double c2=0.0;
				   Color R = new Color(255,244,131);
				   Color T=new Color(145,127,178);
			   class pFrame extends JFrame implements ActionListener {
				   JLabel info1; 
				   JTextField id,name,major,birth, av;
				   JButton back;
				   JTextArea info;
				   Box box;
				   String S = "CNO"+"     "+"Creidt Hours"+"     "+"Grade";
				   public pFrame() {
					   setLayout(null);
					   setVisible(true);
					   background2.setSize(700,700); background2.setLocation(0,0);
					   add(background2);
					   info1=new JLabel("Student Information"); info1.setSize(230,60); info1.setLocation(250,130); info1.setForeground(R); ;info1.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,25));
					   background2.add(info1);
					   back=new JButton("Back to main screen"); back.setSize(700,40); back.setLocation(0,620);back.setBackground(C);back.addActionListener(this);
					   background2.add(back);
					   id=new JTextField(); id.setSize(180,40); id.setLocation(130,200);id.setToolTipText("Student's ID"); id.setEditable(false);id.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,20)); id.setForeground(T);
					   background2.add(id);
					   name=new JTextField(); name.setSize(180,40); name.setLocation(380,200);name.setToolTipText("Student's name"); name.setEditable(false);name.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,20));name.setForeground(T);
					   background2.add(name);
					   major=new JTextField(); major.setSize(180,40); major.setLocation(130,260);major.setToolTipText("Student's Major"); major.setEditable(false);major.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,20));major.setForeground(T);
					   background2.add(major);
					   birth=new JTextField(); birth.setSize(180,40); birth.setLocation(380,260);birth.setToolTipText("Student's Birthdate"); birth.setEditable(false);birth.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,20));birth.setForeground(T);
					   background2.add(birth);
					   av=new JTextField(); av.setSize(80,40); av.setLocation(300,310);av.setToolTipText("Student's Average"); av.setEditable(false);av.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,20)); birth.setForeground(T);
					   background2.add(av);
					   info = new JTextArea(S,350,0); info.setEditable(false); info.append("\n \n"); info.setForeground(T); info.setFont(new Font("Serif", Font.BOLD+Font.ITALIC,20));
					   box=box.createHorizontalBox(); box.add(new JScrollPane(info)); box.setSize(350,100);box.setLocation(190,360);
					   background2.add(box);
				   }//constructor
				   public void actionPerformed(ActionEvent event){
					   if(event.getSource()==back) { TheFrame.this.setVisible(true);
					   setVisible(false);}//if
				   }//action
			   }//class
			   pFrame frame1=new pFrame();
			   frame1.pack();
			   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			   int height = screenSize.height;
			   int width = screenSize.width;
			   frame1.setSize(width/2, height/2);
			   frame1. setSize(700,700);
			   frame1.setResizable(false);
			   frame1.setLocationRelativeTo(null);
			   int x=-1; 
				for(int i=0;i<Stu.size(); i++) {
					if(Stu.get(i).getId().equals(ID)) {x =i;}
				}//for
				if(x==-1) {JOptionPane.showMessageDialog(null,"The ID you entered doesn't exist, please try again :)");}//if
				else {
					frame1.id.setText(Stu.get(x).getId()); frame1.id.setHorizontalAlignment(JTextField.CENTER);
					frame1.name.setText(Stu.get(x).getName());frame1.name.setHorizontalAlignment(JTextField.CENTER);
					frame1.major.setText(Stu.get(x).getMajor());frame1.major.setHorizontalAlignment(JTextField.CENTER);
					frame1.birth.setText(Stu.get(x).getBirth());frame1.birth.setHorizontalAlignment(JTextField.CENTER);
					for (int i=0;i<Stu.get(x).Course.size();i++) {
						c1+=Stu.get(x).Course.get(i).getCrh()*Stu.get(x).Course.get(i).getGrades();
						c2+=Stu.get(x).Course.get(i).getCrh();
					} //for
					frame1.av.setText(Double.toString(c1/c2));frame1.av.setHorizontalAlignment(JTextField.CENTER);
					for(int i=0; i<Stu.get(x).Course.size();i++) {
					frame1.info.append(Stu.get(x).Course.get(i).getCno() +"            " +Double.toString(Stu.get(x).Course.get(i).getCrh())+"                "+Double.toString(Stu.get(x).Course.get(0).getGrades()));
					frame1.info.append("\n\n");
					}//for
				}//B-else
  
		   }//7th_else_if
		   
		   else if(event.getSource()== exit) {
			   //JOptionPane.showMessageDialog(null,"GOOD BYE :)"); 
			   TheFrame.this.dispose();
		   }//Exit_else_if
	   }//Action-Performed
	  
   }//ActionHandler

   public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TheFrame x =new TheFrame();
	        x.setTitle("Student Tower");
	        x.setVisible(true);
	        x.setSize(1000,1000);
	        x.setLocationRelativeTo(null);
	        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        

	}//main
}//class
