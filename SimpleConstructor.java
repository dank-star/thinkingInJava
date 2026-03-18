//: SimpleConstructor.java
// Demonstration of a simple constructor
packge c04;

class Rock{
  Rock(){ // This is constructor
    System.out.println("Creating Rock");
  }
}

public class SimpleConstructor{
  public static void main(String[] args){
    for(int i = 0; i < 10; i++)
      new Rock();
  }
}///:~
