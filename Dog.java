public class Dog {

   // Attributter (navneord)
   private String name;
   private String race = "Puddel";
   private String sound;
   
   private int x;
   private int y;
   
   // Metoder (handlinger)
   
   public Dog(String name){
      this.name = name;
   }
   
   
  public void getName(){
   
      System.out.println(name);
      
   }
   public void setName(String dogName){
      name = dogName;
   }

   
   // get metode
   public void tell(){
      System.out.println("I Am the " + name + " and i am standing on square " + x + ", " + y);
   }
   
   public void setX(int x){
      this.x = x;
   }
   
   public void setY(int y){
      this.y = y;
   }
   
   
   
   
   
   
   public void setSound(String sound){
   
      this.sound = sound;
   
   }
   public void getSound(){
      System.out.println(sound);
   }
   
   
   
     
   
   
   // Declare method bark
   public void bark(){
   
      System.out.println("The " + name + " with the name " + name + " Says " + sound);
   }

}