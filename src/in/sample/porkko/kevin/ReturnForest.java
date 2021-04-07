package in.sample.porkko.kevin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReturnForest {
	
	public static void main(String[] args) {
		
	}

	
	public List<Tree> delNode(Tree root, int[] delnodes){
		List<Tree> remainingNodes = new ArrayList<>();
		Set<Integer> toDelete = new HashSet<>();
		for(int d:delnodes) {
			toDelete.add(d);
		}
		removeNodes(root,toDelete,remainingNodes);
		if(!toDelete.contains(root.val)) {
			remainingNodes.add(root);
		}
		return remainingNodes;
	}

	public Tree removeNodes(Tree root, Set<Integer> toDelete, List<Tree> remainingNodes) {
		if(root == null) {
			return null;
		}
		root.left = removeNodes(root.left,toDelete,remainingNodes);
		root.right = removeNodes(root.right,toDelete,remainingNodes);
		if(toDelete.contains(root.val)) {
			
			if(root.left!=null) {
				remainingNodes.add(root.left);
			}
			if(root.right!=null) {
				remainingNodes.add(root.right);
			}
			return null;
		}
		
		
		return root;
	}
}
