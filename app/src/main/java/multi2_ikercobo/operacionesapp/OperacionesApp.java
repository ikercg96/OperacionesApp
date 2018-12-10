package multi2_ikercobo.operacionesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class OperacionesApp extends AppCompatActivity {

    //Atributos
    private EditText editNum1;
    private EditText editNum2;
    int n1, n2, rdo;
    private EditText editRdo;
    private RadioButton rbSumar;
    private RadioButton rbResta;
    private RadioButton rbMultip;
    private RadioButton rbDivis;
    private Button btnCalcular;
    private Button btnLimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones_app);

        //Asociar las variables con los elementos de la interfaz
        editNum1 = findViewById(R.id.editNum1);
        editNum2 = findViewById(R.id.editNum2);
        editRdo = findViewById(R.id.editRdo);
        rbSumar = findViewById(R.id.buttonSuma);
        rbResta = findViewById(R.id.buttonResta);
        rbMultip = findViewById(R.id.buttonMultip);
        rbDivis = findViewById(R.id.buttonDivis);
        btnCalcular = findViewById(R.id.buttonCalcular);
        btnLimpiar = findViewById(R.id.buttonLimpiar);


        //Lo que sucede al pulsar el boton Calcular
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                n1 = Integer.parseInt(editNum1.getText().toString());
                n2 = Integer.parseInt(editNum2.getText().toString());


                if (rbSumar.isChecked()){  //Si esta seleccionado el boton de SUMAR
                    rdo = n1 + n2;
                    editRdo.setText(rdo);
                }
                else if(rbResta.isChecked()){  //Si esta seleccionado el boton de RESTAR

                }

            };
        })
    ;}
}
