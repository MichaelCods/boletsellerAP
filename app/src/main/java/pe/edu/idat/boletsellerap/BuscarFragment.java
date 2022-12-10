package pe.edu.idat.boletsellerap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import pe.edu.idat.boletsellerap.databinding.FragmentBuscarBinding;

public class BuscarFragment extends Fragment {


    public BuscarFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    FragmentBuscarBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       binding = FragmentBuscarBinding.inflate(inflater, container, false);
       return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<Evento> listEvents = new ArrayList<>();
        listEvents.add(new Evento(listEvents.size() + 1, R.drawable.logo, "Mötley Crüe","*Mar FEB 24,  4PM","ESTADIO NACIONAL","S/520.00"));
        listEvents.add(new Evento(listEvents.size() + 1, R.drawable.logo, "Mötley Crüe","*Mar FEB 24,  4PM","ESTADIO NACIONAL","S/520.00"));
        listEvents.add(new Evento(listEvents.size() + 1, R.drawable.logo, "Mötley Crüe","*Mar FEB 24,  4PM","ESTADIO NACIONAL","S/520.00"));
        listEvents.add(new Evento(listEvents.size() + 1, R.drawable.logo, "Mötley Crüe","*Mar FEB 24,  4PM","ESTADIO NACIONAL","S/520.00"));
        listEvents.add(new Evento(listEvents.size() + 1, R.drawable.logo, "Mötley Crüe","*Mar FEB 24,  4PM","ESTADIO NACIONAL","S/520.00"));
        listEvents.add(new Evento(listEvents.size() + 1, R.drawable.logo, "Mötley Crüe","*Mar FEB 24,  4PM","ESTADIO NACIONAL","S/520.00"));
        listEvents.add(new Evento(listEvents.size() + 1, R.drawable.logo, "Mötley Crüe","*Mar FEB 24,  4PM","ESTADIO NACIONAL","S/520.00"));
        listEvents.add(new Evento(listEvents.size() + 1, R.drawable.logo, "Mötley Crüe","*Mar FEB 24,  4PM","ESTADIO NACIONAL","S/520.00"));

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        EventoAdapter adapter = new EventoAdapter(listEvents);
        binding.recyclerView.setAdapter(adapter);
    }
}