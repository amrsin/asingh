using System;

namespace holamundo
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.Write(" Introduzca su nombre: ");
            string nombre = Console.ReadLine();
            Console.WriteLine("Hola " + nombre);

            Console.Write("Dime tu edad: ");
            int edad = int.Parse(Console.ReadLine());
            Console.Write("Tu edad es: " + edad);


        }
    }
}

