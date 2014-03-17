
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Tarea4Temperaturas extends JFrame{  
	JFrame  marco;
    JPanel panel;
    JButton convertirC,convertirF,convertirK,borrar;
    JLabel celsius,farenheit,kelvin;
    JTextField texto1, texto2, texto3;
    double Tc,Tk,Tf  ;
    String C1,F1,K1;

     public Tarea4Temperaturas(){
     	// ventana
     	this.setSize(470,380);
     	this.setVisible(true);
     	// area o panel
     	panel = new JPanel();
     	panel.setSize(470,380);
		panel.setBackground(Color.blue);
		panel.setLayout(null);
		this.add(panel);
		//etiquetas + text
		celsius = new JLabel();
		celsius.setBackground(Color.yellow);
        celsius.setBounds(50,20,120,20);
		celsius.setText("Cantidad Celsius");
		celsius.setOpaque(true);
		panel.add(celsius);

		farenheit= new JLabel();
		farenheit.setBackground(Color.yellow);
		farenheit.setBounds(50,100,120,20);
		farenheit.setText("Cantidad Farenheit");
		farenheit.setOpaque(true);
		panel.add(farenheit);

		kelvin= new JLabel();
		kelvin.setBackground(Color.yellow);
		kelvin.setBounds(50,180,120,20);
		kelvin.setText("Cantidad Kelvin");
		kelvin.setOpaque(true);
		panel.add(kelvin);

		

		texto1 = new JTextField();
		texto1.setBounds(50,60,120,20);
		panel.add(texto1);

		texto2 = new JTextField();
		texto2.setBounds(50,140,120,20);
		panel.add(texto2);

		texto3 = new JTextField();
		texto3.setBounds(50,220,120,20);
		panel.add(texto3);

		//botones
		borrar = new JButton();
		borrar.setText("Borrar");
		borrar.setBounds(60,250,85,55);
		borrar.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e)
             {
                 texto1.setText("");
                 texto2.setText("");
                 texto3.setText("");
             }
         }); 
 		
 		panel.add(borrar);

 		convertirC = new JButton("Convertidor1 FyK");
		convertirC.setBounds(280,40,130,55);
		convertirC.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e)
               {
               	Tc = new Double (texto1.getText());	
               	Tf = (Tc * 1.8) + 32;
                 Tk = (Tc + 273.15);
                texto2.setText(Double.toString(Tf));
                texto3.setText(Double.toString(Tk));

             }    
             }); 
			panel.add(convertirC); 

		convertirF = new JButton("Convertidor2 CyK");
		convertirF.setBounds(280,130,133,55);
		convertirF.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e)
               {
               	Tf = new Double (texto2.getText());	
               	Tc = (Tf -32)/1.8;
                 Tk = (Tf + 459.67)/1.8;
                 texto1.setText(Double.toString(Tc));
                texto3.setText(Double.toString(Tk));

             }    
             }); 
			panel.add(convertirF); 	

		convertirK = new JButton("Convertidor3 CyF");
		convertirK.setBounds(280,220,130,55);
		convertirK.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e)
               {
               	 Tk = new Double (texto3.getText());	
               Tc = Tk -273.15;
                 Tf = (Tk*1.8)-459.67;
                 texto1.setText(Double.toString(Tc));
                texto2.setText(Double.toString(Tf));

             }    
             }); 
			panel.add(convertirK);	

		}
		 
		
 public static void main(String args[]){
 	Tarea4Temperaturas T = new  Tarea4Temperaturas();
     
    }
 
 
}


