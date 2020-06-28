package idadedecachorro.studio.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText idade;
    private Button calcular;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idade = (EditText) findViewById(R.id.editTextId);
        calcular = (Button) findViewById(R.id.botaoCalcularId);
        resultado = (TextView) findViewById(R.id.textResultadoId);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String idadeCao = idade.getText().toString();

                if (idadeCao.isEmpty()){

                    resultado.setText("Favor digitar um número");

                }else {

                    int valorDigitado = Integer.parseInt(idadeCao);

                    int resultadoFinal = valorDigitado * 7;

                    resultado.setText("A idade do cachorro em anos humanos é: " + resultadoFinal);
                }

            }
        });


    }
}
