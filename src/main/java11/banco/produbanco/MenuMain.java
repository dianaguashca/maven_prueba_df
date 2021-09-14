package banco.produbanco;

import java.util.Scanner;

public class MenuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		Scanner lector=new Scanner(System.in);
		String clave="";
		String clave1="85AB";
		String Salir="-1";
		do {
			System.out.println("Ingrese la clave");
			clave=lector.nextLine();
			if(clave.equals(clave1)) {
				
				
				int opcion=0;
				do {
					
				
				System.out.println("BANCO PRODUBANCO, elija una opción:");
				System.out.println("1. Realizar transferencia");
				System.out.println("2. Consultar transacciones");
				System.out.println("3. SALIR");
				opcion=lector.nextInt();
				if(opcion==1) {
				
				System.out.println("Ingrese una cuenta:");
				lector.nextLine();
				String cuenta=lector.nextLine();
				System.out.println("Ingrese monto:");
			int monto=lector.nextInt();
				int  SaldoD=1000;
				int N=SaldoD-monto;
				System.out.println("Su nuevo saldo es:"+N);
					
				}else if(opcion==2) {
					System.out.println("“En este momento se están procesando las transacciones,"
							+ " intente más tarde");
				}
				}while(opcion!=3);
				
			}else {
				System.out.println("la clave incorrecta ");
			}
			
		}while(!clave.equals(Salir));
		System.out.println("“Gracias por preferirnos”.");
	}}
