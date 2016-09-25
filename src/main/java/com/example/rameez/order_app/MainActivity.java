package com.example.rameez.order_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int order_count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void decreament(View view){
        TextView tv2 = (TextView) findViewById(R.id.order_counter);
        if(this.order_count != 0) {
            tv2.setText(""+(--this.order_count));
        }else{
            tv2.setText("0");
        }
    }
    public void increament(View view){
        TextView tv2 = (TextView) findViewById(R.id.order_counter);
        tv2.setText(""+(++this.order_count));

    }
    public void get_order(View view){
        TextView tv1 = (TextView) findViewById(R.id.show_price);
        int total_price = (this.order_count*50);
        if(this.order_count !=0) {
            tv1.setText("Your total price is = " + total_price);
        }else {
            Toast.makeText(this,"You have not placed any order.",Toast.LENGTH_SHORT).show();
        }
    }

}
