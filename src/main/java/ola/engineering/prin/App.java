package ola.engineering.prin;


/**
 * Hello world!
 *
 */
public class App 
{
//    Scanner StdIn = new Scanner(System.in);

    public static void main( String[] args )
    {

int N =  StdIn.readInt();
UF uf = new UF(N);
while (!StdIin.isEmpty()) {
    int p = StdIn.readint();
    int q = StdIn.readint();
if(!uf.connected(p,q)) {
    uf.union(p,q);
    StdOut.println(p + " " + q);
}

}


    }
}
