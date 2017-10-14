

/**
 * IMPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 *
 */

package com.example.android.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * This method is called when the order button is clicked.
     */

    int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        if (quantity == 100) {

            Toast toast = Toast.makeText(this,"You can`t order more than 100!", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        if (quantity == 0){

            Toast toast = Toast.makeText(this, "You can`t order less than 1!", Toast.LENGTH_SHORT);
            toast.show();
            return;

        }
        quantity = quantity - 1;
        display(quantity);
    }
    public void submitOrder(View view) {
        CheckBox whippedCreamCheckBox =  (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();
        Log.v("MainActivity","Has whipped cream " + hasWhippedCream);

        CheckBox chocolateCheckBox =  (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate =chocolateCheckBox.isChecked();
        Log.v("MainActivity","Has chocolate " + hasChocolate);

        EditText edit = (EditText)findViewById(R.id.name_field);
        String name = edit.getText().toString();
        Log.v("MainActivity","Name " + name);


        int price = calculatePrice(hasWhippedCream,hasChocolate);
        //displayMessage(createOrderSummary(price,hasWhippedCream,hasChocolate,name));
            String priceMessage = createOrderSummary(price,hasWhippedCream,hasChocolate,name);

            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:")); // only email apps should handle this
            intent.putExtra(Intent.EXTRA_SUBJECT, "Just Java order for: "+name);
            intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


    private int calculatePrice(boolean addWhippedCream,boolean addChocolate) {

        if (addWhippedCream && addChocolate)
        {
            return quantity * (1 + 2 + 5);
        }
        else if (addWhippedCream && !addChocolate)
        {
            return quantity * (1 + 5);
        }
        else if (!addWhippedCream && addChocolate)
        {
            return quantity * (2 + 5);
        }
        else
        {
            return quantity *5;
        }
    }

    /**
     * @param priceOfOrder
     * @param addWhippedCream
     * @param addChocolate
     * @param name
     * @return
     */
    private String createOrderSummary(int priceOfOrder,boolean addWhippedCream,boolean addChocolate,String name){
        String priceMessage =getString(R.string.order_summary_name,name);
        priceMessage+="\n"+getString(R.string.order_summary_add_whip)+addWhippedCream;
        priceMessage+="\n"+getString(R.string.order_summary_add_choco)+addChocolate;
        priceMessage+="\n"+getString(R.string.order_summary_quantity)+quantity;
        priceMessage+="\n"+getString(R.string.order_summary_total) + priceOfOrder;
        priceMessage+="\n"+getString(R.string.order_summary_thank_you);
        return priceMessage;

    }
}
