﻿using System;
using Gtk;
using bingo;

public partial class MainWindow : Gtk.Window
{
    Panel panel;
    Bombo bombo = new Bombo();

    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        panel = new Panel(vbox1);
        /*button1.Clicked += delegate
        {
            int numero = bombo.sacarBola();
        };*/


    }


    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnButton1Clicked(object sender, EventArgs e)
    {
        int numero = bombo.sacarBola();
        panel.Marcar(numero);
    }
}