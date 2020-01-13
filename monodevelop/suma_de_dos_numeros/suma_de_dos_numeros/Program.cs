using System;

namespace suma_de_dos_numeros
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            //variables
            double num1;
            double num2;

            Console.Write("Introduzca el num1: ");
            num1 = double.Parse(Console.ReadLine());
            Console.Write("Introduzca el num2: ");
            num2 = double.Parse(Console.ReadLine());

            //Operaciones

            Console.WriteLine("La Suma de " + num1 + "+"+ num2 + " es = " + (num1 + num2));
            Console.WriteLine("La Resta de " + num1 + "-" + num2 + " es = " + (num1 - num2));
            Console.WriteLine("La Multiplicación de " + num1 + "x" + num2 + " es =" + (num1 * num2));
            Console.WriteLine("La División de " + num1 + "/" + num2 + " es = " + (num1 / num2));
            Console.WriteLine("La Resto de " + num1 + "%" + num2 + " es = " + (num1 % num2));

        }

    }
}
