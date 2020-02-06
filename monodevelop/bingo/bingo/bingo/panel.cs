﻿using System;
using System.Collections.Generic;
using Gtk;


namespace bingo
{
    public class Panel
    {

        private static uint rows = 9;
        private static uint colums = 10;
        private IList<Button> buttons = new List<Button>();

        public Panel(VBox vbox1)
        {

            Table table = new Table(rows, colums, true);
            int index = 0;
            for (int row = 0; row < rows; row++)
                for (int colum = 0; colum < colums; colum++)
                {
                    index++;
                    Button button = new Button();
                    table.Attach(button, (uint)colum, (uint)colum + 1, (uint)row, (uint)row + 1);
                    buttons.Add(button);
                    button.Label = index.ToString();
                    //button.Clicked += delegate
                    //{
                    // button.ModifyBg(StateType.Normal, new Gdk.Color(100, 200, 250));
                    //};
                }
            vbox1.Add(table);
            table.ShowAll();

        }
        public void Marcar (int numero)
        {
            buttons[numero -1].ModifyBg(StateType.Normal, new Gdk.Color(0,255,0));
        }
    }
}