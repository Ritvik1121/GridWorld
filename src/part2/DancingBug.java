import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	
	private int step;
	private int sideLength;
    private int[] turns;
    private int currentEntry;

	public BoxBug(int length) {
		step = 0;
        this.turns = turns;
		sideLength = length;
	}

	
	public void act() {
        for(int i = 0; i < this.array[currentEntry]); i++){
            turn();
        }
        if(canMove()){
            move()
        }

        this.currentEntry++;
        if(this.currentEntry >= this.array.length){
            this.currentEntry = 0;
        }
	}
}