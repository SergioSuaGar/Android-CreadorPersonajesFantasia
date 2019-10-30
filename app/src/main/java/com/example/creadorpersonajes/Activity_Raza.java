package com.example.creadorpersonajes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Activity_Raza extends AppCompatActivity {

    TextView textoNombreRaza, textoDescripcionRaza;
    ImageButton botonNorn, botonAsura, botonBestia, botonSylvari, botonHumano;
    String parametroRaza="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__raza);
        getSupportActionBar().hide();

        parametroRaza = getIntent().getStringExtra("raza");

        textoNombreRaza = (TextView) findViewById(R.id.textoNombreRaza);
        textoDescripcionRaza = (TextView) findViewById(R.id.textoDescripcionRaza);

        botonNorn = (ImageButton) findViewById(R.id.botonNorn);
        botonAsura = (ImageButton) findViewById(R.id.botonAsura);
        botonBestia = (ImageButton) findViewById(R.id.botonBestia);
        botonSylvari = (ImageButton) findViewById(R.id.botonSylvari);
        botonHumano = (ImageButton) findViewById(R.id.botonHumano);

    }
    public void razaNorn (View view){
        parametroRaza="Norn";
        textoNombreRaza.setText("Norn");
        textoDescripcionRaza.setText("Esta raza de destacados cazadores sufrió una gran derrota cuando el dragón de hielo los forzó a huir de su hogar glacial. Sin embargo, no dejan que una batalla perdida, por dura que sea, acabe con su estusiasmo por la vida y la caza. Saben que solo la victoria final otorga recompensas legendarias.");

        botonNorn.setImageResource(R.drawable.razanorn);
        botonAsura.setImageResource(R.drawable.raza_asura_gris);
        botonBestia.setImageResource(R.drawable.raza_bestia_gris);
        botonSylvari.setImageResource(R.drawable.raza_guardabosques_gris);
        botonHumano.setImageResource(R.drawable.raza_humano_gris);

    }
    public void razaAsura (View view){
        parametroRaza="Asura";
        textoNombreRaza.setText("Asura");
        textoDescripcionRaza.setText("Estos inventores alquimágicos pueden no ser muy altos, pero son grandes intelectuales. Entre los asura, el que sobrevive no es el fuerte, sino el inteligente. Las demás razas creen que debería gobernar en virtud de su poder y su fuerza, pero se engañan. A su debido tiempo, todos servirán a los asura.");

        botonNorn.setImageResource(R.drawable.raza_norn_gris);
        botonAsura.setImageResource(R.drawable.razaasura);
        botonBestia.setImageResource(R.drawable.raza_bestia_gris);
        botonSylvari.setImageResource(R.drawable.raza_guardabosques_gris);
        botonHumano.setImageResource(R.drawable.raza_humano_gris);

    }
    public void razaGuardabosques (View view){
        parametroRaza="Sylvari";
        textoNombreRaza.setText("Sylvari");
        textoDescripcionRaza.setText("Los sylvari no nacen. Se despiertan bajo el Árbol Pálido con el conocimiento acumulado durante su Sueño prenatal. Estos nobles seres viajan en busca de aventuras y misiones. Luchan por equilibrar la curiosidad con el deber, el entusiasmo con la cortesía y la guerra con el honor. Magia y misterio se entrelazan para dar forma al futuro.");

        botonNorn.setImageResource(R.drawable.raza_norn_gris);
        botonAsura.setImageResource(R.drawable.raza_asura_gris);
        botonBestia.setImageResource(R.drawable.raza_bestia_gris);
        botonSylvari.setImageResource(R.drawable.razaguardabosques);
        botonHumano.setImageResource(R.drawable.raza_humano_gris);
    }
    public void razaBestia (View view){
        parametroRaza="Charr";
        textoNombreRaza.setText("Charr");
        textoDescripcionRaza.setText("La raza de los charr se forjó en el despiadado crisol de la guerra. Es todo lo que conocen. La guerra los define y su búsqueda del dominio los empuja hacia adelante. Los enclenques y los necios no tienen lugar entre los charr. La victoria es todo lo que importa y se debe conseguir por todos los medios y a cualquier coste.");

        botonNorn.setImageResource(R.drawable.raza_norn_gris);
        botonAsura.setImageResource(R.drawable.raza_asura_gris);
        botonBestia.setImageResource(R.drawable.razabestia);
        botonSylvari.setImageResource(R.drawable.raza_guardabosques_gris);
        botonHumano.setImageResource(R.drawable.raza_humano_gris);
    }
    public void razaHumano (View view){
        parametroRaza="Humano";
        textoNombreRaza.setText("Humano");
        textoDescripcionRaza.setText("Los humanos han perdido su tierra, su seguridad y su antigua gloria. Incluso sus dioses se han retirado. Y, aun así, el espiritu humano sigue siendo inquebrantable. Estos brevos defensores de Kryta siguen luchando con todas sus fuerzas.");

        botonNorn.setImageResource(R.drawable.raza_norn_gris);
        botonAsura.setImageResource(R.drawable.raza_asura_gris);
        botonBestia.setImageResource(R.drawable.raza_bestia_gris);
        botonSylvari.setImageResource(R.drawable.raza_guardabosques_gris);
        botonHumano.setImageResource(R.drawable.razahumano);
    }
    public void atras (View view){
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }
    public void siguiente (View view){
        Intent i = new Intent (this, Activity_Profesion.class);
        i.putExtra("raza", parametroRaza);
        startActivity(i);
    }
}
