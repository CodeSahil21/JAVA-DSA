package com.EnumExample;

public class basic {
    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enum constant
        //every member is public static and final
        //since its final you can create child enums
        //type is week
         Week(){
             System.out.println("Constructor called for" + this);
             // this is not public or protected only private or default
             // we don"t want to create new objects
             //that's not concept of enum
         }

        @Override
        public void hello(){
            System.out.println("Hello how are you");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
       // System.out.println(week.ordinal());//ordinal declare position of enum variable
      //  System.out.println(week);
      //  for(Week day : Week.values()){
//            System.out.println(day);
       // }
    }
}
