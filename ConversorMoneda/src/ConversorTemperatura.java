import javax.swing.JOptionPane;

public class ConversorTemperatura{
	
	
	
	public String ElegirConvercion() {
		
		String opcionPrincipal[] = {"Convertir de ºC a ºF", "Convertir de ºF a ºC","Convertir de K a ºC",
									"Convertir de ºC a K","Convertir de ºF a K", "Convertir de K a ºF"};
		
		String opcionEscogida =  (String) JOptionPane.showInputDialog(null,"Seleccione una:","Que desea convertit",
				JOptionPane.QUESTION_MESSAGE,null,
				opcionPrincipal,0);
		
		return opcionEscogida;
		
	}
	//TODO completar los demas metodos
	public void covertirCentigradoAFahrenheit() {
		double temCentigrado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el cantidad con puntos: "));
		
		double temFahrenheit = (temCentigrado*1.8) + 32;
		
		JOptionPane.showMessageDialog(null, temCentigrado+ " °C son "+ temFahrenheit + " °F");
		
	}
	
	public void covertirFahrenheitACentigrado() {
		double temFahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el cantidad con puntos: "));
		
		double temCentigrado = Math.round(((temFahrenheit-32)/1.8)*100.0)/100.0;
		
		JOptionPane.showMessageDialog(null, temFahrenheit + " °F son "+ temCentigrado + " °C");
		
	}
	public void covertirKelvinACentigrado() {
		double temKelvin = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el cantidad con puntos: "));
		
		double temCentigrado = temKelvin - 273.15;
		
		JOptionPane.showMessageDialog(null, temKelvin + " K son "+ temCentigrado + " °C");
		
	}
	
	public void covertirCentigradoAKelvin() {
		double temCentigrado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el cantidad con puntos: "));
		
		double temKelvin = temCentigrado + 273.15;
		
		JOptionPane.showMessageDialog(null, temCentigrado + " °C son "+ temKelvin + " K");
		
	}
	public void covertirFahrenheitAKelvin() {
		//K = 5/9 (ºF – 32) + 273.15.
		double temFahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el cantidad con puntos: "));
		double temKelvin =Math.round((((temFahrenheit - 32)*5)/9 + 273.15)*100.0)/100.0;
		
		JOptionPane.showMessageDialog(null, temFahrenheit + " °F son "+ temKelvin   + " K");
		
	}
	public void covertirKelvinAFahrenheit() {
		//ºF = 1.8(K – 273.15) + 32.
		double temKelvin = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el cantidad con puntos: "));
		
		double temFahrenheit = Math.round((1.8*(temKelvin-273.15)+32)*100.0)/100.0;
		
		JOptionPane.showMessageDialog(null, temKelvin + " K son "+ temFahrenheit   + " °F");
		
	}
	
	
	
	
	
	
	
	
	

}
