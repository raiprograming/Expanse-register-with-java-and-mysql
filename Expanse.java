import java.awt.*;
import java.awt.event.*;
public class Expanse extends Frame
{
 Label l1,l2,l3;
 Button b1,b2,b3,b4,b5,b6,b7;
 Frame f1;
 TextField tf1,tf2,tf3,tf4,tf5;
 Expanse()
 {
  l1=new Label("welcome user");
  Font font1=new Font("SansSerif",Font.BOLD,32);
  Font font2=new Font("SansSerif",Font.BOLD,25);
  l1.setFont(font1);
  addWindowListener(new myWindowAdapter());
  l1.setBounds(170,40,300,50);
  l3=new Label("maintain your expanses here");
  l3.setBounds(130,120,420,75);
  l3.setFont(font2);
  add(l3);
  add(l1);
  l2=new Label("please click any button from below");
  l2.setBounds(110,200,500,50);
  l2.setFont(font2);
  add(l2);
  b1=new Button("add data");
  b1.setBounds(65,300,150,60);
  add(b1);
  b1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
         tf1.setVisible(true);
         tf2.setVisible(true);
         b3.setVisible(true);
     }  
    }  );
  b2=new Button("retrive data");
  b2.setBounds(420,300,150,60);
  add(b2);
  b2.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
        b4.setVisible(true);
        b5.setVisible(true);
      }
   }  );
  setLayout(null);
  setSize(700,700);
  setVisible(true);
  tf1=new TextField("enter amount");
  tf2=new TextField("enter reason");
  tf1.setBounds(75,450,175,40);
  add(tf1);
  tf2.setBounds(75,500,175,40);
  add(tf2);
  b3=new Button("write");
  b3.setBounds(150,550,80,35);
  add(b3);
  b4=new Button("single date");
  b4.setBounds(350,440,110,40);
  add(b4);
  b4.addActionListener(new ActionListener()
 {
  public void actionPerformed(ActionEvent ae){
      tf3.setVisible(true);
     b6.setVisible(true);
  }
 }  );
  b5=new Button("date-interval");
  b5.setBounds(500,440,110,40);
  add(b5);
   b5.addActionListener(new ActionListener()
  {
    public void actionPerformed(ActionEvent ae){
     tf4.setVisible(true);
     tf5.setVisible(true);
     b7.setVisible(true);
  }   }  );
  tf3=new TextField("enter date");
  tf3.setBounds(335,500,150,30);
  add(tf3);
  tf4=new TextField("enter start date");
  tf4.setBounds(500,500,150,30);
  add(tf4);
  tf5=new TextField("enter end date");
  tf5.setBounds(500,550,150,30);
  add(tf5);
   b6=new Button("get data");
  b6.setBounds(400,550,80,35);
  add(b6);
 b7=new Button("get data");
 b7.setBounds(500,600,80,35);
 add(b7);
  tf1.setVisible(false);
  tf2.setVisible(false);
  b3.setVisible(false);
  b4.setVisible(false);
  b5.setVisible(false);
  tf3.setVisible(false);
  tf4.setVisible(false);
  tf5.setVisible(false);
  b6.setVisible(false);
  b7.setVisible(false);
 }
 public static void main(String a[])
 {
  Expanse e1=new Expanse();
 }
}
class myWindowAdapter extends WindowAdapter {
  public void windowClosing(WindowEvent we){
          System.exit(0);
 }
}


  
  