package AplicativoEletronica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplicativoEletronica {

    public static void main(String[] args) {
        JFrame frmEletronicaPikachu = new JFrame("Eletronica Pikachu");
        frmEletronicaPikachu.setTitle("Eletronica Pikachu");
        frmEletronicaPikachu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmEletronicaPikachu.setSize(800, 400);
        
        Color defaultColor = Color.DARK_GRAY;
        Color highlightColor = Color.GRAY;

        JPanel sidebar = new JPanel(null);
        sidebar.setPreferredSize(new Dimension(206, 400));
        sidebar.setBackground(Color.DARK_GRAY);

        JPanel content = new JPanel();
        CardLayout cardLayout = new CardLayout();
        content.setLayout(cardLayout);

       //tela inicial
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        
        JLabel notification = new JLabel("Notificação: Estoque baixo em alguns produtos.");
        notification.setBounds(41, 46, 300, 25);
        mainPanel.add(notification);

        JPanel panel = new JPanel(null);
        panel.setBorder(BorderFactory.createTitledBorder("Painel de Resumo"));
        panel.setBounds(24, 106, 350, 100);
        mainPanel.add(panel);

        JLabel vendas = new JLabel("Vendas Hoje: R$ 2.000");
        vendas.setBounds(10, 20, 200, 25);
        panel.add(vendas);

        JLabel itens = new JLabel("Itens em Falta: 5");
        itens.setBounds(10, 50, 150, 25);
        panel.add(itens);
        
        content.add(mainPanel, "MAIN_PANEL");

        
        //painel de vendas
        JPanel vendasPanel = new JPanel();
        vendasPanel.setLayout(null);
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(450, 300, 100, 30);
        btnVoltar.addActionListener(e -> {
            cardLayout.show(content, "MAIN_PANEL");
        });
        vendasPanel.add(btnVoltar);
        content.add(vendasPanel, "VENDAS_PANEL");
        
        //painel de entrada
        JPanel entradaPanel = new JPanel(null);
        entradaPanel.setPreferredSize(new Dimension(600, 400));
        JButton btnVoltarEntrada = new JButton("Voltar");
        btnVoltarEntrada.setBounds(450, 300, 100, 30);
        btnVoltarEntrada.addActionListener(e -> {
            cardLayout.show(content, "MAIN_PANEL");
        });
        entradaPanel.add(btnVoltarEntrada);
        content.add(entradaPanel, "ENTRADA_PANEL");
        
        //painel de promocao
        JPanel promocaoPanel = new JPanel(null);
        promocaoPanel.setPreferredSize(new Dimension(600, 400));
        JButton btnVoltarPromocao = new JButton("Voltar");
        btnVoltarPromocao.setBounds(450, 300, 100, 30);
        btnVoltarPromocao.addActionListener(e -> {
            cardLayout.show(content, "MAIN_PANEL");
        });
        promocaoPanel.add(btnVoltarPromocao);
        content.add(promocaoPanel, "PROMOCAO_PANEL");
        
        //painel de produtos
        JPanel produtosPanel = new JPanel(null);
        produtosPanel.setPreferredSize(new Dimension(600, 400));
        JButton btnVoltarProdutos = new JButton("Voltar");
        btnVoltarProdutos.setBounds(450, 300, 100, 30);
        btnVoltarProdutos.addActionListener(e -> {
            cardLayout.show(content, "MAIN_PANEL");
        });
        produtosPanel.add(btnVoltarProdutos);
        content.add(produtosPanel, "PRODUTOS_PANEL");
        
        //campos de texto
        JTextField txtNome = new JTextField();
        txtNome.setBounds(140, 100, 200, 25);
        produtosPanel.add(txtNome);

        JTextField txtDescricao = new JTextField();
        txtDescricao.setBounds(140, 136, 200, 25);
        produtosPanel.add(txtDescricao);

        JTextField txtPreco = new JTextField();
        txtPreco.setBounds(140, 172, 200, 25);
        produtosPanel.add(txtPreco);

        //botões
        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds(350, 100, 100, 25);
        btnAdicionar.addActionListener(e -> adicionarProduto());
        produtosPanel.add(btnAdicionar);

        JButton btnEditar = new JButton("Editar");
        btnEditar.setBounds(420, 45, 100, 25);
        btnEditar.addActionListener(e -> editarProduto());
        produtosPanel.add(btnEditar);

        JButton btnRemover = new JButton("Remover");
        btnRemover.setBounds(350, 136, 100, 25);
        btnRemover.addActionListener(e -> removerProduto());
        produtosPanel.add(btnRemover);
        
      //painel de clientes
        JPanel clientesPanel = new JPanel(null);
        clientesPanel.setPreferredSize(new Dimension(600, 400));
        JButton btnVoltarClientes = new JButton("Voltar");
        btnVoltarClientes.setBounds(450, 300, 100, 30);
        btnVoltarClientes.addActionListener(e -> {
            cardLayout.show(content, "MAIN_PANEL");
        });
        clientesPanel.add(btnVoltarClientes);
        content.add(clientesPanel, "CLIENTES_PANEL");
        
        
        //labels do sidebar
        JLabel label_vendas = new JLabel("Vendas");
        label_vendas.setForeground(Color.WHITE);
        label_vendas.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
        label_vendas.setBounds(20, 20, 116, 37);
        label_vendas.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_vendas.setBackground(highlightColor);
                label_vendas.setOpaque(true);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_vendas.setBackground(defaultColor);
                label_vendas.setOpaque(false);
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardLayout.show(content, "VENDAS_PANEL");
            }
        });
        sidebar.add(label_vendas);

        JLabel label_entrada = new JLabel("Entrada");
        label_entrada.setForeground(Color.WHITE);
        label_entrada.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
        label_entrada.setBounds(20, 70, 124, 40);
        label_entrada.addMouseListener(new java.awt.event.MouseAdapter() {
        	@Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_entrada.setBackground(highlightColor);
                label_entrada.setOpaque(true);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_entrada.setBackground(defaultColor);
                label_entrada.setOpaque(false);
            }
        	
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardLayout.show(content, "ENTRADA_PANEL");
            }
        });
        sidebar.add(label_entrada);

        JLabel label_promocoes = new JLabel("Promoções ");
        label_promocoes.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
        label_promocoes.setForeground(Color.WHITE);
        label_promocoes.setBounds(20, 120, 176, 54);
        label_promocoes.addMouseListener(new java.awt.event.MouseAdapter() {
        	@Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_promocoes.setBackground(highlightColor);
                label_promocoes.setOpaque(true);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_promocoes.setBackground(defaultColor);
                label_promocoes.setOpaque(false);
            }
        	
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardLayout.show(content, "ENTRADA_PANEL");
            }
        });
        sidebar.add(label_promocoes);

        JLabel label_produtos = new JLabel("Produtos");
        label_produtos.setForeground(Color.WHITE);
        label_produtos.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
        label_produtos.setBounds(20, 170, 140, 54);
        label_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
        	@Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_produtos.setBackground(highlightColor);
                label_produtos.setOpaque(true);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_produtos.setBackground(defaultColor);
                label_produtos.setOpaque(false);
            }
        	
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardLayout.show(content, "PRODUTOS_PANEL");
            }
        });
        sidebar.add(label_produtos);

        JLabel label_clientes = new JLabel("Clientes");
        label_clientes.setForeground(Color.WHITE);
        label_clientes.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
        label_clientes.setBounds(20, 220, 140, 54);
        label_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_clientes.setBackground(highlightColor);
                label_clientes.setOpaque(true);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_clientes.setBackground(defaultColor);
                label_clientes.setOpaque(false);
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardLayout.show(content, "CLIENTES_PANEL");
            }
        });
        sidebar.add(label_clientes);

        frmEletronicaPikachu.getContentPane().add(sidebar, BorderLayout.WEST);
        frmEletronicaPikachu.getContentPane().add(content, BorderLayout.CENTER);
        cardLayout.show(content, "MAIN_PANEL");  

        frmEletronicaPikachu.setVisible(true);
    }

	

	private static void adicionarProduto() {
		return;
	}
	
	private static void removerProduto() {
		return;
	}

	private static void editarProduto() {
		return;
	}
}
