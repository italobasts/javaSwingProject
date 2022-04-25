package view;
import javax.swing.*;
import javax.swing.border.LineBorder;

import fornecedor.Fornecedor;
import fornecedor.TableModelFornecedor;
import cliente.Cliente;
import cliente.TableModelCliente;

import java.awt.*;
import java.awt.event.*;
public class TelaPrincipal  extends JFrame implements MouseMotionListener{
	int xMouseOld = 0;
	int yMouseOld = 0;
	private JButton bSair;
	private JButton bMinimizar;
	private JPanel painelOpcoes;
	private JPanel painelUser;
	private JPanel painelInicio;
	private JPanel painelServicos;
	private JPanel painelClientes;
	private JPanel painelFornecedores;
	private JButton bInicio;
	private JButton bServicos;
	private JButton bClientes;
	private JButton bFornecedores;
	private JButton bNovoForn;
	private JButton bDeslogar;
	private JLabel textBVindos;
	private JLabel textAtt;
	private JLabel textAtt2;
	private JLabel textAdm;
	private JLabel textAdmt;
	private JButton bNovo;
	private JButton bExcluir;
	    private JButton bSalvar;
	    private JTextField boxCod;
	    private JTextField boxCpf;
	    private JTextField boxNome;
	    private JScrollPane jScrollPane1;
	    private JTable tbl_Clientes;
	    private TableModelCliente modelCliente;
	    
	    //forn
	    private JButton bExcluirForn;
	    private JButton bSalvarForn;
	    private JTextField boxCodForn;
	    private JTextField boxCnpj;
	    private JTextField boxNomeForn;
	    private JScrollPane jScrollPane2;
	    private JTable tbl_Fornecedor;
	    private TableModelFornecedor modelFornecedor;
	    
	    private JLabel attNams;
	    private JLabel attNams2;
	    private JLabel attNams3;
	    private JLabel attNams4;
	    private JLabel attNams5;
	     
	    private JLabel codClienteL;
	    private JLabel nomeClienteL;
	    private JLabel cpfClienteL;
	    private JLabel cnpjL;
	    
	
	ImageIcon image =new ImageIcon(getClass().getResource("userImg.png"));
	JLabel labelImg = new JLabel(image);
	
	ImageIcon imageAtt =new ImageIcon(getClass().getResource("attFundo.jpg"));
	JLabel labelAtt = new JLabel(imageAtt);
	
	ImageIcon imageAtt2 =new ImageIcon(getClass().getResource("check.png"));
	JLabel labelImgAtt2 = new JLabel(imageAtt2);
   
	public TelaPrincipal() {
		//Componentes do JFrame
		initiComp();
		setLayout(null);
	    setSize(1280, 720);  
	    setLocationRelativeTo(null);
	    setUndecorated(true);  
	    addMouseMotionListener(this);
	    setVisible(true);
	    this.modelCliente = new TableModelCliente();
        this.tbl_Clientes.setModel(modelCliente);
	    //gg
        this.modelFornecedor = new TableModelFornecedor();
        this.tbl_Fornecedor.setModel(modelFornecedor);
        	
        	add(cnpjL);
        	add(codClienteL);
        	add(cpfClienteL);
        	add(nomeClienteL);
        	add(labelImgAtt2);
        	add(attNams);
        	add(attNams2);
        	add(attNams3);
        	add(attNams4);
        	add(attNams5);
        	add(bNovo);
	    	add(bNovoForn);
	    	add(textAdmt);
        	add(bSalvarForn);
        	add(bExcluirForn);
        	add(boxCodForn);
        	add(boxNomeForn);
        	add(boxCnpj);
        	add(jScrollPane2);
        	add(bSalvar);
        	add(bExcluir);
        	add(boxCod);
        	add(boxNome);
        	add(boxCpf);
        	add(jScrollPane1);
		 	add(bDeslogar);
		 	add(textAdm);
		 	add(labelImg);

		 	add(textAtt);
		 	add(textAtt2);
		 	add(textBVindos);
		 	add(labelAtt);
		 	add(bInicio);
		 	add(bServicos);
		 	add(bClientes);
		 	add(bFornecedores);
		 	add(bMinimizar);
			add(bSair);
			add(painelUser);
			add(painelOpcoes);
			add(painelFornecedores);
			add(painelClientes);
			add(painelServicos);
			add(painelInicio);
			
	}
	
