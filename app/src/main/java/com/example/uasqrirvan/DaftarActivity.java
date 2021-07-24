package activity.project.uasirvanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import activity.project.uasirvanapp.R;

public class DaftarActivity extends AppCompatActivity {

    Button back, daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        back = findViewById(R.id.btnbback);
        daftar = findViewById(R.id.btndaftar);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftarActivity.this, activity.project.uasirvanapp.getStarted.class);
                startActivity(intent);
            }
        });
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftarActivity.this, activity.project.uasirvanapp.MainActivity.class);
                startActivity(intent);
            }
        });
    }
}