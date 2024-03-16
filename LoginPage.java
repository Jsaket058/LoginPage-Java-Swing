import javax.swing.*;
import java.awt.*;
class FDemo extends JFrame{
	FDemo(){
	setLayout(null);
	setTitle("Login Page");
    Font f=new Font("Harlow Solid Italic",Font.BOLD,50);
    
	JLabel un=new JLabel("Enter Name");
	un.setSize(350,70);
	un.setLocation(100,100);
    un.setFont(f);
    add(un);

    JTextField tx1=new JTextField(10);
	tx1.setSize(500,70);
	tx1.setLocation(450,100);
	tx1.setFont(f);
    add(tx1);  	
	
	JLabel up=new JLabel("Enter Pass");
    up.setSize(350,70);
	up.setLocation(100,200);
	up.setFont(f);
	add(up);
	
	JPasswordField tx2=new JPasswordField(10);
	tx2.setSize(500,70);
	tx2.setLocation(450,200);
	tx2.setFont(f);
	tx2.setEchoChar('?');
	add(tx2);
	
	JButton b1=new JButton("Login");
	b1.setSize(200,70);
	b1.setLocation(250,350);
	b1.setFont(f);
	add(b1);
	
	setResizable(false);
	}
} 


class LoginPage{
	public static void main(String[] args){
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(1100,500);
		f.setLocation(200,100);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}