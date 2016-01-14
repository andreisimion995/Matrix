


public class WorkMatrix {
	private int[][] matrix;

	public WorkMatrix(int[][] matrix) {
		this.setMatrix(matrix);
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	public int SumaMatrix(){
		int s = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				s=s+matrix[i][j];
			}
		}
		return s;
	}
	
	 public int SumaElmImpare()
	 {
	     int i,j,sum;
	     sum=0;

	     for(i=0;i<matrix[0].length;i++)
	         for(j=0;j<matrix[1].length;j++)
	             {
	                System.out.println("i="+i+"  j="+j);
	                if(matrix[i][j]%2 != 0)
	                    sum=sum+matrix[i][j];
	            }
	     return sum;
	 }
	
	 public int SumaElmPare()
	 {
     int i,j,sum;
     sum=0;

     for(i=0;i<matrix[0].length;i++)
         for(j=0;j<matrix[1].length;j++)
             {
                System.out.println("i="+i+"  j="+j);
                if(matrix[i][j]%2==0)
                    sum=sum+matrix[i][j];
            }
     return sum;
 }

	
		public double suma_sub_diagonala()
			{
				double suma = 0;
				
				if(matrix.length != matrix.length)
					{
						System.out.println("Matricea nu este patratica!");
						return 0;	
					}
					
				for(int i = 1; i < matrix.length; i++)
					for(int j = 0; j < i; j++)
						suma += matrix[i][j];
				
				return suma; 		 	
			}	

		public int SumaPrime()
		{
			int s=0;
			for(int i=0;i<matrix.length;i++)
			{
				for(int j=0;j<matrix.length;j++)
				{
					for(int k=2;4*k<matrix.length;k++)
						if(matrix[i][j]%k==0)
							s+=matrix[i][j];
				}
			}
			
			return s;		
		}

		public int SumaPatrate()
		{
			double a=0;
			int s=0;
			for(int i=0;i<matrix.length;i++)
			{
				for(int j=0;j<matrix.length;j++)
				{
					a=Math.sqrt(matrix[i][j]);
					if(matrix[i][j]/a==a)
							s+=matrix[i][j];
				}
			}
			
			return s;		
		}
		
		public int MaxMatrix()
		{
			int max=matrix[0][0];
			for(int i=0;i<matrix.length;i++)
			{
				for(int j=0; j<matrix.length;j++)
				{
					if(max<matrix[i][j])
						max=matrix[i][j];
				}
			}
			return max;
		}
		
		
		public int MinMatrix()
		{
			int min=matrix[0][0];
			for(int i=0;i<matrix.length;i++)
			{
				for(int j=0; j<matrix.length;j++)
				{
					if(min>matrix[i][j])
						min=matrix[i][j];
				}
			}
			return min;
		}

		public int Pare()
		{
			int counter=0;
			for (int i = 0; i < matrix.length; i++) 
			{
				for (int j = 0; j < matrix.length; j++) 
				{				
						if(matrix[i][j]%2==0)
							counter++;				
				}
			}
			return counter;
		}

		public int Impare()
		{
			int counter=0;
			for (int i = 0; i < matrix.length; i++) 
			{
				for (int j = 0; j < matrix.length; j++) 
				{				
						if(matrix[i][j]%2==1)
							counter++;				
				}
			}
			return counter;
		}
		

		public double PatratPerf()
		{
			double a = 0;
			int contor = 0;
			for(int i=0;i<matrix.length;i++)
			{
				for(int j=0;j<matrix.length;j++)
				{
					a=Math.sqrt(matrix[i][j]);
					if(matrix[i][j]/a==a)
						contor++;
				}
			}
			
			return contor;
		}
		

		public int Prim()
		{
			int contor=0;
			for(int i=0;i<matrix.length;i++)
			{
				for(int j=0;j<matrix.length;j++)
				{
					for(int k=2;4*k<matrix.length;k++)
						if(matrix[i][j]%k==0)
							contor++;
				}
			}
			
			return contor;		
		}
		
		public int DiagPrinc() {
			int s = 0;
			for (int i = 0; i < matrix.length; i++)
				s = s + matrix[i][i];

			return s;
		}

		public int DiagSec() {
			int s = 1;
			for (int i = 0; i < matrix.length; i++)
				s += matrix[i][matrix.length - i - 1];

			return s;
		}

		public int SumaElDiagP() {
			int s = 0;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++)
					if (i < j)
						s += matrix[i][j];
			}

			return s;

		}

		public String TestDiag() {

			if (DiagPrinc() == DiagSec())
				return "Sumele sunt egale" + " " + DiagPrinc() + "=" + DiagSec();
			else
				return "Sumele nu sunt egale" + " " + DiagPrinc() + "!=" + DiagSec();

		}
		
		public String SumLin() {
			int s1 = 0, s2 = 0, L1 = 0, L2 = 0, ok = 0;
			for (int i = 0; i < matrix.length; i++)
				s1 = s1 + matrix[L1][i];
			for (int i = 0; i < matrix.length; i++)
				s2 = s2 + matrix[L2][i];
			for (int i = 0; i < matrix.length; i++)
				if (matrix[L1][i] != matrix[L2][i])
					ok = 0;
			if (ok == 0)
				return "Exista linii cu sume identice";
			else
				return "Nu exista";
		}

		public String SumCol() {
			int s1 = 0, s2 = 0, L1 = 0, L2 = 0, ok = 0;
			for (int j = 0; j < matrix.length; j++)
				s1 = s1 + matrix[L1][j];
			for (int j = 0; j < matrix.length; j++)
				s2 = s2 + matrix[L2][j];
			for (int j = 0; j < matrix.length; j++)
				if (matrix[L1][j] != matrix[L2][j])
					ok = 0;
			if (ok == 0)
				return "Exista coloane cu sume identice";
			else
				return "Nu exista";
		}

	}
	
		

