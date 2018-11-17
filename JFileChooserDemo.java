package salva.file;

import javax.swing.JFrame;

import javafx.stage.FileChooser;
import java.io.File;
import javax.swing.filechooser.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class JFileChooserDemo extends JFrame {
	
	private JFileChooser fc;
	
	public JFileChooserDemo() {
		super("JFileChooserDemo");
		
		fc=new JFileChooser();
		fc.setFileHidingEnabled(false);
		fc.showSaveDialog(this);
		
		fc.addChoosableFileFilter(new FileFilter() {
			
			private final String jpg="jpg";
			private final String png="png";

			@Override
			public boolean accept(File f) {
				String name=f.getName();
				if(name.equals(jpg) || name.equals(png))
					return true;
				return false;
			}

			@Override
			public String getDescription() {
				return null;
			}
			
		});
	}

}
