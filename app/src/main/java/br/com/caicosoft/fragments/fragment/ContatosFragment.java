package br.com.caicosoft.fragments.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.caicosoft.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContatosFragment extends Fragment {

    TextView tvContato;

    public ContatosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contatos, container, false);

        // somente eh possivel utilizar o findViewById aqui chamando a view que inflou o XML do feagment
        tvContato = view.findViewById(R.id.tvContato);

        return view;
    }

}
