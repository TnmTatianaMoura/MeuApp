package projetomobile.contador.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //criar um evento para o botão
    public void sortearNumero(View view){
        //não esquecer dde criar o tipo (texto ou botão por exemplo)
        //criar um objeto
        TextView textoResultado = findViewById(R.id.textoResultado);
        int x = new Random().nextInt(11);
        textoResultado.setText(" O número selecionando é: " + x);
    }
}
