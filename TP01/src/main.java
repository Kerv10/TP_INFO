public class main {

	
	/** Une methode main qui teste cette classe */
	  public static void main(String[] args) {
	    Stock s = new Stock(8);
		Producer po1 = new Producer("pat",s);
		System.out.println(po1.getName());
	    po1.SetName("gaston");
	    System.out.println(po1.getStock());
	    po1.produce("Voiture");
	    System.out.println(po1.getName());
	    System.out.println(po1.getStock());
	    System.out.println(po1.toString());
	    
	    /**
	    System.out.println("Le nombre de produits crees est " + Product.getNumberCreated());
	    new Product("");
	    Product p3 = new Product("p3");
	    System.out.println(p3); 
	    System.out.println("Le nom de p3 est " + p3.getName()); 
	    System.out.println("Le numéro de p3 est " + p3.getNumber()); 
	    System.out.println("Le nombre de produits crees est " + Product.getNumberCreated());

	    System.out.println("Nous allons creer 12 produits :");
	    for(int i = 1; i <= 12; i ++)
	      new Product("p" + i);
	    System.out.println("Le nombre de produits crees est " + Product.getNumberCreated());
	  **/
	  }
	  
	}
	
	



