package activity.project.uasirvanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import activity.project.uasirvanapp.R;

public class DataActivity extends AppCompatActivity {

    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        back = findViewById(R.id.btnbdata);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    Intent intent = new Intent(activity.project.uasirvanapp.DataActivity.this, activity.project.uasirvanapp.MainActivity.class);
                    startActivity(intent);
            }
        });
    }
}
