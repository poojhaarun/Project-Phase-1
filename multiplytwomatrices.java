
public class multiplytwomatrices {
	public static void main(String args[]){    
		int a[][]={{4,4,4},{2,2,2},{8,8,8}};    
		int b[][]={{1,1,1},{6,6,6},{4,4,4}};        
		int c[][]=new int[3][3];      
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		}
		System.out.print(c[i][j]+" ");    
		}
		System.out.println();//new line    
		}    
		}}


