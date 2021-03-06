package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.PersonaDAO;
import dao.PersonaDAO_Hibernate;
import dominio.Persona;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import javax.swing.JButton;

public class DarDeAltaPasajero extends JFrame {

	private JPanel contentPane;
	private JTextField textApellido;
	private JTextField textTelefono;
	private JTextField textCalle;
	private JTextField textNombre;
	private JTextField textNumeroDocumento;
	private JTextField textOcupacion;
	private JTextField textEmail;
	private JTextField textCuit;
	private JTextField textNacionalidad;


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
		
		
		textApellido = new JTextField();
		textApellido.setBounds(340, 50, 200, 20);
		panel_1.add(textApellido);
		textApellido.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(340, 260, 200, 20);
		panel_1.add(textTelefono);
		
		textCalle = new JTextField();
		textCalle.setColumns(10);
		textCalle.setBounds(970, 470, 200, 20);
		panel_1.add(textCalle);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(970, 50, 200, 20);
		panel_1.add(textNombre);
		
		textNumeroDocumento = new JTextField();
		textNumeroDocumento.setColumns(10);
		textNumeroDocumento.setBounds(970, 120, 200, 20);
		panel_1.add(textNumeroDocumento);
		
		textOcupacion = new JTextField();
		textOcupacion.setColumns(10);
		textOcupacion.setBounds(970, 190, 200, 20);
		panel_1.add(textOcupacion);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(970, 260, 200, 20);
		panel_1.add(textEmail);
		
		textCuit = new JTextField();
		textCuit.setEnabled(false);
		textCuit.setColumns(10);
		textCuit.setBounds(970, 330, 200, 20);
		panel_1.add(textCuit);
		
		
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
		
		JLabel lblOcupacion = new JLabel("Ocupacion");
		lblOcupacion.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblOcupacion.setBounds(710, 190, 140, 30);
		panel_1.add(lblOcupacion);
		
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
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(1081, 603, 89, 23);
		panel_1.add(btnAceptar);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNacionalidad.setBounds(80, 540, 140, 30);
		panel_1.add(lblNacionalidad);
		
		textNacionalidad = new JTextField();
		textNacionalidad.setColumns(10);
		textNacionalidad.setBounds(340, 540, 200, 20);
		panel_1.add(textNacionalidad);
		
		JComboBox comboBoxA?o = new JComboBox();
		comboBoxA?o.setModel(new DefaultComboBoxModel(new String[] {"2021", "2020", "2019", "2020", "2019", "2020", "2019", "2020", "2019", "2020", "2019", "2020", "2019", "2020", "2019", "2020", "2019", "2020", "2019"}));
		comboBoxA?o.setBounds(490, 188, 50, 24);
		panel_1.add(comboBoxA?o);
		
		JComboBox comboBoxMes = new JComboBox();
		comboBoxMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiempre", "Octubre", "Noviembre", "Diciembre"}));
		comboBoxMes.setBounds(400, 188, 80, 24);
		panel_1.add(comboBoxMes);
		
		JComboBox comboBoxDia = new JComboBox();
		comboBoxDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDia.setBounds(340, 188, 45, 24);
		panel_1.add(comboBoxDia);
	
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 1280, 720);
		setResizable(false);
		setTitle("dsa");
		
		
		
		
		//persona.setNacimiento(Date.parse(textNacionalidad.getText().toString());
	
		

		btnAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				

				Persona persona = new Persona();
				persona.setId(2);
				persona.setApellido(textApellido.getText().toString());
			/*
				persona.setId(2);
				persona.setApellido(textApellido.getText().toString());
				persona.setNombre(textNombre.getText().toString());
				persona.setTipoDocumento(comboBoxDocumento.getSelectedItem().toString());
				persona.setNumeroDocumento(Integer.parseInt(textApellido.getText().toString()));
			//	persona.setNacimiento()
				persona.setOcupacion(textOcupacion.getText().toString());
				persona.setTelefono(Integer.parseInt(textTelefono.getText().toString()));
				persona.setCorreoElectronico(textEmail.getText().toString());
				persona.setPosFrenteIVA(comboBoxPosicion.getSelectedItem().toString());
				persona.setCuit(Integer.parseInt(textCuit.getText().toString()));
				//direc
				persona.setNacionalidad(textNacionalidad.getText().toString());
				
					//PersonaDAO pdao = new PersonaDAO_Hibernate();
					
					//pdao.guardarPersona(persona);
				*/
				
				PersonaDAO pdao = new PersonaDAO_Hibernate();
				System.out.println(persona.getApellido().toString());
			pdao.guardarPersona(persona);
			
		}
	});

	}
}
