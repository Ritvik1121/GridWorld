1. The bug moves to a new location when there is a new location
2. The bug starts moving up then to the right in a counter clockwise motion.
3. 
4. a flower
5. it will turn and continue onto the nearest empty square
6. it will go to a space that is diagonal
7. no
8. it turns red once the bug crosses it
9. no
10. yes the bug and the flower can be on the same location

exercises
1.  0  N
    45 NE
    90 E
    135 SE
    180 S
    225 SW
    270 W
    315 NW
    360 N
2. can move anywhere in any direction. When you move the bug outside of the grid it you get an error message saying that the argument is out of bounds.
3. setColor
4. The bug dissapeared when the rock was moved off.


PART 2
1. sidelength is the side length of the box itself.
2. step is a count for how many boxes the bug has crossed
3. the bug has to turn a full 90 degress in order to make a complete box.
4. BoxBug inherits the method from Bug
5. yes, because the sideLength was given when constructed.
6. It can if it comes across a rock or the end of the grid.
7. At the start and then after steps becomes equal to sideLength the steps count is reset to 0.

exercises
1. The bug makes the shape of a octogon shape that's supposed to be a circle.
 5. Create a new bug. then use the world.add feature to add it somewhere in the world.

Activity 3

set 3
1. locl.getRow()
2. false
3. 4, 4
4. 135 degrees
5. indicates direction of adj neighbor to find

set 4
1. gr.getOccupiedLocations().size() will find the number of occupied locations in any type of grid.

gr.getNumRows()*gr.getNumCols() - gr.getOccupiedLocations().size() will find the number of empty locations. 
2. gr.isValid(new Location(10,10))
3. Grid is an interface. BoundedGrid and UnboundedGrid extend AbstractGrid class and use the other methods needed by the Grid interface
4. filling an array would be just  as easy as filling an arraylist so it doesn't matter.

set 5
1. color, direction and loctaion
2. blue north
3. You need to be able to create methods and variables
4. a - no 
   b - no
   c - yes
5. you can use the setDirection method in order to turn the actor.

set 6
1. if(!gr.isValid(next))
    return false;
2. Actor neighbor = gr.get(next);
return (neighbor == null) || (neighbor instanceof Flower); 
3. isValid and get methods
4. getAdjacentLocation method
5. getLocation, getDirection, getGrid
6. the bug will remove itself from the grid
7. Yes it is needed because its stores the bug's loctaion and is used to put the flower in place
8. Easier to see which bug dropped which flower
9. when you use removeSelfFromGrid method it won't this method is from the actor class
10. Flower flower = new Flower(getColor());
flower.putSelfInGrid(gr, loc); 
11. four times'

Group Activity
a. turn
b. turn
c. turn
d. turn
e. if the other jumper is one space in front the jumper will jump.
f.  

a. Bug
b. Bug, Jumper is still a bug that just moves two spaces
c. Yes, no parameters are needed
d. act() move() canMove()
e. none
f. Set up an "obtacle course on the grid and see how the jumper functions

