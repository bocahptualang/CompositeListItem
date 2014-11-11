package com.bsoft.compositelistitem;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = (TextView) findViewById(R.id.txtContact);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/segoeuil.ttf");
        t.setTypeface(typeface);

        ListView listView = (ListView) findViewById(R.id.listView);
        ContactAdapter adapter = new ContactAdapter(this);
        List<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact("Althea Mckie","Hello, my name is Althea Mckie", "1.jpg"));
        contacts.add(new Contact("Alejandra Labella","Hello, my name is Alejandra Labella", "2.jpg"));
        contacts.add(new Contact("Etha Leblanc","Hello, my name is Etha Leblanc", "3.jpg"));
        contacts.add(new Contact("Rosalyn Crites","Hello, my name is Rosalyn Crites", "4.jpg"));
        contacts.add(new Contact("Angelique Duggan","Hello, my name is Angelique Duggan", "5.jpg"));
        contacts.add(new Contact("Azucena Fredrickson","Hello, my name is Azucena Fredrickson", "6.jpg"));
        contacts.add(new Contact("Riva Etienne","Hello, my name is Riva Etienne", "7.jpg"));
        contacts.add(new Contact("Harriett Gunter","Hello, my name is Harriett Gunter", "8.jpg"));
        contacts.add(new Contact("Rebbecca Reiber","Hello, my name is Rebbecca Reiber", "9.jpg"));
        contacts.add(new Contact("Melanie Alatorre","Hello, my name is Melanie Alatorre", "10.jpg"));
        contacts.add(new Contact("Theressa Nagata","Hello, my name is Theressa Nagata", "11.jpg"));
        contacts.add(new Contact("Rena Waldron","Hello, my name is Rena Waldron", "12.jpg"));
        contacts.add(new Contact("Genevieve Corona","Hello, my name is Genevieve Corona", "13.jpg"));
        contacts.add(new Contact("Monnie Loh","Hello, my name is Monnie Loh", "14.jpg"));
        adapter.setData(contacts);

        listView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
