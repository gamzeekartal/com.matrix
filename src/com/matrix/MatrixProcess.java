package com.matrix;

public class MatrixProcess {

	public static void main(String[] args) {
		
		int[][] A={
				{3,-3,5}, 
				{-4,6,4},
				{7,8,-1}
				};
		
		int[][] B={
				{1,-3,5}, 
				{3,6,-2},
				{-4,7,1}
				};
		int[][] A1={
				{0,5},	 
				{6,1},
				{-3,-1}
		   };
		int[][] B1={
				{0,-2,2,4},	 
				{3,1,4,5}
		   };
		int[][] A2={
				{0,3,-4},	 
				{1,-1,-3}
		   };
		int[][] B2={
				{4,-2,0,5},	 
				{3,6,7,-3},
				{8,9,1,-1}
		   };
		
		System.out.println("matrix add: ");
 		printMts(add(A,B));
 		System.out.println("\nmatrix subs: ");
 		printMts(subs(A,B));
 		System.out.println("\nmatrix mult1: ");
 		printMts(mult(A1,B1));
 		System.out.println("\nmatrix mult2: ");
 		printMts(mult(A2,B2));
 		
	}
	
	public static int[][] add(int[][] mts1, int[][] mts2){
		
		int[][] addMts = new int[mts1.length][mts1[0].length];
		for(int i=0; i<mts1.length; i++)
			for(int j=0; j<mts1[i].length; j++)
				addMts[i][j] = mts1[i][j] + mts2[i][j];
		return addMts;
	}
	
	public static int[][] subs(int[][] mts1, int[][] mts2){
			
			int[][] subMts = new int[mts1.length][mts1[0].length];
			for(int i=0; i<mts1.length; i++){
				for(int j=0; j<mts1[0].length; j++)
					subMts[i][j] = mts1[i][j] - mts2[i][j];
			}
			return subMts;
		}
	
	public static int[][] mult(int[][] mts1, int[][] mts2){
		
		int[][] mulMts = new int[mts1.length][mts2[0].length];
		if(mts1[0].length!=mts2.length)
			throw new RuntimeException("Illegal matrix dimensions");
		for(int i=0; i<mts1.length; i++){
			for(int j=0; j<mts2[0].length; j++)
				for(int k=0; k<mts1[0].length; k++)
				mulMts[i][j] += mts1[i][k] * mts2[k][j];
		}
		return mulMts;
	}
	
	public static void printMts(int[][] mts){			
			for(int i=0; i<mts.length; i++){
				for(int j=0; j<mts[0].length; j++)
					System.out.print(mts[i][j] + " ");
				System.out.println("");
			}
		}
	
}
