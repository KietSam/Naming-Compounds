import java.util.*;
public class NamingCompounds {
	public static void main (String[]args){
		Scanner console = new Scanner (System.in);
		System.out.print("Type in a molecular formula to get it's name: ");
		String formula = console.next();
		String [] symbols = getTwo(formula);
		System.out.println(Arrays.toString(symbols));
		
		boolean found = false;
		int x = 0;
		if (formula.contains("(") && formula.contains(")")){
			while (found == false){
            System.out.println(formula.substring(0, x));
				if (formula.substring(0, x).equals(symbols[0])){
					found = true;
				}
				else if (formula.substring(0, x).equals(symbols[1])){
					String temp = symbols[0];
					symbols[0] = symbols[1];
					symbols[1] = temp;
					found = true;
				}
				else {
					x++;
				}
			}
		}
      if (getTypeFromSymbol(symbols[0]).equals("tm")){
         System.out.println(getNameFromSymbol(symbols[0]) + " " + getRomanNumerals(symbols, formula) + " " + getNameFromSymbol(symbols[1]));
      }
      else {
         System.out.println(getNameFromSymbol(symbols[0]) + " " + getNameFromSymbol(symbols[1]));
      }
	}
	public static String[] getTwo (String formula){
		if (!(formula.contains("(") && formula.contains(")"))){
         String longest = "";
			for (Element x: Element.values()){
				if (formula.contains(x.getSymbol())){
               if (x.getSymbol().length() > longest.length()){
                  longest = x.getSymbol();
               }
				}
			}
         System.out.println(longest);
			String[] lSymbols = {, }; //lsymbols = less symbols
			return lSymbols;
		}
		else {
			String[] lSymbols = new String[2];
			formula = removeChar(formula, '(');
			int x = 0;
			while (!formula.substring(0, x).contains(")")){
				x++;
			}
			lSymbols[0] = formula.substring(0, x-1);
			int x2 = x+1;
			while (isNumber(formula.substring(x, x2))){
				x2++;
			}
			String second = formula.substring(x2-1);
			if (second.contains("(") && second.contains(")")){
				second = removeChar(second, '(');
				x = 0;
				while (!second.substring(0, x).contains(")")){
					x++;
				}
				lSymbols[1] = second.substring(0, x-1);
			}
			lSymbols[1] = second;
			return lSymbols;
		}
	}
	
   public static String getRomanNumerals (String[] symbols, String formula){
      int x = 1;
      while (isNumber(formula.substring(symbols[0].length(),symbols[0].length()+x))){
         System.out.println(formula.substring(symbols[0].length(),symbols[0].length()+x));
         x++;
      }
      if (formula.substring(symbols[0].length(),symbols[0].length()+x-1).equals("")){
         return numToRN(getChargeFromSymbol(symbols[1]));
      }
      return formula.substring(symbols[0].length(),symbols[0].length()+x-1);
   }
   
   //Number to Roman Numeral
   public static String numToRN (int n) {
      n = Math.abs(n);
      if (n == 1){
         return "(I)";
      }
      else if (n == 2){
         return "(II)";
      }
      else if (n == 3){
         return "(III)";
      }
      else if (n == 4){
         return "(IV)";
      }
      else {
         return "(V)";
      }
   }
   
   public static int getChargeFromSymbol (String symbol) {
		for (Element x: Element.values()){
			if (x.getSymbol().equals(symbol)){
				return x.getCharge();
			}
		}
		return -77;
	}
   
	public static String getNameFromSymbol (String symbol) {
		for (Element x: Element.values()){
			if (x.getSymbol().equals(symbol)){
				return x.getName();
			}
		}
		return "No such symbol";
	}
   
   public static String getTypeFromSymbol (String symbol) {
		for (Element x: Element.values()){
			if (x.getSymbol().equals(symbol)){
				return x.getType();
			}
		}
		return "No type.";
	}
	
	//Removes the first instance of char b from string a
	public static String removeChar (String a, char b){
		return a.substring(0,a.indexOf(b)) + a.substring(a.indexOf(b)+1);
	}
	
	
	public static boolean isNumber (String a){
		try {
			Integer.parseInt(a);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}