package org.richit.recyclerview.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.richit.recyclerview.R;

public class DetailsActivity extends AppCompatActivity {

    String dataFromIntent = "";
    TextView textViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        dataFromIntent = getIntent().getStringExtra("Munir");

        textViewData = findViewById(R.id.dummyText);
        textViewData.setText(dataFromIntent);
    }
}
