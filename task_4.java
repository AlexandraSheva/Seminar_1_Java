public class task_4 {
  public static void main (String[] args) {
    task4();
  }

  
  static void task4() {
    /* Возвести a в степень b */

    int a = 2, b = 0;
    float rez = 1;
    int res = 1;

    if (b>0) {
      for(int i = 0; i<b; i++) {
        res*=a;
      }
      System.out.println(res);
    } else if (b<0) {
        for(int i = b; i<0; i++) {
          rez/=a;
        }
        System.out.println(rez);
    } else System.out.println("1");

  }
}
