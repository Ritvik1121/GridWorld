import info.gridworld.actor.Bug;


public class ZBug extends Bug {
	
	private int steps;
	private int sideLength;
    private int side;

	
	public ZBug(int length) {
		steps = 0;
        side = 0;
		sideLength = length;
	}

	public void act() {
		if (side == 0) {
			turn();
            turn();
            for ( int i = 0; i < sideLength; i ++){
                move();
            }
            side++;
		} else if (side == 1){
			turn();
			turn();
			turn();
            for ( int i = 0; i < sideLength; i ++){
                move();
            }
            side++;
		} else if (side ==2){
            turn();
            turn();
            turn();
            turn();
            turn();
            for ( int i = 0; i < sideLength; i ++){
                move();
            }
            side++;
        }
	}
}