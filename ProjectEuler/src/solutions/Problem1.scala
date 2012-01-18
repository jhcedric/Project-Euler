package solutions

object Problem1 {
	def main(args:Array[String]){
	  solve()
	}
	/*
	 * Add all the natural numbers below one thousand that are multiples of 3 or 5.
	 */
	def solve(){
	  var sum=0;
	  for(i <- 1 until 1000){
		  if(i%3==0 || i%5==0){
			  println(i);
			  sum+=i
		  }
	  }
	  println(sum)
	  
	}
}