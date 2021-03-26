public class Programa {
		void iniciar() {
			int a, b, c, x;
			a = 2;                  // Variable entera "a" es igualada a 2
			b = a + a;             //Variable entera "b" es igualada a 4
			c = a+1;              //VAriable entera "c" es igualada a 3
			x = funcion(a,b,c);   //Se le asigna a x la función "funcion" la cual envia los valores de a,b y c, o sea 2,4 y 3
			System.out.println("el valor de x es: " + x);	    //Imprime 11
		}					
		int funcion(int x, int y, int z) {
			x = x + 1;                   //x=a=2 entonces x=2+1=3
			y = x + 2;                  //y=3+2=5
			z = x + y + z;             //z=3 entonces z=3+5+3=11
			return z;                 //retorna 11
		}
	}
