public class FuncionRecursiva {
    static void recursiva(int cont) {
        if (cont == 0){
            return;
        }
        
        System.out.println("Antes: " + cont);
        recursiva(cont-1);
        System.out.println("Despues: " + cont);
    }


    public static void main(String[] args) {
        recursiva(10);
    }











    static void print(String msg){
        int aleatorio = random();
        System.out.println(msg + aleatorio);
    }

    static int random(){
        return (int) Math.floor(Math.random()*100);
    }
}
