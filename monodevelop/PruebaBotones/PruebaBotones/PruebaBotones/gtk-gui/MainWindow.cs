
// This file has been generated by the GUI designer. Do not modify.

public partial class MainWindow
{
	private global::Gtk.VBox vbox1;

	private global::Gtk.Label label1;

	private global::Gtk.HBox hbox2;

	private global::Gtk.Entry text;

	private global::Gtk.Button saludar;

	private global::Gtk.HBox hbox3;

	private global::Gtk.Entry entry5;

	private global::Gtk.Button aleatorio;

	private global::Gtk.Button salir;

	protected virtual void Build()
	{
		global::Stetic.Gui.Initialize(this);
		// Widget MainWindow
		this.Name = "MainWindow";
		this.Title = global::Mono.Unix.Catalog.GetString("MainWindow");
		this.WindowPosition = ((global::Gtk.WindowPosition)(4));
		this.Resizable = false;
		// Container child MainWindow.Gtk.Container+ContainerChild
		this.vbox1 = new global::Gtk.VBox();
		this.vbox1.Name = "vbox1";
		this.vbox1.Spacing = 6;
		// Container child vbox1.Gtk.Box+BoxChild
		this.label1 = new global::Gtk.Label();
		this.label1.Name = "label1";
		this.label1.LabelProp = global::Mono.Unix.Catalog.GetString("Primer Programa");
		this.vbox1.Add(this.label1);
		global::Gtk.Box.BoxChild w1 = ((global::Gtk.Box.BoxChild)(this.vbox1[this.label1]));
		w1.Position = 0;
		w1.Expand = false;
		w1.Fill = false;
		// Container child vbox1.Gtk.Box+BoxChild
		this.hbox2 = new global::Gtk.HBox();
		this.hbox2.Name = "hbox2";
		this.hbox2.Spacing = 6;
		// Container child hbox2.Gtk.Box+BoxChild
		this.text = new global::Gtk.Entry();
		this.text.CanFocus = true;
		this.text.Name = "text";
		this.text.IsEditable = true;
		this.text.InvisibleChar = '•';
		this.hbox2.Add(this.text);
		global::Gtk.Box.BoxChild w2 = ((global::Gtk.Box.BoxChild)(this.hbox2[this.text]));
		w2.Position = 0;
		// Container child hbox2.Gtk.Box+BoxChild
		this.saludar = new global::Gtk.Button();
		this.saludar.WidthRequest = 0;
		this.saludar.CanFocus = true;
		this.saludar.Name = "saludar";
		this.saludar.UseUnderline = true;
		this.saludar.Label = global::Mono.Unix.Catalog.GetString("SALUDAR");
		this.hbox2.Add(this.saludar);
		global::Gtk.Box.BoxChild w3 = ((global::Gtk.Box.BoxChild)(this.hbox2[this.saludar]));
		w3.Position = 1;
		w3.Expand = false;
		w3.Fill = false;
		this.vbox1.Add(this.hbox2);
		global::Gtk.Box.BoxChild w4 = ((global::Gtk.Box.BoxChild)(this.vbox1[this.hbox2]));
		w4.Position = 1;
		w4.Expand = false;
		w4.Fill = false;
		// Container child vbox1.Gtk.Box+BoxChild
		this.hbox3 = new global::Gtk.HBox();
		this.hbox3.Name = "hbox3";
		this.hbox3.Spacing = 6;
		// Container child hbox3.Gtk.Box+BoxChild
		this.entry5 = new global::Gtk.Entry();
		this.entry5.CanFocus = true;
		this.entry5.Name = "entry5";
		this.entry5.IsEditable = false;
		this.entry5.InvisibleChar = '•';
		this.hbox3.Add(this.entry5);
		global::Gtk.Box.BoxChild w5 = ((global::Gtk.Box.BoxChild)(this.hbox3[this.entry5]));
		w5.Position = 0;
		// Container child hbox3.Gtk.Box+BoxChild
		this.aleatorio = new global::Gtk.Button();
		this.aleatorio.CanFocus = true;
		this.aleatorio.Name = "aleatorio";
		this.aleatorio.UseUnderline = true;
		this.aleatorio.Label = global::Mono.Unix.Catalog.GetString("Aleatorio");
		this.hbox3.Add(this.aleatorio);
		global::Gtk.Box.BoxChild w6 = ((global::Gtk.Box.BoxChild)(this.hbox3[this.aleatorio]));
		w6.Position = 1;
		w6.Expand = false;
		w6.Fill = false;
		// Container child hbox3.Gtk.Box+BoxChild
		this.salir = new global::Gtk.Button();
		this.salir.CanFocus = true;
		this.salir.Name = "salir";
		this.salir.UseUnderline = true;
		this.salir.Label = global::Mono.Unix.Catalog.GetString("SALIR");
		this.hbox3.Add(this.salir);
		global::Gtk.Box.BoxChild w7 = ((global::Gtk.Box.BoxChild)(this.hbox3[this.salir]));
		w7.Position = 2;
		w7.Expand = false;
		w7.Fill = false;
		this.vbox1.Add(this.hbox3);
		global::Gtk.Box.BoxChild w8 = ((global::Gtk.Box.BoxChild)(this.vbox1[this.hbox3]));
		w8.Position = 2;
		w8.Expand = false;
		w8.Fill = false;
		this.Add(this.vbox1);
		if ((this.Child != null))
		{
			this.Child.ShowAll();
		}
		this.DefaultWidth = 400;
		this.DefaultHeight = 300;
		this.Show();
		this.DeleteEvent += new global::Gtk.DeleteEventHandler(this.OnDeleteEvent);
		this.saludar.Clicked += new global::System.EventHandler(this.OnSaludarClicked);
		this.aleatorio.Clicked += new global::System.EventHandler(this.OnAleatorioClicked);
		this.salir.Clicked += new global::System.EventHandler(this.OnSalirClicked);
	}
}
