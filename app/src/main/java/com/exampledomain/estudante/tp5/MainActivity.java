package com.exampledomain.estudante.tp5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtUsuario,edtSenha;
    static Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsuario=(EditText)findViewById(R.id.editText);
        edtSenha=(EditText)findViewById(R.id.editText2);
        btnRegistrar=(Button)findViewById(R.id.button2);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bunde = new Bundle();
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtras(bunde);
                startActivity(intent);
                finish();
            }
        });

    }
}
