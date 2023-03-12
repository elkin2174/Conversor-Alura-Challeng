
import javax.swing.JOptionPane;

public class CoversorMoneda {
	
	
		public String ElegirConvercion() {
			
			String opcionPrincipal[] = {"COP a Dolar","COP a Euro","COP a Libra esterlina","COP a Yen","COP a Won",
										"Dolar a COP","Euro a COP","Libra esterlina a COP","Yen a COP","Won a COP"};
			
			String opcionEscogida =  (String) JOptionPane.showInputDialog(null,"Seleccione una:","Que desea convertit",
					JOptionPane.QUESTION_MESSAGE,null,
					opcionPrincipal,0);
			
			return opcionEscogida;
			
		}
		

		
		public void covertir(double valorEquivalente, String moneda) {
			
			double monedaInicial = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el cantidad con puntos: "));
			
			Double monedaFinal = monedaInicial/valorEquivalente;
			
			monedaFinal = (double) Math.round(monedaFinal * 100d)/100;
			
			JOptionPane.showMessageDialog(null,"Usted Tiene: "+ monedaFinal +" "+ moneda );
			
		}
		
}
