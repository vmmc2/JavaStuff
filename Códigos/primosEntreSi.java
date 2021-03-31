public class Aula01{
  public static void main(String args[]){
    System.out.println(primosEntreSi(42, 91));
    System.out.println(primosEntreSi(31, 97));
    
    int[] souUmArray = new int[100];
    souUmArray[0] = 42;
    System.out.println(souUmArray.length);
    System.out.println(souUmArray[0]);
    return;
  }
  
  public static boolean primosEntreSi(int x, int y){
    int div = x;
    while(div > 1){
      if(x % div == 0 && y % div == 0){
        return false;
      }
      div -= 1;
    }
    return true;
  }
}
