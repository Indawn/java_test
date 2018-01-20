
public class HammingDistance {
	public int hammingDistance(int x, int y) {
		if(x < 0)
			return -1;
		if(y < 0)
			return -1;
		if(x > y){
			int temp = x;
			x = y;
			y = temp;
		}
		int sum = 0;
		while(y != 0){
			if(x%2 != y%2)
				sum++;
			y = y/2;
			x = x/2;
		}
		return sum;
	}
	public static void main(String[] agrv){
		HammingDistance test = new HammingDistance();
		int result = test.hammingDistance(1, 5);
		System.out.println(result);
	}

}
