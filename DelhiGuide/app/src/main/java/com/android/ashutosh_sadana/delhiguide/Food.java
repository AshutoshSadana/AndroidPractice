package com.android.ashutosh_sadana.delhiguide;

import android.content.Context;

import java.util.List;

public class Food {

    public static void initFoodsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.food_parantha_name),
                context.getString(R.string.food_parantha_description),
                context.getString(R.string.food_parantha_address),
                context.getString(R.string.food_parantha_phone),
                context.getString(R.string.food_parantha_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.parantha_gali
        ));

        list.add(new Location(
                context.getString(R.string.food_roshan_name),
                context.getString(R.string.food_roshan_description),
                context.getString(R.string.food_roshan_address),
                context.getString(R.string.food_roshan_phone),
                context.getString(R.string.food_roshan_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.roshan_di_kulfi
        ));

        list.add(new Location(
                context.getString(R.string.food_haldiram_name),
                context.getString(R.string.food_haldiram_description),
                context.getString(R.string.food_haldiram_address),
                context.getString(R.string.food_haldiram_phone),
                context.getString(R.string.food_haldiram_schedule),
                context.getString(R.string.food_price_three),
                R.drawable.haldiram
        ));

        list.add(new Location(
                context.getString(R.string.food_kulcha_name),
                context.getString(R.string.food_kulcha_description),
                context.getString(R.string.food_kulcha_address),
                context.getString(R.string.food_kulcha_phone),
                context.getString(R.string.food_kulcha_schedule),
                context.getString(R.string.food_price_three),
                R.drawable.kulcha_king
        ));

        list.add(new Location(
                context.getString(R.string.food_bukhara_name),
                context.getString(R.string.food_bukhara_description),
                context.getString(R.string.food_bukhara_address),
                context.getString(R.string.food_bukhara_phone),
                context.getString(R.string.food_bukhara_schedule),
                context.getString(R.string.food_price_four),
                R.drawable.bukhara_grill
        ));

        list.add(new Location(
                context.getString(R.string.food_bishan_name),
                context.getString(R.string.food_bishan_description),
                context.getString(R.string.food_bishan_address),
                context.getString(R.string.food_bishan_phone),
                context.getString(R.string.food_bishan_schedule),
                context.getString(R.string.food_price_one),
                R.drawable.bishan
        ));

    }
}
