package one.digitalinnovation;

public class Main {

        public static void main(String[] args) {
                //Gereric T não aceita nada alem de string 
                //minhaFila.enqueue((1))---- Erro X
                Fila<String> minhaFila = new Fila<>();

                minhaFila.enqueue("primeiro");
                minhaFila.enqueue("segundo");
                minhaFila.enqueue("terceiro");
                minhaFila.enqueue("quarto");

                System.out.println(minhaFila);

                System.out.println(minhaFila.dequeue());

                System.out.println(minhaFila);
                
                minhaFila.enqueue("ultimo");

                System.out.println(minhaFila);

                System.out.println(minhaFila.first());

                System.out.println(minhaFila);
        }

}
