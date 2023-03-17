
public class Main {
    public static void main(String[] args) {
        //criando a lista
        Vetor vetor = new Vetor();

        //verificando se está vazia
        System.out.println(vetor.empty());
        System.out.println();

        //verificando se está cheia
        System.out.println(vetor.full());
        System.out.println();

        //buscando elemento em uma posição
        System.out.println(vetor.search(int position)); //trocar position por um número inteiro
        System.out.println();

        System.out.println(vetor.size());
        System.out.println();

        System.out.println(vetor.insert(int position, int dados)); //trocar position e dados por valores int
        System.out.println();

        System.out.println(vetor.remove(int position)); //trocar position por valor int




    }

}