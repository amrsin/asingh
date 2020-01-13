using System;

namespace VectorOrdenador
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            //creamos el vector
            int [] vector = new int[] { 90, 10, 85, 5 };

             Console.WriteLine("El vector desordenado es: ");
                //bucle para imprimir el vector actual
                  for (int i = 0; i < vector.Length; i++){
                   Console.Write("[" + vector[i] + "] ");
               }
                 //bucle para recorrer el vector
                 for (int i = 0; i<vector.Length - 1; i++){
                   for (int j = i + 1; j < vector.Length; j++){ //bucle para comparar 
                     if (vector[i] > vector[j]){ //si i es mayor que j entonces
                        int aux = vector[i]; //creamos variable aux que guardara el valor i
                        vector[i] = vector[j]; //el valor i igualamos a num j
                        vector[j] = aux; //valor j lo iguamos a aux
                    }
                }
            }
                Console.WriteLine("\nEl vector ordenado es: ");
                 for (int i=0; i<vector.Length; i++){
                     Console.Write("[" + vector[i] + "] ");
            }
        }
    }
}
