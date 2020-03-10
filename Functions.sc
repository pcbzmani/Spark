  object ScalaFunction{
  // EXERCISE
  // Strings have a built-in .toUpperCase method. For example, "foo".toUpperCase gives you back FOO.
  // Write a function that converts a string to upper-case, and use that function of a few test strings.
  // Then, do the same thing using a function literal instead of a separate, named function.
  
  def uppercasecon (xy :String ) : String = {
  	val yz : String = xy.toUpperCase
  	return(yz)
  }                                               //> uppercasecon: (xy: String)String
  
  println(uppercasecon("foo"))                   //> MANI
  
  var name :String = "mani"                       //> name  : String = mani

  
  //transformStr( "foo" , xy => xy.toUpperCase)
  
  }
