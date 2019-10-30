package com.example.creadorpersonajes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;

public class Activity_Finalizar extends AppCompatActivity {

    TextView textViewRaza, textViewProfesion, textEdad, textoBiografia;
    Spinner spinnerGenero;
    SeekBar seekEdad;
    int edad=30;
    String parametroRaza, parametroProfesion,opcion1,opcion2,opcion3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__finalizar);
        getSupportActionBar().hide();

        textViewRaza = (TextView) findViewById(R.id.textViewRaza);
        textViewProfesion = (TextView) findViewById(R.id.textViewProfesion);
        textoBiografia = (TextView) findViewById(R.id.textoBiografia);

        parametroRaza = getIntent().getStringExtra("raza");
        parametroProfesion = getIntent().getStringExtra("profesion");
        opcion1 = getIntent().getStringExtra("opcion1");
        opcion2 = getIntent().getStringExtra("opcion2");
        opcion3 = getIntent().getStringExtra("opcion3");

        textViewRaza.setText(parametroRaza);
        textViewProfesion.setText(parametroProfesion);

        spinnerGenero = (Spinner) findViewById(R.id.spinnerGenero);
        String [] opciones = {"Masculino", "Femenino"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinnerGenero.setAdapter(adapter);

        seekEdad = (SeekBar) findViewById(R.id.seekEdad);
        textEdad = (TextView) findViewById(R.id.textEdad);
        seekEdad.setMax(100);
        seekEdad.setProgress(edad);
        textEdad.setText(edad+"");

        seekEdad.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekEdad, int i, boolean b) {
                edad = i;
                textEdad.setText("" + edad);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        switch (parametroRaza){
            case "Asura":
                textoBiografia.setText("Soy un reputado miembro del Instituto de "+opcion1+". Mi primer invento fue el "+opcion2+", y algún día, mis adoradores dirán que he superado incluso a mi primer consejero, el maestro "+opcion3+".\n\nEsta es mi historia.");
                break;
            case "Norn":
                switch (opcion3){
                    case "Oso": opcion3="La Osa, mi espiritu guía, enseña que hay un timepo para ser enérgico y un tiempo para ser amable.";break;
                    case "Leopardo de las nieves": opcion3="La pantera de las Nieves, mi espíritu de guía, enseña que hay un tiempo para la serenidad y un tiempo para la risa.";break;
                    case "Lobo": opcion3="El Lobo, mi espíritu guía, enseña que hay un tiempo para la violencia y un tiempo para la paz.";break;
                }
                switch (opcion1){
                    case "Derrota a nuestros enemigos ancestrales": opcion1="Trabajo duro para mantener mi fuerza y destreza física.";break;
                    case "Proteger a los espíritus": opcion1="Dependo de mi astucia para protegernos a mis aliados y a mí.";break;
                    case "Defiende la Niebla": opcion1="Confío en mi intuición y en mi instinto en situaciones peligrosas.";break;
                }
                switch (opcion2){
                    case "Inconsciente": opcion2="en  el pasado he sido negligente. Me dejé llevar por el jolgorio de un festín y desperté a la mañana siguiente incapaz de recordar lo que había hecho. Es un misterio que debo resolver.";break;
                    case "Venganza": opcion2="he conocido el fracaso. Desafié a mi rival de toda la vida a una pelea en un festín y, por confiarme, perdí. Espero el día en que pueda tomarme la revancha.";break;
                    case "Herencia perdida": opcion2="en el pasado he sido un insensato. Aposté el Cuerno de Romke, una reliquia ancestral de mi familia con propiedades mágicas, en una prueba de fuerza. Me confié, pero estoy decidido a recuperarlo.";break;
                }
                textoBiografia.setText(opcion3+"\n"+opcion1+" Y, sin embargo, "+opcion2);
                break;
            case "Charr":
                switch (opcion3){
                    case "Soldado leal": opcion3+=". Mi objetivo es estar a la altura de su reputación, cueste lo que cueste.";break;
                    case "Chamán hechicero": opcion3+=" Debo superar su reputación, cueste lo que cueste.";break;
                    case "Gladio sin honor": opcion3+=" No le tengo ningún respeto y me niego a vivir bajo su sombra";break;
                }
                textoBiografia.setText("Soy un soldado de la "+opcion1+", y mi escuadra es mi familia. Moriría por ellos, sobre todo por "+opcion2+", mi compañero de combate.\nDicen que mi progenitor es"+opcion3);
                break;
            case "Sylvari":
                textoBiografia.setText("El Árbol Pálido me despertó durante el "+opcion3+". La más importante de las enseñanzas de Ventari es: '"+opcion2+"'.\nDurante mi Sueño, soñé con el "+opcion1+" y mi destino es encontrarlo.\n\nEsta es mi historia.");
                break;
            case "Humano":
                switch (opcion3){
                    case "Dwayna": opcion3+=", la diosa de la curación,";break;
                    case "Grenth": opcion3+=", el dios de la muerte,";break;
                    case "Balthazar": opcion3+=", el dios de la guerra,";break;
                }
                switch (opcion1){
                    case "Plebeyo": opcion1="Fui criado por el pueblo llano y he trabajado muy duro, pero honradamente.";break;
                    case "Noble": opcion1="Crecí entre la nobleza y valoro mi honor.";break;
                    case "Rata callejera": opcion1="Mi gente era muy pobre y he tenido que luchar toda mi vida.";break;
                }
                switch (opcion2){
                    case "Huerfano": opcion2="buscado nunca a mis verdaderos padres.";break;
                    case "Hermana muerta": opcion2="recuperado el cuerpo de mi hermana.";break;
                    case "Oportunidad perdida": opcion2="aceptado la oportunidad de actuar en el circo.";break;
                }
                textoBiografia.setText(opcion3+" me bendijo cuando era joven.\n"+opcion1+" Estoy muy orgulloso de la vida que he llevado; solo me arrepiento de no haber "+opcion2+"\n\nEsta es mi historia.");
                break;
        }
    }

    public void atras (View view){
        Intent i = new Intent (this, Activity_Biografia3.class);
        i.putExtra("raza", parametroRaza);
        i.putExtra("profesion", parametroProfesion);
        i.putExtra("opcion1", opcion1);
        i.putExtra("opcion2", opcion2);
        i.putExtra("opcion3", opcion3);
        startActivity(i);
    }
    public void crear(View view){
        Toast.makeText(this, "Personaje creado", Toast.LENGTH_LONG).show();
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }

}
