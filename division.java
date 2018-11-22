import java.util.Scanner;
public class division {
	public static void main(String[]args){
		Scanner entrada=new Scanner(System.in);
		double a;
		double b;
		double c=0;
		System.out.println("ingrese dividendo");
		a=entrada.nextDouble();
		System.out.println("ingrese divisor");
		b=entrada.nextDouble();
		if(b==0){
			System.out.println("division indeterminada");
		}
		else{
			while(a>=b){
				c++;
				a=a-b;
			}
			System.out.println("cociente= "+c);
			System.out.println("resto= "+(a));
		}
		
		entrada.close();
	}
}
