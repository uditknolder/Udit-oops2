package OOpsAssignment2

object Main {

  def main(args: Array[String]): Unit =
  {

    val object1=new Person(24,"test")
    val object2=new Person(25,"test")


    if ((object1.Name).equals(object2.Name))
      {
        if((object1.Age)equals(object2.Age))
          {
            println("true")
          }
          else
          {
            println("true")
          }

      }
    else if ((object2.Name.length()) equals (object1.Name.length()))
    {
      println("false")
    }
    else
      {
        println("false")
      }

   }

}
