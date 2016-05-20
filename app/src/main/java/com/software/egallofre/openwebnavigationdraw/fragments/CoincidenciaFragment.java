package com.software.egallofre.openwebnavigationdraw.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.software.egallofre.openwebnavigationdraw.Adapters.AdaptadorPersonas;
import com.software.egallofre.openwebnavigationdraw.R;
import com.software.egallofre.openwebnavigationdraw.models.ItemPersona;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CoincidenciaFragment extends Fragment {


    ArrayList<ItemPersona> personas;
    ListView lista;

    public CoincidenciaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_coincidencia, container, false);

        lista=(ListView) v.findViewById(R.id.listView);

       /* personas=new String[] {"pepito","ramon","josep","jaume","felipe"};*/



        personas=new ArrayList<>();
        personas.add(new ItemPersona("maria",24,2));
        personas.add(new ItemPersona("raquel",25,1));
        personas.add(new ItemPersona("montse",27,2));

        AdaptadorPersonas adaptadorPersonas=new AdaptadorPersonas(getActivity(), R.layout.list_item_persona, personas);

        lista.setAdapter(adaptadorPersonas);


        return v;
    }

}
