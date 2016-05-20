package com.software.egallofre.openwebnavigationdraw.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.software.egallofre.openwebnavigationdraw.R;
import com.software.egallofre.openwebnavigationdraw.models.ItemPersona;

import java.util.ArrayList;

/**
 * Created by egallofre on 13/05/2016.
 */
public class AdaptadorPersonas extends ArrayAdapter<ItemPersona> {
    Context contexto;
    ArrayList<ItemPersona> personas;

    int layoutPersona;

    public AdaptadorPersonas(Context context, int resource, ArrayList<ItemPersona> objects) {
        super(context, resource, objects);
        this.contexto=context;
        this.layoutPersona=resource;
        this.personas=objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        LayoutInflater inflater=(LayoutInflater)contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View layoutPersonaAInyectar=inflater.inflate(layoutPersona, parent,false);

        ItemPersona personaActual=personas.get(position);

        ImageView icono=(ImageView) layoutPersonaAInyectar.findViewById(R.id.imageView);
        TextView nombre=(TextView) layoutPersonaAInyectar.findViewById(R.id.textViewNombrePersona);
        TextView edad=(TextView) layoutPersonaAInyectar.findViewById(R.id.textViewEdad);
        if (personaActual.getTipoCoincidencia()==1) {
            icono.setImageResource(R.drawable.ic_action_name);
        }
        else
        {
            icono.setImageResource(R.drawable.logout);

        }
        nombre.setText(personaActual.getNombre());
        edad.setText(String.valueOf(personaActual.getEdad()));

        return layoutPersonaAInyectar;
    }


}
