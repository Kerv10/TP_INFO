
public class Paragraph {
	
	private String texte;
	public Paragraph(String texte) {
		this.texte=texte;
	}

	public String toString() {
		return this.texte;
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paragraph p;
		p=new Paragraph("je vous aime");
		System.out.println(p.toString());
		
		p=new Paragraph("je vous aime");
		System.out.println(p.toString());
	}

}
