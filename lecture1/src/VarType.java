
public class VarType {


	public static void main(String[] args) {
		int num = 0;
		int num2 = 20;
		int num1;
		num1 = 33 + num2; // + zīme darbojas kā summētājs
		String string = "";// vairāki simboli pēc kārtas ir String (character sequence)
		System.out.println("Num value: "+num+num1);// + zīme strādā kā apvienošanas operators (connection operator) - apvieno vienā stringā nevis sasummē
		System.out.println("Num1 value: "+num1);
		System.out.println("Num value: "+(num+num1));

	}

}
