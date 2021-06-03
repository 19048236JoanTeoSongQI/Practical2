package sg.edu.rp.c346.id19048236.practical2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class LocationDetails extends AppCompatActivity {
    TextView textDetails1,textDetails2,textDetails3,textDetails4,textDetails5,textDetails6;
    TextView textUrl1,textUrl2,textUrl3,textUrl4,textUrl5,textUrl6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_details);

        textDetails1=findViewById(R.id.textViewDetails1);
        registerForContextMenu(textDetails1);
        textDetails2=findViewById(R.id.textViewDetails2);
        registerForContextMenu(textDetails2);
        textDetails3=findViewById(R.id.textViewDetails3);
        registerForContextMenu(textDetails3);
        textDetails4=findViewById(R.id.textViewDetails4);
        registerForContextMenu(textDetails4);
        textDetails5=findViewById(R.id.textViewDetails5);
        registerForContextMenu(textDetails5);
        textDetails6=findViewById(R.id.textViewDetails6);
        registerForContextMenu(textDetails6);

        textUrl1=findViewById(R.id.textViewUrl1);
        textUrl2=findViewById(R.id.textViewUrl2);
        textUrl3=findViewById(R.id.textViewUrl3);
        textUrl4=findViewById(R.id.textViewUrl4);
        textUrl5=findViewById(R.id.textViewUrl5);
        textUrl6=findViewById(R.id.textViewUrl6);



        Intent i=getIntent();
        String title= i.getStringExtra("value");
        String description= i.getStringExtra("value1");
        String url= i.getStringExtra("value2");


        textDetails1.setText(title +getString(R.string.place1)+"\n"+description+"\n"+getString(R.string.description1));
        textDetails2.setText(title +getString(R.string.place2)+"\n"+description+"\n"+getString(R.string.description2));
        textDetails3.setText(title +getString(R.string.place3)+"\n"+description+"\n"+getString(R.string.description3));
        textDetails4.setText(title +getString(R.string.place4)+"\n"+description+"\n"+getString(R.string.description4));
        textDetails5.setText(title +getString(R.string.place5)+"\n"+description+"\n"+getString(R.string.description5));
        textDetails6.setText(title +getString(R.string.place6)+"\n"+description+"\n"+getString(R.string.description6));

        textUrl1.setText(url+getString(R.string.url1));
        textUrl2.setText(url+getString(R.string.url2));
        textUrl3.setText(url+getString(R.string.url3));
        textUrl4.setText(url+getString(R.string.url4));
        textUrl5.setText(url+getString(R.string.url5));
        textUrl6.setText(url+getString(R.string.url6));

        textUrl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url1)));
                startActivity(intentWeb);
            }
        });

        textUrl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url2)));
                startActivity(intentWeb);
            }
        });
        textUrl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url3)));
                startActivity(intentWeb);
            }
        });
        textUrl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url4)));
                startActivity(intentWeb);
            }
        });
        textUrl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url5)));
                startActivity(intentWeb);
            }
        });
        textUrl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url6)));
                startActivity(intentWeb);
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.main_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        int id = item.getItemId();
        Intent i=getIntent();
        String title= i.getStringExtra("value");
        String description= i.getStringExtra("value1");
        String title2= i.getStringExtra("value3");
        String description2=i.getStringExtra("value4");

        if(description.equalsIgnoreCase("Description: ")){
            if(id == R.id.EnglishSelection){
                textDetails1.setText(title+getString(R.string.place1)+"\n"+description+"\n"+getString(R.string.description1));
                textDetails2.setText(title+getString(R.string.place2)+"\n"+description+"\n"+getString(R.string.description2));
                textDetails3.setText(title+getString(R.string.place3)+"\n"+description+"\n"+getString(R.string.description3));
                textDetails4.setText(title+getString(R.string.place4)+"\n"+description+"\n"+getString(R.string.description4));
                textDetails5.setText(title+getString(R.string.place5)+"\n"+description+"\n"+getString(R.string.description5));
                textDetails6.setText(title+getString(R.string.place6)+"\n"+description+"\n"+getString(R.string.description6));
                return true;
            }
            else if(id == R.id.ChineseSelection){

                textDetails1.setText(title2+getString(R.string.place1)+"\n"+description2+"\n"+getString(R.string.desChinese1));
                textDetails2.setText(title2+getString(R.string.place2)+"\n"+description2+"\n"+getString(R.string.desChinese2));
                textDetails3.setText(title2+getString(R.string.place3)+"\n"+description2+"\n"+getString(R.string.desChinese3));
                textDetails4.setText(title2+getString(R.string.place4)+"\n"+description2+"\n"+getString(R.string.desChinese4));
                textDetails5.setText(title2+getString(R.string.place5)+"\n"+description2+"\n"+getString(R.string.desChinese5));
                textDetails6.setText(title2+getString(R.string.place6)+"\n"+description2+"\n"+getString(R.string.desChinese6));
                return true;
            }
        }
        return super.onContextItemSelected(item);
    }

}