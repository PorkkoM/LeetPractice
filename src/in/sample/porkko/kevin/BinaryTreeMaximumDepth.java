package in.sample.porkko.kevin;

public class BinaryTreeMaximumDepth {
	static Tree root; 
	
	public static void main(String[] args) {
		root = new Tree(10);
        root.left = new Tree(11);
        root.left.left = new Tree(7);
        root.right = new Tree(9);
        root.right.left = new Tree(15);
        root.right.right = new Tree(8);
        
        BinaryTreeMaximumDepth btm = new BinaryTreeMaximumDepth();
        System.out.println("Max Depth -->"+btm.maxDepth(root));
	}

	public int maxDepth(Tree node) {
		if(node ==null) {
			return 0;
		}
		int left = maxDepth(node.left);
		int right  = maxDepth(node.right);
		
		return Math.max(left, right)+1;
	}
	
}
