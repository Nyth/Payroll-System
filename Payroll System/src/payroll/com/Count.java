package payroll.com;

public class Count {

	double counter = 0;
        double num ;
        double num1;
    void calculation (String a,double b){
           
        num = Double.parseDouble(a);
        num1=b;
        counter (num,num1);

    }

    void counter (double a,double b){
    	if (b>=a){
    	  	counter += b-a;
    	  	}
    	  	else{
    	  	System.out.println("Error");
    	  	}
    }
}
