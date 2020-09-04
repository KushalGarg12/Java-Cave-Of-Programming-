
public class app {

	public static void main(String[] args) {
		Plant plant1=new Plant();
		Tree tree =new Tree();
		
		Plant plant2=plant1;//or can use Plant plant2=tree as Tree is the child class of Plant
		//plant2.grow();
		tree.shedleaves();
		//plant2.shedleaves();
		dogrow(tree);
		
	}
	public static void dogrow(Plant plant){
		plant.grow();
		plant.length();
	}

}
