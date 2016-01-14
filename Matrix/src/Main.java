

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		ReadMatrix readMatrix = new ReadMatrix("array.txt");

		WorkMatrix workSquare = new WorkMatrix(readMatrix.getMatrix());

		PrintWriter writer = new PrintWriter("src/out.txt", "UTF-8");
		
		
		writer.print(readMatrix.toString());
		
		writer.println();
		writer.println("Suma matrice = "+workSquare.SumaMatrix());
		writer.println("Suma elm. aflate sub diagonala principala = " + workSquare.suma_sub_diagonala());
		writer.println("Suma elm. pare din matrice = " + workSquare.SumaElmPare());
		writer.println("Suma elm. impare din matrice = " + workSquare.SumaElmImpare());
		writer.println("Suma elm. prime din matrice = " + workSquare.SumaPrime());
		writer.println("Suma patratelor perfecte din matrice = " + workSquare.SumaPatrate());
		writer.println("Elementul maxim din matrice = " + workSquare.MaxMatrix());
		writer.println("Elementul minim din matrice = " + workSquare.MinMatrix());
		writer.println("Elementele pare din matrice = " + workSquare.Pare());
		writer.println("Numarul elementelor pare din matrice = " + workSquare.Impare());
		writer.println("Numarul patratelor perfecte din matrice = " + workSquare.PatratPerf());
		writer.println("Numarul de elemente prime= "+workSquare.Prim());
		writer.println("Daca matricea este patratica: ");
		writer.println("Suma elm. de pe diagonala principala= "+workSquare.DiagPrinc());
		writer.println("Suma elm. de pe diagonala secundara= "+workSquare.DiagSec());
		writer.println("Suma elm. de deasupra diagonalei principale= "+workSquare.SumaElDiagP());
		writer.println("Suma elm. aflate sub diagonala principala = " + workSquare.suma_sub_diagonala());
		writer.println(""+workSquare.TestDiag());
		writer.println(workSquare.SumLin());
		writer.println(workSquare.SumCol());
		writer.println();
		writer.println();
		writer.println();
		writer.close();
		
	}


		
		
	}

