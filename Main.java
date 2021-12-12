import java.util.Scanner;

class Main{
 
    public static void main(String[] args) {
    int state = 0;
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    
    for (int i = 0; i < input.length(); i++) {
        //haz, hazat, haznak
        switch(state){
            case 0: switch (input.charAt(i)){
                case 'h': state = 1; break;
                default: state = 0; break;
            } break;
            case 1: switch (input.charAt(i)){
                case 'a': state = 2; break;
                default: state = 0; break;
            } break;
            case 2: switch (input.charAt(i)){
                case 'z': state = 3; break;
                default: state = 0; break;
            } break;
            case 3: switch (input.charAt(i)){
                case 'a': state = 5; break;
                case 'n': state = 4; break;
                default: state = 0; break;
            } break;
            case 4: switch (input.charAt(i)){
                case 'a': state = 5; break;
                default: state = 0; break;
            } break;
            case 5: switch (input.charAt(i)){
                case 'k': state = 7; break;
                case 't': state = 6; break;
                default: state = 0; break;
            } break;
        }
    }
    System.out.println(state == 3 || state == 6 || state == 7 ? "Elfogadva":"Nem elfogadva");
    }
}