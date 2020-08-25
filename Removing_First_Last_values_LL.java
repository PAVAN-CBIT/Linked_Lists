public  class Removing_First_Last_values_LL
{
      public static void main(String[] args)
      {

            LinkedList<String> LL = new LinkedList<>();  //Creating LinkedList with String


                                                         //Adding elements to the LinkedList
            LL.add("a");
            LL.add("b");
            LL.add("c");
            System.out.println(LL);                      //Printing the values before removing
            LL.removeLast();
            LL.removeFirst();
            System.out.println(LL);                      //Printing the values after removing






      }

}
