
public class JudgeRouteCircle {
	public boolean judgeCircle(String moves){
		int[] temp = {0, 0};
		for(int i = 0; i < moves.length(); i++){
			switch(moves.charAt(i)){
			case 'U':
				temp[1]++;
				break;
			case 'D':
				temp[1]--;
				break;
			case 'L':
				temp[0]++;
				break;
			case 'R':
				temp[0]--;
				break;
			}
		}
		if(temp[0] == 0 && temp[1] == 0)
			return true;
		else
			return false;
	}
	public static void main(String[] argv){
		JudgeRouteCircle test = new JudgeRouteCircle();
		//(test.judgeCircle("RL")){
			System.out.println(test.judgeCircle("RLU"));
		//}
		
	}
}
