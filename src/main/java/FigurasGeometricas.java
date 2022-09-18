public class  FigurasGeometricas extends ElementosGeometricos{


    public static int circulo(Boolean ExisteLado, int r){

         return ElementosGeometricos(false,0,r,0,0);
    }

    public static int Triangulo(Boolean ExisteLado, int NLados, int base, int Haltura){
        return ElementosGeometricos(ExisteLado,3,0,Haltura,base);
    }
    public static int Quadrado(Boolean ExisteLado, int NLados, int lado){

        return ElementosGeometricos(true,4,0,lado,lado);
    }
    public static int Quadrilatero(Boolean ExisteLado, int NLados, int base, int Haltura){

        return ElementosGeometricos(true,4,0,Haltura,base);
    }

}
