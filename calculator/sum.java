public class sum {

	

public float resultOf(String s) {
	boolean pos=s.contains("+");
	boolean neg=s.contains("-");
	boolean diviso=s.contains("/");
	boolean mul=s.contains("*");
	
	if(pos==true) {
	 return somma(s);
	
}
	
	if(diviso==true) {
	return divisione(s);
	
}
	
	if(mul==true) {
	return mul(s);
	
}
	if(neg==true) {
		System.out.println(s);
	return sottrazione(s);
	
}
	else return 0;
	}

public float somma(String s) throws ArithmeticException {

	
	
	String[] g=s.split("\\+");   //remove sign from string
	String[] u=g[1].split("=");   //remove "="  from string
	
	int a1=Integer.parseInt(g[0]);
	int a2=Integer.parseInt(u[0]);
	
	return (float)a1+a2;
}

public float divisione(String s) throws ArithmeticException{

	
	
	String[] g=s.split("\\/");   //remove sign from string
	String[] u=g[1].split("=");   //remove "="  from string
	
	int a1=Integer.parseInt(g[0]);
	int a2=Integer.parseInt(u[0]);
	
	return (float)a1/a2;
}

public float mul(String s) throws ArithmeticException{

	
	
	String[] g=s.split("\\*");   //remove sign from string
	String[] u=g[1].split("=");   //remove "="  from string
	
	int a1=Integer.parseInt(g[0]);
	int a2=Integer.parseInt(u[0]);
	
	return (float)a1*a2;
}

public float sottrazione(String s) throws ArithmeticException{

	
	
	String[] g=s.split("\\-");   //remove sign from string
	String[] u=g[1].split("=");   //remove "="  from string
	
	int a1=Integer.parseInt(g[0]);
	int a2=Integer.parseInt(u[0]);
	
	return (float)a1-a2;
}
	
	
	
	
}
