package pe.edu.idat.boletsellerap;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pe.edu.idat.boletsellerap.databinding.ItemEventoBinding;

public class EventoAdapter extends RecyclerView.Adapter<EventoAdapter.ViewHolder> {

    private List<Evento> listaEventos;

    public EventoAdapter(List<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemEventoBinding
                .inflate(LayoutInflater
                        .from(parent.getContext()),
                        parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Evento itemEvento = listaEventos.get(position);
        holder.binding.imageView.setImageResource(itemEvento.getImagen());
        holder.binding.concierto.setText(itemEvento.getConcierto());
        holder.binding.fecha.setText(itemEvento.getFecha());
        holder.binding.lugar.setText(itemEvento.getLugar());
        holder.binding.precio.setText(itemEvento.getPrecio());
    }

    @Override
    public int getItemCount() {
        return listaEventos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemEventoBinding binding;
        public ViewHolder(@NonNull ItemEventoBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
