package com.example.bblog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

  Button submitbtn;
  RatingBar rt;
  EditText txtrev;
  EditText txtcontract;
  EditText txtUser;
  float rating;
    String userName;
    String review;
    String info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rt=(RatingBar) findViewById(R.id.rating);
        submitbtn=(Button)findViewById(R.id.buttonsubmit);
        txtUser=(EditText)findViewById(R.id.txtUserName);
        txtrev=(EditText)findViewById(R.id.txtreview);
        txtcontract=(EditText)findViewById(R.id.txtcontractinfo);
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              rating=rt.getRating();//get rating
                userName = txtUser.getText().toString();
                review = txtrev.getText().toString();
                info = txtcontract.getText().toString();




            }
        });

    }
}
