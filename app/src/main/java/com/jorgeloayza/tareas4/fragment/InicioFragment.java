package com.jorgeloayza.tareas4.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jorgeloayza.tareas4.R;
import com.jorgeloayza.tareas4.adapter.MascotaAdaptador;
import com.jorgeloayza.tareas4.pojo.Mascota;

import java.util.ArrayList;

public class InicioFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;

    public InicioFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio,container,false);
        // Inflate the layout for this fragment

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Ronny",200,R.drawable.foto1));
        mascotas.add(new Mascota("Lucky",160,R.drawable.foto2));
        mascotas.add(new Mascota("Cookie",160,R.drawable.foto3));
        mascotas.add(new Mascota("Shadow",23,R.drawable.dog_logo1));
        mascotas.add(new Mascota("Mascota X",76,R.drawable.dog2_logo));
        mascotas.add(new Mascota("Mascota Y",2,R.drawable.dog3_logo));


        rvMascotas = view.findViewById(R.id.rvMacotas);
        LinearLayoutManager llm = new LinearLayoutManager(view.getContext());
        llm.setOrientation(RecyclerView.VERTICAL);
        rvMascotas.setLayoutManager(llm);

        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador(mascotas);
        rvMascotas.setAdapter(mascotaAdaptador);
        return view;
    }
}