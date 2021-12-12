import java.util.Scanner;

class Main{
 
    public static void main(String[] args) {
    int state = 0;
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    
    for (int i = 0; i < input.length(); i++) {
        //haz, hazat, haznak, hazzal, hazert, hazza, hazig
        switch(state){
            case 0: switch (input.charAt(i)){
                case 'h': state = 1; break;
                default: state = 0; break;
            } break;
            case 1: switch (input.charAt(i)){
                case 'a': state = 2; break;
                case 'h': state = 1; break;
                default: state = 0; break;
            } break;
            case 2: switch (input.charAt(i)){
                case 'z': state = 3; break;
                case 't': state = 4; break;
                case 'k': state = 6; break;
                case 'l': state = 7; break;
                case 'h': state = 1; break;
                default: state = 0; break;
            } break;
            case 3: switch (input.charAt(i)){
                case 'z': state = 3; break;
                case 'a': state = 2; break;
                case 'n': state = 5; break;
                case 'e': state = 8; break;
                case 'i': state = 10; break;
                case 'h': state = 1; break;
                default: state = 0; break;
            } break;
            case 4: switch (input.charAt(i)){ //elfogadó allapot
                default: state = 4; break;
            } break;
            case 5: switch (input.charAt(i)){
                case 'a': state = 2; break;
                default: state = 0; break;
            } break;
            case 6: switch (input.charAt(i)){ //elfogadó allapot
                default: state = 6; break;
            } break;
            case 7: switch (input.charAt(i)){ //elfogadó allapot
                default: state = 7; break;
            } break;
            case 8: switch (input.charAt(i)){
                case 'r': state = 9; break;
                case 'h': state = 1; break;
                default: state = 0; break;
            } break;
            case 9: switch (input.charAt(i)){
                case 't': state = 4; break;
                case 'h': state = 1; break;
                default: state = 0; break;
            } break;
            case 10: switch (input.charAt(i)){
                case 'g': state = 11; break;
                case 'h': state = 1; break;
                default: state = 0; break;
            } break;
            case 11: switch (input.charAt(i)){ //elfogadó allapot
                default: state = 11; break;
            } break;
        }
    }
    System.out.println(state == 3 || state == 4 || state == 6 || state == 7 || state == 11 ? "Elfogadva":"Nem elfogadva");
    }
}