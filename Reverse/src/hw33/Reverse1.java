package hw33;

public class Reverse1 {
	
	private String str;
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	public Reverse1(String str) {
		super();
		this.str = str;
	}
	
	public Reverse1() {
		
	}
	

	public String part(String str)
	{
		int b=0;
		String str2="";
		char temp;
		String[] words=str.split(" ");
		for(int j=0;j<words.length;j++) {
			char[]symbols1=words[j].toCharArray();
			for(int i=0;i<symbols1.length/2;i++) {
				if(!Character.isDigit(symbols1[i])&&!Character.isDigit(symbols1[symbols1.length-i-1])) {
					temp=symbols1[i];
					symbols1[i]=symbols1[symbols1.length-i-1];
					symbols1[symbols1.length-i-1]=temp;
				}
				else {
					if(Character.isDigit(symbols1[i])&&Character.isDigit(symbols1[symbols1.length-i-1])) {
						i++;
					}
					else {
						if(Character.isDigit(symbols1[i])) {
							if(!Character.isDigit(symbols1[i+1])) {
								temp=symbols1[i+1];
								symbols1[i+1]=symbols1[symbols1.length-i-1];
								symbols1[symbols1.length-i-1]=temp;
							}
							
						}
						if(Character.isDigit(symbols1[symbols1.length-i-1])) {
							b++;
							if(!Character.isDigit(symbols1[symbols1.length-i-1-b])){
								temp=symbols1[i];
								symbols1[i]=symbols1[symbols1.length-i-1-b];
								symbols1[symbols1.length-i-1-b]=temp;
							}
							
						}
					}
					
					
				}
			}
			for(int i=0;i<symbols1.length;i++) {
				str2+=String.valueOf(symbols1[i]);
			}
			
			str2+=" ";	
		}
		return str2;
			
	}
}
