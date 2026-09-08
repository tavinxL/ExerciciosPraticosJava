package academy.java.introducao;

public class aula05EstruturasCondicionais02 {
    static void main(String[] args) {
        byte dia = 9;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Ùtil");
                break;
            default:
                System.out.println("Opção inválida");

        }


    }
}
