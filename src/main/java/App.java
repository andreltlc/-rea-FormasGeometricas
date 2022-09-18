import java.util.Scanner;

public class App extends FigurasGeometricas   {
    private static boolean existeLado(int x){
        if(x == 1){
            return true;
        } else if (x >2 || x < 1) {
            throw new RuntimeException("Opção não existe");
        }
        return false;
    }
    private static  int NLado(int y) {
        if (y == 1) {
            return 3;
        } else if( y > 2 || y < 1) {
            throw new RuntimeException("Opção não existe");
        }
        return 4;
    }
    private static boolean LadoIgual(int z){
        if(z == 1){
            return true;
        }
        else if( z > 2 || z < 1) {
            throw new RuntimeException("Opção não existe");
        }
        return false;

    }

    public static void main(String[] args) {
        int x = 0, y = 0, z = 0;
        int area;
        Scanner s = new Scanner(System.in);
        System.out.println("Sua Figura tem Lado?");
        System.out.println("1 - Sim ");
        System.out.println("2 - Não ");
        x = s.nextInt();
        if(!existeLado(x)){
            int r =0;
            System.out.println("Logo sua figura só pode ser um circulo");
            System.out.println("Digite o raio dele:");
            r = s.nextInt();
            area = FigurasGeometricas.circulo(existeLado(x),r);
            System.out.println("A área é:" + area);
        }else {
            System.out.println("Sua figura tem lados");
            System.out.println("Escolha entre:");
            System.out.println("1 - triangulo");
            System.out.println("2 - quadrilatero");
            y = s.nextInt();
            if(NLado(y)==3){
                int base =0 , altura =0;
                System.out.println("Digite a base do seu triangulo:");
                base = s.nextInt();
                System.out.println("Digite a altura do seu triangulo:");
                altura = s.nextInt();
                area =FigurasGeometricas.Triangulo(existeLado(x),NLado(y),base,altura);
                System.out.println("A área é:" + area );
            }
            else{
                int lado = 0, haltura = 0;
                System.out.println(" Tem Lados iguais");
                System.out.println("1 - sim");
                System.out.println("2 - não");
                z = s.nextInt();
                if(LadoIgual(z)){
                    System.out.println("Digite o valor do Lado:");
                    lado = s.nextInt();
                    area = FigurasGeometricas.Quadrado(existeLado(x),NLado(y),lado);
                    System.out.println("A área é:" + area );
                }
                else{
                    System.out.println("Digite o valor do Lado:");
                    lado = s.nextInt();
                    System.out.println("Digite o valor da Altura:");
                    haltura = s.nextInt();
                    area = FigurasGeometricas.Quadrilatero(existeLado(x),NLado(y),lado,haltura);
                    System.out.println("A área é:" + area);
                }
            }
        }
    }
}
