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
    String textClick;

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



        Intent i=getIntent();
        String title= i.getStringExtra("value");
        String description= i.getStringExtra("value1");
        String url= i.getStringExtra("value2");


        textDetails1.setText(title +getString(R.string.place1)+"\n"+description+getString(R.string.description1)+"\n"+url+getString(R.string.url1));
        textDetails2.setText(title +getString(R.string.place2)+"\n"+description+getString(R.string.description2)+"\n"+url+getString(R.string.url2));
        textDetails3.setText(title +getString(R.string.place3)+"\n"+description+getString(R.string.description3)+"\n"+url+getString(R.string.url3));
        textDetails4.setText(title +getString(R.string.place4)+"\n"+description+getString(R.string.description4)+"\n"+url+getString(R.string.url4));
        textDetails5.setText(title +getString(R.string.place5)+"\n"+description+getString(R.string.description5)+"\n"+url+getString(R.string.url5));
        textDetails6.setText(title +getString(R.string.place6)+"\n"+description+getString(R.string.description6)+"\n"+url+getString(R.string.url6));

  /*      Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url1)));
        Intent intentWeb2 = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url2)));
        Intent intentWeb3 = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url3)));
        Intent intentWeb4 = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url4)));
        Intent intentWeb5 = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url5)));
        Intent intentWeb6 = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url6)));

        startActivity(intentWeb);
        startActivity(intentWeb2);
        startActivity(intentWeb3);
        startActivity(intentWeb4);
        startActivity(intentWeb5);
        startActivity(intentWeb6);


   */

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


 /*   @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.main_menu,menu);
        if (v == textDetails1) {
            textClick="description1";
        }
        else if(v==textDetails2){
            textClick="description2";

        }
        else if(v==textDetails3){
            textClick="description3";
        }
        else if(v==textDetails4){
            textClick="description4";
        }
        else if(v==textDetails5){
            textClick="description5";
        }
        else if(v==textDetails6){
            textClick="description6";
        }
    }


  */


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();

        if(id==R.id.EnglishSelection){
            Intent i=getIntent();
            String title= i.getStringExtra("value");
            String description= i.getStringExtra("value1");
            String url= i.getStringExtra("value2");

            textDetails1.setText(title +getString(R.string.place1)+"\n"+description+getString(R.string.description1)+"\n"+url+getString(R.string.url1));
            textDetails2.setText(title +getString(R.string.place2)+"\n"+description+getString(R.string.description2)+"\n"+url+getString(R.string.url2));
            textDetails3.setText(title +getString(R.string.place3)+"\n"+description+getString(R.string.description3)+"\n"+url+getString(R.string.url3));
            textDetails4.setText(title +getString(R.string.place4)+"\n"+description+getString(R.string.description4)+"\n"+url+getString(R.string.url4));
            textDetails5.setText(title +getString(R.string.place5)+"\n"+description+getString(R.string.description5)+"\n"+url+getString(R.string.url5));
            textDetails6.setText(title +getString(R.string.place6)+"\n"+description+getString(R.string.description6)+"\n"+url+getString(R.string.url6));





        }
        else if(id== R.id.ChineseSelection){
            Intent i=getIntent();
            String title= i.getStringExtra("value3");
            String description= i.getStringExtra("value4");
            String url= i.getStringExtra("value5");
            textDetails1.setText(title +getString(R.string.place1)+"\n"+description+getString(R.string.desChinese1)+"\n"+url+getString(R.string.url1));
            textDetails2.setText(title +getString(R.string.place2)+"\n"+description+getString(R.string.desChinese2)+"\n"+url+getString(R.string.url2));
            textDetails3.setText(title +getString(R.string.place3)+"\n"+description+getString(R.string.desChinese3)+"\n"+url+getString(R.string.url3));
            textDetails4.setText(title +getString(R.string.place4)+"\n"+description+getString(R.string.desChinese4)+"\n"+url+getString(R.string.url4));
            textDetails5.setText(title +getString(R.string.place5)+"\n"+description+getString(R.string.desChinese5)+"\n"+url+getString(R.string.url5));
            textDetails6.setText(title +getString(R.string.place6)+"\n"+description+getString(R.string.desChinese6)+"\n"+url+getString(R.string.url6));




        }

        return super.onOptionsItemSelected(item);
    }



}