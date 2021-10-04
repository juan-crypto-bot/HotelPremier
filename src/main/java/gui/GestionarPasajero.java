package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GestionarPasajero extends JFrame {

	private JPanel contentPane;

	public GestionarPasajero() {

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 1280, 720);
		setResizable(false);
		setTitle("");

		JPanel panelNorte = new JPanel();
		panelNorte.setBackground(new Color(153, 153, 255));
		contentPane.add(panelNorte, BorderLayout.NORTH);
		panelNorte.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		JButton btnUsuario = new JButton("");
		btnUsuario.setBackground(new Color(153, 153, 255));
		btnUsuario.setIcon(new ImageIcon("C:\\Users\\Intel\\Desktop\\Icono1.JPG"));
		panelNorte.add(btnUsuario);

		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(new Color(153, 153, 255));
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);

		JButton btnDarDeAlta = new JButton("Dar de alta pasajero");
		btnDarDeAlta.setBounds(467, 145, 250, 80);
		btnDarDeAlta.setFont(new Font("Dialog", Font.PLAIN, 20));
		panelCentral.add(btnDarDeAlta);

		JButton btnModificar = new JButton("Modificar Pasajero");
		btnModificar.setBounds(467, 249, 250, 80);
		btnModificar.setFont(new Font("Dialog", Font.PLAIN, 20));
		panelCentral.add(btnModificar);

		JButton btnDarDeBaja = new JButton("Dar de baja pasajero");
		btnDarDeBaja.setBounds(467, 359, 250, 80);
		btnDarDeBaja.setFont(new Font("Dialog", Font.PLAIN, 20));
		panelCentral.add(btnDarDeBaja);

		btnDarDeAlta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				final Principal v = new Principal();
				v.setVisible(true);
				dispose();
			}
		});

		btnModificar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JPanel(), "Modalidad aún no implementada", " ",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		btnDarDeBaja.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(new JPanel(), "Modalidad aún no implementada", " ",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

	}

}
