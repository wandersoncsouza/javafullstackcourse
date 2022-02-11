
public class Program {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Bob", "João", "Marcos", "Túlio"};

        for(int i =0; i<vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("-----------------------");

        for(String vec : vect){
            System.out.println(vec);
        }
    }
}
