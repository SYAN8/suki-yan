class Cat {
		//Indicates the horizontal axis of cats
		int x = 0; 
		//Indicates the ordinate of cats
		int y = 0;
		
		public int getX() {
			return x;
		}
 
		public void setX(int x) {
			this.x = x;
		}
 
		public int getY() {
			return y;
		}
 
		public void setY(int y) {
			this.y = y;
		}
		public Cat(int x, int y){
			this.x = x;
			this.y = y;
		}
}