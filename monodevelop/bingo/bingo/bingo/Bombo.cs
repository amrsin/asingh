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


        public int sacarBola()
        {
            int indexAletorio = random.Next(1,90);
            int bola = bolas[indexAletorio];
            bolas.RemoveAt(indexAletorio);
            return bola;
        }
    }
}