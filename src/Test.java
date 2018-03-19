//import java.io.File;

public class Test {
	
	public  static int printnum(int[][] a)
	{
		int m=a.length,n=a[0].length;
		
	    int ii,jj;
	    for(ii=0;ii<m;ii++)
	    {
	        for(jj=0;jj<n;jj++)
	        	System.out.printf("%4d",a[ii][jj]);
	        	//System.out.printf("%4d(%2d)",a[ii][jj],prt(ii,jj,m,n));
	        System.out.println("");
	    }
	    System.out.printf("------------------------------------>");
	    
	    int stat=0;
	    int  i=0,  j=0;
	    int di=0, dj=0;
	    
	    for(ii=0;ii<m*n;ii++)
	    {
	        i=i+di;
	        j=j+dj;
	    	int prtstat=prt(i,j,m,n);
	    	//System.out.printf("   [%d]",prt(i,j,m,n));
	        System.out.printf("%3d",a[i][j]);	
	        if(i+j==0)
	        { 
	        	if(n==1)
	        	{
	        		di=1;dj=0;
	        		stat=-3;
	        	}
	        	else
	        	{
	        		di=0;dj=1;
	        		stat=-1;
	        	}      
	        }
	        else
	        {
	        	
	        	switch(prtstat)
	        	{
	        	case -1:
	        		 if(stat==3||stat==1)
		                {
		                    di=0;
		                    dj=1;
		                    stat=-1;
		                }
		                else if(stat==-1)
		                {
		                    di=1;
		                    dj=-1;
		                    stat=-3;
		                }
	        		 break;
	        	case 1:
	        		 if(stat==-3||stat==-1)
		                {
		                    di=1;
		                    dj=0;
		                    stat=1;
		                }
		                else if(stat==1)
		                {
		                    di=-1;
		                    dj=1;
		                    stat=3;
		                }
	        		 break;
	        	case 3:
	                if(stat==-3)
	                {
	                    di=0;
	                    dj=1;
	                    stat=3;
	                }
	                else if(stat==1)
	                {
	                    di=-1;
	                    dj=1;
	                    stat=3;
	                }
	                break;
	                
	        	case -3: 
	        		if(stat==3)
	                {
	                    di=1;
	                    dj=0;
	                    stat=-3;
	                }
	                else if(stat==-1)
	                {
	                    di=1;
	                    dj=-1;
	                    stat=-3;
	                } 
	        		break;
	        		
	        	case -2:
	        		if(stat==3||stat==1)
	                {
	                    di=1;
	                    dj=0;
	                    stat=-3;
	                }
	                else if(stat==-3)
	                {
	                    di=1;
	                    dj=-1;
	                    stat=-1;
	                }
	        		break;
	        	case 2:
	        		if(stat==-1||stat==-3)
	                {
	                    di=0;
	                    dj=1;
	                    stat=3;
	                }
	                else if(stat==3)
	                {
	                    di=-1;
	                    dj=1;
	                    stat=1;
	                }	
	        		break;
	        	}
	        }
	    }
	    return 0;
	}
	public static int prt(int i, int j, int m, int n)
	{
	    int pp=0;
	    if(i==m-1)
	        pp=2;
	    if(i==0)
	        pp=-1;
	    if(j==n-1)
	        pp=-2;

	    if(j==0)
	        pp=1;
	    if(i==0&&j==n-1)
	        pp=-3;
	    if(i==m-1&&j==0)
	        pp=3;
	    if(m==1||n==1)
	    	pp=0;
	    
	    return pp;
	}
	
	public static void main(String[] args){
		int[ ][ ] arr ={
				 	{1, 2, 3, 4},
			        {5, 6, 7, 8},
			        {9, 10,11,12},
			        {13,14,15,16},
			        {17,18,19,20}};
		printnum(arr);     
	}
}
/*
{
			        {1, 2, 3, 4 },
			        {5, 6, 7, 8 },
			        {9, 10,11,12},
			        {13,14,15,16},
			        {17,18,19,20}};
*/