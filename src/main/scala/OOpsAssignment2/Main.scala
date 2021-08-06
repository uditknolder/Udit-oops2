package OOpsAssignment2
object Main {

  /**
   * @param args
   */
  def main(args: Array[String]): Unit =
  {

    val Person1=new Person(24,"testagain")
    val Person2=new Person(25,"test")


    if ((Person1.name).equals(Person2.name))
      {
        if((Person1.age)<(Person2.age))
          {
            println("true")
          }
          else
          {
            println("false")
          }

      }
    else
      {
        if ((Person1.name.length()) < (Person2.name.length()))
        {
          println("true")
        }
        else
        {
          println("false")
        }
      }

   }

}
