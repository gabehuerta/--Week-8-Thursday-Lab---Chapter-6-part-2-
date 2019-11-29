import java.util.Scanner;

public class Pet
{

   public static void main(String[] args) {

       int age, weight ;
       String name;

       int youngest = 100 , oldest = 0;
       String young = null, old = null;
       int smallest = 100 , largest = 0;
       String small = null, large = null;
       int avgAge = 0 , avgWeight = 0;

       Scanner keyboard = new Scanner(System.in);

       for(int i = 0 ; i< 3;++i){

           System.out.print("Enter name of pet: ");
           name = keyboard.nextLine();

           System.out.print("Enter age of pet: ");
           age = keyboard.nextInt();

           System.out.print("Enter weight of pet: ");
           weight = keyboard.nextInt();

           if(youngest > age){

               youngest = age;
               young = name;

           }

           if(oldest < age){
               oldest = age;
               old = name;
             
           }

           if(smallest > weight){
               smallest = weight;
               small = name;          

           }

           if(largest < weight){
               largest = weight;
               large = name;
          
           }

           avgAge = avgAge + age;
           avgWeight = avgWeight + weight;

           keyboard.nextLine();
      }

       System.out.println("The names of the smallest pet (by weight). " + small);
       System.out.println("The names of the largest pet (by weight). " + large);
       System.out.println("The name of the youngest Pets. " + young);
       System.out.println("The name of the oldest Pets.. " + old);
       System.out.println("The average weight of the three Pets. " + avgWeight/(1.0 *3));
       System.out.println("The average age of the three Pets. " + avgAge/(1.0 * 3));

   }

}