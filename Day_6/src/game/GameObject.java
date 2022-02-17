package game;

public abstract class GameObject {
	
	public abstract void draw();
	
		
	
   public static void main(string[] args){
   
	   Player Player = new Player();
	   Player.draw();
	   
	   Menu menu = new Menu();
	   menu.draw();
	  // GameObject myObject = new GameObject();
   }
}

