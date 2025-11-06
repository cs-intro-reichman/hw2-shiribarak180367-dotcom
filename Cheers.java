//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String name = args[0].toUpperCase();
            int count = Integer.parseInt(args[1]);
            for (int j = 0; j < name.length(); j++) {
                char letter = Character.toUpperCase(name.charAt(j));
                if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'F' || letter == 'H' || letter == 'L' || letter == 'M' || letter == 'N' || letter == 'R' || letter == 'S' || letter == 'X') {
                    System.out.println("Give me an " + letter + ": " + letter + "!");
                } else {
                    System.out.println("Give me a " + letter + ": " + letter + "!");
                }

                }
                String cheer = "What does that spell?";
                System.out.println(cheer);
                int k = 0;
                while (k < count) {

                            System.out.println( name + "!!!");
                            k++;
                }
}
                
        }

        
