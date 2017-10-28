

package com.android.ashutosh_sadana.delhiguide;

import android.content.Context;

import java.util.List;


public class Shops {

    public static void initShopsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.shop_dilli_name),
                context.getString(R.string.shop_dilli_description),
                context.getString(R.string.shop_dilli_address),
                context.getString(R.string.shop_dilli_phone),
                context.getString(R.string.shop_dilli_schedule),
                null,
                R.drawable.dilli_haat
        ));

        list.add(new Location(
                context.getString(R.string.shop_khan_name),
                context.getString(R.string.shop_khan_description),
                context.getString(R.string.shop_khan_address),
                context.getString(R.string.shop_khan_phone),
                context.getString(R.string.shop_khan_schedule),
                null,
                R.drawable.khan_market
        ));

        list.add(new Location(
                context.getString(R.string.shop_sarojini_name),
                context.getString(R.string.shop_sarojini_description),
                context.getString(R.string.shop_sarojini_address),
                context.getString(R.string.shop_sarojini_phone),
                context.getString(R.string.shop_sarojini_schedule),
                null,
                R.drawable.sarojini_market
        ));

        list.add(new Location(
                context.getString(R.string.shop_chandani_name),
                context.getString(R.string.shop_chandani_description),
                context.getString(R.string.shop_chandani_address),
                context.getString(R.string.shop_chandani_phone),
                context.getString(R.string.shop_chandani_schedule),
                null,
                R.drawable.chandani_chowk_market
        ));

        list.add(new Location(
                context.getString(R.string.shop_janpath_name),
                context.getString(R.string.shop_janpath_description),
                context.getString(R.string.shop_janpath_address),
                context.getString(R.string.shop_janpath_phone),
                context.getString(R.string.shop_janpath_schedule),
                null,
                R.drawable.janpath_market
        ));

    }
}
