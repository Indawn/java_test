
public class Linklist {	
	private int val;
	private Linklist next;
	public Linklist(int val){
		this.val=val;
	}
	public void printLinklist(Linklist root){
		if(root == null)
			System.out.println("empty");
		while(root != null){
			System.out.print(root.val+" ");
			root = root.next;
		}
	}
	public int find(Linklist root, int index){
		if(root == null)
			return -1;
		else{
			while(index > 1){
				root = root.next;
				index -= 1;
			}
		return root.val;
		}
		
	}
	
	public void remove(Linklist root, int index){
		if(root != null){
			Linklist prv = null;
			while(index > 1){
				prv =root;
				root = root.next;
				index -= 1;
			}
			
			Linklist temp = root.next;
			prv.next = temp;
			root = null;
				
		}
			
	}
	
	public void insert(Linklist root, int index, int val){
		if(root != null){
			Linklist prv = null;
			while(index > 1){
				prv = root;
				root = root.next;
				index -= 1;
			}
			Linklist temp =new Linklist(val);
			prv.next = temp;
			temp.next = root;
			
		}
	}
	
	public static void main(String[] argv)
	{
		Linklist root = new Linklist(1);
		root.next = new Linklist(2);
		root.next.next = new Linklist(3);
		root.next.next.next = new Linklist(4);
		root.next.next.next.next = new Linklist(5);
		root.printLinklist(root);
		
		
		int findindex = 2;
		System.out.print("\n"+"index("+findindex+") = "+root.find(root,findindex));
		
		
		root.remove(root, findindex);
		System.out.print("\nremove index("+findindex+"):  ");
		root.printLinklist(root);
		
		
		root.insert(root, findindex, 9);
		System.out.print("\ninsert index("+findindex+") = 9 :  ");
		root.printLinklist(root);
		
		
	}

}
