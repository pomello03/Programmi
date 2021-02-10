package Recupero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Finestra extends JFrame implements ActionListener{
	private JTable tbl;
	private DefaultTableModel tblmod;
	private JScrollPane scrlpain;
	private JMenuBar bar;
	private JMenu menu;
	private JMenuItem inserisci, carica, salva;
	private ArGay a;
	
	public void initComp() {
		Object [][] data = {}; //crea la riga della tabella
		String[] columnNames = {"Nome", "Coglione", "Classe"};
		tblmod = new DefaultTableModel(data, columnNames);
		tbl = new JTable(tblmod);
		scrlpain = new JScrollPane(tbl);
	}
		
	
	public Finestra() {
		initComp();
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
}
