package com.calonapps.oficiossalesianos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SelectionActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        String colorMen= "#B2EBF2";
        String colorWomen= "#F8BBD0";


        //Get Intent and inherit message String

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        // Create objects in selection screen
        View selectionActivityLayout = findViewById(R.id.selection_activity_layout);
        TextView dateTextView = findViewById(R.id.date_text_view);
        TextView saintTextView = findViewById(R.id.saint_text_view);
        TextView typeTextView = findViewById(R.id.type_text_view);
        ListView selectionListView = findViewById(R.id.selection_list_view);

        //LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
        String[] options = {getString(R.string.biografia),
                getString(R.string.oficio_de_lectura),
                getString(R.string.laudes),
                getString(R.string.tercia),
                getString(R.string.sexta),
                getString(R.string.nona),
                getString(R.string.visperas),
                getString(R.string.completas)};

        //LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
        String[] options2 = {

                getString(R.string.reseña),
                getString(R.string.primeras_visperas),
                getString(R.string.oficio_de_lectura),
                getString(R.string.laudes),
                getString(R.string.tercia),
                getString(R.string.sexta),
                getString(R.string.nona),
                getString(R.string.segundas_visperas),
                getString(R.string.completas)};

        //LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
        String[] oraciones = {

                getString(R.string.rezo_Espiritu_Santo),
                getString(R.string.rezo_consagrar_dia),
                getString(R.string.rezo_diario),
                getString(R.string.rezo_mañana),
                getString(R.string.rezo_don_bosco),
                getString(R.string.rezo_jovenes),
                getString(R.string.rezo_virgen),
                getString(R.string.rezo_sosiego),
                getString(R.string.rezo_familia),
                getString(R.string.rezo_alimentos)};

        assert message != null;
        if (message.equals("1")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            dateTextView.setText(R.string.enero_15);
            saintTextView.setText(R.string.luis_variara);
            typeTextView.setText(R.string.memoria);
            final String date = "enero_15"+"_";


            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });

        }

        if (message.equals("2")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorWomen));
            saintTextView.setText(R.string.laura_vicuña);
            typeTextView.setText(R.string.memoria);
            dateTextView.setText(R.string.enero_22);
            final String date = "enero_22"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });

        }

        if (message.equals("3")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.francisco_de_sales);
            typeTextView.setText(R.string.fiesta);
            dateTextView.setText(R.string.enero_24);
            final String date = "enero_24"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("4")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.bronislao_markievicz);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.enero_30);
            final String date = "enero_30"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("5")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.juan_bosco);
            typeTextView.setText(R.string.solemnidad);
            dateTextView.setText(R.string.enero_31);
            final String date = "enero_31"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options2);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("6")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.salesianos_difuntos);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.febrero_1);
            final String date = "febrero_1"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("7")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.pio_ix);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.febrero_7);
            final String date = "febrero_7"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("8")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorWomen));
            saintTextView.setText(R.string.eusebia_palomino);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.febrero_9);
            final String date = "febrero_9"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("9")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.versiglia_caravario);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.febrero_25);
            final String date = "febrero_25"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("10")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.domingo_savio);
            typeTextView.setText(R.string.fiesta);
            dateTextView.setText(R.string.mayo_6);
            final String date = "mayo_6"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options2);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("11")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorWomen));
            saintTextView.setText(R.string.maria_mazarello);
            typeTextView.setText(R.string.fiesta);
            dateTextView.setText(R.string.mayo_13);
            final String date = "mayo_13"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options2);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("12")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorWomen));
            saintTextView.setText(R.string.virgen_fatima);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.mayo_15);
            final String date = "mayo_15"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("13")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.luis_orione);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.mayo_16);
            final String date = "mayo_16"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("14")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.leonardo_murialdo);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.mayo_18);
            final String date = "mayo_18"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("15")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorWomen));
            saintTextView.setText(R.string.maria_auxiliadora);
            typeTextView.setText(R.string.solemnidad);
            dateTextView.setText(R.string.mayo_24);
            final String date = "mayo_24"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options2);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("16")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.jose_kowalski);
            typeTextView.setText(R.string.memoria);
            dateTextView.setText(R.string.mayo_29);
            final String date = "mayo_29"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("17")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.francisco_kęsy);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.junio_12);
            final String date = "junio_12"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("18")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.jose_cafasso);
            typeTextView.setText(R.string.memoria);
            dateTextView.setText(R.string.junio_23);
            final String date = "junio_23"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("19")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorWomen));
            saintTextView.setText(R.string.maria_romero);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.julio_7);
            final String date = "julio_7"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("20")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.augusto_czartorysky);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.agosto_2);
            final String date = "agosto_2"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("21")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorWomen));
            saintTextView.setText(R.string.maria_troncatti);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.agosto_25);
            final String date = "agosto_25"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("22")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.ceferino_namuncura);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.agosto_26);
            final String date = "agosto_26"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("23")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.calasanz_aparicio);
            typeTextView.setText(R.string.memoria);
            dateTextView.setText(R.string.septiembre_22);
            final String date = "septiembre_22"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("24")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.alberto_marvelli);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.octubre_5);
            final String date = "octubre_5"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("25")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorWomen));
            saintTextView.setText(R.string.alexandrina_da_costa);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.octubre_13);
            final String date = "octubre_13"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("26")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.luis_guanella);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.octubre_24);
            final String date = "octubre_24"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("27")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorWomen));
            saintTextView.setText(R.string.aniversario_iglesia);
            typeTextView.setText(R.string.solemnidad);
            dateTextView.setText(R.string.octubre_25);
            final String date = "octubre_25"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options2);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("28")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.miguel_rua);
            typeTextView.setText(R.string.memoria);
            dateTextView.setText(R.string.octubre_29);
            final String date = "octubre_29"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("29")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.artemides_zatti);
            typeTextView.setText(R.string.memoria);
            dateTextView.setText(R.string.noviembre_13);
            final String date = "noviembre_13"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("30")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorWomen));
            saintTextView.setText(R.string.magdalena_morano);
            typeTextView.setText(R.string.memoria_libre);
            dateTextView.setText(R.string.noviembre_15);
            final String date = "noviembre_15"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }

        if (message.equals("31")) {

            selectionActivityLayout.setBackgroundColor(Color.parseColor(colorMen));
            saintTextView.setText(R.string.felipe_rinaldi);
            typeTextView.setText(R.string.memoria);
            dateTextView.setText(R.string.diciembre_5);
            final String date = "diciembre_5"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    options);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", date+i);
                    startActivity(contentIntent);

                }
            });
        }


        // Lower buttons Main Screen inherit

        if (message.equals("pray")) {


            selectionActivityLayout.setBackgroundColor(Color.parseColor("#FFFAE0"));
            dateTextView.setText("");
            saintTextView.setText(R.string.oraciones);
            typeTextView.setText(R.string.oracion_agustin);
            final String select = "pray"+"_";

            //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
            ArrayAdapter<String> adapter;

            //Insert the options array into the adapter
            adapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1,
                    oraciones);
            //Set the adapter content in the ListView object
            selectionListView.setAdapter(adapter);

            // ListView . setOnClickListener and pass keyword to next activity
            selectionListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent contentIntent = new Intent(SelectionActivity.this, ContentView.class);
                    contentIntent.putExtra("message", select+i);
                    startActivity(contentIntent);

                }
            });
        }
    }


}
