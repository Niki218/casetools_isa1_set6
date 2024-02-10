package casetools_isa1_set6;

 public class vegetables {
	    String name;
		vegetables(String name)
		{
			this.name=name;
		}
	
	
	public static void main(String[]args) {
		//TODO Auto-generated method stub
		vegetables spinach=new vegetables("spinach");
		System.out.println("vegetables is"+spinach.name);
		
	}
	
	
	String getType()
	{
		return name;
	}
}
