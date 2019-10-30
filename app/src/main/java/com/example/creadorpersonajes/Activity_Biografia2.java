package com.example.creadorpersonajes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class Activity_Biografia2 extends AppCompatActivity {

    TextView textoBiografiaCompletar2,textoBiografia2,tituloOpcionElegida;
    String parametroRaza="",parametroProfesion="";
    String completar="______ ";
    ImageButton imagenOpcion1,imagenOpcion2,imagenOpcion3;
    String opcion1="",opcion2="",opcion3="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__biografia2);
        getSupportActionBar().hide();

        textoBiografiaCompletar2 = (TextView) findViewById(R.id.textoBiografiaCompletar2);
        tituloOpcionElegida = (TextView) findViewById(R.id.tituloOpcionElegida);
        textoBiografia2 = (TextView) findViewById(R.id.textoBiografia2);
        imagenOpcion1 = (ImageButton) findViewById(R.id.imagenOpcion1);
        imagenOpcion2 = (ImageButton) findViewById(R.id.imagenOpcion2);
        imagenOpcion3 = (ImageButton) findViewById(R.id.imagenOpcion3);

        parametroRaza = getIntent().getStringExtra("raza");
        parametroProfesion = getIntent().getStringExtra("profesion");
        opcion1 = getIntent().getStringExtra("opcion1");
        opcion2 = getIntent().getStringExtra("opcion2");
        opcion3 = getIntent().getStringExtra("opcion3");

        switch (parametroRaza){
            case "Asura":
                textoBiografiaCompletar2.setText("Mi primera creación fue un "+ completar + ".");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.asura21_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.asura22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.asura23_gris));
                break;
            case "Norn":
                textoBiografiaCompletar2.setText("En una celebración reciente realizada en Hoelbrak, yo "+ completar + ".");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.norn21_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.norn22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.norn23_gris));
                break;
            case "Charr":
                textoBiografiaCompletar2.setText("Moriria por mi hermandad de guerra, especialmente por "+ completar + " mi compañero de entrenamiento.");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr21_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr23_gris));
                break;
            case "Sylvari":
                textoBiografiaCompletar2.setText("Creo que lo más importante de las enseñanzas de Ventari es "+ completar + ".");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.sylvari21_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.sylvari22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.sylvari23_gris));
                break;
            case "Humano":
                textoBiografiaCompletar2.setText("Uno de mis mayores pesares es que "+ completar + ".");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.humano21_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.humano22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.humano23_gris));
                break;
        }
    }

    public void seleccionarOpcion1(View view){
        switch(parametroRaza){
            case "Asura":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.asura21));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.asura22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.asura23_gris));
                tituloOpcionElegida.setText("Gólem VAL-A");
                completar="Gólem VAL-A";
                textoBiografiaCompletar2.setText("Mi primera creación fue un "+ completar + ".");
                textoBiografia2.setText("La mayoría de gólems son centros de poder, diseñados para la guerra. Nos muestran la sutileza o la originalidad del diseño. Mi gólem era compacto y eficiente, y tenia un paquete de características sin precedentes. Revolucionó la limpieza del laboratorio, y mezclaba unos cócteles estupendos.");
                break;
            case "Norn":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.norn21));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.norn22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.norn23_gris));
                tituloOpcionElegida.setText("Inconsciente");
                completar="Inconsciente";
                textoBiografiaCompletar2.setText("En una celebración reciente realizada en Hoelbrak, yo "+ completar + ".");
                textoBiografia2.setText("¡Cerveza! ¡Peleas escandalosas! Es demasiado fácil dar rienda suelta a la emoción del momento. Después me desperté y no podía recordar lo que había hecho. Estoy seguro de que no era nada demasiado terrible.");
                break;
            case "Charr":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr21));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr23_gris));
                tituloOpcionElegida.setText("Maverick");
                completar="Maverick";
                textoBiografiaCompletar2.setText("Moriria por mi hermandad de guerra, especialmente por "+ completar + " mi compañero de entrenamiento.");
                textoBiografia2.setText("Maverick es el mejor luchador de uno contra uno que haya conocido. Desafortunadamente, tiene una vena rebelde y ha generado una reputación fuera de nuestra banda como una bala perdida.");
                break;
            case "Sylvari":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.sylvari21));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.sylvari22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.sylvari23_gris));
                tituloOpcionElegida.setText("Actúa sabiamente, pero actúa");
                completar="Actúa sabiamente, pero actúa";
                textoBiografiaCompletar2.setText("Creo que lo más importante de las enseñanzas de Ventari es "+ completar + ".");
                textoBiografia2.setText("Una cosa es saber lo que es correcto y otra usarlo para cambiar el mundo. Todos tenemos una vocación. Me voy a distinguir a través de mis acciones y con ello levantar Tyria a un estado superior de nobleza.");
                break;
            case "Humano":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.humano21));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.humano22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.humano23_gris));
                tituloOpcionElegida.setText("Huerfano");
                completar="Huerfano";
                textoBiografiaCompletar2.setText("Uno de mis mayores pesares es que "+ completar + ".");
                textoBiografia2.setText("Cuando yo era un niño, fui abandonado en un orfanato. Una pareja amable me adoptó y se convirtió en mi familia. Sin embargo, siempre me he preguntado acerca de mis verdaderos padres.");
                break;
        }
    }
    public void seleccionarOpcion2(View view){
        switch(parametroRaza){
            case "Asura":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.asura21_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.asura22));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.asura23_gris));
                tituloOpcionElegida.setText("Conversor transatmosférico");
                completar="Conversor transatmosférico";
                textoBiografiaCompletar2.setText("Mi primera creación fue un "+ completar + ".");
                textoBiografia2.setText("¡Qué alegría poder cambiar el tiempo a mi antojo! Eso si el prototipo hubiese sido más fuerte. Sin embargo, el diseño fue muy vanguardista. Mi conversor transatmosférico era una obra maestra de un completo genio. Ojalá hubiese tenido más fondos.");
                break;
            case "Norn":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr21_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr22));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr23_gris));
                tituloOpcionElegida.setText("Venganza");
                completar="Venganza";
                textoBiografiaCompletar2.setText("En una celebración reciente realizada en Hoelbrak, yo "+ completar + ".");
                textoBiografia2.setText("He tenido un rival desde que era joven. Es inteligente, traidor y astuto. Yo perdí en nuestro último duelo, pero la próxima vez que nos reunamos, yo ganaré.");
                break;
            case "Charr":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr21_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr22));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr23_gris));
                tituloOpcionElegida.setText("Euryale");
                completar="Euryale";
                textoBiografiaCompletar2.setText("Moriria por mi hermandad de guerra, especialmente por "+ completar + " mi compañero de entrenamiento.");
                textoBiografia2.setText("Euryale es el soldado más leal en las legiones. Es terca y malhumorada. Cree que nuestra hermandad no puede hacer nada malo y a cualquiera que diga lo contrario le hace morder el polvo.");
                break;
            case "Sylvari":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.sylvari21_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.sylvari22));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.sylvari23_gris));
                tituloOpcionElegida.setText("Todas las cosas tienen derecho a crecer");
                completar="Todas las cosas tienen derecho a crecer";
                textoBiografiaCompletar2.setText("Creo que lo más importante de las enseñanzas de Ventari es "+ completar + ".");
                textoBiografia2.setText("La flor es hermano de la maleza. La discusión es saludable. Nadie debe ser rechazado simplemente por ser diferente. Lucharé por los derechos de todos.");
                break;
            case "Humano":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.humano21_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.humano22));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.humano23_gris));
                tituloOpcionElegida.setText("Hermana muerta");
                completar="Hermana muerta";
                textoBiografiaCompletar2.setText("Uno de mis mayores pesares es que "+ completar + ".");
                textoBiografia2.setText("Mi hermana era una Serafín. Los Centauros la matarón mientras ella estaba en la patrulla. Nunca encontré su cuerpo, y siempre me ha molestado.");
                break;
        }
    }
    public void seleccionarOpcion3(View view) {
        switch (parametroRaza) {
            case "Asura":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.asura21));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.asura22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.asura23));
                tituloOpcionElegida.setText("Bola del infinito");
                completar = "Bola del infinito";
                textoBiografiaCompletar2.setText("Mi primera creación fue un " + completar + ".");
                textoBiografia2.setText("Me dijeron que era un juguete, una ilusión, y un desperdicio de recursos. Qué equivocados estaban. Mi invención predice el futuro. ¿Y qué si no siempre lo predice correctamente? ¡Eso es irrelevante! ¿Podría darme ventaja? Respuesta confusa. Pregunte de nuevo.");
                break;
            case "Norn":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.norn21_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.norn22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.norn23));
                tituloOpcionElegida.setText("Herencia perdida");
                completar="Herencia perdida";
                textoBiografiaCompletar2.setText("En una celebración reciente realizada en Hoelbrak, yo "+ completar + ".");
                textoBiografia2.setText("Heredé el Cuerno de Romke, una reliquia mágica ancestral que ha pasado de generación en generación. Sin embargo, después de unas copas de más lo aposté en un concurso de fuerza... y perdí..");
                break;
            case "Charr":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr21_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.charr23));
                tituloOpcionElegida.setText("Clawspur");
                completar="Clawspur";
                textoBiografiaCompletar2.setText("Moriria por mi hermandad de guerra, especialmente por "+ completar + " mi compañero de entrenamiento.");
                textoBiografia2.setText("Clawspur deja que sus espadas hablen por él. Desenvaina tranquila y silenciosamente. Mientras que otros le gritan y le amenazan, Clawspur se posiciona sigilosamente para hacer una muerte rápida.");
                break;
            case "Sylvari":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.sylvari21_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.sylvari22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.sylvari23));
                tituloOpcionElegida.setText("Allá donde vaya la vida, deberías seguirla");
                completar="Allá donde vaya la vida, deberías seguirla";
                textoBiografiaCompletar2.setText("Creo que lo más importante de las enseñanzas de Ventari es "+ completar + ".");
                textoBiografia2.setText("El mundo es un lugar delicioso y precioso creado para nosotros, para explorar, disfrutar y proteger. Voy a aprender lecciones de cada experiencia, y al crecer, podre ofrecer algo más a cambio.");
                break;
            case "Humano":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.humano21_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.humano22_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia2.this, R.drawable.humano23));
                tituloOpcionElegida.setText("Oportunidad perdida");
                completar="Oportunidad perdida";
                textoBiografiaCompletar2.setText("Uno de mis mayores pesares es que "+ completar + ".");
                textoBiografia2.setText("Cuando yo era joven, tuve la oportunidad de actuar en el circo, pero la rechacé. A día de hoy, me lamento de haberla rechazado.");
                break;
        }
    }

    public void atras (View view){
        Intent i = new Intent (this, Activity_Biografia1.class);
        i.putExtra("raza", parametroRaza);
        i.putExtra("profesion", parametroProfesion);
        i.putExtra("opcion1", opcion1);
        i.putExtra("opcion2", completar);
        i.putExtra("opcion3", opcion3);
        startActivity(i);
    }
    public void siguiente (View view){
        Intent i = new Intent (this, Activity_Biografia3.class);
        i.putExtra("raza", parametroRaza);
        i.putExtra("profesion", parametroProfesion);
        i.putExtra("opcion1", opcion1);
        i.putExtra("opcion2", completar);
        i.putExtra("opcion3", opcion3);
        startActivity(i);
    }
}
