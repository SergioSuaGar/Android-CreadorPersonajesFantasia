package com.example.creadorpersonajes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_Biografia1 extends AppCompatActivity {

    TextView textoBiografiaCompletar1,textoBiografia1,tituloOpcionElegida;
    String parametroRaza="",parametroProfesion="";
    String completar="______ ";
    ImageButton imagenOpcion1,imagenOpcion2,imagenOpcion3;
    String opcion1="",opcion2="",opcion3="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__biografia1);
        getSupportActionBar().hide();

        textoBiografiaCompletar1 = (TextView) findViewById(R.id.textoBiografiaCompletar1);
        tituloOpcionElegida = (TextView) findViewById(R.id.tituloOpcionElegida);
        textoBiografia1 = (TextView) findViewById(R.id.textoBiografia1);
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
                textoBiografiaCompletar1.setText("Soy miembro del instituto de "+ completar + ".");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.asura11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.asura12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.asura13_gris));
                break;
            case "Norn":
                textoBiografiaCompletar1.setText("La cualidad más importante de un gran héroe es "+ completar + ".");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.norn11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.norn12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.norn13_gris));
                break;
            case "Charr":
                textoBiografiaCompletar1.setText("Me siento orgulloso de ser de la "+ completar + ".");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.charr11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.charr12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.charr13_gris));
                break;
            case "Sylvari":
                textoBiografiaCompletar1.setText("Soñaba con una aventura que me llamara a la acción.\nEra una vision de "+ completar + ".");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.sylvari11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.sylvari12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.sylvari13_gris));
                break;
            case "Humano":
                textoBiografiaCompletar1.setText("Yo me crié "+ completar + ".");
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.humano11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.humano12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.humano13_gris));
                break;
        }
    }

    public void seleccionarOpcion1(View view){
        switch(parametroRaza){
            case "Asura":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.asura11));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.asura12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.asura13_gris));
                tituloOpcionElegida.setText("Estática");
                completar="Estática";
                textoBiografiaCompletar1.setText("Soy miembro del instituto de "+ completar + ".");
                textoBiografia1.setText("Constructores y arquitectos forman el Instituto de la Estática, y lo construimos para que perdure. Muchos nos llaman conservadores, pero somos excelentes creando nuevos diseños, usando materiales antiguos de forma innovadora, y ampliando el ámbito del conocimiento de la magia para aplicaciones practicas.");
                break;
            case "Norn":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.norn11));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.norn12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.norn13_gris));
                tituloOpcionElegida.setText("Proteger a los espíritus");
                completar="Proteger a los espíritus";
                textoBiografiaCompletar1.setText("La cualidad más importante de un gran héroe es "+ completar + ".");
                textoBiografia1.setText("Los Norn siempre debe honrar a los espíritus de la naturaleza.Su valentía y astucia nos ayudó a escapar del Dragón de hielo.");
                break;
            case "Charr":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.charr11));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.charr12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.charr13_gris));
                tituloOpcionElegida.setText("Legión de la sangre");
                completar="Legión de la sangre";
                textoBiografiaCompletar1.setText("Me siento orgulloso de ser de la "+ completar + ".");
                textoBiografia1.setText("Soy de la legión de la sangre. Puedo cargar directamente en la batalla. La Legión de Sangre se encuentra en el frente en cualquier combate. Somos poderosos y audaces, ninguno puede igualar nuestra destreza en el campo.");
                break;
            case "Sylvari":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.sylvari11));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.sylvari12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.sylvari13_gris));
                tituloOpcionElegida.setText("El Ciervo Blanco");
                completar="El Ciervo Blanco";
                textoBiografiaCompletar1.setText("Soñaba con una aventura que me llamara a la acción.\nEra una vision de "+ completar + ".");
                textoBiografia1.setText("El Ciervo Blanco es una criatura encantada, una bestia inmortal de gran poder. Se dice que el ciervo negociará su libertad a cambio de una bendición mágica, si lograra cojerlo.");
                break;
            case "Humano":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.humano11));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.humano12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.humano13_gris));
                tituloOpcionElegida.setText("Plebeyo");
                completar="Plebeyo";
                textoBiografiaCompletar1.setText("Yo me crié "+ completar + ".");
                textoBiografia1.setText("Me crié entre gente común de Linde de la Divinidad. Somos de la clase obrera, los engranajes que mantienen a la ciudad en marcha. Ayudo en la taberna propiedad de mis amigos, Andrés y su hija Petra.");
                break;
        }
    }
    public void seleccionarOpcion2(View view){
        switch(parametroRaza){
            case "Asura":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.asura11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.asura12));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.asura13_gris));
                tituloOpcionElegida.setText("Dinámica");
                completar="Dinámica";
                textoBiografiaCompletar1.setText("Soy miembro del instituto de "+ completar + ".");
                textoBiografia1.setText("El Instituto de Dinámica produce extraordinarios constructores de aparatos. Energía, entusiasmo y audacia son nuestras mayores cualidades. Creemos en el aprovechamiento de la naturaleza aplicable a todas las cosas. Si un prototipo explota, no supone un fallo a no ser que no aprendas la lección.");
                break;
            case "Norn":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.norn11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.norn12));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.norn13_gris));
                tituloOpcionElegida.setText("Derrota a nuestros enemigos ancestrales");
                completar="Derrota a nuestros enemigos ancestrales";
                textoBiografiaCompletar1.setText("La cualidad más importante de un gran héroe es "+ completar + ".");
                textoBiografia1.setText("Un verdadero héroe tiene la fuerza para derrotar a nuestros antiguos enemigos y proteger a la Gran Logia");
                break;
            case "Charr":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.charr11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.charr12));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.charr13_gris));
                tituloOpcionElegida.setText("Legión de ceniza");
                completar="Legión de ceniza";
                textoBiografiaCompletar1.setText("Me siento orgulloso de ser de la "+ completar + ".");
                textoBiografia1.setText("Soy de la legión de la ceniza. Uso la astucia para vencer a mis enemigos. La Legión de la Ceniza nos enseña el arte del sigilo y la astucia. Con la infiltración, terminamos batallas incluso antes de comenzar, recopilando información y con ataques precisos.");
                break;
            case "Sylvari":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.sylvari11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.sylvari12));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.sylvari13_gris));
                tituloOpcionElegida.setText("El Caballero verde");
                completar="El Caballero verde";
                textoBiografiaCompletar1.setText("Soñaba con una aventura que me llamara a la acción.\nEra una vision de "+ completar + ".");
                textoBiografia1.setText("Vi a un poderoso cazador con armadura verde, con el rostro oscurecido por las enredaderas. Fue derrotado, pero no sometido; fue asesinado, pero no murió. ¿Me atrevería a combatirlo en batalla?");
                break;
            case "Humano":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.humano11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.humano12));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.humano13_gris));
                tituloOpcionElegida.setText("Noble");
                completar="Noble";
                textoBiografiaCompletar1.setText("Yo me crié "+ completar + ".");
                textoBiografia1.setText("Crecí entre los nobles, incluyendo a mi amigo Lord Faren, su descendencia se remonta a los antiguos reyes. He recibido una excelente educación, estoy versado en la finura cortesana, y comprendo la responsabilidad que conlleva este privilegio.");
                break;
        }
    }
    public void seleccionarOpcion3(View view){
        switch(parametroRaza){
            case "Asura":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.asura11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.asura12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.asura13));
                tituloOpcionElegida.setText("Sinergética");
                completar="Sinergética";
                textoBiografiaCompletar1.setText("Soy miembro del instituto de "+ completar + ".");
                textoBiografia1.setText("Como miembros del Instituto de la sinergética, estudiamos cómo la energía se propaga formando patrones fractales alquimiomágicos. Pocos más allá de nuestra universidad han entendido las complejidades filosóficas y místicas de nuestros intereses. Somos devotos de la investigación de la verdadera naturaleza de la Alquimia Eterna.");
                break;
            case "Norn":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.norn11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.norn12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.norn13));
                tituloOpcionElegida.setText("Defiende la Niebla");
                completar="Defiende la Niebla";
                textoBiografiaCompletar1.setText("La cualidad más importante de un gran héroe es "+ completar + ".");
                textoBiografia1.setText("Un Norn debe venerar y proteger la niebla, donde las almas de nuestros antepasados ​​perdurará en la gloria");
                break;
            case "Charr":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.charr11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.charr12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.charr13));
                tituloOpcionElegida.setText("Legión de hierro");
                completar="Legión de hierro";
                textoBiografiaCompletar1.setText("Me siento orgulloso de ser de la "+ completar + ".");
                textoBiografia1.setText("Soy de la legión del hierro. Marcho al son de las máquinas de guerra. La Legión de Hierro ha desencadenado nuestra revolución industrial. Hemos perfeccionado el metal, los cañones y lo más importante; las armas.");
                break;
            case "Sylvari":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.sylvari11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.sylvari12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.sylvari13));
                tituloOpcionElegida.setText("El Escudo de la Luna");
                completar="El Escudo de la Luna";
                textoBiografiaCompletar1.setText("Soñaba con una aventura que me llamara a la acción.\nEra una vision de "+ completar + ".");
                textoBiografia1.setText("La luna es un poderoso símbolo de curación y magia. Estaré protegido de cualquier sueño por la luna si tengo fe y fortaleza, espero ser digno de esta visión.");
                break;
            case "Humano":
                imagenOpcion1.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.humano11_gris));
                imagenOpcion2.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.humano12_gris));
                imagenOpcion3.setBackground(ContextCompat.getDrawable(Activity_Biografia1.this, R.drawable.humano13));
                tituloOpcionElegida.setText("Rata callejera");
                completar="Rata callejera";
                textoBiografiaCompletar1.setText("Yo me crié "+ completar + ".");
                textoBiografia1.setText("Crecí en la pobreza de la calle, sobreviviendo como podia. Cada día es un reto, pero como le digo a mi compañero Quinn, 'Lo que no te mata, te hace más fuerte'. He trabajado duro para cambiar mi suerte, pero todavía tengo un largo camino por recorrer.");
                break;
        }
    }
    public void atras (View view){
        Intent i = new Intent (this, Activity_Profesion.class);
        i.putExtra("raza", parametroRaza);
        i.putExtra("profesion", parametroProfesion);
        startActivity(i);
    }
    public void siguiente (View view){
        Intent i = new Intent (this, Activity_Biografia2.class);
        i.putExtra("raza", parametroRaza);
        i.putExtra("profesion", parametroProfesion);
        i.putExtra("opcion1", completar);
        i.putExtra("opcion2", opcion2);
        i.putExtra("opcion3", opcion3);
        startActivity(i);
    }
}
