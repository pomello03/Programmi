package Recupero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class ArGay extends ArrayList <Studente>{
	public ArGay() {
		super ();
	}
	public String createCsv() {
		String csv= "";
		for(int i =0; i<this.size(); i++) { 
			csv+= this.get(i).getNome() + ";" + this.get(i).getCognome() + ";" + this.get(i).getClasse() + "\n";
		}
		return csv;
	}
	public void creaFile (JFrame finestra) throws IOException {
		JFileChooser ciuser= new JFileChooser();
		ciuser.setFileFilter( new TxtFileFilter() );
		int n = ciuser.showSaveDialog( finestra );
		if ( n==JFileChooser.APPROVE_OPTION ) {
			File f= ciuser.getSelectedFile();
			FileWriter fw= new FileWriter(f);
			fw.write(this.createCsv());
			fw.flush();
			fw.close();
		}
	}
	
	
	public void leggiFile (JFrame finestra) throws IOException{
		JFileChooser ciuser= new JFileChooser();
		ciuser.setFileFilter( new TxtFileFilter() );
		int n = ciuser.showOpenDialog( finestra );
		if ( n==JFileChooser.APPROVE_OPTION ) {
			File f = ciuser.getSelectedFile();
			FileReader fr= new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] celli = line.split(";");
				this.add(new Studente (celli[0], celli[1], celli[2]));
			}
			br.close();
			fr.close();
		}
	}
}
