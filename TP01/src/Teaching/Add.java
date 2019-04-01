/**
 * 
 */
package Teaching;

/**
 * @author kerv
 *
 */
public class Add {
	
	int numA=1;
	int numB=0;
	int result;
	
	public Add() {
		this.result=numA+numB;
		
	}
	
	public int Adition(int a, int b){
			
		return a+b;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add resultat= new Add();
		System.out.println(resultat.Adition(5,5));

		System.out.println(resultat.result);
		System.out.println(resultat.result);
		System.out.println(resultat.result);
		
		
	}

}
