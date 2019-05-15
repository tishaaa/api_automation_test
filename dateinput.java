package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dateinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		String expectedPattern = "MM/dd/yyyy";
	    SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern);
	    try
	    {
	    	Date date = formatter.parse(input);
	    	System.out.println(date);
	    }
	    catch(ParseException e)
	    {
	    	e.printStackTrace();
	    }
	}

}
