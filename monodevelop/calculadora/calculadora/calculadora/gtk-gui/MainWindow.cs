
// This file has been generated by the GUI designer. Do not modify.

public partial class MainWindow
{
	private global::Gtk.VBox vbox5;

	private global::Gtk.Label label;

	private global::Gtk.Entry pantalla;

	private global::Gtk.VBox vbox7;

	private global::Gtk.HBox hbox1;

	private global::Gtk.Button Bdel;

	private global::Gtk.Button Bc;

	private global::Gtk.HBox hbox2;

	private global::Gtk.HBox hbox10;

	private global::Gtk.Button B7;

	private global::Gtk.Button B8;

	private global::Gtk.Button B9;

	private global::Gtk.HBox hbox9;

	private global::Gtk.Button Bdividir;

	private global::Gtk.HBox hbox3;

	private global::Gtk.Button B4;

	private global::Gtk.Button B5;

	private global::Gtk.HBox hbox11;

	private global::Gtk.Button B6;

	private global::Gtk.Button Bmultiplicar;

	private global::Gtk.HBox hbox4;

	private global::Gtk.Button B1;

	private global::Gtk.Button B2;

	private global::Gtk.HBox hbox13;

	private global::Gtk.Button B3;

	private global::Gtk.Button Bresta;

	private global::Gtk.HBox hbox8;

	private global::Gtk.Button Bpunto;

	private global::Gtk.Button Bcero;

	private global::Gtk.HBox hbox14;

	private global::Gtk.Button Bigual;

	private global::Gtk.Button Bsuma;

