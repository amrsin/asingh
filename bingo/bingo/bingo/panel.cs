using System;
using Gtk;


namespace tabla
{
    public class Panel
    {
        public Panel(VBox vbox1)
        {

            Table table = new Table(10, 9, true);
            int index = 0;
            for (int row = 0; row < 10; row++)
                for (int colum = 0; colum < 9; colum++)
                {
                    index++;
                    Button button = new Button();
                    table.Attach(button, (uint)colum, (uint)colum + 1, (uint)row, (uint)row + 1);
                    button.Label = index.ToString();
                    button.Clicked += delegate
                    {
                        button.ModifyBg(StateType.Normal, new Gdk.Color(100, 200, 250));
                    };
                }
            vbox1.Add(table);
            table.ShowAll();

        }


    }
}