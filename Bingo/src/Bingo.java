
import java.util.Random;
import java.util.Scanner;

public class Bingo {

	private static Scanner sc;
	public static void main(String[] args) {
		int n;
		String jugador1;
		String jugador2;
		sc = new Scanner(System.in);
		System.out.println("¡Bienvenido al Bingo!\n(pulsa una tecla y dale a ENTER para comenzar)");
		sc.next();
		System.out.println("Introduce el nombre del primer jugador: ");
		jugador1 = sc.next();		
		System.out.println("Introduce el nombre del segundo jugador: ");
		jugador2 = sc.next();
		System.out.println(jugador1+" y "+jugador2);
		System.out.println("Por favor seleccione una de estas opciones.");


		do{
			System.out.println("1.)Iniciar partida \n2.)Sacar una bola.\n3.)Imprimir cartones.\n4.)Imprimir el bombo.\n5.)Salir.");
			n=sc.nextInt();	

			while(n<0||n>5){
				System.out.println("Introduce un numero del 1 al 5");
				n=sc.nextInt();	
			}
				switch(n){
				case 1:
					IniciarPartida();
					break;
				case 2:
					SacarBola();
					break;	
				case 3:
					ImprimirCartones();
					break;
				case 4:
					ImprimirBombo();
					break;
				case 5:
					Salir();
					break;
				}

		}
		while(n!=5);
		System.out.println("Has Salido del programa");
	} 
	

	private static void tecla() {
		// TODO Auto-generated method stub
		
	}


	public static void IniciarPartida(){
		Random aleatorio=new Random() ;
		int[][] carton1=new int [3][5];
		int[][] carton2=new int [3][5];
		for(int i=0; i<carton1.length; i++){
			for(int j=0; j<carton1.length; j++){
				carton1[i][j]=aleatorio.nextInt(89)+1;
			}
		}
		System.out.println(carton1);
	}
	private static void SacarBola() {
		// TODO Auto-generated method stub
		
	}
	private static void ImprimirCartones(){
		
	}
	private static void ImprimirBombo(){
		
	}
	private static void Salir(){
		
	}


}