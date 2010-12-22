package gui;

import java.awt.Color;
import java.awt.Component;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

public class Util {

	public static final Color inicioColor=Color.blue;
	public static final Color finColor=Color.red;
	
	public static void mostrarMensaje(Component parent,String s){
		JOptionPane.showMessageDialog(parent, s, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public static ResourceBundle resource=ResourceBundle.getBundle("resources.textos",Locale.getDefault());
	
	private static MessageFormat formatter=new MessageFormat("");
	
	public static String mensajes(String key,Object[] argumentos){
		formatter.applyPattern(resource.getString(key));
		return formatter.format(argumentos);
	}
	
}