import java.util.Arrays;
import java.util.Scanner;


public class patron {

	public static int [] sequence =  new int[4];//Secuencia escondida
	int [] numbers = {0,1,2,3,4,5,6,7,8,9};//Array con iniciales de colores
	static int colorNumber = 4; //Numero de fichas secretas
	static int roundNumber = 10; //Numero de rondas permitidas
	
	public patron(){
		String stringSequence = new String();
		for (int i=0 ; i < colorNumber ; i++){ 
			sequence[i] = numbers[(int)(Math.random()*10)];			
		}
		
		//System.out.println(stringSequence[0]);
		//sequence = stringSequence.split("");
		
		/*System.out.println(sequence[1]);*/
		System.out.println(Arrays.toString(sequence));
		
		
	}
	
	


	public static void play(){
		int [] sequence_ =  new int[4];
		for (int t = 0;t< colorNumber;t++ ){
				for(int z = 0; z < colorNumber; z++){
					//System.out.println(z);
		
					System.out.println("Introduzca la primera ficha 0-9: ");
					Scanner scanner = new Scanner(System.in);
					sequence_[z] = Integer.parseInt(scanner.nextLine());
					
				}
			System.out.println(sequence[0]);
			int [] aux = new int[4];
			for (int x=0;x<sequence.length;x++)
				  aux[x] = sequence[x];
			//System.arraycopy(aux,0,sequence,0,aux.length);
			int [] aux_ = new int[4];
			for (int x=0;x<sequence_.length;x++)
				  aux_[x] = sequence_[x];
			//System.arraycopy(aux_,0,sequence_,0,aux_.length);
			
			int deepCounter = 0;
			int injuredCounter = 0;
			for(int i=0;i< colorNumber;i++){
				if(aux[i] == aux_[i]){
					//System.out.println("Muerto");
					deepCounter ++;
					aux[i]  = -1;
					aux_[i] = -1;
				}
			}
			for(int i=0;i<colorNumber;i++){
				if(aux_[i] != -1){
					System.out.println("Entra");
					for(int j=0;j<colorNumber;j++){
						if(aux[j] != -1){
							//System.out.println("Entra1");
							if(aux[j]==aux_[i]){
								//System.out.println("Herido");
								injuredCounter++;
								aux[j]  = -1;
								aux_[i] = -1;
								
							}
						}
					}
				}
			}
			System.out.println("El numero de muertes es de "+deepCounter);
			System.out.println("El numero de heridos es de "+injuredCounter);
			if(deepCounter == 4){
				System.out.println("HAS DADO CON LA COMBINACION");
				break;
			}

		}
	}
}
