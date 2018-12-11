package multi2_ikercobo.operacionesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.*;

import multi2_ikercobo.operacionesapp.R;

public class OperacionesApp extends AppCompatActivity {

    //Atributos
    private EditText editNum1;
    private EditText editNum2;
    private int n1, n2;
    private String rdo;
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

                try {
                    n1 = Integer.parseInt(editNum1.getText().toString());
                    n2 = Integer.parseInt(editNum2.getText().toString());

                    if (rbSumar.isChecked()){  //Si esta seleccionado el boton de SUMAR
                        rdo = Integer.toString(n1 + n2);
                        editRdo.setText(rdo);
                    }
                    else if(rbResta.isChecked()){  //Si esta seleccionado el boton de RESTAR
                        rdo = Integer.toString(n1 - n2);
                        editRdo.setText(rdo);
                    }

                }
                catch(Exception e){
                    Toast toastError = Toast.makeText(getApplicationContext(), "Error: es necesario rellenar ambos campos", Toast.LENGTH_LONG);
                    toastError.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
                    toastError.show();
                    editRdo.setText("");
                }






            };
        })
    ;}
}
