import java.util.LinkedList;
public class Document {

	
		
		private String title;
		private LinkedList<Section> sections;
		private int index;
		
		public Document(String title) {
			this.title=title;
			this.index=-1;
			this.sections=new LinkedList<Section>();
		}	
		
		
		public void addSection(Section newSection) {
			this.index=this.index+1;
			this.sections.add(this.index,newSection);
			
		}
		
		public String getTitle() {
				return this.title;
		}

				
		public String toString() {
			
			String result;
			result=this.getTitle();
			for (Section s : sections) {
				result=result+'\n'+s.toString();
			}
			return result;
		}	
		
		
		public Section getCurrentSection() {
			
			return this.sections.get(this.index);
			
		}
		
	public Section nextSection() {
		
		if(this.index<sections.size()) {
			this.index=this.index+1;
			return this.sections.get(this.index);
		
		}else {return this.sections.get(this.index);}
		
	}
	
	
   public Section prevSection() {
		
		if(this.index>-1) {
			this.index=this.index-1;
			return this.sections.get(this.index);
		
		}else {return this.sections.get(this.index);}
		
	}
	
			
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Paragraph p,p2;
			p=new Paragraph("je vous aime");
			//System.out.println(p.toString());
			
			p2=new Paragraph("moi aussi");
			//System.out.println(p2.toString());
		
			Section introduction;
			introduction = new Section("introduction");
			//System.out.println(introduction.getTitle());
			
			Section deve;
			deve = new Section("developpement");
			//System.out.println(introduction.getTitle());
			
			introduction.addPara(p);
			introduction.addPara(p2);
			
			//System.out.println(introduction.toString());
			
			Document doc1;
			doc1 = new Document("Poeme1");
			System.out.println(doc1.getTitle());
			

			doc1.addSection(introduction);
			
			
			//System.out.println(doc1.toString());
			//System.out.println(doc1.getCurrentSection());
			//System.out.println(doc1.nextSection());
			//System.out.println(doc1.prevSection());
			
			doc1.addSection(deve);
			System.out.println(doc1.getCurrentSection());
			//System.out.println(doc1.toString());
			System.out.println(doc1.prevSection());
			//System.out.println(doc1.nextSection());
			
			

		}

	}


