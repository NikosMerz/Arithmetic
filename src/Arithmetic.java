public class Arithmetic
{
    private int a;
    private int b;
    private int c;

    public Arithmetic(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Arithmetic(int a, int b, int c){
        this(a,b);
        this.c = c;
    }

    public static void main(String[] args) {

        Arithmetic Arithmetic = new Arithmetic(20,10);

        System.out.println(Arithmetic.a + Arithmetic.b);
        System.out.println((Arithmetic.a - Arithmetic.b));
        System.out.println((Arithmetic.a / Arithmetic.b));
        System.out.println((Arithmetic.a * Arithmetic.b));

        Arithmetic Arithmetic1 = new Arithmetic(2,6);
        Arithmetic Arithmetic2 = new Arithmetic(3,7,6);

        System.out.println(Arithmetic1.c + Arithmetic1.c);

    }
    }

