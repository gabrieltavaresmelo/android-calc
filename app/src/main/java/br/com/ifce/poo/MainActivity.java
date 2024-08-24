package br.com.ifce.poo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnSomar;
    private Button btnSubtrair;
    private EditText etN1;
    private EditText etN2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        btnSomar = (Button) findViewById(R.id.btnSomar);
        btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
        etN1 = (EditText) findViewById(R.id.etN1);
        etN2 = (EditText) findViewById(R.id.etN2);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n1 = etN1.getText().toString();
                String n2 = etN2.getText().toString();

                int n1Int = Integer.parseInt(n1);
                int n2Int = Integer.parseInt(n2);

                int soma = n1Int + n2Int;

                Toast.makeText(getApplicationContext(), n1 + " + " + n2 + " = " + soma, Toast.LENGTH_SHORT).show();

                tvResultado.setText(n1 + " + " + n2 + " = " + soma);
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = etN1.getText().toString();
                String n2 = etN2.getText().toString();

                int n1Int = Integer.parseInt(n1);
                int n2Int = Integer.parseInt(n2);

                int resultado = n1Int - n2Int;

                Toast.makeText(getApplicationContext(), n1 + " - " + n2 + " = " + resultado, Toast.LENGTH_SHORT).show();

                tvResultado.setText(n1 + " - " + n2 + " = " + resultado);
            }
        });
    }
}