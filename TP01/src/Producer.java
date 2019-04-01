public class Producer {
	
	private String namepro;
	private Stock myStock;
	
	public Producer(String name, Stock s) {
		namepro =name;
		myStock=s;				
	}
	public String getName() {
		return this.namepro;	
	}
	public void SetName(String newName) {
		this.namepro=newName;
		
	}
	public Stock getStock() {
		return myStock;		
	}
	public void produce(String newProduit) {		
		 myStock.add(new Product(newProduit));
	}
	
	public String toString() {
		return "je suis "+this.namepro+" un producteur et voici mon stock "+this.myStock;
				
	}
	
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
	    
	   
	  }
	
	
	
}
