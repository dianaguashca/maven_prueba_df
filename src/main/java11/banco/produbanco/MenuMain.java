package banco.produbanco;

import java.util.Scanner;

public class MenuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector= new Scanner(System.in);
		int opcion=0;
		int clave=85;
		
			System.out.println("Ingrese clave ");
			opcion=lector.nextInt();
			do {
				
				if(opcion!=clave) {
					System.out.println("la clave no es correcta");
					opcion=lector.nextInt();
					
				}
				if (opcion==clave) {
				System.out.println("Banco Produbanco ");
				System.out.println("1.-Realizar transferencia");
				System.out.println("2.-consultar transacciones ");
				System.out.println("3.-Salir ");
				System.out.println("elija opcion ");
				opcion=lector.nextInt();
				}
				
				if(opcion==1) {
					int saldo=1000;
					System.out.println("su nuevo saldo es "+saldo);
					opcion=lector.nextInt();
				}
					if(opcion==2) {
						System.out.println("“En este momento se están procesando las"
								+ " transacciones, intente más tard");
						opcion=lector.nextInt();
					}
				
		
			}while(opcion!=3);
			

			System.out.println("Vuelva pronto");
	}

}
