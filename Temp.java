package swingexample;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Temp extends JFrame{
	private JLabel celsius;
	private JLabel fahrenheit;
	private JTextField txtcelsius;
	private JTextField txtfaherenheit;
	private CelsHandler celsiushandler;
	private FahrHandler faherenheithandler;
	private static final int WIDTH=500;
	private static final int HEIGHT=75;
	private static final double FTOC=5.0/7.0;
	private static final double CTOF=9.0/5.0;
	private static final int OFFSET=32;
	public Temp() {
		setTitle("Temperature Conversion");
		Container c=getContentPane();
		c.setLayout(new GridLayout(1,4));
		celsius = new JLabel("Temp in Celsius: ", SwingConstants.RIGHT);
		fahrenheit = new JLabel("Temp in Fahrenheit: ", SwingConstants.RIGHT);
		txtcelsius = new JTextField(7); 
		txtfaherenheit = new JTextField(7);
		c.add(celsius); 
		c.add(txtcelsius); 
		c.add(fahrenheit); 
		c.add(txtfaherenheit);
		celsiushandler = new CelsHandler(); 
		faherenheithandler = new FahrHandler();
		 txtcelsius.addActionListener(celsiushandler); 
		 txtfaherenheit.addActionListener(faherenheithandler);
		setSize(WIDTH, HEIGHT);
		setVisible(true); setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	private class CelsHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double celsius, fahrenheit;
			celsius = Double.parseDouble(txtcelsius.getText());
			fahrenheit = celsius * CTOF + OFFSET; 
			txtfaherenheit.setText(String.format("%.2f",fahrenheit));
			// TODO Auto-generated method stub
			
		}
		
	}
	private class FahrHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double celsius, fahrenheit; 
			fahrenheit =Double.parseDouble(txtfaherenheit.getText());
					celsius = (fahrenheit - OFFSET) * FTOC; 
					txtcelsius.setText(String.format("%.2f",
					celsius));// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args) { 
		Temp tempConv = new Temp(); 
		tempConv.setLocationRelativeTo(null);
	}
	

}
