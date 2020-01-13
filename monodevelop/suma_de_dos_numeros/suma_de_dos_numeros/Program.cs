using System;

namespace suma_de_dos_numeros
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            //variables
            int num1;
            int num2;

            Console.Write("Introduzca el num1: ");
            num1 = int.Parse(Console.ReadLine());
            Console.Write("Introduzca el num2: ");
            num2 = int.Parse(Console.ReadLine());

            //Operaciones

            Console.Write("La suma de " + num1 + "+"+ num2 + " es " + (num1 + num2));
        }
    }
}
