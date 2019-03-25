package com.example.pizzapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Button order_btn = findViewById(R.id.order_btn);
        order_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initTable();

    }


    public void initTable() {
        TableLayout ll = findViewById(R.id.displayLinear);

        for (int i = 0; i < 2; i++) {
            TableRow row = new TableRow(this);
            TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
            row.setLayoutParams(lp);

            //CheckBox checkBox = new CheckBox(this);
            //addBtn = new ImageButton(this);
            //addBtn.setImageResource(R.drawable.add);
            //minusBtn = new ImageButton(this);
            //minusBtn.setImageResource(R.drawable.minus);
            //checkBox.setText("hello");

            TextView name = new TextView(this);
            TextView price = new TextView(this);
            name.setText("HAWAII");
            price.setText("1399 Ft");

            //row.addView(checkBox);
            // row.addView(minusBtn);
            row.addView(name);
            row.addView(price);
            ll.addView(row, i);
        }
    }
}
