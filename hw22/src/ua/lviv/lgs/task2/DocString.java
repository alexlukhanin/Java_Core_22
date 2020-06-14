package ua.lviv.lgs.task2;

public class DocString {
	
	private String str;

	
	
	public DocString() {
		super();
		this.str = "Default String";
	}

	
	public DocString(String str) {
		super();
		this.str = str;
	}



	public String getStr() {
		return str;
	}

	
	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "DocString [str=" + str + "]";
	}
	
	
	
	
}
