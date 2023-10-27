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

        //=========================================================================
        
        //painel de vendas
        JPanel vendasPanel = new JPanel();
        vendasPanel.setLayout(null);
        content.add(vendasPanel, "VENDAS_PANEL");
        
        //painel de entrada
        JPanel entradaPanel = new JPanel(null);
        entradaPanel.setPreferredSize(new Dimension(600, 400));
        content.add(entradaPanel, "ENTRADA_PANEL");
        
        //painel de promocao
        JPanel promocaoPanel = new JPanel(null);
        promocaoPanel.setPreferredSize(new Dimension(600, 400));
        content.add(promocaoPanel, "PROMOCAO_PANEL");
        
        //painel de produtos
        JPanel produtosPanel = new JPanel(null);
        produtosPanel.setPreferredSize(new Dimension(600, 400));
        content.add(produtosPanel, "PRODUTOS_PANEL");
        
        //painel de remocao de produtos
        JPanel removerProdutoPanel = new JPanel(null);
        removerProdutoPanel.setPreferredSize(new Dimension(600, 400));
        content.add(removerProdutoPanel, "REMOVER_PRODUTO_PANEL");

        //painel de clientes
        JPanel clientesPanel = new JPanel(null);
        clientesPanel.setPreferredSize(new Dimension(600, 400));
        content.add(clientesPanel, "CLIENTES_PANEL");
        
        //======================================================================
           //items
  
        // Tabela de produtos
     // Tabela de produtos
        String[] colunas = {"SKU", "Nome", "Descrição", "Preço de Custo", "Preço de Venda", "Estoque Disponível"};
        Object[][] dados = {};  // Você pode preencher esta matriz com os dados dos seus produtos
        JTable tabelaProdutos = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabelaProdutos);
        scrollPane.setBounds(10, 10, 580, 300);  // Definindo a posição e dimensão manualmente
        produtosPanel.add(scrollPane);

        // Botões de ação
        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds(10, 320, 100, 25);  // Definindo a posição e dimensão manualmente
        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(content, "ADICIONAR_PRODUTO_PANEL");
            }
        });
        produtosPanel.add(btnAdicionar);

        JButton btnEditar = new JButton("Editar");
        btnEditar.setBounds(120, 320, 100, 25);  // Definindo a posição e dimensão manualmente
        btnEditar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // ... seu código aqui ...
            }
        });
        produtosPanel.add(btnEditar);

        JButton btnRemover = new JButton("Remover");
        btnRemover.setBounds(230, 320, 100, 25);  // Definindo a posição e dimensão manualmente
        btnRemover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // ... seu código aqui ...
            }
        });
        produtosPanel.add(btnRemover);
        
      //==============================================================
        //labels do sidebar
        JLabel label_vendas = new JLabel("Vendas");
        label_vendas.setForeground(Color.WHITE);
        label_vendas.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
        label_vendas.setBounds(20, 59, 116, 37);
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
        label_entrada.setBounds(20, 107, 124, 40);
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
        label_promocoes.setBounds(20, 158, 176, 40);
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
                cardLayout.show(content, "PROMOCAO_PANEL");
            }
        });
        sidebar.add(label_promocoes);

        JLabel label_produtos = new JLabel("Produtos");
        label_produtos.setForeground(Color.WHITE);
        label_produtos.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
        label_produtos.setBounds(20, 209, 140, 54);
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
        label_clientes.setBounds(20, 268, 140, 54);
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
        
        JLabel label_telaPrincipal = new JLabel("Tela Principal");
        label_telaPrincipal.setForeground(Color.WHITE);
        label_telaPrincipal.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
        label_telaPrincipal.setBounds(10, 11, 196, 37);
        label_telaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_telaPrincipal.setBackground(highlightColor);
                label_telaPrincipal.setOpaque(true);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_telaPrincipal.setBackground(defaultColor);
                label_telaPrincipal.setOpaque(false);
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardLayout.show(content, "MAIN_PANEL");
            }
        });
        sidebar.add(label_telaPrincipal);
        
        //==============================================================
    
        frmEletronicaPikachu.getContentPane().add(content, BorderLayout.CENTER);
        cardLayout.show(content, "MAIN_PANEL");  
        frmEletronicaPikachu.setVisible(true);   
    }
}
