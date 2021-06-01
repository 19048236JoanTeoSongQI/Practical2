package sg.edu.rp.c346.id19048236.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView textswim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textswim=findViewById(R.id.textViewSwim);
        textswim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,LocationDetails.class);
                i.putExtra("value","Location: ");
                i.putExtra("value1","Description: ");
                i.putExtra("value2","URL: ");
                i.putExtra("value3","地点： ");
                i.putExtra("value4","简介： ");
                i.putExtra("value5","链接： ");
                //i.putExtra(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url1);
                startActivity(i);

            }
        });


    }
}