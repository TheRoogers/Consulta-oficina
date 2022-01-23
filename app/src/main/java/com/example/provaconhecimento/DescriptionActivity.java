package com.example.provaconhecimento;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;


public class DescriptionActivity extends AppCompatActivity {

    TextView oficinaDescriptionTextView;
    TextView descricaoDescriptionTextView;
    TextView fulldescriptionTextView;
    TextView distanciaDescriptionTextView;
    TextView enderecodescriptionTextView;
    TextView emaildescriptionTextView;
    TextView telefoneDescriptionTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        List_Element element = (List_Element) getIntent().getSerializableExtra("ListElement");
        oficinaDescriptionTextView = findViewById(R.id.oficinadescriptionTextView);
        descricaoDescriptionTextView = findViewById(R.id.descricaodescriptionTextView);
        fulldescriptionTextView = findViewById(R.id.fulldescriptionTextView);
        distanciaDescriptionTextView = findViewById(R.id.distanciadescriptionTextView);
        enderecodescriptionTextView = findViewById(R.id.enderecodescriptionTextView);
        emaildescriptionTextView = findViewById(R.id.emaildescriptionTextView);
        telefoneDescriptionTextView = findViewById(R.id.telefonedescriptionTextView);

        oficinaDescriptionTextView.setText(element.getOficina());
        oficinaDescriptionTextView.setTextColor(Color.parseColor(element.getColor()));

        descricaoDescriptionTextView.setText(element.getDescricao());

        fulldescriptionTextView.setText(element.getfullDescricao());
        fulldescriptionTextView.setTextColor(Color.BLACK);

        distanciaDescriptionTextView.setText(element.getDistancia());
        distanciaDescriptionTextView.setTextColor(Color.BLACK);

        enderecodescriptionTextView.setText(element.getEndereco());
        enderecodescriptionTextView.setTextColor(Color.BLACK);

        emaildescriptionTextView.setText(element.getEmail());
        emaildescriptionTextView.setTextColor(Color.BLACK);

        telefoneDescriptionTextView.setText(element.getTelefone());
        telefoneDescriptionTextView.setTextColor(Color.BLACK);
    }}