	public void initiComp(){
		//
		 //cores
	    Color cor1 = new Color(218,67,54);
	    Color corBorda = new Color(128,128,128);
	    Color corText = new Color(255,255,255);
	    Color corUser = new Color(250,250,250);
		
		//
	   
	    attNams = new JLabel("Notas de Atualizacoes! V:1.0 :D ");
	    attNams.setFont(new Font("Century_gothic",Font.BOLD, 25));
	    attNams.setBounds(100,250, 800, 50);
	    attNams.setForeground(Color.black);
	    attNams.setVisible(false);
	    
	    attNams2 = new JLabel("Lançamento da versão 1.0 ");
	    attNams2.setFont(new Font("Century_gothic",Font.BOLD, 25));
	    attNams2.setBounds(100,300, 800, 50);
	    attNams2.setForeground(Color.black);
	    attNams2.setVisible(false);
	    
	    attNams3 = new JLabel("Cadastro e Exclusão de Fornecedores e clientes ok! ");
	    attNams3.setFont(new Font("Century_gothic",Font.BOLD, 25));
	    attNams3.setBounds(100,350, 800, 50);
	    attNams3.setForeground(Color.black);
	    attNams3.setVisible(false);
	    
	    attNams4 = new JLabel("Você está usando a versão mais recente do programa! ");
	    attNams4.setFont(new Font("Century_gothic",Font.BOLD, 25));
	    attNams4.setBounds(200,460, 800, 50);
	    attNams4.setForeground(Color.blue);
	    attNams4.setVisible(false);
	    
	    attNams5 = new JLabel("Relaxe avisaremos quando tivermos atualizações.");
	    attNams5.setFont(new Font("Century_gothic",Font.BOLD, 25));
	    attNams5.setBounds(100,550, 800, 50);
	    attNams5.setForeground(Color.black);
	    attNams5.setVisible(false);
	    
	    labelImgAtt2.setBounds(100,450,70,70);
	    labelImgAtt2.setVisible(false);
	    //tabela Forn
	    bNovoForn = new JButton();
	    jScrollPane2 = new JScrollPane();
        tbl_Fornecedor = new JTable();
        bSalvarForn = new JButton();
        bExcluirForn = new JButton();
        boxCodForn = new JTextField();
        boxNomeForn = new JTextField();
        boxCnpj = new JTextField();
        
	   //botao salvar
        bSalvarForn.setBounds(700, 450, 230, 50);
        bSalvarForn.setFont(new Font("Century_gothic",Font.BOLD, 15));
        bSalvarForn.setForeground(Color.black);
        bSalvarForn.setBackground(cor1);
        bSalvarForn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bSalvarForn.setRolloverEnabled(false);
        bSalvarForn.setBorderPainted(false);
        bSalvarForn.setVisible(false);
        bSalvarForn.setEnabled(false);
	      //botao excluir
        bExcluirForn.setBounds(700, 520, 230, 50);
        bExcluirForn.setVisible(false);
        bExcluirForn.setFont(new Font("Century_gothic",Font.BOLD, 15));
        bExcluirForn.setForeground(Color.black);
        bExcluirForn.setBackground(cor1);
        bExcluirForn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bExcluirForn.setRolloverEnabled(false);
        bExcluirForn.setBorderPainted(false);
        bExcluirForn.setEnabled(false);
        //botao novo
        bNovoForn.setText("Novo");
        bNovoForn.setBounds(700, 600, 230, 50);
        bNovoForn.setVisible(false);
        bNovoForn.setFont(new Font("Century_gothic",Font.BOLD, 15));
        bNovoForn.setForeground(Color.black);
        bNovoForn.setBackground(cor1);
        bNovoForn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bNovoForn.setRolloverEnabled(false);
        bNovoForn.setBorderPainted(false);
        bNovoForn.addActionListener(new ActionListener()
		   {  
		       public void actionPerformed(ActionEvent ae)
		       {   boxCodForn.setEditable(true);
		    	   boxCnpj.setEditable(true);
		    	   boxNomeForn.setEditable(true);
		    	   bSalvarForn.setEnabled(true);
		    	   bExcluirForn.setEnabled(true);
		    	   
		    	   boxNomeForn.setText("");
		    	   boxCodForn.setText("");
		    	   boxCnpj.setText("");
		    	   
		       }
		    }); 
        
        //boxnome
        boxNomeForn.setBounds(700, 250, 230, 50);
        boxNomeForn.setVisible(false);
        boxNomeForn.setEditable(false);
        boxNomeForn.setFont(new Font("Century_gothic",Font.BOLD, 15));
        boxNomeForn.setBorder(new LineBorder(cor1));
        boxNomeForn.setBorder(BorderFactory.createCompoundBorder(
        		boxNomeForn.getBorder(), 
    	BorderFactory.createEmptyBorder(0, 10, 0, 0)));
      //boxcpf
        boxCnpj.setBounds(700, 350, 230, 50);
        boxCnpj.setVisible(false);
        boxCnpj.setEditable(false);
        boxCnpj.setFont(new Font("Century_gothic",Font.BOLD, 15));
        boxCnpj.setBorder(new LineBorder(cor1));
        boxCnpj.setBorder(BorderFactory.createCompoundBorder(
        		boxCnpj.getBorder(), 
    	BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        //boxcodigo
        boxCodForn.setBounds(700, 150, 230, 50);
        boxCodForn.setVisible(false);
        boxCodForn.setEditable(false);
        boxCodForn.setFont(new Font("Century_gothic",Font.BOLD, 15));
        boxCodForn.setBorder(new LineBorder(cor1));
        boxCodForn.setBorder(BorderFactory.createCompoundBorder(
        		boxCodForn.getBorder(), 
    	BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        
        jScrollPane2.setBounds(75, 150, 600, 500);
        jScrollPane2.setVisible(false);
        tbl_Fornecedor.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null}
                },
                new String [] {
                    "codigo", "nome", "cpf"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
                };
                boolean[] canEdit = new boolean [] {
                    true, true, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
        	tbl_Fornecedor.setGridColor(Color.WHITE);
        	tbl_Fornecedor.setForeground(Color.black);
            jScrollPane2.setViewportView(tbl_Fornecedor);

            bSalvarForn.setText("Salvar");
            bSalvarForn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                	bSalvarFornActionPerformed(evt);
                }
            });
            bSalvarForn.addActionListener(new ActionListener()
 		   {  
 		       public void actionPerformed(ActionEvent ae)
 		       {   boxCodForn.setEditable(false);
 		    	   boxCnpj.setEditable(false);
 		    	   boxNomeForn.setEditable(false);
 		    	   bSalvarForn.setEnabled(false);
 		    	  
 		    	   
 		       }
 		    }); 

          

            bExcluirForn.setText("remover");
            bExcluirForn.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                	bExcluirFornActionPerformed(evt);
                }
            });
            

	    //TabelaFornecedor
        

		 jScrollPane1 = new JScrollPane();
	     tbl_Clientes = new JTable();
	     bSalvar = new JButton();
	     bExcluir = new JButton();
	     boxCod = new JTextField();
	     boxNome = new JTextField();
	     boxCpf = new JTextField();
	   //botao salvar
	        bSalvar.setBounds(700, 450, 230, 50);
	        bSalvar.setFont(new Font("Century_gothic",Font.BOLD, 15));
	        bSalvar.setForeground(Color.black);
	        bSalvar.setBackground(cor1);
	        bSalvar.setCursor(new Cursor(Cursor.HAND_CURSOR));
	        bSalvar.setRolloverEnabled(false);
	        bSalvar.setBorderPainted(false);
	        bSalvar.setVisible(false);
	    
	      //botao excluir
	        bExcluir.setBounds(700, 520, 230, 50);
	        bExcluir.setVisible(false);
	        bExcluir.setFont(new Font("Century_gothic",Font.BOLD, 15));
	        bExcluir.setForeground(Color.black);
	        bExcluir.setBackground(cor1);
	        bExcluir.setCursor(new Cursor(Cursor.HAND_CURSOR));
	        bExcluir.setRolloverEnabled(false);
	        bExcluir.setBorderPainted(false);
	        
	        bNovo = new JButton();
	        bNovo.setText("Novo");
	        bNovo.setBounds(700, 600, 230, 50);
	        bNovo.setVisible(false);
	        bNovo.setFont(new Font("Century_gothic",Font.BOLD, 15));
	        bNovo.setForeground(Color.black);
	        bNovo.setBackground(cor1);
	        bNovo.setCursor(new Cursor(Cursor.HAND_CURSOR));
	        bNovo.setRolloverEnabled(false);
	        bNovo.setBorderPainted(false);
	        bNovo.addActionListener(new ActionListener()
			   {  
			       public void actionPerformed(ActionEvent ae)
			       {   boxCod.setEditable(true);
			    	   boxCpf.setEditable(true);
			    	   boxNome.setEditable(true);
			    	   bSalvar.setEnabled(true);
			    	   bExcluir.setEnabled(true);
			    	   
			    	   boxNome.setText("");
			    	   boxCod.setText("");
			    	   boxCpf.setText("");
			       }
			    }); 
       
       //boxnome
       boxNome.setBounds(700, 250, 230, 50);
       boxNome.setVisible(false);
       boxNome.setEditable(false);
       boxNome.setFont(new Font("Century_gothic",Font.BOLD, 15));
       boxNome.setBorder(new LineBorder(cor1));
       boxNome.setBorder(BorderFactory.createCompoundBorder(
       boxNome.getBorder(), 
   	BorderFactory.createEmptyBorder(0, 10, 0, 0)));
       
       nomeClienteL = new JLabel("Nome:");
       nomeClienteL.setBounds(700,220,200,30);
       nomeClienteL.setForeground(cor1);
       nomeClienteL.setFont(new Font("Century_gothic",Font.BOLD, 15));
       nomeClienteL.setVisible(false);
     //boxcpf
       boxCpf.setBounds(700, 350, 230, 50);
       boxCpf.setVisible(false);
       boxCpf.setEditable(false);
       boxCpf.setFont(new Font("Century_gothic",Font.BOLD, 15));
       boxCpf.setBorder(new LineBorder(cor1));
       boxCpf.setBorder(BorderFactory.createCompoundBorder(
       boxCpf.getBorder(), 
   	BorderFactory.createEmptyBorder(0, 10, 0, 0)));
       
       cpfClienteL = new JLabel("Cpf:");
       cpfClienteL.setBounds(700,320,200,30);
       cpfClienteL.setForeground(cor1);
       cpfClienteL.setFont(new Font("Century_gothic",Font.BOLD, 15));
       cpfClienteL.setVisible(false);
       //boxcodigo
       boxCod.setBounds(700, 150, 230, 50);
       boxCod.setVisible(false);
       boxCod.setEditable(false);
       boxCod.setFont(new Font("Century_gothic",Font.BOLD, 15));
       boxCod.setBorder(new LineBorder(cor1));
       boxCod.setBorder(BorderFactory.createCompoundBorder(
       boxCod.getBorder(), 
   	BorderFactory.createEmptyBorder(0, 10, 0, 0)));
       
       codClienteL = new JLabel("Codigo:");
       codClienteL.setBounds(700,120,200,30);
       codClienteL.setForeground(cor1);
       codClienteL.setFont(new Font("Century_gothic",Font.BOLD, 15));
       codClienteL.setVisible(false);
       
       
       //cnpj
       cnpjL = new JLabel("Cnpj:");
       cnpjL.setBounds(700,320,200,30);
       cnpjL.setForeground(cor1);
       cnpjL.setFont(new Font("Century_gothic",Font.BOLD, 15));
       cnpjL.setVisible(false);

       //TABLE
       jScrollPane1.setBounds(75, 150, 600, 500);
       jScrollPane1.setVisible(false);
       
       tbl_Clientes.setModel(new javax.swing.table.DefaultTableModel(
           new Object [][] {
               {null, null, null},
               {null, null, null},
               {null, null, null},
               {null, null, null}
           },
           new String [] {
               "codigo", "nome", "cpf"
           }
       ) {
           Class[] types = new Class [] {
               java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
           };
           boolean[] canEdit = new boolean [] {
               true, true, false
           };

           public Class getColumnClass(int columnIndex) {
               return types [columnIndex];
           }

           public boolean isCellEditable(int rowIndex, int columnIndex) {
               return canEdit [columnIndex];
           }
       });
       jScrollPane1.setViewportView(tbl_Clientes);

       bSalvar.setText("Salvar");
       bSalvar.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               bSalvarActionPerformed(evt);
           }
       });
       bSalvar.setEnabled(false);
       bSalvar.addActionListener(new ActionListener()
		   {  
		       public void actionPerformed(ActionEvent ae)
		       {   boxCod.setEditable(false);
		    	   boxCpf.setEditable(false);
		    	   boxNome.setEditable(false);
		    	   bSalvar.setEnabled(false);
		    	  
		    	   
		       }
		    }); 
       
       bExcluir.setText("remover");
       bExcluir.setEnabled(false);
       bExcluir.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               bExcluirActionPerformed(evt);
           }
       });

	    
		
		//JPanels
	    painelOpcoes = new JPanel();
		painelOpcoes.setBounds(0, 0, 1280, 80);
		painelOpcoes.setBackground(cor1);
		
		painelUser = new JPanel();
		painelUser.setBounds(980, 80, 300, 640);
		painelUser.setBackground(corUser);
		//img user
		labelImg.setBounds(1070, 200, 128, 128);
		
		labelAtt.setBounds(0, 80, 980, 640);
		
		painelInicio = new JPanel();
		painelInicio.setBounds(0, 80, 1030, 640);
		painelInicio.setBackground(Color.white);
		
		painelServicos = new JPanel();
		painelServicos.setBounds(0, 80, 1030, 640);
		painelServicos.setBackground(Color.white);
		painelServicos.setVisible(false);
		
		painelClientes = new JPanel();
		painelClientes.setBounds(0, 80, 1030, 640);
		painelClientes.setBackground(Color.white);
		painelClientes.setVisible(false);
		
		painelFornecedores = new JPanel();
		painelFornecedores.setBounds(0, 80, 1030, 640);
		painelFornecedores.setBackground(Color.white);
		painelFornecedores.setVisible(false);
		
		
		//Labels
		
		textAdmt = new JLabel("Administrador");
		textAdmt.setFont(new Font("Century_gothic",Font.BOLD, 25));
		textAdmt.setBounds(1050,350, 800, 50);
		textAdmt.setForeground(Color.black);
		
		textBVindos = new JLabel("Bem vindo!");
		textBVindos.setFont(new Font("Century_gothic",Font.BOLD, 35));
		textBVindos.setBounds(100,200, 800, 50);
		textBVindos.setForeground(Color.WHITE);
		
		textAtt = new JLabel("Estamos trabalhando constatimente em atualizações!");
		textAtt.setFont(new Font("Century_gothic",Font.BOLD, 25));
		textAtt.setBounds(100,350, 800, 50);
		textAtt.setForeground(Color.WHITE);
		
		textAtt2 = new JLabel("Clique aqui para visualizar as notas da ultima atualização. :D");
		textAtt2.setFont(new Font("Century_gothic",Font.BOLD, 25));
		textAtt2.setBounds(100,400, 800, 50);
		textAtt2.setForeground(Color.WHITE);
		
		textAdm = new JLabel("Painel Administrador");
		textAdm.setFont(new Font("Century_gothic",Font.BOLD, 25));
		textAdm.setBounds(1000,100, 800, 50);
		textAdm.setForeground(Color.black);
		
		// botoes
		// botao inicio
		bDeslogar = new JButton("Deslogar");
		bDeslogar.setFont(new Font("Century_gothic",Font.BOLD, 15));
		bDeslogar.setBounds(1010, 600, 250, 50);
		bDeslogar.setForeground(Color.black);
		bDeslogar.setBackground(cor1);
		bDeslogar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bDeslogar.setRolloverEnabled(false);
		bDeslogar.setBorderPainted(false);
		bDeslogar.addActionListener(new ActionListener()
		   {  
		       public void actionPerformed(ActionEvent ae)
		       {  
		    	   new TelaLogin();
		    	   dispose();
		       }
		    }); 
		
		
		
		bInicio = new JButton("Inicio");
		bInicio.setFont(new Font("Century_gothic",Font.BOLD, 15));
		bInicio.setBounds(200, 20, 100, 40);
		bInicio.setForeground(corText);
		bInicio.setBackground(cor1);
		bInicio.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bInicio.setRolloverEnabled(false);
		bInicio.setBorderPainted(false);
		bInicio.addActionListener(new ActionListener()
		   {  
		       public void actionPerformed(ActionEvent ae)
		       {  
		    	   painelInicio.setVisible(true);
		    	   painelServicos.setVisible(false);
		    	   painelClientes.setVisible(false);
		    	   painelFornecedores.setVisible(false);
		    	   textBVindos.setVisible(true);
		    	   textAtt.setVisible(true);
		    	   textAtt2.setVisible(true);
		    	   attNams.setVisible(false);
		    	   attNams2.setVisible(false);
		    	   attNams3.setVisible(false);
		    	   attNams4.setVisible(false);
		    	   attNams5.setVisible(false);
		    	   labelImgAtt2.setVisible(false);
		    	   //cliente
		    	   bSalvar.setVisible(false);
		           bExcluir.setVisible(false);
		           boxNome.setVisible(false);
		           boxCpf.setVisible(false);
		           boxCod.setVisible(false);
		           jScrollPane1.setVisible(false);
		    	   labelAtt.setVisible(true);
		    	   bNovo.setVisible(false);
		    	   
		           
		           nomeClienteL.setVisible(false);
		           cpfClienteL.setVisible(false);
		           codClienteL.setVisible(false);
		    	   //forn
		    	   boxCodForn.setVisible(false);
		    	   boxNomeForn.setVisible(false);
		    	   boxCnpj.setVisible(false);
		    	   bSalvarForn.setVisible(false);
		    	   jScrollPane2.setVisible(false);
		           bExcluirForn.setVisible(false);
		    	   bNovoForn.setVisible(false);
		    	   cnpjL.setVisible(false);
		       }
		    }); 
		
		// botao servicos
		bServicos = new JButton("Atualizações");
		bServicos.setFont(new Font("Century_gothic",Font.BOLD, 15));
		bServicos.setBounds(350, 20, 200, 40);
		bServicos.setForeground(corText);
		bServicos.setBackground(cor1);
		bServicos.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bServicos.setRolloverEnabled(false);
		bServicos.setBorderPainted(false);
		bServicos.addActionListener(new ActionListener()
		   {  
		       public void actionPerformed(ActionEvent ae)
		       {  
		    	   painelInicio.setVisible(false);
		    	   painelServicos.setVisible(true);
		    	   painelClientes.setVisible(false);
		    	   painelFornecedores.setVisible(false);
		    	   textBVindos.setVisible(false);
		    	   textAtt.setVisible(false);
		    	   textAtt2.setVisible(false);
		    	   labelAtt.setVisible(false);
		    	   attNams.setVisible(true);
		    	   attNams2.setVisible(true);
		    	   attNams3.setVisible(true);
		    	   attNams4.setVisible(true);
		    	   attNams5.setVisible(true);
		    	   labelImgAtt2.setVisible(true);
		    	   //cliente
		           
		           nomeClienteL.setVisible(false);
		           cpfClienteL.setVisible(false);
		           codClienteL.setVisible(false);
		    	   bSalvar.setVisible(false);
		           bExcluir.setVisible(false);
		           boxNome.setVisible(false);
		           boxCpf.setVisible(false);
		           boxCod.setVisible(false);
		           jScrollPane1.setVisible(false);
		           bNovo.setVisible(false);
		    	   //forn
		           bSalvarForn.setVisible(false);
		           bExcluirForn.setVisible(false);
		           boxNomeForn.setVisible(false);
		           boxCnpj.setVisible(false);
		           boxCodForn.setVisible(false);
		           jScrollPane2.setVisible(false);
		           bNovoForn.setVisible(false);
		           cnpjL.setVisible(false);
		       }
		    }); 
		
		// botao clientes
		bClientes = new JButton("Clientes");
		bClientes.setFont(new Font("Century_gothic",Font.BOLD, 15));
		bClientes.setBounds(550, 20, 150, 40);
		bClientes.setForeground(corText);
		bClientes.setBackground(cor1);
		bClientes.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bClientes.setRolloverEnabled(false);
		bClientes.setBorderPainted(false);
		bClientes.addActionListener(new ActionListener()
		   {  
		       public void actionPerformed(ActionEvent ae)
		       {  
		    	   painelInicio.setVisible(false);
		    	   painelServicos.setVisible(false);
		    	   painelClientes.setVisible(true);
		    	   painelFornecedores.setVisible(false);
		    	   textBVindos.setVisible(false);
		    	   textAtt.setVisible(false);
		    	   labelAtt.setVisible(false);
		    	   textAtt2.setVisible(false);
		    	   attNams.setVisible(false);
		    	   attNams2.setVisible(false);
		    	   attNams3.setVisible(false);
		    	   attNams4.setVisible(false);
		    	   attNams5.setVisible(false);
		    	   labelImgAtt2.setVisible(false);
		    	   //cliente
		    	   bNovo.setVisible(true);
		    	   bSalvar.setVisible(true);
		           bExcluir.setVisible(true);
		           boxNome.setVisible(true);
		           boxCpf.setVisible(true);
		           boxCod.setVisible(true);
		           jScrollPane1.setVisible(true);
		           
		           nomeClienteL.setVisible(true);
		           cpfClienteL.setVisible(true);
		           codClienteL.setVisible(true);
		    	   //forn
		           bSalvarForn.setVisible(false);
		           bExcluirForn.setVisible(false);
		           boxNomeForn.setVisible(false);
		           boxCnpj.setVisible(false);
		           boxCodForn.setVisible(false);
		           jScrollPane2.setVisible(false);
		           bNovoForn.setVisible(false);
		           cnpjL.setVisible(false);
		       }
		    }); 
		
		// botao fornecedores
		bFornecedores = new JButton("Fornecedores");
		bFornecedores.setFont(new Font("Century_gothic",Font.BOLD, 15));
		bFornecedores.setBounds(700, 20, 200, 40);
		bFornecedores.setForeground(corText);
		bFornecedores.setBackground(cor1);
		bFornecedores.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bFornecedores.setRolloverEnabled(false);
		bFornecedores.setBorderPainted(false);
		bFornecedores.addActionListener(new ActionListener()
		   {  
		       public void actionPerformed(ActionEvent ae)
		       {  
		    	   painelInicio.setVisible(false);
		    	   painelServicos.setVisible(false);
		    	   painelClientes.setVisible(false);
		    	   painelFornecedores.setVisible(true);
		    	   textBVindos.setVisible(false);
		    	   textAtt.setVisible(false);
		    	   textAtt2.setVisible(false);
		    	   labelAtt.setVisible(false);
		    	   attNams.setVisible(false);
		    	   attNams2.setVisible(false);
		    	   attNams3.setVisible(false);
		    	   attNams4.setVisible(false);
		    	   attNams5.setVisible(false);
		    	   labelImgAtt2.setVisible(false);
		    	   //cliente
		    	   bSalvar.setVisible(false);
		           bExcluir.setVisible(false);
		           boxNome.setVisible(false);
		           boxCpf.setVisible(false);
		           boxCod.setVisible(false);
		           jScrollPane1.setVisible(false);
		           bNovo.setVisible(false);
		    	   //forn
		           bSalvarForn.setVisible(true);
		           bExcluirForn.setVisible(true);
		           boxNomeForn.setVisible(true);
		           boxCnpj.setVisible(true);
		           boxCodForn.setVisible(true);
		           jScrollPane2.setVisible(true);
		           bNovoForn.setVisible(true);
		           cnpjL.setVisible(true);
		           nomeClienteL.setVisible(true);
		           cpfClienteL.setVisible(false);
		           codClienteL.setVisible(true);
		       }
		    }); 
		
		
		
		
		//botao sair
	    bSair = new JButton("X");
	    bSair.setFont(new Font("Century_gothic",Font.BOLD, 15));
	    bSair.setBounds(1230, 0, 50, 50);
	    bSair.setForeground(corText);
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
		 bMinimizar.setForeground(corText);
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
		
	}
	
    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String codigo = this.boxCod.getText();
        String nome = this.boxNome.getText();
        String cpf = this.boxCpf.getText();
        
        Cliente c = new Cliente(codigo,nome,cpf);
        this.modelCliente.adicionarCliente(c);
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com Sucesso!");
    }                                       

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	int resposta;
    	resposta = JOptionPane.showConfirmDialog(null, "Tem Certeza que deseja remover este cliente?");
    	if(resposta == JOptionPane.YES_OPTION) {
    		int linhaSelecionada = this.tbl_Clientes.getSelectedRow();
    	       this.modelCliente.removerCliente(linhaSelecionada);
    	       JOptionPane.showMessageDialog(null, "Cliente Removido");
    		
    	}else {
    		JOptionPane.showMessageDialog(null, "Operação cancelada");
    	}
    }                                        

    private void bSalvarFornActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String codigo = this.boxCodForn.getText();
        String nome = this.boxNomeForn.getText();
        String cnpj = this.boxCnpj.getText();
        
        Fornecedor f = new Fornecedor(codigo,nome,cnpj);
        this.modelFornecedor.adicionarFornecedor(f);
        JOptionPane.showMessageDialog(null, "Novo Fornecedor Cadastrado!");
    }                                       

    private void bExcluirFornActionPerformed(java.awt.event.ActionEvent evt) {                                         
       int resposta;
   	resposta = JOptionPane.showConfirmDialog(null, "Tem Certeza que deseja remover este Fornecedor?");
   	if(resposta == JOptionPane.YES_OPTION) {
   		int linhaSelecionada = this.tbl_Fornecedor.getSelectedRow();
        this.modelFornecedor.removerFornecedor(linhaSelecionada);
        JOptionPane.showMessageDialog(null, "Fornecedor Removido");
   		
   	}else {
   		JOptionPane.showMessageDialog(null, "Operação cancelada");
   	}
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
	
	public static void main(String[] args) {
		new TelaPrincipal();

	}

}