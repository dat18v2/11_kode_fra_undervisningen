public class Dogrun {


   public static void main(String[] args){
   
     // Har laver jeg en hund - jeg laver et objekt
      Dog fido = new Dog("Claus");
      // objekt nummer 2
      Dog pluto = new Dog("Jarl");
      
      //Animal snake = new Animal();
      //Animal rabbit = new Animal();
      
      // her kalder jeg en metoder der har navnet "bark"
      
      // pluto.setName("Snake");
      
      pluto.setX(1);
      pluto.setY(1);
      pluto.tell();
      
      pluto.setX(2);
      pluto.setY(2);
      pluto.tell();
      
      pluto.setX(3);
      pluto.setY(3);
      pluto.tell();
      
      //pluto.getName();
      //pluto.setSound("Im going to eat you");
      //pluto.getSound();
      
      //pluto.bark();
      
   

/*
      fido.setName("RAbbit");
      fido.bark();
      fido.getName();
      //fido.setSound("Ohh please don´t eat me!!");
      fido.getSound();
*/
   }

}