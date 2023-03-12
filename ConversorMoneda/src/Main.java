
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Main {
	public static void main(String[] args) {
		
		
		//Arreglos opciones menu principal
		String opcionPrincipal[] = {"Coversor de moneda","Coversor de temperatura"};
		
		String opcionEscogida =  (String) JOptionPane.showInputDialog(null,"Seleccione una:","¿Que desea convertir?",
				JOptionPane.QUESTION_MESSAGE,new ImageIcon("/ConversorMoneda/src/icons8-convertidor-de-texto-enriquecido-48.png"),
				opcionPrincipal,0);
		
		//Seleccion de clase a utilizar
		
		
		if(opcionEscogida == opcionPrincipal[0]) {
			
			CoversorMoneda conversor = new CoversorMoneda();
			String opcionDeMoneda = conversor.ElegirConvercion();
			
			switch(opcionDeMoneda) {
			
				case "COP a Dolar":
					
					conversor.covertir(4722.36,"Dolar(es)");
					break;
				case "COP a Euro":
					
					conversor.covertir(5032.89,"Euro(s)");
					break;
				case "COP a Libra esterlina":
					
					conversor.covertir(5682.89,"Libra(s) Esterlina(s)");
					break;
					
				case "COP a Yen":
					
					conversor.covertir(34.98,"Yen(es)");
					break;
				case "COP a Won":
					
					conversor.covertir(3.58,"Won(es)");
					break;
				case "Dolar a COP":
					
					conversor.covertir((1/4722.36),"Pesos");
					break;
				case "Euro a COP":
					
					conversor.covertir((1/5032.89),"Pesos");
					break;
				case "Libra esterlina a COP":
					
					conversor.covertir((1/5682.89),"Pesos");
					break;
				case "Yen a COP":
					
					conversor.covertir((1/34.98),"Pesos");
					break;
				case "Won a COP":
					
					conversor.covertir((1/3.58),"Pesos");
					break;
						
				
			
			}
			

			
		}else {
			System.out.println("Se ejecuta caso 2");
		}
	
}			
}
