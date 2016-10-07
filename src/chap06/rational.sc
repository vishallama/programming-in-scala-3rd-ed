package chap06

object rational {
	val oneHalf = new Rational(1, 2)          //> oneHalf  : chap06.Rational = 1/2
	val twoThirds = new Rational(2, 3)        //> twoThirds  : chap06.Rational = 2/3
	println(oneHalf + twoThirds)              //> 7/6
	
	val y = new Rational(3)                   //> y  : chap06.Rational = 3/1
	println(y)                                //> 3/1
	
	// Rational in normalized form
	val x = new Rational(66, 42)              //> x  : chap06.Rational = 11/7
	println(x)                                //> 11/7
	
	val a = new Rational(1, 2)                //> a  : chap06.Rational = 1/2
	val b = new Rational(2, 3)                //> b  : chap06.Rational = 2/3
	println(a + b)                            //> 7/6
	println(a + a * b)                        //> 5/6
	
	println(x * x)                            //> 121/49
	println(x * 14)                           //> 22/1
	
	implicit def intToRational(x: Int) = new Rational(x)
                                                  //> intToRational: (x: Int)chap06.Rational
	println(2 * twoThirds)                    //> 4/3
}