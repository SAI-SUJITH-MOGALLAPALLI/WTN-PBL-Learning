package JavaFundamentals.MiniProject1;

public class PBLMiniProject1 {
	@SuppressWarnings("unused")
	private static String[] joinDates;

	public static void main(String[] args) {
		String[][] empTable={{"1001","1002","1003","1004","1005","1006","1007"},
					{"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"},
					{"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"},
					{"e","c","k","r","m","e","c"},
					{"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"},
					{"20000","30000","10000","12000","50000","23000","29000"},
					{"8000","12000","8000","6000","20000","9000","12000"},
					{"3000","9000","1000","2000","20000","4400","10000"}
		};
		int employeeId=Integer.parseInt(args[0]);
		int index=-1;
		for(int i=0;i<7;i++) {
			if(employeeId==Integer.parseInt(empTable[0][i])) {
				index=i;
				break;
			}
		}
		if(index==-1)
			System.out.println("There is no employee with empid:"+employeeId);
		else {
			char ch=empTable[3][index].charAt(0);
			int daSal=0;
			String desig="";
			switch(ch){
				case 'e':
					daSal=20000;
					desig=desig+"Engineer";
					break;
				case 'c':
					daSal=32000;
					desig=desig+"Consultant";
					break;
				case 'k':
					daSal=12000;
					desig=desig+"Clerk";
					break;
				case 'r':
					daSal=15000;
					desig=desig+"Receptionist";
					break;
				case 'm':
					daSal=40000;
					desig=desig+"Manager";
					break;
			}
			int salary=0;
			salary=Integer.parseInt(empTable[5][index])+Integer.parseInt(empTable[6][index])+daSal-Integer.parseInt(empTable[7][index]);
			System.out.println("EmpNo."+"\t"+"EmpName"+"\t"+"Department"+"\t"+"Designation\tSalary");
			System.out.println(empTable[0][index]+"\t"+empTable[1][index]+"\t"+empTable[4][index]+"\t\t"+desig+"\t\t"+salary);
		}
	}
}
