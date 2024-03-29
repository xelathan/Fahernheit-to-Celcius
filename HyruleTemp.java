
import java.io.*;
import java.util.Scanner;

public class HyruleTemp {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(new File("HyruleTempF.txt"));
		PrintWriter writer = new PrintWriter(new File("HyruleTempC.txt"));
		
		double F; double C; int roundC; int count = 0;
		
		while(reader.hasNext()) {
			F = reader.nextDouble();
			C = (F-32)/1.8;
			C *= 10;
			if(C > 0){
				C += 0.5;
			}
			else {
				C -= 0.5;
			}
			roundC = (int)C;
			C = (double)roundC/10;
			writer.print(C + " ");
			count ++;
			if(count % 15 == 0) {
				writer.println();
			}
		
		}
		writer.close();
	}

}
