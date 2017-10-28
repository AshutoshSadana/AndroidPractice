package com.android.ashutosh_sadana.delhiguide;

import android.content.Context;

import java.util.List;

public class Sights {


    public static void initSightsList(List<Location> list, Context context) {


        list.add(new Location(
                context.getString(R.string.sight_red_fort_name),
                context.getString(R.string.sight_red_fort_description),
                context.getString(R.string.sight_red_fort_address),
                context.getString(R.string.sight_red_fort_phone),
                context.getString(R.string.sight_red_fort_schedule),
                context.getString(R.string.sight_red_fort_price),
                R.drawable.red_fort
        ));

        list.add(new Location(
                context.getString(R.string.sight_india_gate_name),
                context.getString(R.string.sight_india_gate_description),
                context.getString(R.string.sight_india_gate_address),
                context.getString(R.string.sight_india_gate_phone),
                context.getString(R.string.sight_india_gate_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.india_gate
        ));

        list.add(new Location(
                context.getString(R.string.sight_lotus_name),
                context.getString(R.string.sight_lotus_description),
                context.getString(R.string.sight_lotus_address),
                context.getString(R.string.sight_lotus_phone),
                context.getString(R.string.sight_lotus_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.lotus_temple
        ));

        list.add(new Location(
                context.getString(R.string.sight_jantar_name),
                context.getString(R.string.sight_jantar_description),
                context.getString(R.string.sight_jantar_address),
                context.getString(R.string.sight_jantar_phone),
                context.getString(R.string.sight_jantar_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.jantar_mantar
        ));

        list.add(new Location(
                context.getString(R.string.sight_qutub_name),
                context.getString(R.string.sight_qutub_description),
                context.getString(R.string.sight_qutub_address),
                context.getString(R.string.sight_qutub_phone),
                context.getString(R.string.sight_qutub_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.qutub_minar
        ));

        list.add(new Location(
                context.getString(R.string.sight_rashtrapati_name),
                context.getString(R.string.sight_rashtrapati_description),
                context.getString(R.string.sight_rashtrapati_address),
                context.getString(R.string.sight_rashtrapati_phone),
                context.getString(R.string.sight_rashtrapati_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.rashtrapati_bhawan
        ));

        list.add(new Location(
                context.getString(R.string.sight_gurudwara_name),
                context.getString(R.string.sight_gurudwara_description),
                context.getString(R.string.sight_gurudwara_address),
                context.getString(R.string.sight_gurudwara_phone),
                context.getString(R.string.sight_gurudwara_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.gurudwara_bangla_sahib
        ));
    }
}
