	package Practice;
	 
	import java.util.Scanner;

	import Validate.Validate;

	import java.util.Random;
	import java.util.Date;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.time.Duration;

	public class Details {
	public static void main(String Args[]){
		
		Scanner sc= new Scanner(System.in);
		while(true){
		System.out.println("1)Enter the details :\n 2)Print The details :\n 3)Exit");
		int a=sc.nextInt();
		switch(a){
		case 1: AddPatient();
				break;
		case 2: PrintDetails();
				break;
		case 3: System.out.println("Exiting...");
		        System.exit(0);
		default: System.out.println("Enter valid input");
				break;
		}
		}
	}
	private static void PrintDetails() {
		// TODO Auto-generated method stub
		
	}
	private static void AddPatient(){
		Scanner sc= new Scanner(System.in);
		try{
		System.out.println("Enter the Customer Name");
		String name= sc.next();
		if(Validate.ValidateName(name)){
	     	System.out.println("Enter the Age");
	     	String age=sc.next();
	    if(Validate.ValidateAge(age)){
	     	System.out.println("Enter patient phone number");
	     	String phoneno=sc.next();
	    if(Validate.ValidateNo(phoneno)){
	     		System.out.println("Enter Description");
	         	String desc=sc.next();
	    if(Validate.ValidateDesc(desc)){
	         	Random rand=new Random();
	         	int pid=rand.nextInt();
	         	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	        	Date date = new Date();
	        	System.out.println(dateFormat.format(date));
	         	}
	     	}
	     	}
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	}


