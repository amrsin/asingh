using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    int cont_punto = 0;
    int cont_igual = 0;
    double a;
    double b;
    double result;
    String signo;

    operaciones resultado = new operaciones();

    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
     
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnBdelClicked(object sender, EventArgs e)
    {
        pantalla.DeleteText (0, pantalla.Text.Length);
        cont_punto = 0;
       


    }

    protected void OnBcClicked(object sender, EventArgs e)
    {
        pantalla.DeleteText(pantalla.Text.Length - 1, pantalla.Text.Length);
        String display = pantalla.Text.ToString();

        if (display.Contains(",")){
            cont_punto = 0;
        }
    
    }

    protected void OnB7Clicked(object sender, EventArgs e)
    {
        if (cont_igual==1) { 
         pantalla.DeleteText(0, pantalla.Text.Length);
        }
        cont_punto = 0;
        cont_igual = 0;
        String display = pantalla.Text.ToString();
        pantalla.DeleteText(0, pantalla.Text.Length);
        pantalla.InsertText(display + "7");

    }

    protected void OnB8Clicked(object sender, EventArgs e)
    {
        if (cont_igual == 1)

        {
            pantalla.DeleteText(0, pantalla.Text.Length);
        }
        cont_punto = 0;
        cont_igual = 0;
        String display = pantalla.Text.ToString();
        pantalla.DeleteText(0, pantalla.Text.Length);
        pantalla.InsertText(display + "8");

    }

    protected void OnB9Clicked(object sender, EventArgs e)
    {
        if (cont_igual == 1)
        {
          pantalla.DeleteText(0, pantalla.Text.Length);
        }
        cont_punto = 0;
        cont_igual = 0;
        String display = pantalla.Text.ToString();
        pantalla.DeleteText(0, pantalla.Text.Length);
        pantalla.InsertText(display + "9");
    }

    protected void OnBdividirClicked(object sender, EventArgs e)
    {

       
            a = Convert.ToDouble(pantalla.Text);
            pantalla.DeleteText(0, pantalla.Text.Length);
            signo = "/";

    }

    protected void OnB4Clicked(object sender, EventArgs e)
    {
        if (cont_igual == 1)
        { 
         pantalla.DeleteText(0, pantalla.Text.Length);
        }
        cont_punto = 0;
        cont_igual = 0;
        String display = pantalla.Text.ToString();
        pantalla.DeleteText(0, pantalla.Text.Length);
        pantalla.InsertText(display + "4");

    }

    protected void OnB5Clicked(object sender, EventArgs e)
    {
        if (cont_igual == 1)
        { 
         pantalla.DeleteText(0, pantalla.Text.Length);
        }
        cont_punto = 0;
        cont_igual = 0;
        String display = pantalla.Text.ToString();
        pantalla.DeleteText(0, pantalla.Text.Length);
        pantalla.InsertText(display + "5");

    }

    protected void OnB6Clicked(object sender, EventArgs e)
    {
        if (cont_igual == 1)
        {
          pantalla.DeleteText(0, pantalla.Text.Length);
        }
        cont_punto = 0;
        cont_igual = 0;
        String display = pantalla.Text.ToString();
        pantalla.DeleteText(0, pantalla.Text.Length);
        pantalla.InsertText(display + "6");

    }

    protected void OnBmultiplicarClicked(object sender, EventArgs e)
    {
        cont_punto = 0;
        a = Convert.ToDouble(pantalla.Text);
            String display = pantalla.Text.ToString();
            pantalla.DeleteText(0, pantalla.Text.Length);
            signo = "*";
    }

    protected void OnB1Clicked(object sender, EventArgs e)
    {
        if (cont_igual == 1)
        {
         pantalla.DeleteText(0, pantalla.Text.Length);
        }
        cont_punto = 0;
        cont_igual = 0;
        String display = pantalla.Text.ToString();
        pantalla.DeleteText(0, pantalla.Text.Length);
        pantalla.InsertText(display + "1");

    }

    protected void OnB2Clicked(object sender, EventArgs e)
    {
        if (cont_igual == 1)
        {
          pantalla.DeleteText(0, pantalla.Text.Length);
        }
        cont_punto = 0;
        cont_igual = 0;
        String display = pantalla.Text.ToString();
        pantalla.DeleteText(0, pantalla.Text.Length);
        pantalla.InsertText(display + "2");
    }

    protected void OnB3Clicked(object sender, EventArgs e)
    {
        if (cont_igual == 1)
        {
          pantalla.DeleteText(0, pantalla.Text.Length);
        }
        cont_punto = 0;
        cont_igual = 0;

        String display = pantalla.Text.ToString();
        pantalla.DeleteText(0, pantalla.Text.Length);
        pantalla.InsertText(display + "3");
    }

    protected void OnBrestaClicked(object sender, EventArgs e)
    {

            a = Convert.ToDouble(pantalla.Text);
            pantalla.DeleteText(0, pantalla.Text.Length);
            signo = "-";

    }

    protected void OnBpuntoClicked(object sender, EventArgs e)
    {

        if (cont_punto == 0)
        {

            String display = pantalla.Text.ToString();
            if (display.Equals(""))
            {
                pantalla.InsertText("0," + display);
                cont_punto++;
            }
            else { 
            pantalla.DeleteText(0, pantalla.Text.Length);
            pantalla.InsertText(display + ",");
            cont_punto++;
        }
        }
    }

    protected void OnBceroClicked(object sender, EventArgs e)
    {
       
        String display = pantalla.Text.ToString();
        pantalla.DeleteText(0, pantalla.Text.Length);
        pantalla.InsertText(display + "0");
       
    }

    protected void OnBigualClicked(object sender, EventArgs e)
    {
        if (cont_igual == 0) { 
        b = Convert.ToDouble(pantalla.Text);
        switch (signo)
        {
            case "*":
                result = resultado.multiplicacion(a, b);
                this.pantalla.Text = (Convert.ToString(result));
                cont_igual++;
                break;

            case "/":
                result = resultado.division(a, b);
                this.pantalla.Text = (Convert.ToString(result));
                cont_igual++;
                break; 

            case "+":
              

                result = resultado.suma(a, b);
                this.pantalla.Text = (Convert.ToString(result));
                cont_igual++;
                break;


            case "-":
                result = resultado.resta(a, b);
                this.pantalla.Text = (Convert.ToString(result));
                cont_igual++;
                break;
           }
        }
    }

    protected void OnBsumaClicked(object sender, EventArgs e)
    {

            a = Convert.ToDouble(pantalla.Text);
            pantalla.DeleteText(0, pantalla.Text.Length);
            signo = "+";
    }
}