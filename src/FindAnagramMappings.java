
public class FindAnagramMappings {
    public int[] anagramMappings(int[] A, int[] B) {
    	int[] C = new int[A.length];
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A.length; j++)
            {
            	
                if(A[i] == B[j])
                {
                	C[i] = j;
                	
                	break;
                }
                	
            }
        }
        return C;
    }

    public static void main(String[] argv){
    	int[] A = {1, 2, 3, 4, 3};
    	int[] B = {3, 3, 4, 2, 1};
    	FindAnagramMappings test = new FindAnagramMappings();
    	int[] C = test.anagramMappings(A, B);
    	for(int i = 0; i < C.length; i++)
        {
    		System.out.print(C[i] + "  ");
        }
    }
}
