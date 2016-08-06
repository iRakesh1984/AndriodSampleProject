package com.example.anilkothari.secondapril;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class MainActivity2 extends ActionBarActivity {

    private List<Car> myCars = new ArrayList<Car>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        showPassedValue();

        createCarList();

    }

    public void showPassedValue(){

        TextView passedValues = (TextView) findViewById(R.id.title);

        String name = getIntent().getStringExtra("person-name");
        String email = getIntent().getStringExtra("person-email");
        String password = getIntent().getStringExtra("person-pwd");
        String phone = getIntent().getStringExtra("person-ph");

        passedValues.setText("Name :" + name +"\nEmail :" + email +"\nPhone :" + phone + "\nPassword :" + password);
    }

    public void createCarList(){

        myCars.add(new Car("Ford",2000,0,"poor"));
        myCars.add(new Car("Porche",2010,1,"Good"));
        myCars.add(new Car("Honda city",2015,2,"Excellent"));
        myCars.add(new Car("Honda Accord",2013,3,"Fast"));
        myCars.add(new Car("Mercedes",2011,4,"Value for money"));
        myCars.add(new Car("Maruti suzuki",2000,5,"Okay"));

    }

    private void populateListView() {
        ArrayAdapter<Car> adapter = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.carlistView);
        list.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }




    private class MyListAdapter extends ArrayAdapter<Car> {
        public MyListAdapter() {
            super(MainActivity2.this, R.layout.item, myCars);
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Make sure we have a view to work with (may have been given null)
            View itemView = convertView;
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.item, parent, false);
            }

            // Find the car to work with.
            Car currentCar = myCars.get(position);

            // Fill the view

            // Make:
            TextView makeText = (TextView) itemView.findViewById(R.id.item_txt_make);
            makeText.setText(currentCar.getMake());

            // Year:
            TextView yearText = (TextView) itemView.findViewById(R.id.item_txt_year);
            yearText.setText("" + currentCar.getYear());

            // Condition:
            TextView conditionText = (TextView) itemView.findViewById(R.id.item_txt_condition);
            conditionText.setText(currentCar.getCondition());

            return itemView;
        }

    }
}
