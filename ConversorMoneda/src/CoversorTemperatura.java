import javax.swing.JOptionPane;

public class CoversorTemperatura{
	
	
	
	public String ElegirConvercion() {
		
		String opcionPrincipal[] = {"COP a Dolar","COP a Euro","COP a Libra esterlina","COP a Yen","COP a Won",
									"Dolar a COP","Euro a COP","Libra esterlina a COP","Yen a COP","Won a COP"};
		
		String opcionEscogida =  (String) JOptionPane.showInputDialog(null,"Seleccione una:","Que desea convertit",
				JOptionPane.QUESTION_MESSAGE,null,
				opcionPrincipal,0);
		
		return opcionEscogida;
		
	}
	
	
	
	
	
	

}
