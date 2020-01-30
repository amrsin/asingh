using System;
using System.Collections.Generic;
using Gtk;

namespace bingo
{

    public class Bombo
    {
        private IList<int> bolas = new List<int>();
        private Random random = new Random();


        public Bombo()
        {
            for (int bola = 1; bola <= 90; bola++)
                bolas.Add(bola);
        }


        /*public int sacarBolar()
        {
            int indexAletorio = random.Next(bolas.Count);
            int bola = bolas(indexAletorio);
            bolas.Remove(indexAletorio);
            return bola;
        }*/
    }
}