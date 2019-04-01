import java.util.LinkedList;

public class Section {
	
	private String title;
	private LinkedList<Paragraph> para;
	private int index;
	
	public Section(String title) {
		this.title=title;
		this.index=-1;
		this.para=new LinkedList<Paragraph>();
	}	
	public void addPara(Paragraph newPara) {
		this.index=this.index+1;
		this.para.add(this.index,newPara);
		
		
	}
	
	public String getTitle() {
			return this.title;
	}

	public String toString() {
		
		String result;
		result=this.getTitle();
		for (Paragraph p : para) {
			result=result+'\n'+p.toString();
		}
		return result;
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paragraph p,p2;
		p=new Paragraph("je vous aime");
		//System.out.println(p.toString());
		
		p2=new Paragraph("moi aussi");
		//System.out.println(p2.toString());
	
		Section introduction;
		introduction = new Section("resume du document");
		//System.out.println(introduction.getTitle());
		
		introduction.addPara(p);
		introduction.addPara(p2);
		
		System.out.println(introduction.toString());
		
		

	}

}
