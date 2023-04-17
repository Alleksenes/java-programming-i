public class CubesConstructor { 
        private int cube;
        
        public CubesConstructor(int cube){
            this.cube = cube;
        }
        
        public int volume(){
            return (int) Math.pow(this.cube, 3);
        }
        
        @Override
        public String toString(){
            return "The length of the edge is " + this.cube + " and the volume " + volume();
        }
    }
