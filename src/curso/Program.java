package curso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
       SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
       SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       Date x1= new Date(System.currentTimeMillis());
       Date x2 = new Date();
       Date x3 = new Date(0L);
       
       
       Date y1 = sdf1.parse("29/09/2020");
       Date y2 = sdf2.parse("29/09/2020 13:27:07");
       
       System.out.println(x1);
       System.out.println(x2);
       System.out.println(y1);
       System.out.println(y2);
	}

}
