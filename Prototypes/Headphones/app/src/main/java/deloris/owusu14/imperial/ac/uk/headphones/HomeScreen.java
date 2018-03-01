package deloris.owusu14.imperial.ac.uk.headphones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button DisplayVolume = (Button) findViewById(R.id.DisplayVolume);
        DisplayVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startintent = new Intent(getApplicationContext(), VolumeDisplay.class);
                startActivity(startintent);
            }
        });
    }
}
