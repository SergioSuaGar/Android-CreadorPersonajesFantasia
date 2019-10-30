package com.example.creadorpersonajes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Activity_Profesion extends AppCompatActivity {

    TextView textoProfesion, textoDescripcionProfesion;
    RadioButton radioGuerrero,radioGuardian,radioRetornado,radioGuardabosques,radioLadron,radioIngeniero,radioNigromante,radioElementalista,radioHipnotizador;
    String parametroRaza, parametroProfesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__profesion);
        getSupportActionBar().hide();

        parametroRaza = getIntent().getStringExtra("raza");
        parametroProfesion = getIntent().getStringExtra("profesion");

        textoProfesion = (TextView) findViewById(R.id.textoProfesion);
        textoDescripcionProfesion = (TextView) findViewById(R.id.textoDescripcionProfesion);
        radioGuerrero = (RadioButton) findViewById(R.id.radioGuerrero);
        radioGuardian = (RadioButton) findViewById(R.id.radioGuardian);
        radioRetornado = (RadioButton) findViewById(R.id.radioRetornado);
        radioGuardabosques = (RadioButton) findViewById(R.id.radioGuardabosques);
        radioLadron = (RadioButton) findViewById(R.id.radioLadron);
        radioIngeniero = (RadioButton) findViewById(R.id.radioIngeniero);
        radioNigromante = (RadioButton) findViewById(R.id.radioNigromante);
        radioElementalista = (RadioButton) findViewById(R.id.radioElementalista);
        radioHipnotizador = (RadioButton) findViewById(R.id.radioHipnotizador);

        radioGuerrero.setOnClickListener(listenerGuerrero);
        radioGuardian.setOnClickListener(listenerGuardian);
        radioRetornado.setOnClickListener(listenerRetornado);
        radioGuardabosques.setOnClickListener(listenerGuardabosques);
        radioLadron.setOnClickListener(listenerLadron);
        radioIngeniero.setOnClickListener(listenerIngeniero);
        radioNigromante.setOnClickListener(listenerNigromante);
        radioElementalista.setOnClickListener(listenerElementalista);
        radioHipnotizador.setOnClickListener(listenerHipnotizador);
    }

    View.OnClickListener listenerGuerrero = new View.OnClickListener() {
        public void onClick(View v) {
            parametroProfesion="Guerrero";
            textoProfesion.setText("Guerrero");
            textoDescripcionProfesion.setText("Prioriza el cuerpo a cuerpo. Alta capacidad de supervivencia. Maestro de armas. Los guerreros acumulan adrenalina al golpear con éxito a un enemigo, y luego la emplean para lanzar devastadores ataques de estallido. Los guerreros son luchadores versátiles y resistentes");
            radioGuardian.setChecked(false);
            radioRetornado.setChecked(false);
            radioGuardabosques.setChecked(false);
            radioLadron.setChecked(false);
            radioIngeniero.setChecked(false);
            radioNigromante.setChecked(false);
            radioElementalista.setChecked(false);
            radioHipnotizador.setChecked(false);

            radioHipnotizador.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.hipnotizador_gris));
            radioGuerrero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guerrero));
            radioElementalista.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.elementalista_gris));
            radioNigromante.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.nigromante_gris));
            radioIngeniero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ingeniero_gris));
            radioLadron.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ladron_gris));
            radioGuardabosques.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardabosques_gris));
            radioRetornado.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.retornado_gris));
            radioGuardian.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardian_gris));
        }
    };
    View.OnClickListener listenerGuardian = new View.OnClickListener() {
        public void onClick(View v) {
            parametroProfesion="Guardián";
            textoProfesion.setText("Guardián");
            textoDescripcionProfesion.setText("Prioriza el cuerpo a cuerpo. Apoya a los aliados. Magia defensiva. Los guardianes ganan potentes mejoras personales con sus virtudes, que pueden emplear brevemente para ayudar a amigos o dañar a enemigos. Formidables ya por sí solos, donde más se lucen los guardianes es en compañia de aliados.");
            radioGuerrero.setChecked(false);
            radioRetornado.setChecked(false);
            radioGuardabosques.setChecked(false);
            radioLadron.setChecked(false);
            radioIngeniero.setChecked(false);
            radioNigromante.setChecked(false);
            radioElementalista.setChecked(false);
            radioHipnotizador.setChecked(false);

            radioHipnotizador.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.hipnotizador_gris));
            radioGuerrero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guerrero_gris));
            radioElementalista.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.elementalista_gris));
            radioNigromante.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.nigromante_gris));
            radioIngeniero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ingeniero_gris));
            radioLadron.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ladron_gris));
            radioGuardabosques.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardabosques_gris));
            radioRetornado.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.retornado_gris));
            radioGuardian.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardian));
        }
    };
    View.OnClickListener listenerRetornado = new View.OnClickListener() {
        public void onClick(View v) {
            parametroProfesion="Retornado";
            textoProfesion.setText("Retornado");
            textoDescripcionProfesion.setText("Cuerpo a cuerpo a distancia. Invoca héroes legendarios. Luchador que utiliza magia. Los retornados invocan el poder de héroes legendarios del pasado de Tyria, empleando su propia energía para canalizar las habilidades usadas por esas figuras. Son aliados de confianza y peligrosos enemigos.");
            radioGuardian.setChecked(false);
            radioGuerrero.setChecked(false);
            radioGuardabosques.setChecked(false);
            radioLadron.setChecked(false);
            radioIngeniero.setChecked(false);
            radioNigromante.setChecked(false);
            radioElementalista.setChecked(false);
            radioHipnotizador.setChecked(false);

            radioHipnotizador.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.hipnotizador_gris));
            radioGuerrero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guerrero_gris));
            radioElementalista.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.elementalista_gris));
            radioNigromante.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.nigromante_gris));
            radioIngeniero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ingeniero_gris));
            radioLadron.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ladron_gris));
            radioGuardabosques.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardabosques_gris));
            radioRetornado.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.retornado));
            radioGuardian.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardian_gris));
        }
    };
    View.OnClickListener listenerGuardabosques = new View.OnClickListener() {
        public void onClick(View v) {
            parametroProfesion="Guardabosques";
            textoProfesion.setText("Guardabosques");
            textoDescripcionProfesion.setText("Prioriza el ataque a distancia. Mascota acompañante. Naturalista. Los guardabosques doman a diversas mascotas acompañantes para que complementen su estilo de lucha. Con un arsenal que se completa con trampas, espíritus de la naturaleza y habilidades de supervivencia, tienen las herramientas necesarias para enfrentarse a cualquier tipo de enemigo.");
            radioGuardian.setChecked(false);
            radioRetornado.setChecked(false);
            radioGuerrero.setChecked(false);
            radioLadron.setChecked(false);
            radioIngeniero.setChecked(false);
            radioNigromante.setChecked(false);
            radioElementalista.setChecked(false);
            radioHipnotizador.setChecked(false);

            radioHipnotizador.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.hipnotizador_gris));
            radioGuerrero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guerrero_gris));
            radioElementalista.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.elementalista_gris));
            radioNigromante.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.nigromante_gris));
            radioIngeniero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ingeniero_gris));
            radioLadron.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ladron_gris));
            radioGuardabosques.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardabosques));
            radioRetornado.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.retornado_gris));
            radioGuardian.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardian_gris));
        }
    };
    View.OnClickListener listenerLadron = new View.OnClickListener() {
        public void onClick(View v) {
            parametroProfesion="Ladrón";
            textoProfesion.setText("Ladrón");
            textoDescripcionProfesion.setText("Prioriza el cuerpo a cuerpo. Sigilo y evasión. Combate acrobático. Los ladrones gestionan su iniciativa durante el combate, empleándola para lanzar ataques en el momento más oportuno. Lo que les falta en defensa, lo compensan con sus habilidades de debilitar, teletransportarse o esfumarse.");
            radioGuardian.setChecked(false);
            radioRetornado.setChecked(false);
            radioGuardabosques.setChecked(false);
            radioGuerrero.setChecked(false);
            radioIngeniero.setChecked(false);
            radioNigromante.setChecked(false);
            radioElementalista.setChecked(false);
            radioHipnotizador.setChecked(false);

            radioHipnotizador.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.hipnotizador_gris));
            radioGuerrero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guerrero_gris));
            radioElementalista.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.elementalista_gris));
            radioNigromante.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.nigromante_gris));
            radioIngeniero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ingeniero_gris));
            radioLadron.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ladron));
            radioGuardabosques.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardabosques_gris));
            radioRetornado.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.retornado_gris));
            radioGuardian.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardian_gris));
        }
    };
    View.OnClickListener listenerIngeniero = new View.OnClickListener() {
        public void onClick(View v) {
            parametroProfesion="Ingeniero";
            textoProfesion.setText("Ingeniero");
            textoDescripcionProfesion.setText("Cuerpo a cuerpo o distancia. Dispositivos, torretas y kits de herramientas. Tecnomante. Los ingenieros saben de todo un poco, y con el tiempo suficiente dominan muchas cosas. Capaces de aportar a un combate docenas de habilidades normales y del cinturón de herramientas, su arte radica en elegir la adecuada en el momento idóneo.");
            radioGuardian.setChecked(false);
            radioRetornado.setChecked(false);
            radioGuardabosques.setChecked(false);
            radioLadron.setChecked(false);
            radioGuerrero.setChecked(false);
            radioNigromante.setChecked(false);
            radioElementalista.setChecked(false);
            radioHipnotizador.setChecked(false);

            radioHipnotizador.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.hipnotizador_gris));
            radioGuerrero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guerrero_gris));
            radioElementalista.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.elementalista_gris));
            radioNigromante.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.nigromante_gris));
            radioIngeniero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ingeniero));
            radioLadron.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ladron_gris));
            radioGuardabosques.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardabosques_gris));
            radioRetornado.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.retornado_gris));
            radioGuardian.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardian_gris));
        }
    };
    View.OnClickListener listenerNigromante = new View.OnClickListener() {
        public void onClick(View v) {
            parametroProfesion="Nigromante";
            textoProfesion.setText("Nigromante");
            textoDescripcionProfesion.setText("Prioriza el ataque a distancia. Invoca a siervos. Magia negra. Los nigromantes de Tyria son unos monstruos en el campo de batalla, drenándoles la fuerza vital a sus enemigos y metiéndose en un Sudario de muerte que les otorga temporalmente poderosas habilidades y los protege de todo daño.");
            radioGuardian.setChecked(false);
            radioRetornado.setChecked(false);
            radioGuardabosques.setChecked(false);
            radioLadron.setChecked(false);
            radioIngeniero.setChecked(false);
            radioGuerrero.setChecked(false);
            radioElementalista.setChecked(false);
            radioHipnotizador.setChecked(false);

            radioHipnotizador.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.hipnotizador_gris));
            radioGuerrero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guerrero_gris));
            radioElementalista.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.elementalista_gris));
            radioNigromante.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.nigromante));
            radioIngeniero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ingeniero_gris));
            radioLadron.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ladron_gris));
            radioGuardabosques.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardabosques_gris));
            radioRetornado.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.retornado_gris));
            radioGuardian.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardian_gris));
        }
    };
    View.OnClickListener listenerElementalista = new View.OnClickListener() {
        public void onClick(View v) {
            parametroProfesion="Elementalista";
            textoProfesion.setText("Elementalista");
            textoDescripcionProfesion.setText("Prioriza el ataque a distnacia. Magia elemental. Conjurador versátil. Los elementalistas controlan el poder de los cuatro elementos (agua,tierra,fuego,aire) para lanzar potentes hechizos. Su capacidad para cambiar de síntonia elemental en pleno combate es algo versátil pero difícil de dominar.");
            radioGuardian.setChecked(false);
            radioRetornado.setChecked(false);
            radioGuardabosques.setChecked(false);
            radioLadron.setChecked(false);
            radioIngeniero.setChecked(false);
            radioNigromante.setChecked(false);
            radioGuerrero.setChecked(false);
            radioHipnotizador.setChecked(false);

            radioHipnotizador.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.hipnotizador_gris));
            radioGuerrero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guerrero_gris));
            radioElementalista.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.elementalista));
            radioNigromante.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.nigromante_gris));
            radioIngeniero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ingeniero_gris));
            radioLadron.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ladron_gris));
            radioGuardabosques.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardabosques_gris));
            radioRetornado.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.retornado_gris));
            radioGuardian.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardian_gris));
        }
    };
    View.OnClickListener listenerHipnotizador = new View.OnClickListener() {
        public void onClick(View v) {
            parametroProfesion="Hipnotizador";
            textoProfesion.setText("Hipnotizador");
            textoDescripcionProfesion.setText("Prioriza el ataque a distancia. Crea ilusiones. Astucia y desinformación. Maestros del artificio mágico, los hipnotizadores crean y destruyen clones e ilusiones de sí mismos en combate. Los hipnotizadores se sirven de la evasión y el subterfugio, algo que requiere refinamiento y práctica.");
            radioGuardian.setChecked(false);
            radioRetornado.setChecked(false);
            radioGuardabosques.setChecked(false);
            radioLadron.setChecked(false);
            radioIngeniero.setChecked(false);
            radioNigromante.setChecked(false);
            radioElementalista.setChecked(false);
            radioGuerrero.setChecked(false);

            radioHipnotizador.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.hipnotizador));
            radioGuerrero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guerrero_gris));
            radioElementalista.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.elementalista_gris));
            radioNigromante.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.nigromante_gris));
            radioIngeniero.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ingeniero_gris));
            radioLadron.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.ladron_gris));
            radioGuardabosques.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardabosques_gris));
            radioRetornado.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.retornado_gris));
            radioGuardian.setBackground(ContextCompat.getDrawable(Activity_Profesion.this, R.drawable.guardian_gris));
        }
    };

    public void atras (View view){
        Intent i = new Intent (this, Activity_Raza.class);
        i.putExtra("raza", parametroRaza);
        startActivity(i);
    }
    public void siguiente (View view){
        Intent i = new Intent (this, Activity_Biografia1.class);
        i.putExtra("profesion", parametroProfesion);
        i.putExtra("raza", parametroRaza);
        startActivity(i);
    }
}
