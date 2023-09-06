public class Utilities{
  public static void printHello(String str){
    if (str.equalsIgnoreCase("hello")){
      System.out.println("hello, world!");
    }

    else if (str.equalsIgnoreCase("goodbye")) {
      System.out.println("goodbye, cruel world");
    }

    else{
      System.out.println("other message");
    }
  }
}
