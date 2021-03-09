package org.knoldus.main


class Person (val name: String,val age:Int) extends Ordered [Person] {
   def compare(that: Person): Int = {
    if(this.name == that.name)
      {
        this.age - that.age

      }
      else {
        this.name.length - that.name.length
      }
  }
}

 object person {
  def main(args: Array[String]): Unit = {
    val obj1=new Person("Test", 24)
    val obj2=new Person("Test", 25)
    def compare_obj:Boolean={
      if(obj1.compare(obj2)==0)
        false
      else
        true
    }
    println("result:  "+compare_obj)
    println("Values of object one  are: "+obj1.name+" "+obj1.age + "  \n Values of object two  are : "+obj2.name+" "+obj2.age)

  }
}