	protected virtual void Build()
	{
		global::Stetic.Gui.Initialize(this);
		// Widget MainWindow
		this.Name = "MainWindow";
		this.Title = global::Mono.Unix.Catalog.GetString("MainWindow");
		this.WindowPosition = ((global::Gtk.WindowPosition)(4));
		this.Resizable = false;
		// Container child MainWindow.Gtk.Container+ContainerChild
		this.vbox5 = new global::Gtk.VBox();
		this.vbox5.Name = "vbox5";
		this.vbox5.Spacing = 6;
		// Container child vbox5.Gtk.Box+BoxChild
		this.label = new global::Gtk.Label();
		this.label.Name = "label";
		this.label.LabelProp = global::Mono.Unix.Catalog.GetString("CALCULADORA");
		this.vbox5.Add(this.label);
		global::Gtk.Box.BoxChild w1 = ((global::Gtk.Box.BoxChild)(this.vbox5[this.label]));
		w1.Position = 0;
		w1.Expand = false;
		w1.Fill = false;
		// Container child vbox5.Gtk.Box+BoxChild
		this.pantalla = new global::Gtk.Entry();
		this.pantalla.HeightRequest = 35;
		this.pantalla.CanFocus = true;
		this.pantalla.Name = "pantalla";
		this.pantalla.IsEditable = true;
		this.pantalla.InvisibleChar = '•';
		this.vbox5.Add(this.pantalla);
		global::Gtk.Box.BoxChild w2 = ((global::Gtk.Box.BoxChild)(this.vbox5[this.pantalla]));
		w2.Position = 1;
		w2.Expand = false;
		w2.Fill = false;
		// Container child vbox5.Gtk.Box+BoxChild
		this.vbox7 = new global::Gtk.VBox();
		this.vbox7.Name = "vbox7";
		this.vbox7.Spacing = 6;
		// Container child vbox7.Gtk.Box+BoxChild
		this.hbox1 = new global::Gtk.HBox();
		this.hbox1.Name = "hbox1";
		this.hbox1.Spacing = 6;
		// Container child hbox1.Gtk.Box+BoxChild
		this.Bdel = new global::Gtk.Button();
		this.Bdel.WidthRequest = 80;
		this.Bdel.CanFocus = true;
		this.Bdel.Name = "Bdel";
		this.Bdel.UseUnderline = true;
		this.Bdel.Label = global::Mono.Unix.Catalog.GetString("Vaciar");
		this.hbox1.Add(this.Bdel);
		global::Gtk.Box.BoxChild w3 = ((global::Gtk.Box.BoxChild)(this.hbox1[this.Bdel]));
		w3.Position = 0;
		w3.Expand = false;
		w3.Fill = false;
		// Container child hbox1.Gtk.Box+BoxChild
		this.Bc = new global::Gtk.Button();
		this.Bc.WidthRequest = 170;
		this.Bc.CanFocus = true;
		this.Bc.Name = "Bc";
		this.Bc.UseUnderline = true;
		this.Bc.Label = global::Mono.Unix.Catalog.GetString("C");
		this.hbox1.Add(this.Bc);
		global::Gtk.Box.BoxChild w4 = ((global::Gtk.Box.BoxChild)(this.hbox1[this.Bc]));
		w4.Position = 1;
		w4.Expand = false;
		this.vbox7.Add(this.hbox1);
		global::Gtk.Box.BoxChild w5 = ((global::Gtk.Box.BoxChild)(this.vbox7[this.hbox1]));
		w5.Position = 0;
		w5.Expand = false;
		w5.Fill = false;
		// Container child vbox7.Gtk.Box+BoxChild
		this.hbox2 = new global::Gtk.HBox();
		this.hbox2.Name = "hbox2";
		this.hbox2.Spacing = 6;
		// Container child hbox2.Gtk.Box+BoxChild
		this.hbox10 = new global::Gtk.HBox();
		this.hbox10.Name = "hbox10";
		this.hbox10.Spacing = 6;
		// Container child hbox10.Gtk.Box+BoxChild
		this.B7 = new global::Gtk.Button();
		this.B7.WidthRequest = 60;
		this.B7.CanFocus = true;
		this.B7.Name = "B7";
		this.B7.UseUnderline = true;
		this.B7.Label = global::Mono.Unix.Catalog.GetString("7");
		this.hbox10.Add(this.B7);
		global::Gtk.Box.BoxChild w6 = ((global::Gtk.Box.BoxChild)(this.hbox10[this.B7]));
		w6.Position = 0;
		// Container child hbox10.Gtk.Box+BoxChild
		this.B8 = new global::Gtk.Button();
		this.B8.WidthRequest = 60;
		this.B8.CanFocus = true;
		this.B8.Name = "B8";
		this.B8.UseUnderline = true;
		this.B8.Label = global::Mono.Unix.Catalog.GetString("8");
		this.hbox10.Add(this.B8);
		global::Gtk.Box.BoxChild w7 = ((global::Gtk.Box.BoxChild)(this.hbox10[this.B8]));
		w7.Position = 1;
		w7.Expand = false;
		w7.Fill = false;
		// Container child hbox10.Gtk.Box+BoxChild
		this.B9 = new global::Gtk.Button();
		this.B9.WidthRequest = 60;
		this.B9.CanFocus = true;
		this.B9.Name = "B9";
		this.B9.UseUnderline = true;
		this.B9.Label = global::Mono.Unix.Catalog.GetString("9");
		this.hbox10.Add(this.B9);
		global::Gtk.Box.BoxChild w8 = ((global::Gtk.Box.BoxChild)(this.hbox10[this.B9]));
		w8.Position = 2;
		w8.Expand = false;
		this.hbox2.Add(this.hbox10);
		global::Gtk.Box.BoxChild w9 = ((global::Gtk.Box.BoxChild)(this.hbox2[this.hbox10]));
		w9.Position = 0;
		w9.Expand = false;
		w9.Fill = false;
		// Container child hbox2.Gtk.Box+BoxChild
		this.hbox9 = new global::Gtk.HBox();
		this.hbox9.Name = "hbox9";
		this.hbox9.Spacing = 6;
		// Container child hbox9.Gtk.Box+BoxChild
		this.Bdividir = new global::Gtk.Button();
		this.Bdividir.WidthRequest = 60;
		this.Bdividir.CanFocus = true;
		this.Bdividir.Name = "Bdividir";
		this.Bdividir.UseUnderline = true;
		this.Bdividir.Label = global::Mono.Unix.Catalog.GetString("/");
		this.hbox9.Add(this.Bdividir);
		global::Gtk.Box.BoxChild w10 = ((global::Gtk.Box.BoxChild)(this.hbox9[this.Bdividir]));
		w10.Position = 0;
		w10.Expand = false;
		w10.Fill = false;
		this.hbox2.Add(this.hbox9);
		global::Gtk.Box.BoxChild w11 = ((global::Gtk.Box.BoxChild)(this.hbox2[this.hbox9]));
		w11.Position = 1;
		w11.Expand = false;
		w11.Fill = false;
		this.vbox7.Add(this.hbox2);
		global::Gtk.Box.BoxChild w12 = ((global::Gtk.Box.BoxChild)(this.vbox7[this.hbox2]));
		w12.Position = 1;
		w12.Expand = false;
		w12.Fill = false;
		// Container child vbox7.Gtk.Box+BoxChild
		this.hbox3 = new global::Gtk.HBox();
		this.hbox3.Name = "hbox3";
		this.hbox3.Spacing = 6;
		// Container child hbox3.Gtk.Box+BoxChild
		this.B4 = new global::Gtk.Button();
		this.B4.WidthRequest = 60;
		this.B4.CanFocus = true;
		this.B4.Name = "B4";
		this.B4.UseUnderline = true;
		this.B4.Label = global::Mono.Unix.Catalog.GetString("4");
		this.hbox3.Add(this.B4);
		global::Gtk.Box.BoxChild w13 = ((global::Gtk.Box.BoxChild)(this.hbox3[this.B4]));
		w13.Position = 0;
		w13.Expand = false;
		w13.Fill = false;
		// Container child hbox3.Gtk.Box+BoxChild
		this.B5 = new global::Gtk.Button();
		this.B5.WidthRequest = 60;
		this.B5.CanFocus = true;
		this.B5.Name = "B5";
		this.B5.UseUnderline = true;
		this.B5.Label = global::Mono.Unix.Catalog.GetString("5");
		this.hbox3.Add(this.B5);
		global::Gtk.Box.BoxChild w14 = ((global::Gtk.Box.BoxChild)(this.hbox3[this.B5]));
		w14.Position = 1;
		w14.Expand = false;
		w14.Fill = false;
		// Container child hbox3.Gtk.Box+BoxChild
		this.hbox11 = new global::Gtk.HBox();
		this.hbox11.Name = "hbox11";
		this.hbox11.Spacing = 6;
		// Container child hbox11.Gtk.Box+BoxChild
		this.B6 = new global::Gtk.Button();
		this.B6.WidthRequest = 60;
		this.B6.CanFocus = true;
		this.B6.Name = "B6";
		this.B6.UseUnderline = true;
		this.B6.Label = global::Mono.Unix.Catalog.GetString("6");
		this.hbox11.Add(this.B6);
		global::Gtk.Box.BoxChild w15 = ((global::Gtk.Box.BoxChild)(this.hbox11[this.B6]));
		w15.Position = 0;
		w15.Expand = false;
		w15.Fill = false;
		// Container child hbox11.Gtk.Box+BoxChild
		this.Bmultiplicar = new global::Gtk.Button();
		this.Bmultiplicar.WidthRequest = 60;
		this.Bmultiplicar.CanFocus = true;
		this.Bmultiplicar.Name = "Bmultiplicar";
		this.Bmultiplicar.UseUnderline = true;
		this.Bmultiplicar.Label = global::Mono.Unix.Catalog.GetString("*");
		this.hbox11.Add(this.Bmultiplicar);
		global::Gtk.Box.BoxChild w16 = ((global::Gtk.Box.BoxChild)(this.hbox11[this.Bmultiplicar]));
		w16.Position = 1;
		w16.Expand = false;
		w16.Fill = false;
		this.hbox3.Add(this.hbox11);
		global::Gtk.Box.BoxChild w17 = ((global::Gtk.Box.BoxChild)(this.hbox3[this.hbox11]));
		w17.Position = 2;
		w17.Expand = false;
		w17.Fill = false;
		this.vbox7.Add(this.hbox3);
		global::Gtk.Box.BoxChild w18 = ((global::Gtk.Box.BoxChild)(this.vbox7[this.hbox3]));
		w18.Position = 2;
		w18.Expand = false;
		w18.Fill = false;
		// Container child vbox7.Gtk.Box+BoxChild
		this.hbox4 = new global::Gtk.HBox();
		this.hbox4.Name = "hbox4";
		this.hbox4.Spacing = 6;
		// Container child hbox4.Gtk.Box+BoxChild
		this.B1 = new global::Gtk.Button();
		this.B1.WidthRequest = 60;
		this.B1.CanFocus = true;
		this.B1.Name = "B1";
		this.B1.UseUnderline = true;
		this.B1.Label = global::Mono.Unix.Catalog.GetString("1");
		this.hbox4.Add(this.B1);
		global::Gtk.Box.BoxChild w19 = ((global::Gtk.Box.BoxChild)(this.hbox4[this.B1]));
		w19.Position = 0;
		w19.Expand = false;
		w19.Fill = false;
		// Container child hbox4.Gtk.Box+BoxChild
		this.B2 = new global::Gtk.Button();
		this.B2.WidthRequest = 60;
		this.B2.CanFocus = true;
		this.B2.Name = "B2";
		this.B2.UseUnderline = true;
		this.B2.Label = global::Mono.Unix.Catalog.GetString("2");
		this.hbox4.Add(this.B2);
		global::Gtk.Box.BoxChild w20 = ((global::Gtk.Box.BoxChild)(this.hbox4[this.B2]));
		w20.Position = 1;
		w20.Expand = false;
		w20.Fill = false;
		// Container child hbox4.Gtk.Box+BoxChild
		this.hbox13 = new global::Gtk.HBox();
		this.hbox13.Name = "hbox13";
		this.hbox13.Spacing = 6;
		// Container child hbox13.Gtk.Box+BoxChild
		this.B3 = new global::Gtk.Button();
		this.B3.WidthRequest = 60;
		this.B3.CanFocus = true;
		this.B3.Name = "B3";
		this.B3.UseUnderline = true;
		this.B3.Label = global::Mono.Unix.Catalog.GetString("3");
		this.hbox13.Add(this.B3);
		global::Gtk.Box.BoxChild w21 = ((global::Gtk.Box.BoxChild)(this.hbox13[this.B3]));
		w21.Position = 0;
		w21.Expand = false;
		w21.Fill = false;
		// Container child hbox13.Gtk.Box+BoxChild
		this.Bresta = new global::Gtk.Button();
		this.Bresta.WidthRequest = 60;
		this.Bresta.CanFocus = true;
		this.Bresta.Name = "Bresta";
		this.Bresta.UseUnderline = true;
		this.Bresta.Label = global::Mono.Unix.Catalog.GetString("-");
		this.hbox13.Add(this.Bresta);
		global::Gtk.Box.BoxChild w22 = ((global::Gtk.Box.BoxChild)(this.hbox13[this.Bresta]));
		w22.Position = 1;
		w22.Expand = false;
		w22.Fill = false;
		this.hbox4.Add(this.hbox13);
		global::Gtk.Box.BoxChild w23 = ((global::Gtk.Box.BoxChild)(this.hbox4[this.hbox13]));
		w23.Position = 2;
		w23.Expand = false;
		w23.Fill = false;
		this.vbox7.Add(this.hbox4);
		global::Gtk.Box.BoxChild w24 = ((global::Gtk.Box.BoxChild)(this.vbox7[this.hbox4]));
		w24.Position = 3;
		w24.Expand = false;
		w24.Fill = false;
		// Container child vbox7.Gtk.Box+BoxChild
		this.hbox8 = new global::Gtk.HBox();
		this.hbox8.Name = "hbox8";
		this.hbox8.Spacing = 6;
		// Container child hbox8.Gtk.Box+BoxChild
		this.Bpunto = new global::Gtk.Button();
		this.Bpunto.WidthRequest = 60;
		this.Bpunto.CanFocus = true;
		this.Bpunto.Name = "Bpunto";
		this.Bpunto.UseUnderline = true;
		this.Bpunto.Label = global::Mono.Unix.Catalog.GetString(".");
		this.hbox8.Add(this.Bpunto);
		global::Gtk.Box.BoxChild w25 = ((global::Gtk.Box.BoxChild)(this.hbox8[this.Bpunto]));
		w25.Position = 0;
		w25.Expand = false;
		w25.Fill = false;
		// Container child hbox8.Gtk.Box+BoxChild
		this.Bcero = new global::Gtk.Button();
		this.Bcero.WidthRequest = 60;
		this.Bcero.CanFocus = true;
		this.Bcero.Name = "Bcero";
		this.Bcero.UseUnderline = true;
		this.Bcero.Label = global::Mono.Unix.Catalog.GetString("0");
		this.hbox8.Add(this.Bcero);
		global::Gtk.Box.BoxChild w26 = ((global::Gtk.Box.BoxChild)(this.hbox8[this.Bcero]));
		w26.Position = 1;
		w26.Expand = false;
		w26.Fill = false;
		// Container child hbox8.Gtk.Box+BoxChild
		this.hbox14 = new global::Gtk.HBox();
		this.hbox14.Name = "hbox14";
		this.hbox14.Spacing = 6;
		// Container child hbox14.Gtk.Box+BoxChild
		this.Bigual = new global::Gtk.Button();
		this.Bigual.WidthRequest = 60;
		this.Bigual.CanFocus = true;
		this.Bigual.Name = "Bigual";
		this.Bigual.UseUnderline = true;
		this.Bigual.Label = global::Mono.Unix.Catalog.GetString("=");
		this.hbox14.Add(this.Bigual);
		global::Gtk.Box.BoxChild w27 = ((global::Gtk.Box.BoxChild)(this.hbox14[this.Bigual]));
		w27.Position = 0;
		w27.Expand = false;
		w27.Fill = false;
		// Container child hbox14.Gtk.Box+BoxChild
		this.Bsuma = new global::Gtk.Button();
		this.Bsuma.WidthRequest = 60;
		this.Bsuma.CanFocus = true;
		this.Bsuma.Name = "Bsuma";
		this.Bsuma.UseUnderline = true;
		this.Bsuma.Label = global::Mono.Unix.Catalog.GetString("+");
		this.hbox14.Add(this.Bsuma);
		global::Gtk.Box.BoxChild w28 = ((global::Gtk.Box.BoxChild)(this.hbox14[this.Bsuma]));
		w28.Position = 1;
		w28.Expand = false;
		w28.Fill = false;
		this.hbox8.Add(this.hbox14);
		global::Gtk.Box.BoxChild w29 = ((global::Gtk.Box.BoxChild)(this.hbox8[this.hbox14]));
		w29.Position = 2;
		w29.Expand = false;
		w29.Fill = false;
		this.vbox7.Add(this.hbox8);
		global::Gtk.Box.BoxChild w30 = ((global::Gtk.Box.BoxChild)(this.vbox7[this.hbox8]));
		w30.Position = 4;
		w30.Expand = false;
		w30.Fill = false;
		this.vbox5.Add(this.vbox7);
		global::Gtk.Box.BoxChild w31 = ((global::Gtk.Box.BoxChild)(this.vbox5[this.vbox7]));
		w31.Position = 2;
		w31.Expand = false;
		w31.Fill = false;
		this.Add(this.vbox5);
		if ((this.Child != null))
		{
			this.Child.ShowAll();
		}
		this.DefaultWidth = 268;
		this.DefaultHeight = 255;
		this.Show();
		this.DeleteEvent += new global::Gtk.DeleteEventHandler(this.OnDeleteEvent);
		this.Bdel.Clicked += new global::System.EventHandler(this.OnBdelClicked);
		this.Bc.Clicked += new global::System.EventHandler(this.OnBcClicked);
		this.B7.Clicked += new global::System.EventHandler(this.OnB7Clicked);
		this.B8.Clicked += new global::System.EventHandler(this.OnB8Clicked);
		this.B9.Clicked += new global::System.EventHandler(this.OnB9Clicked);
		this.Bdividir.Clicked += new global::System.EventHandler(this.OnBdividirClicked);
		this.B4.Clicked += new global::System.EventHandler(this.OnB4Clicked);
		this.B5.Clicked += new global::System.EventHandler(this.OnB5Clicked);
		this.B6.Clicked += new global::System.EventHandler(this.OnB6Clicked);
		this.Bmultiplicar.Clicked += new global::System.EventHandler(this.OnBmultiplicarClicked);
		this.B1.Clicked += new global::System.EventHandler(this.OnB1Clicked);
		this.B2.Clicked += new global::System.EventHandler(this.OnB2Clicked);
		this.B3.Clicked += new global::System.EventHandler(this.OnB3Clicked);
		this.Bresta.Clicked += new global::System.EventHandler(this.OnBrestaClicked);
		this.Bpunto.Clicked += new global::System.EventHandler(this.OnBpuntoClicked);
		this.Bcero.Clicked += new global::System.EventHandler(this.OnBceroClicked);
		this.Bigual.Clicked += new global::System.EventHandler(this.OnBigualClicked);
		this.Bsuma.Clicked += new global::System.EventHandler(this.OnBsumaClicked);
	}
}
