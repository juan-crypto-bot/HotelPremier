package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import javax.swing.SpinnerListModel;

public class DarDeAltaPasajero extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldApellido;
	private JTextField textFieldTelefono;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;


	/**
	 * Create the frame.
	 */
	public DarDeAltaPasajero() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(340, 50, 200, 20);
		panel_1.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setColumns(10);
		textFieldTelefono.setBounds(340, 260, 200, 20);
		panel_1.add(textFieldTelefono);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(970, 470, 200, 20);
		panel_1.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(970, 50, 200, 20);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(970, 120, 200, 20);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(970, 190, 200, 20);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(970, 260, 200, 20);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setEnabled(false);
		textField_10.setColumns(10);
		textField_10.setBounds(970, 330, 200, 20);
		panel_1.add(textField_10);
		
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblApellido.setBounds(80, 50, 80, 30);
		panel_1.add(lblApellido);
		
		
		JLabel lblTipoDeDocumento = new JLabel("Tipo de Documento");
		lblTipoDeDocumento.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblTipoDeDocumento.setBounds(80, 120, 150, 30);
		panel_1.add(lblTipoDeDocumento);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblFechaDeNacimiento.setBounds(80, 190, 150, 30);
		panel_1.add(lblFechaDeNacimiento);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblTelefono.setBounds(80, 260, 80, 30);
		panel_1.add(lblTelefono);
		
		JLabel lblPosicionFrenteAl = new JLabel("Posicion frente al IVA");
		lblPosicionFrenteAl.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPosicionFrenteAl.setBounds(80, 330, 150, 30);
		panel_1.add(lblPosicionFrenteAl);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPais.setBounds(80, 400, 80, 30);
		panel_1.add(lblPais);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblCiudad.setBounds(80, 470, 80, 30);
		panel_1.add(lblCiudad);
		
		JLabel lblNumDocumento = new JLabel("Numero de Documento");
		lblNumDocumento.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNumDocumento.setBounds(710, 120, 200, 30);
		panel_1.add(lblNumDocumento);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNacionalidad.setBounds(710, 190, 140, 30);
		panel_1.add(lblNacionalidad);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblEmail.setBounds(710, 260, 80, 30);
		panel_1.add(lblEmail);
		
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNombre.setBounds(710, 50, 80, 30);
		panel_1.add(lblNombre);
		
		
		
		JComboBox comboBoxDocumento = new JComboBox();
		comboBoxDocumento.setFont(new Font("Dialog", Font.PLAIN, 15));
		comboBoxDocumento.setModel(new DefaultComboBoxModel(new String[] {"Tipo", "DNI", "LE", "LC", "PASAPORTE", "OTRO"}));
		comboBoxDocumento.setBounds(390, 120, 150, 24);
		panel_1.add(comboBoxDocumento);
		
		JSpinner spinnerDate = new JSpinner();
		spinnerDate.setModel(new SpinnerDateModel(new Date(1633316402000L), null, null, Calendar.DAY_OF_YEAR));
		spinnerDate.setBounds(450, 185, 90, 30);
		panel_1.add(spinnerDate);
		
		JComboBox comboBoxPosicion = new JComboBox();
		comboBoxPosicion.setFont(new Font("Dialog", Font.PLAIN, 15));
		comboBoxPosicion.setModel(new DefaultComboBoxModel(new String[] {"Consumidor final", "IVA Sujeto Exento", "Responsable Monotributo", "IVA Responsable Inscripto"}));
		comboBoxPosicion.setBounds(340, 330, 200, 24);
		panel_1.add(comboBoxPosicion);
		
		JComboBox comboBoxPais = new JComboBox();
		comboBoxPais.setBounds(400, 405, 140, 24);
		panel_1.add(comboBoxPais);
		
		JComboBox comboBoxCiudad = new JComboBox();
		comboBoxCiudad.setBounds(400, 468, 140, 24);
		panel_1.add(comboBoxCiudad);
		
		JLabel lblCuit = new JLabel("CUIT");
		lblCuit.setEnabled(false);
		lblCuit.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblCuit.setBounds(710, 330, 80, 30);
		panel_1.add(lblCuit);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblProvincia.setBounds(710, 400, 80, 30);
		panel_1.add(lblProvincia);
		
		JLabel lblCalle = new JLabel("Calle");
		lblCalle.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblCalle.setBounds(710, 470, 80, 30);
		panel_1.add(lblCalle);
		
		JLabel lblNum = new JLabel("Num");
		lblNum.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNum.setBounds(710, 540, 80, 20);
		panel_1.add(lblNum);
		
		JLabel lblDep = new JLabel("Dep");
		lblDep.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblDep.setBounds(883, 540, 61, 20);
		panel_1.add(lblDep);
		
		JLabel lblPiso = new JLabel("Piso");
		lblPiso.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPiso.setBounds(1066, 540, 38, 20);
		panel_1.add(lblPiso);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(1024, 400, 140, 24);
		panel_1.add(comboBox);
		
		JSpinner spinnerNum = new JSpinner();
		spinnerNum.setBounds(781, 540, 50, 20);
		panel_1.add(spinnerNum);
		
		JSpinner spinnerPiso = new JSpinner();
		spinnerPiso.setBounds(1120, 540, 50, 20);
		panel_1.add(spinnerPiso);
		
		JSpinner spinnerDepto = new JSpinner();
		spinnerDepto.setModel(new SpinnerListModel(new String[] {"A", "B", "C", "D", "E", "F", "G", "H"}));
		spinnerDepto.setBounds(954, 540, 50, 20);
		panel_1.add(spinnerDepto);
	
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 1280, 720);
		setResizable(false);
		setTitle("");
	}
}
