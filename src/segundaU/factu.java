package segundaU;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class factu extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    public static void main(String[] args) {
        factu frame = new factu();
        frame.setVisible(true);
    }

    public factu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 600);
        setTitle("Factura en Java");

        // Definir el color turquesa utilizando RGB
        Color turquesa = new Color(10, 146, 219);

        // Crear el JPanel principal para los datos del cliente
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.WHITE);

        // Panel azul con el título anterior
        JPanel titlePanel = new JPanel(null);
        titlePanel.setBounds(30, 0, 630, 50);
        titlePanel.setBackground(turquesa); // Color azul turquesa
        mainPanel.add(titlePanel);

        // Etiqueta con el título
        JLabel titleLabel = new JLabel("<html><div style='text-align: center; color: white;'>Factura en Java - NetBeans - ArrayList y POO<br>[Sin base de datos]");
        titleLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 17));
        titleLabel.setBounds(40, 11, 580, 30);
        titlePanel.add(titleLabel);

        // Panel de Datos de Cliente
        JPanel clientePanel = new JPanel(null);
        clientePanel.setToolTipText("Datos de cliente");
        clientePanel.setBounds(50, 57, 600, 85);
        clientePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Agrega un borde negro alrededor del panel

        // Agregar etiquetas y campos de texto para los datos del cliente
        JLabel documentoLabel = new JLabel("Documento:");
        documentoLabel.setBounds(65, 11, 100, 20);
        clientePanel.add(documentoLabel);

        JTextField documentoField = new JTextField();
        documentoField.setBounds(138, 11, 150, 20);
        clientePanel.add(documentoField);

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(340, 11, 100, 20);
        clientePanel.add(nombreLabel);

        JTextField nombreField = new JTextField();
        nombreField.setBounds(399, 11, 150, 20);
        clientePanel.add(nombreField);

        JLabel calleLabel = new JLabel("Dirección:");
        calleLabel.setBounds(65, 42, 100, 20);
        clientePanel.add(calleLabel);

        JTextField calleField = new JTextField();
        calleField.setBounds(399, 42, 150, 20);
        clientePanel.add(calleField);

        JLabel telefonoLabel = new JLabel("Teléfono:");
        telefonoLabel.setBounds(340, 42, 100, 20);
        clientePanel.add(telefonoLabel);

        JTextField telefonoField = new JTextField();
        telefonoField.setBounds(138, 42, 150, 20);
        clientePanel.add(telefonoField);

        // Agregar el panel de Datos de Cliente al panel principal
        mainPanel.add(clientePanel);

        // Panel de Datos de Factura
        JPanel facturaPanel = new JPanel(null);
        facturaPanel.setBounds(50, 147, 600, 56);
        facturaPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Agrega un borde negro alrededor del panel

        JLabel lblDatosDeFactura = new JLabel("Datos de Factura");
        lblDatosDeFactura.setBounds(0, 0, 150, 20);
        facturaPanel.add(lblDatosDeFactura);

        JLabel lblNumFactura = new JLabel("Número de Factura:");
        lblNumFactura.setBounds(0, 28, 120, 20);
        facturaPanel.add(lblNumFactura);

        textField = new JTextField();
        textField.setBounds(109, 28, 150, 20);
        facturaPanel.add(textField);

        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(297, 28, 100, 20);
        facturaPanel.add(lblFecha);

        textField_1 = new JTextField();
        textField_1.setBounds(344, 28, 150, 20);
        facturaPanel.add(textField_1);

        // Agregar el panel de Datos de Factura al panel principal
        mainPanel.add(facturaPanel);

        // Panel de Ver lista de facturas
        JPanel listaFacturasPanel = new JPanel(null);
        listaFacturasPanel.setBounds(50, 206, 600, 117);
        listaFacturasPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Agrega un borde negro alrededor del panel

        JLabel lblVerListaFacturas = new JLabel("Ver lista de facturas");
        lblVerListaFacturas.setBounds(10, 10, 150, 20);
        listaFacturasPanel.add(lblVerListaFacturas);

        // Crear la tabla para mostrar los datos de las facturas
        String[] columnNames = {"Producto", "Cantidad", "Valor", "Subtotal"};
        Object[][] data = {{"Producto 1", 1, 10.00, 10.00}, {"Producto 2", 2, 20.00, 40.00}, {"Producto 3", 3, 30.00, 90.00}};
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 40, 580, 70);
        listaFacturasPanel.add(scrollPane);

        // Agregar el panel de Lista de Facturas al panel principal
        mainPanel.add(listaFacturasPanel);
        
        JButton btnNewButton = new JButton("+");
        btnNewButton.setBackground(new Color(128, 255, 0));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton.setFont(new Font("Serif", Font.BOLD, 24));
        btnNewButton.setBounds(292, 8, 53, 22);
        listaFacturasPanel.add(btnNewButton);
        
        JButton btnNewButton_2 = new JButton("-");
        btnNewButton_2.setBackground(new Color(255, 0, 0));
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_2.setFont(new Font("Serif", Font.BOLD, 24));
        btnNewButton_2.setBounds(426, 8, 47, 22);
        listaFacturasPanel.add(btnNewButton_2);
        
        JLabel lblAadirProducto = new JLabel("Añadir producto");
        lblAadirProducto.setBounds(345, 10, 150, 20);
        listaFacturasPanel.add(lblAadirProducto);
        
        JLabel lblQuitarProdcuto = new JLabel("Quitar producto");
        lblQuitarProdcuto.setBounds(473, 10, 150, 20);
        listaFacturasPanel.add(lblQuitarProdcuto);

        // Agregar el panel principal al JFrame
        getContentPane().add(mainPanel);
        
        JLabel lblSubtotal = new JLabel("Subtotal: $140.00");
        lblSubtotal.setBounds(60, 334, 150, 20);
        mainPanel.add(lblSubtotal);
        
        JLabel lblDatosDeFactura_1_1 = new JLabel("Descuento: %");
        lblDatosDeFactura_1_1.setBounds(60, 361, 82, 20);
        mainPanel.add(lblDatosDeFactura_1_1);
        
        textField_2 = new JTextField();
        textField_2.setBounds(135, 361, 29, 20);
        mainPanel.add(textField_2);
        
        JLabel lblDatosDeFactura_1_1_1 = new JLabel("IVA 19%:    $26.00");
        lblDatosDeFactura_1_1_1.setBounds(60, 392, 104, 20);
        mainPanel.add(lblDatosDeFactura_1_1_1);
        
        JLabel lblDatosDeFactura_1_1_1_1 = new JLabel("Total factura:    $166.00");
        lblDatosDeFactura_1_1_1_1.setBounds(60, 423, 135, 20);
        mainPanel.add(lblDatosDeFactura_1_1_1_1);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Valor descontado: $0.00");
        chckbxNewCheckBox.setBounds(169, 360, 143, 23);
        mainPanel.add(chckbxNewCheckBox);
        
        JButton btnNewButton_1 = new JButton("Finalizar factura");
        btnNewButton_1.setBounds(413, 438, 150, 23);
        mainPanel.add(btnNewButton_1);
        
        JButton btnNewButton_1_1 = new JButton("Limpiar");
        btnNewButton_1_1.setBounds(566, 438, 89, 23);
        mainPanel.add(btnNewButton_1_1);
        
        JPanel titlePanel_1 = new JPanel((LayoutManager) null);
        titlePanel_1.setBackground(new Color(10, 146, 219));
        titlePanel_1.setBounds(0, 511, 684, 50);
        mainPanel.add(titlePanel_1);
        
        JLabel titleLabel_1 = new JLabel("");
        titleLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 17));
        titleLabel_1.setBounds(40, 11, 580, 30);
        titlePanel_1.add(titleLabel_1);
    }
}

