package com.software.egallofre.openwebnavigationdraw.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.andtinder.model.CardModel;
import com.andtinder.view.CardContainer;
import com.andtinder.view.SimpleCardStackAdapter;
import com.software.egallofre.openwebnavigationdraw.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CardsFragment extends Fragment implements CardModel.OnCardDimissedListener {

    private CardContainer contenedorCartas;

    public CardsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_cards, container, false);


        contenedorCartas=(CardContainer)v.findViewById(R.id.cartasContainer);

        CardModel card1 = new CardModel("Pepe", "tarragona", getActivity().getDrawable(R.drawable.chica1));
        CardModel card2 = new CardModel("Montse", "Reus", getActivity().getDrawable(R.drawable.chica2));

        card1.setOnCardDimissedListener(this);
        card2.setOnCardDimissedListener(this);


        SimpleCardStackAdapter adapter = new SimpleCardStackAdapter(getActivity());
        adapter.add(card1);
        adapter.add(card2);
        contenedorCartas.setAdapter(adapter);

        return v;

    }

    @Override
    public void onLike() {
        Toast.makeText(getActivity(),"me gusta",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDislike() {
        Toast.makeText(getActivity(),"no me gusta",Toast.LENGTH_SHORT).show();

    }
}