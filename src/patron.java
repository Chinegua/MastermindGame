import java.util.Arrays;

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
	public String [] sequence;
	char [] colors = {'R', 'G', 'B', 'P', 'W','O','P','Y'};
	
	public patron(){
		String stringSequence = new String();
		for (int i=0 ; i <= 4 ; i++){ 
			
			stringSequence += colors[(int)(Math.random()*7)];

			//sequence = colors[(int)(Math.random()*7)];
			
		}
		
		//System.out.println(stringSequence[0]);
		sequence = stringSequence.split("");
		/*System.out.println(sequence[1]);
		System.out.println(Arrays.toString(sequence));*/
		
		
	}
	public String[] get_patron(){
		return sequence;
	}
	

}
