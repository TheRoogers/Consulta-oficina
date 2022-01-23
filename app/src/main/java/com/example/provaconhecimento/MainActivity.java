package com.example.provaconhecimento;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<List_Element> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init() {
        elements = new ArrayList<>();
        elements.add(new List_Element("#775447","TomCar", "Manuntenção em Geral","A tomCar realiza Manutenção preventiva e corretiva de qualquer veiculo, somos especializados em motor e cambio", "A 3KM", "Av. Nacional, 505 - Parque Xangrila, Contagem - MG", "Email: tomcar@gmail.com", "telefone: (31)9 7507-2811"));
        elements.add(new List_Element("#607d8b","Prime", "Auto Eletrica","Serviços de Auto Elétrica em Geral · Sistema de iluminação (faróis, lanternas, lâmpadas e sinalizadores); · Alternador da bateria do automóvel; Motor de arranque entre outros", "A 8KM", "R. Rio Madeira, 421 - Amazonas, Contagem - MG", "Email: primeeletrica@hotmail.com", "telefone: (31)9 7857-0587"));
        elements.add(new List_Element("#03a9f4","Chronos", "Martelinho de Ouro", "Tiramos amassados do seu veículo de sem danificar a pintura e mantendo a originalidade. Em até 12x sem juros, isso mesmo! Melhor preço e qualidade do mercado!", "A 12KM", "Av. dos Engenheiros, 1234 - Castelo, Belo Horizonte - MG","Email: chronosbh@gmail.com","telefone: (31)9 7852-4494"));
        elements.add(new List_Element("#009688","Sparta", "Lanternagem e Pintura", "Temos nossa própria máquina pigmentação de tintas e cabine profissional de aquecimento. Contamos com Painel de Secagem com Lux Ultravioleta (UV) e profissionais com experiência. Excelência nos resultados.","A 28KM", "R. Francisco Deslandes, 169 - Anchieta, Belo Horizonte - MG", "Email: spartapintura@hotmail.com", "telefone: (31)9 9999-9999"));

        ListAdapter listAdapter = new ListAdapter(elements, this, new ListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(List_Element item) {
                moveToDescription(item);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

    public void moveToDescription(List_Element item){
        Intent intent = new Intent(this, DescriptionActivity.class);
        intent.putExtra("ListElement", item);
        startActivity(intent);
    }
}