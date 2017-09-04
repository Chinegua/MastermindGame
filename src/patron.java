import java.util.Arrays;
import java.util.Scanner;


public class patron {
	/* 
	 * R -> Rojo
	 * G -> Verde
	 * B -> Azul
	 * P -> Rosa
	 * W -> Blanco
	 * O -> Orange
	 * Y -> Yellow
	 */
	public static String [] sequence;//Secuencia escondida
	char [] colors = {'R', 'G', 'B', 'P', 'W','O','P','Y'};//Array con iniciales de colores
	static int colorNumber = 4; //Numero de fichas secretas
	static int roundNumber = 10; //Numero de rondas permitidas
	
	public patron(){
		String stringSequence = new String();
		for (int i=0 ; i <= colorNumber ; i++){ 
			
			stringSequence += colors[(int)(Math.random()*7)];

			//sequence = colors[(int)(Math.random()*7)];
			
		}
		
		//System.out.println(stringSequence[0]);
		sequence = stringSequence.split("");
		
		/*System.out.println(sequence[1]);*/
		System.out.println(Arrays.toString(sequence));
		
		
	}
	public static int get_dead(String stringSequenceIn){

		int deadNumber = 0;
		String [] sequence_;
		sequence_ = stringSequenceIn.split("");
		for(int i=0;i<= colorNumber;i++){
			System.out.println(sequence[i]+" "+sequence_[i]);

			if(sequence[i].equals(sequence_[i])){
				System.out.println(deadNumber);
				deadNumber ++;
			}
		}

		return deadNumber;
		
	}
	public static void play(){
		
		for(int i =0; i<= roundNumber;i++){
			
			String stringSequenceIn = new String();
			
			for(int z = 0; z <= colorNumber; z++){
				System.out.println(z);

				System.out.println("Introduzca la primera ficha [R,G,B,P,W,O,P,Y]: ");
				Scanner scanner = new Scanner(System.in);
				stringSequenceIn += scanner.nextLine();
				
			}
			if(get_dead(stringSequenceIn) > colorNumber){
				System.out.println("HAS DADO CON LA COMBINACION");
				break;
			}
			
			
			
		}
		
	}
	

}
