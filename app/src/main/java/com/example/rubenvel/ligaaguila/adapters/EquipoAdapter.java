package com.example.rubenvel.ligaaguila.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rubenvel.ligaaguila.R;
import com.example.rubenvel.ligaaguila.databinding.TemplatePosicionesBinding;
import com.example.rubenvel.ligaaguila.models.Equipo;

import java.util.List;

/**
 * Created by rubev on 13/06/2017.
 */

public class EquipoAdapter extends RecyclerView.Adapter<EquipoAdapter.EquipoHolder> {

    LayoutInflater inflater;
    List<Equipo> data;
    View.OnClickListener onClickListener;

    public EquipoAdapter(LayoutInflater inflater, List<Equipo> data, View.OnClickListener onClickListener){
        this.inflater = inflater;
        this.data = data;
        this.onClickListener = onClickListener;
    }


    //Se crea el viewHolder
    @Override
    public EquipoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.template_posiciones, parent, false);

        return new EquipoHolder(v);
    }
    //Se enlaza el viewHolder - Cuando se ponen datos
    @Override
    public void onBindViewHolder(EquipoHolder holder, int position) {
            holder.binding.setEquipo(data.get(position));
    }
    //Retorna el tamaño
    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<Equipo>data){
        this.data = data;
        notifyDataSetChanged();

    }

    static class EquipoHolder extends RecyclerView.ViewHolder{
        //Este ViewHolder es la clase que da acceso a los views del template
        TemplatePosicionesBinding binding;

        public EquipoHolder(View itemView) {
            super(itemView);

            binding = DataBindingUtil.bind(itemView);
        }
    }

}
