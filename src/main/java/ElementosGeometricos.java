public abstract class ElementosGeometricos {
    private boolean ExisteLado;
    private int NLados;
    private int Haltura;
    private int Lado;


    public static int ElementosGeometricos(Boolean ExisteLado, int NLados, int r, int Lado, int Base) {
        if(!ExisteLado){
            int pi =3;
            return (r*r)*pi;
        }
        else {
            if (NLados == 3){
                 return (Base* Lado)/2;
            } else{
                return Base*Lado;
            }
        }

    }



}
