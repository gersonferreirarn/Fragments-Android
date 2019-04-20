package br.com.caicosoft.fragments.activity;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import br.com.caicosoft.fragments.R;
import br.com.caicosoft.fragments.fragment.ContatosFragment;
import br.com.caicosoft.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    Button btnConversas, btnContatos;
    FrameLayout flConteudo;

    ConversasFragment conversasFragment;
    ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Remove a sombra do Actionbar
        getSupportActionBar().setElevation(0);

        btnConversas = findViewById(R.id.btnConversas);
        btnContatos = findViewById(R.id.btnContatos);
        flConteudo = findViewById(R.id.flConteudo);

        carregaFragmentConversas(); // MOSTRA PRIMEIRO OS CONTATOS

        btnConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregaFragmentConversas();
            }
        });

        btnContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregaFragmentContatos();
            }
        });
    }

    public void carregaFragmentConversas(){
        // Cria instancia do fragment
        conversasFragment = new ConversasFragment();

        // Configura objeto para o fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.flConteudo,conversasFragment); // REPLACE SUBSTITUI OQ TIVER LA NA FRAME(Destino, Conteudo do Destino)
        transaction.commit(); // finaliza transação
    }

    public void carregaFragmentContatos(){
        // Cria instancia do fragment
        contatosFragment = new ContatosFragment();

        // Configura objeto para o fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.flConteudo, contatosFragment); // REPLACE SUBSTITUI OQ TIVER LA NA FRAME(Destino, Conteudo do Destino)
        transaction.commit(); // finaliza transação
    }
}
