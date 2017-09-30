package com.example.arqdsis.provaint81521928;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;

import java.util.Hashtable;
/**
 * Vinicius Lopes de Oliveira
 * Ra:81521928.
 */

public class TimesAdapter extends BaseAdapter implements SectionIndexer{
    private Times[] times;
    private Activity activity;
    Object[] sectionHeaders;
    Hashtable<Integer, Integer> positionForSectionMap;
    Hashtable<Integer, Integer> sectionForPositionMap;
    /**
     * Vinicius Lopes de Oliveira
     * Ra:81521928.
     */
    public TimesAdapter(Times[] times, Activity activity) {
        this.times = times;
        this.activity = activity;
        sectionHeaders = SectionIndexBuilder.buildSectionHeaders(times);
        positionForSectionMap = SectionIndexBuilder.buildPositionForSectionMap(times);
        sectionForPositionMap = SectionIndexBuilder.buildSectionForPositionMap(times);
    }
    /**
     * Vinicius Lopes de Oliveira
     * Ra:81521928.
     */
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    /**
     * Vinicius Lopes de Oliveira
     * Ra:81521928.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.linha_times, parent, false);
            ImageView bandeira = (ImageView) view.findViewById(R.id.foto_times);
            TextView nome = (TextView) view.findViewById(R.id.texto_nome_times);
            TextView detalhe = (TextView) view.findViewById(R.id.texto_detalhe_times);
            ViewHolder viewHolder = new ViewHolder(bandeira, nome, detalhe);
            view.setTag(viewHolder);
        }

        ViewHolder viewHolder = (ViewHolder)view.getTag();
        viewHolder.getNome().setText(paises[position].getNome());
        viewHolder.getDetalhe().setText(String.format("nome: %s - pontos: %s",
                times[position].getNome(),
                times[position].getPontos()));
        Drawable drawable = Util.getDrawable(activity, times[position].getCodigo3().toLowerCase());
        if(drawable == null){
            drawable = activity.getDrawable(simbolo);
        }
        System.out.println(times[position].getNome());
        viewHolder.getSimbolo().setImageDrawable(drawable);

        return view;
    }


    @Override
    public Object[] getSections() {
        return new Object[0];
    }

    @Override
    public int getPositionForSection(int i) {
        return 0;
    }

    @Override
    public int getSectionForPosition(int i) {
        return 0;
    }
}
