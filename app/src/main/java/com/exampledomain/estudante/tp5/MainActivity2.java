package com.exampledomain.estudante.tp5;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText nome,txtusuario,senha,Rsenha;
    Button Salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome=(EditText)findViewById(R.id.editText6);
                txtusuario=(EditText)findViewById(R.id.editText7);
                senha=(EditText)findViewById(R.id.editText8);
                Rsenha=(EditText)findViewById(R.id.editText9);
                Salvar=(Button)findViewById(R.id.button4);
                String usuario[][]= new String[50][3];
                for(int i=0;i<usuario.length;i++){
                    txtusuario.getText().toString();
                    txtusuario.setText(usuario[i][1]);
                    senha.getText().toString();
                    senha.setText(usuario[i][2]);
                                    }

            }
        });

    }

}
