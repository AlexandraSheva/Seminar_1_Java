public class task_3 {
  public static void main (String[] args) {
    System.out.println(task2("крупнокалиберная бензоколонка стоит на берегу пруда"));
  }
  
  static String task2 (String str){
    /* Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке */
    String[] strArr = str.split(" ");
    StringBuilder stringBuilder = new StringBuilder();
    for(int i = 0; i < strArr.length; i++) {
      stringBuilder.append(strArr[strArr.length - i - 1]).append(" ");
    }
    return stringBuilder.toString();


  }
}
