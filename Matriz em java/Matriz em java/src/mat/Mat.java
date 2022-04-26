package mat;

import java.util.Scanner;

public class Mat {
    
	
	
	public void  mat() 
	{
		System.out.println("Digite o valor de linhas da primeira Matriz: ");
		Scanner readfirstmat = new Scanner(System.in);
		int a = readfirstmat.nextInt();
		System.out.println("Digite o valor de colunas da primeira Matriz: ");
		Scanner readsecondmat = new Scanner(System.in);
		int b = readsecondmat.nextInt();
		System.out.println("Digite o valor de linhas da segunda Matriz: ");
		Scanner readthirdmat = new Scanner(System.in);
		int c = readthirdmat.nextInt();
		System.out.println("Digite o valor de colunas da segunda Matriz: ");
		Scanner readforthmat = new Scanner(System.in);
		int d = readforthmat.nextInt();
		
		int [][]mat = new int[a][b];
		int [][]matPrim = new int[c][d];
		
		Scanner readpositionsmat = new Scanner(System.in);
		
		
	    for(int i=0; i<a; i++) //buscando nas linhas
	    {
	    	for(int j=0; j<b; j++) //buscando nas colunas
	    	{
	    		System.out.println("Digite o valor na posição: ["+ i +"]" + "["+ j +"]:");	
	    		mat[i][j] = readpositionsmat.nextInt();
	    		
	    	}
	   }
	
		
		Scanner readpositionsmatTwo = new Scanner(System.in);
		
		
	    for(int i=0; i<c; i++) //Função que Percorre as linhas da segunda matrix
	    {
	    	for(int j=0; j<d; j++) //Função que Percorre as colunas da segunda matrix
	    	{
	    		System.out.println("Digite o valor na posição: ["+ i +"]" + "["+ j +"]:");	
	    		matPrim[i][j] = readpositionsmat.nextInt();
	    		
	    	}
	   }
	    

	    
	    System.out.println("Diagonal principal da primeira matriz");
	    for (int i = 0; i <a ; i++)
	    {
	    	for (int j = 0; j <b; j++)
	    	{
	    		if (i == j)
	    		{
	    			System.out.println("" + mat[i][j] + "");
	    		}
	    		
	    		else 
	    		{
	    			System.out.print(" * ");
	    		}
	    	}
	    	System.out.print("\n");
	    }
	    
	    System.out.println("Diagonal secudária da primeira matriz");
	    for (int i = 0; i <a ; i++)
	    {
	    	for (int j = 0; j <b; j++)
	    	{
	    		if(j == (a - 1 - i))
	    		{
	    			System.out.print(mat[i][j]);
	    		}
	    		
	    		else 
	    		{
	    			System.out.print(" * ");
	    		}
	    	}
	    	System.out.print("\n");
	    }
	    
	    
	    System.out.println("Diagonal principal da segunda matriz: ");
	    for (int i = 0; i <c ; i++)
	    {
	    	for (int j = 0; j <d; j++)
	    	{
	    		if (i == j)
	    		{
	    			System.out.println("" + matPrim[i][j] + "");
	    		}
	    		
	    		else 
	    		{
	    			System.out.print(" * ");
	    		}
	    	}
	    	System.out.print("\n");
	    }
	    
	    System.out.println("Diagonal secundária da segunda matriz: ");
	    for (int i = 0; i <c ; i++)
	    {
	    	for (int j = 0; j <d; j++)
	    	{
	    		if(j == (c - 1 - i))
	    		{
	    			System.out.print(matPrim[i][j]);
	    		}
	    		
	    		else 
	    		{
	    			System.out.print(" * ");
	    		}
	    	}
	    	System.out.print("\n");
	    }
	    
	    int [][]transMat = new int[b][a];
	    
	    for(int i = 0; i<b; i++)
	    {
	    	for(int j = 0; j<a; j++)
	    	{
	    		transMat[i][j] = mat[j][i];
	    	}
	    	System.out.print("\n");
	    }
	    
	    System.out.println("Resultado da matriz transposta de AxB: ");
	    for(int i = 0; i<b; i++)
	    {
	    	for(int j = 0; j<a; j++)
	    	{
	    		System.out.print(matPrim[i][j]);
	    	}
	    	System.out.print("\n");
	    }
	    
int [][]transmatPrim = new int[d][c];
	    
	    for(int i = 0; i<d; i++)
	    {
	    	for(int j = 0; j<c; j++)
	    	{
	    		transmatPrim[i][j] = matPrim[j][i];
	    	}
	    	System.out.print("\n");
	    }
	    
	    System.out.println("Resultado da matriz transposta de CxD: ");
	    for(int i = 0; i<d; i++)
	    {
	    	for(int j = 0; j<c; j++)
	    	{
	    		System.out.print(transmatPrim[i][j]);
	    	}
	    	System.out.print("\n");
	    }
	    
	    int [][]sumTheMat = new int[a][b];
	    if((a==c)&&(b==d))
	    {
	    	for(int i=0; i<a; i++)
	    	{
	    		for(int j=0; j<b; j++)
	    		{
	    			sumTheMat[i][j]= mat[i][j]+matPrim[i][j];
	    		}
	    	}
	    }
	    else
	    {
	    	System.out.println("Não é possível realizar a soma!!");
	    }
	    
	    System.out.println("Soma das matrizes: ");
	    for(int i=0; i<a; i++)
	    {
	    	for(int j=0; j<b; j++)
	    	{
	    		System.out.print(sumTheMat[i][j]);
	    	}
	    	System.out.print("\n");
	    }
	    
	    
	    int [][]multiplicationMat = new int[a][d];
	    
	     if(b==c)
	     {
	    	 for(int i=0; i<a; i++)
	    	 {
	    		for(int j=0; j<d; j++)
	    		{
	    			for (int k=0; k<b; k++)
	    			{
	    				multiplicationMat[i][k] += mat[i][k]*matPrim[k][j];
	    			}
	    		}
	    	 }
	     }
	     else
	     {
	    	 System.out.println("Não é possível realizar a Multiplicação!!");
	     }
	     
	     System.out.println(" Multiplicação das matrizes: ");
	     for(int i=0; i<a; i++)
	     {
	    	 for(int j=0; j<d; j++)
	    	 {
	    		 System.out.print(multiplicationMat[i][j]);
	    	 }
	    	 System.out.print("\n");
	     }
	     
	     
	}
	
	
	
	
	
	
	
	
	
}

