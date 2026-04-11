public class PracticeProblem {

	public static void main(String args[]) {

	}

	
	public static String seriesInclusive(int number){
    if(number < 1){
        return "";
    }
    String word = "";
    int number1 = 1;

    while(number1 <= number){
        word+=number1;
        if(number1 != number){
            word += " ";
        }
        number1++;
    }

    return word;
}
	public static String seriesExclusive(int number){
		String word="";
		int number1=0;
		while(number1<number){
			word+=number1;
			number1++;
			if(number1<number){
				word+=" ";
			}
		}
		return(word);
	}
}
