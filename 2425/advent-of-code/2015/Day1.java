public class Day1 {
  static int findTheFloor(String input) {
    int floor = 0;
    int position = 0;
    for (int i = 0; i < input.length() && floor != -1; i++) {
      position = i+1;
      char direction = input.charAt(i);
      if(direction == '('){
        floor++;
      }else{
        floor--;
      }
    }
    return position;
  }

  public static void main(String[] args) {
    String input = args.length > 0 ? args[0] : "((()))"; // 0

    System.out.println(findTheFloor(input));

  }
}




















/*
 * String input = args.length > 0 ? args[0] : "(()(()(";
 * int cont = 0;
 * int position = 0;
 * for (int i = 0; i < input.length() & cont > -1; i++) {
 * position = i+1;
 * if(input.charAt(i) == '('){
 * cont++;
 * } else {
 * cont--;
 * }
 * }
 * System.out.println(cont);
 * System.out.println(position);
 */