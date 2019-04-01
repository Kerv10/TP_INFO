package stock;

import java.util.LinkedList;

import product.Product;

public class StockList implements Stock{
	
	private LinkedList<Product> content;
	private int index;
	/**private Product[] content;

	 /** nombre de produits dans le stock */
	 /** private int size; */
	    
	/** Construit un stock dont la capacite est donnee par s
	* @param s la taille du stock  */
	public StockList() {
	    this.content = new LinkedList<Product>();
	    this.index=-1;
	   	  }
		    
	  /** rajoute un nouveau produit dans le stock
	   * @param p  le produit qui est rajoute  */  
	  public void add(Product p)  {
	      if (isFull()) return; 
	    this.index=this.index+1;
	    this.content.add(this.index, p);
	  }
	  
	  /** retire le <b>dernier</b> produit ajoute au stock et le rend en
	   * resultat */ 
	  public Product remove() {
	    if(isEmpty()) return null;
	    this.index=this.index-1;
	    return this.content.remove();
	  }
	  

	  /** permet de savoir si le stock plein */ 
	  public boolean isFull() { return false; }

	  /** permet de savoir si le stock est vide */
	  public boolean isEmpty() { return index == -1; }

	  /** permet de savoir le nombre d'elements du stock */
	  public int getSize() {return index+1; }
	  
	  /** rend une chaine de caracteres decrivant le stock */ 
	  
	  
	  public String toString() {
		  if (isEmpty()) return "Le stock est vide.";	
			String result;
			result="a";
			for (Product p :content ) {
				result=result+'\n'+p.toString();
			}
			return result;
		}	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
