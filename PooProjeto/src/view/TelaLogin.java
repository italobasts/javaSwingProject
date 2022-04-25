package view;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;

public class TelaLogin extends JFrame implements MouseMotionListener {
int xMouseOld = 0;
int yMouseOld = 0;
private JTextField boxLogin;
private JPasswordField boxSenha;
private JPanel painelImg;
private JPanel painelLogin;
private JLabel textLogin;
private JLabel textEntrada;
private JLabel textSenha;
private JLabel textBVindos;
private JButton btLogin;
private JLabel textBVindos2;
private JButton bSair;
private JButton bMinimizar;
private JLabel textAbout;
ImageIcon image =new ImageIcon(getClass().getResource("imgFundo.jpg"));
JLabel labelImg = new JLabel(image);


public TelaLogin()
{
	//Proprieadades do JFrame
	setLayout(null);
    setSize(1280, 720);  
    setLocationRelativeTo(null);
    setUndecorated(true);  
    addMouseMotionListener(this);
    
    labelImg.setBounds(0, 0, 1000, 720);
    
	
	//Compenentes
	Color cor1 = new Color(250,250,250);
	Color cor2 = new Color(0,0,0,0);
	Color corBt = new Color(0,103,184);
	Color corBorda = new Color(128,128,128);
	Color corHoverBt = new Color (2,76,135);
	painelImg = new JPanel();
	painelImg.setBounds(0, 0, 1030, 720);
	painelImg.setBackground(cor2);
	
	painelLogin = new JPanel();
	painelLogin.setBounds(980, 0, 300, 720);
	painelLogin.setBackground(cor1);
	
	boxLogin = new JTextField();
	boxLogin.setFont(new Font("Century_gothic",Font.BOLD, 15));
	boxLogin.setBounds(1010, 200, 250, 50);
	boxLogin.setBorder(new LineBorder(corBorda));
	boxLogin.setBorder(BorderFactory.createCompoundBorder(
	boxLogin.getBorder(), 
	BorderFactory.createEmptyBorder(0, 10, 0, 0)));
	
	boxSenha = new JPasswordField();
	boxSenha.setFont(new Font("Century_gothic",Font.BOLD, 15));
	boxSenha.setBounds(1010, 300, 250, 50);
	boxSenha.setBorder(new LineBorder(corBorda));
	boxSenha.setBorder(BorderFactory.createCompoundBorder(
	boxSenha.getBorder(), 
	BorderFactory.createEmptyBorder(0, 10, 0, 0)));
	
	textEntrada = new JLabel("Entrar");
	textEntrada.setFont(new Font("Century_gothic",Font.BOLD, 27));
	textEntrada.setBounds(1010, 75, 250, 50);
	textEntrada.setForeground(Color.black);
	
	textBVindos2 = new JLabel("Unifor");
	textBVindos2.setFont(new Font("Century_gothic",Font.BOLD, 60));
	textBVindos2.setBounds(400, 200, 500, 50);
	textBVindos2.setForeground(Color.white);
	
	textBVindos = new JLabel("Faça o Login para entrar na area administrativa!");
	textBVindos.setFont(new Font("Century_gothic",Font.BOLD, 35));
	textBVindos.setBounds(100,350, 800, 50);
	textBVindos.setForeground(Color.white);
	
	
	textLogin = new JLabel("Login:");
	textLogin.setFont(new Font("Century_gothic",Font.BOLD, 15));
	textLogin.setBounds(1010, 150, 250, 50);
	textLogin.setForeground(Color.black);
	
	
	textSenha = new JLabel("Senha:");
	textSenha.setFont(new Font("Century_gothic",Font.BOLD, 15));
	textSenha.setBounds(1010, 250, 250, 50);
	textSenha.setForeground(Color.black);
    
	
	textAbout = new JLabel("Versão: 1.0 | 2017");
	textAbout.setFont(new Font("Century_gothic",Font.BOLD, 12));
	textAbout.setBounds(1100, 670, 250, 50);
	textAbout.setForeground(Color.black);
	
    bSair = new JButton("X");
    bSair.setFont(new Font("Century_gothic",Font.BOLD, 15));
    bSair.setBounds(1230, 0, 50, 50);
    bSair.setForeground(Color.black);
    bSair.setBackground(cor1);
    bSair.setCursor(new Cursor(Cursor.HAND_CURSOR));
    bSair.setRolloverEnabled(false);
	bSair.setBorderPainted(false);
	bSair.addActionListener(new ActionListener()
   {  
       public void actionPerformed(ActionEvent ae)
       {  
      System.exit(0);  
       }
    }); 
	 	bMinimizar = new JButton("---");
	 	bMinimizar.setFont(new Font("Century_gothic",Font.BOLD, 15));
	 	bMinimizar.setBounds(1170, 0, 50, 50);
	 	bMinimizar.setForeground(Color.black);
	 	bMinimizar.setBackground(cor1);
	 	bMinimizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	 	bMinimizar.setRolloverEnabled(false);
	 	bMinimizar.setBorderPainted(false);
	 	bMinimizar.addActionListener(new ActionListener()
	   {  
	       public void actionPerformed(ActionEvent ae)
	       {  
	     setExtendedState(TelaLogin.ICONIFIED);
	       }
	    });
	 	btLogin = new JButton("Entrar");
		btLogin.setFont(new Font("Century_gothic",Font.BOLD, 15));
		btLogin.setBounds(1010, 400, 250, 50);
		btLogin.setForeground(Color.black);
		btLogin.setBackground(corBt);
		btLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btLogin.setRolloverEnabled(false);
		btLogin.setBorderPainted(false);
		btLogin.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent e) { 
		 if(boxLogin.getText().equals("admin")&&boxSenha.getText().equals("12345")) {
			JOptionPane.showMessageDialog(null, "Bem Vindo");
			new TelaPrincipal();
			dispose();
				    }
				    else {
				    	JOptionPane.showMessageDialog(null, "Dados incorretos! Tente novamente.","Alerta",JOptionPane.WARNING_MESSAGE);
				    }
				  } 
				} );
		btLogin.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
            	btLogin.setBackground(corHoverBt);
            }
            public void mouseExited(MouseEvent e) {
            	btLogin.setBackground(corBt);
            }
        });
	add(btLogin);
	add(boxLogin);
	add(textLogin);
	add(textAbout);
	add(textEntrada);
	add(boxSenha);
	add(textSenha);
	add(textBVindos);
	add(bMinimizar);
	add(bSair);
	add(textBVindos2);
	add(painelLogin);
	add(painelImg);
	add(labelImg);
    add(labelImg); 
    
    setVisible(true);  

}

@Override  
public void mouseDragged(MouseEvent p_oMouseEvent)
{  
    Point posicaoNova = new Point((p_oMouseEvent.getXOnScreen() - xMouseOld), (p_oMouseEvent.getYOnScreen() - yMouseOld));  
    setLocation(posicaoNova); 
}  

@Override  
public void mouseMoved(MouseEvent p_oMouseEvent)
{  
    xMouseOld = p_oMouseEvent.getX();    
    yMouseOld = p_oMouseEvent.getY();      
}

public static void main(String[] args)
{  
     new TelaLogin();
}
}