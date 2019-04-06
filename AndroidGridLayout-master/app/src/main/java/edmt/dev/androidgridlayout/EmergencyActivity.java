package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.text.util.*;

public class EmergencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergencyactivity);




        final TextView view = (TextView) findViewById(R.id.emergencynumber);
        view.setText("112");
        view.setClickable(true);
        view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+view.getText()));
                startActivity(intent);
            }

        });

        final TextView view24 = (TextView) findViewById(R.id.saude24);
        view24.setClickable(true);
        view24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+"808242424"));
                startActivity(intent);
            }

        });

        final TextView viewCancro = (TextView) findViewById(R.id.cancro);
        viewCancro.setClickable(true);
        viewCancro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+"213 619 542"));
                startActivity(intent);
            }

        });



    }
}
