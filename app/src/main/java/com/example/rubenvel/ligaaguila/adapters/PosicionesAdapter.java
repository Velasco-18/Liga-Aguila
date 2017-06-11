package com.example.rubenvel.ligaaguila.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.rubenvel.ligaaguila.R;
import com.example.rubenvel.ligaaguila.databinding.TemplatePosicionesBinding;
import com.example.rubenvel.ligaaguila.models.Posiciones;
import com.example.rubenvel.ligaaguila.util.PosicionesData;

import java.util.List;

/**
 * Created by rubev on 31/05/2017.
 */

public class PosicionesAdapter extends RecyclerView.Adapter<PosicionesAdapter.PosicionesHolder> {

    LayoutInflater inflater;
    List<Posiciones> dataPosiciones;
    View.OnClickListener onClickListener;

    public PosicionesAdapter(LayoutInflater inflater, List<Posiciones> dataPosiciones, View.OnClickListener onClickListener){
        this.inflater = inflater;
        this.dataPosiciones = dataPosiciones;
        this.onClickListener = onClickListener;
    }


    //Se crea el viewHolder
    @Override
    public PosicionesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.template_posiciones, parent, false);
        PosicionesHolder holder = new PosicionesHolder(v);
        return holder;
    }
    //Se enlaza el viewHolder - Cuando se ponen datos
    @Override
    public void onBindViewHolder(PosicionesHolder holder, int position) {

        holder.binding.setPosicion(PosicionesData.getDataPosiciones().get(position));
        holder.binding.setHandlerPos(this);
    }
    //Retorna el tamaño
    @Override
    public int getItemCount() {
        return dataPosiciones.size();
    }

    public static class PosicionesHolder extends RecyclerView.ViewHolder{
        //Este ViewHolder es la clase que da acceso a los views del template
        TemplatePosicionesBinding binding;

        public PosicionesHolder(View itemView) {
            super(itemView);

            binding = DataBindingUtil.bind(itemView);
        }
    }

}
