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
	
	public void covertirCentigradoaFahrenheit() {
		double centigrado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el cantidad con puntos: "));
		
		double temFahrenheit = (centigrado*1.8) + 32;
		
		JOptionPane.showMessageDialog(null, centigrado+ " °C son "+ temFahrenheit + " °F");
		
	}
	
	
	
	
	
	

}
