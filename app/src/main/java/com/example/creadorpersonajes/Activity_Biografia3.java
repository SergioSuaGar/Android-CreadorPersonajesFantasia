package com.example.creadorpersonajes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Activity_Biografia3 extends AppCompatActivity {

    TextView textoBiografiaCompletar3,textoBiografia3,tituloOpcionElegida;
    String parametroRaza="",parametroProfesion="";
    String completar="______ ";
    ImageButton imagenOpcion1,imagenOpcion2,imagenOpcion3;
    String opcion1="",opcion2="",opcion3="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__biografia3);
        getSupportActionBar().hide();

        textoBiografiaCompletar3 = (TextView) findViewById(R.id.textoBiografiaCompletar3);
        tituloOpcionElegida = (TextView) findViewById(R.id.tituloOpcionElegida);
        textoBiografia3 = (TextView) findViewById(R.id.textoBiografia3);
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
                textoBiografiaCompletar3.setText("Mi primer asesor, el que me enseñó casi todo lo que sé (o casi), fue "+ completar + ".");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.asura31));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.asura32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.asura33_gris));
                break;
            case "Norn":
                textoBiografiaCompletar3.setText("Cuando yo era todavía un cachorro, tuve una visión. Un espíritu salvaje me habló y me ofreció su tutela. Ese espíritu fue "+ completar + ".");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.norn31));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.norn32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.norn33_gris));
                break;
            case "Charr":
                textoBiografiaCompletar3.setText("Me han dicho que el soldado que me engendró es un "+ completar + ".");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.charr31));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.charr32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.charr33_gris));
                break;
            case "Sylvari":
                textoBiografiaCompletar3.setText("El Árbol Blanco me despertó durante el "+ completar + ".");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.sylvari31));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.sylvari32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.sylvari33_gris));
                break;
            case "Humano":
                textoBiografiaCompletar3.setText("Todo el mundo decía que estaba bendecido por "+ completar + " cuando era joven.");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.humano31));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.humano32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.humano33_gris));
                break;
        }
    }

    public void seleccionarOpcion1(View view){
        switch(parametroRaza){
            case "Asura":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.asura31));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.asura32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.asura33_gris));
                tituloOpcionElegida.setText("Bronk");
                completar="Bronk";
                textoBiografiaCompletar3.setText("Mi primer asesor, el que me enseñó casi todo lo que sé (o casi), fue "+ completar + ".");
                textoBiografia3.setText("Good Ol'Maestro Bronk me enseñó los beneficios de la potencia de fuego superior. A él le gustaba decir: 'Cuando se trata de superar a los enemigos, no hay tal cosa como un exceso.'");
                break;
            case "Norn":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.norn31));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.norn32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.norn33_gris));
                tituloOpcionElegida.setText("Oso");
                completar="Oso";
                textoBiografiaCompletar3.setText("Cuando yo era todavía un cachorro, tuve una visión. Un espíritu salvaje me habló y me ofreció su tutela. Ese espíritu fue "+ completar + ".");
                textoBiografia3.setText("El Oso es el más poderoso entre los espíritus de la naturaleza. El es un símbolo de fortaleza y confianza en uno mismo. Un Oso me rugió cuando era bebé, y desde entonces, he tenido su coraje en mi corazón.");
                break;
            case "Charr":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.charr31));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.charr32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.charr33_gris));
                tituloOpcionElegida.setText("Soldado leal");
                completar="Soldado leal";
                textoBiografiaCompletar3.setText("Me han dicho que el soldado que me engendró es un "+ completar+".");
                textoBiografia3.setText("He oído que han pronunciado el nombre de mi padre con mucho respeto desde que era un cachorro en el Fahrar. Pienso estar a la altura de su reputación o superarla.");
                break;
            case "Sylvari":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.sylvari31));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.sylvari32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.sylvari33_gris));
                tituloOpcionElegida.setText("Ciclo de la Aurora");
                completar="Ciclo de la Aurora";
                textoBiografiaCompletar3.setText("El Árbol Blanco me despertó durante el "+ completar + ".");
                textoBiografia3.setText("Los Sylvari que despertarón al amanecer son habladores naturales, diplomáticos y abiertos. Estamos íntimamente conectados con nuestro entorno y empatizamos marcadamente con todo, incluso con el resto de razas.");
                break;
            case "Humano":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.humano31));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.humano32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.humano33_gris));
                tituloOpcionElegida.setText("Dwayna");
                completar="Dwayna";
                textoBiografiaCompletar3.setText("Todo el mundo decía que estaba bendecido por "+ completar + " cuando era joven.");
                textoBiografia3.setText("Dwayna es la diosa de la curación, el aire y la vida, es la líder ecuánime de los antiguos dioses. Es a menudo descrita como joven, alta y delgada, elevándose en el aire con sus inmensas alas de plumas.");
                break;
        }
    }
    public void seleccionarOpcion2(View view){
        switch(parametroRaza){
            case "Asura":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.asura31_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.asura32));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.asura33_gris));
                tituloOpcionElegida.setText("Zinga");
                completar="Zinga";
                textoBiografiaCompletar3.setText("Mi primer asesor, el que me enseñó casi todo lo que sé (o casi), fue "+ completar + ".");
                textoBiografia3.setText("Maestra Zinga me enseñó que la mejor forma de magia es buena suerte a la vieja usanza. A ella le gustaba decir: 'Planificar de antemano es para bobos que creen que pueden predecir todos los resultados posibles. ¡El futuro es mutable! ¡Ir con la corriente!'");
                break;
            case "Norn":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.norn31_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.norn32));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.norn33_gris));
                tituloOpcionElegida.setText("Leopardo de las nieves");
                completar="Leopardo de las nieves";
                textoBiografiaCompletar3.setText("Cuando yo era todavía un cachorro, tuve una visión. Un espíritu salvaje me habló y me ofreció su tutela. Ese espíritu fue "+ completar + ".");
                textoBiografia3.setText("El Leopardo de las Nieves es un sigiloso, sonriente espíritu. Nos enseña la independencia. A día de hoy, su sabiduría me guía y el recuerdo de su visita me consuela en las noches oscuras.");
                break;
            case "Charr":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.charr31_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.charr32));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.charr33_gris));
                tituloOpcionElegida.setText("Chamán hechicero");
                completar="Chamán hechicero";
                textoBiografiaCompletar3.setText("Me han dicho que el soldado que me engendró es un "+ completar + ".");
                textoBiografia3.setText("La Legión de la Llama nos esclavizarón una vez. Debido a esto, mi padre, que es un chamán, le tratan con recelo y desconfianza. Tengo que salvar su reputación.");
                break;
            case "Sylvari":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.sylvari31_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.sylvari32));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.sylvari33_gris));
                tituloOpcionElegida.setText("Ciclo del Día");
                completar="Ciclo del Día";
                textoBiografiaCompletar3.setText("El Árbol Blanco me despertó durante el "+ completar + ".");
                textoBiografia3.setText("Los Sylvari nacidos en el medio día solucionan sus problemas de frente. Son guerreros, cazadores, y viajeros, viven las experiencias de la vida de primera mano y disfrutan de la emoción del riesgo al sentirse vivos.");
                break;
            case "Humano":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.humano31_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.humano32));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.humano33_gris));
                tituloOpcionElegida.setText("Grenth");
                completar="Grenth";
                textoBiografiaCompletar3.setText("Todo el mundo decía que estaba bendecido por "+ completar + " cuando era joven.");
                textoBiografia3.setText("Grenth Es el dios de la oscuridad, el hielo y la muerte. Sus acólitos saben que el velo entre mundos es fino. La muerte no me asusta. Incluso las noches más ocuras me dan comodidad, porqué Grenth vela por mi.");
                break;
        }
    }
    public void seleccionarOpcion3(View view) {
        switch (parametroRaza) {
            case "Asura":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.asura31_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.asura32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.asura33));
                tituloOpcionElegida.setText("Blipp");
                completar = "Blipp";
                textoBiografiaCompletar3.setText("Mi primer asesor, el que me enseñó casi todo lo que sé (o casi), fue " + completar + ".");
                textoBiografia3.setText("Maestro Blipp era conocido por sus redundancias, así como sus despidos. A menudo decía: 'Su primer intento no debe ser el último, sobre todo si lo logró. Usted siempre puede tener éxito más grande la próxima vez.'");
                break;
            case "Norn":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.norn31_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.norn32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.norn33));
                tituloOpcionElegida.setText("Lobo");
                completar="Lobo";
                textoBiografiaCompletar3.setText("Cuando yo era todavía un cachorro, tuve una visión. Un espíritu salvaje me habló y me ofreció su tutela. Ese espíritu fue "+ completar + ".");
                textoBiografia3.setText("El Lobo tiene la astucia de la manada detrás de él. Imparte las virtudes de la lealtad, la ferocidad y la fuerza. Cuando él vino a mí, me susurró mi futuro heroico y me dijo que nunca estaría sola.");
                break;
            case "Charr":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.charr31_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.charr32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.charr33));
                tituloOpcionElegida.setText("Gladio sin honor");
                completar="Gladio sin honor";
                textoBiografiaCompletar3.setText("Me han dicho que el soldado que me engendró es un "+ completar + ".");
                textoBiografia3.setText("Un gladio no tiene banda. Mi padre dio la espalda a la suya. Ahora, él es un gladio sin honor, sin ningún respeto por la cadena de mando, y no tengo ningún respeto hacia él.");
                break;
            case "Sylvari":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.sylvari31_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.sylvari32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.sylvari33));
                tituloOpcionElegida.setText("Ciclo del Crepúsculo");
                completar="Ciclo del Crepúsculo";
                textoBiografiaCompletar3.setText("El Árbol Blanco me despertó durante el "+ completar + ".");
                textoBiografia3.setText("Los Sylvari que despertaron en el crepúsculo son naturalmente curiosos y reflexivos. Nos encanta aprender y pasar el tiempo leyendo y estudiando. Somos inteligentes y nos atrae las exuberantes complejidades de la magia.");
                break;
            case "Humano":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.humano31_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.humano32_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia3.this, R.drawable.humano33));
                tituloOpcionElegida.setText("Balthazar");
                completar="Balthazar";
                textoBiografiaCompletar3.setText("Todo el mundo decía que estaba bendecido por "+ completar + " cuando era joven.");
                textoBiografia3.setText("Balthazar Es el dios de la guerra, el fuego y el reto — supervisa el campo de batalla. Favorecen a aquellos que tienen un don para la estrategia en el combate y habilidad con las armas. He entrenado muy duro para honrar a Balthazar.");
                break;
        }
    }

    public void atras (View view){
        Intent i = new Intent (this, Activity_Biografia2.class);
        i.putExtra("raza", parametroRaza);
        i.putExtra("profesion", parametroProfesion);
        i.putExtra("opcion1", opcion1);
        i.putExtra("opcion2", opcion2);
        i.putExtra("opcion3", completar);
        startActivity(i);
    }
    public void siguiente (View view){
        Intent i = new Intent (this, Activity_Finalizar.class);
        i.putExtra("raza", parametroRaza);
        i.putExtra("profesion", parametroProfesion);
        i.putExtra("opcion1", opcion1);
        i.putExtra("opcion2", opcion2);
        i.putExtra("opcion3", completar);

        startActivity(i);
    }
}
