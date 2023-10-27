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
        
        //titulo
        JLabel titleProdutos = new JLabel("PRODUTOS");
        titleProdutos.setBounds(140, 40, 177, 36);
        titleProdutos.setFont(new Font("Arial", Font.BOLD, 30));
        produtosPanel.add(titleProdutos);
        
        //botões
        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds(140, 87, 177, 25);
        btnAdicionar.setFont(new Font("Arial", Font.BOLD, 14));
        btnAdicionar.setBackground(new Color(64, 64, 64));
        btnAdicionar.setForeground(Color.WHITE);
        btnAdicionar.setFocusPainted(false);
        btnAdicionar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame adicionarProdutoFrame = new JFrame("Adicionar Produto");
                adicionarProdutoFrame.setSize(400, 400);
                adicionarProdutoFrame.setLocationRelativeTo(null);
                adicionarProdutoFrame.getContentPane().setLayout(null);  
                
                //campos de texto
                JTextField txtSku = new JTextField();
                JTextField txtNome = new JTextField();
                JTextField txtDescricao = new JTextField();
                JTextField txtPrecoCusto = new JTextField();
                JTextField txtPrecoVenda = new JTextField();
                JTextField txtEstoqueDisponivel = new JTextField();
                JTextField txtNomeCategoria = new JTextField();
                JTextField txtNomeFornecedor = new JTextField();
                
                //labels
                JLabel lblSku = new JLabel("SKU:");
                JLabel lblNome = new JLabel("Nome:");
                JLabel lblDescricao = new JLabel("Descrição:");
                JLabel lblPrecoCusto = new JLabel("Preço de Custo:");
                JLabel lblPrecoVenda = new JLabel("Preço de Venda:");
                JLabel lblEstoqueDisponivel = new JLabel("Estoque Disponível:");
                JLabel lblNomeCategoria = new JLabel("Nome da Categoria:");
                JLabel lblNomeFornecedor = new JLabel("Nome do Fornecedor:");
                
                JButton btnSalvar = new JButton("Salvar");
                btnSalvar.setFont(new Font("Arial", Font.BOLD, 14));
                btnSalvar.setBackground(new Color(64, 64, 64));
                btnSalvar.setForeground(Color.WHITE);
                btnSalvar.setFocusPainted(false);
                btnSalvar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                btnSalvar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //implementar logica e metodo de adiconar do rodrigo
                    }
                });
                
                lblSku.setBounds(10, 10, 100, 25);
                txtSku.setBounds(120, 10, 250, 25);
                
                lblNome.setBounds(10, 45, 100, 25);
                txtNome.setBounds(120, 45, 250, 25);
                
                lblDescricao.setBounds(10, 80, 100, 25);
                txtDescricao.setBounds(120, 80, 250, 25);
                
                lblPrecoCusto.setBounds(10, 115, 100, 25);
                txtPrecoCusto.setBounds(120, 115, 250, 25);
                
                lblPrecoVenda.setBounds(10, 150, 100, 25);
                txtPrecoVenda.setBounds(120, 150, 250, 25);
                
                lblEstoqueDisponivel.setBounds(10, 185, 150, 25);
                txtEstoqueDisponivel.setBounds(170, 185, 200, 25);
                
                lblNomeCategoria.setBounds(10, 220, 150, 25);
                txtNomeCategoria.setBounds(170, 220, 200, 25);
                
                lblNomeFornecedor.setBounds(10, 255, 150, 25);
                txtNomeFornecedor.setBounds(170, 255, 200, 25);
                
                btnSalvar.setBounds(150, 300, 100, 25);
                
                adicionarProdutoFrame.getContentPane().add(lblSku);
                adicionarProdutoFrame.getContentPane().add(txtSku);
                adicionarProdutoFrame.getContentPane().add(lblNome);
                adicionarProdutoFrame.getContentPane().add(txtNome);
                adicionarProdutoFrame.getContentPane().add(lblDescricao);
                adicionarProdutoFrame.getContentPane().add(txtDescricao);
                adicionarProdutoFrame.getContentPane().add(lblPrecoCusto);
                adicionarProdutoFrame.getContentPane().add(txtPrecoCusto);
                adicionarProdutoFrame.getContentPane().add(lblPrecoVenda);
                adicionarProdutoFrame.getContentPane().add(txtPrecoVenda);
                adicionarProdutoFrame.getContentPane().add(lblEstoqueDisponivel);
                adicionarProdutoFrame.getContentPane().add(txtEstoqueDisponivel);
                adicionarProdutoFrame.getContentPane().add(lblNomeCategoria);
                adicionarProdutoFrame.getContentPane().add(txtNomeCategoria);
                adicionarProdutoFrame.getContentPane().add(lblNomeFornecedor);
                adicionarProdutoFrame.getContentPane().add(txtNomeFornecedor);
                adicionarProdutoFrame.getContentPane().add(btnSalvar);
                
                adicionarProdutoFrame.setVisible(true);
            }
        });
        produtosPanel.add(btnAdicionar);

        
        JButton btnEditar = new JButton("Editar");
        btnEditar.setBounds(140, 123, 177, 25);
        btnEditar.setFont(new Font("Arial", Font.BOLD, 14));
        btnEditar.setBackground(new Color(64, 64, 64));
        btnEditar.setForeground(Color.WHITE);
        btnEditar.setFocusPainted(false);
        btnEditar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
     
        produtosPanel.add(btnEditar);

        JButton btnRemover = new JButton("Remover");
        btnRemover.setBounds(350, 172, 100, 25);
        btnRemover.setFont(new Font("Arial", Font.BOLD, 14));
        btnRemover.setBackground(new Color(64, 64, 64));
        btnRemover.setForeground(Color.WHITE);
        btnRemover.setFocusPainted(false);
        btnRemover.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        btnRemover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame removerProdutoFrame = new JFrame("Remover Produto");
                removerProdutoFrame.setSize(300, 150);
                removerProdutoFrame.setLocationRelativeTo(null);  // Centraliza o frame
                removerProdutoFrame.getContentPane().setLayout(null);  // Define o layout como null
                
                JTextField txtSku = new JTextField();
                
                JLabel lblSku = new JLabel("SKU:");
               
                JButton btnRemoverProduto = new JButton("Remover");
                btnRemoverProduto.setFont(new Font("Arial", Font.BOLD, 14));
                btnRemoverProduto.setBackground(new Color(64, 64, 64));
                btnRemoverProduto.setForeground(Color.WHITE);
                btnRemoverProduto.setFocusPainted(false);
                btnRemoverProduto.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                btnRemoverProduto.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //codigo de remover produto do rodrigo
                    }
                });
                
                lblSku.setBounds(10, 10, 100, 25);
                txtSku.setBounds(120, 10, 150, 25);
                btnRemoverProduto.setBounds(95, 50, 100, 25);
                
                removerProdutoFrame.getContentPane().add(lblSku);
                removerProdutoFrame.getContentPane().add(txtSku);
                removerProdutoFrame.getContentPane().add(btnRemoverProduto);
                removerProdutoFrame.setVisible(true);
            }
        });
        produtosPanel.add(btnRemover);
        
      //painel de clientes
        JPanel clientesPanel = new JPanel(null);
        clientesPanel.setPreferredSize(new Dimension(600, 400));
        content.add(clientesPanel, "CLIENTES_PANEL");
        
        
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
                cardLayout.show(content, "PROMOCOES_PANEL");
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
