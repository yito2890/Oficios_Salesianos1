package com.calonapps.oficiossalesianos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //**
        // All Headers */

        TextView header1TextView = findViewById(R.id.header1_text_view);
        TextView header2TextView = findViewById(R.id.header2_text_view);
        TextView header3TextView = findViewById(R.id.header3_text_view);
        TextView header4TextView = findViewById(R.id.header4_text_view);
        TextView header5TextView = findViewById(R.id.header5_text_view);
        TextView header6TextView = findViewById(R.id.header6_text_view);
        TextView header7TextView = findViewById(R.id.header7_text_view);
        TextView header8TextView = findViewById(R.id.header8_text_view);
        TextView header9TextView = findViewById(R.id.header9_text_view);
        TextView header10TextView = findViewById(R.id.header10_text_view);

        //All Headers. Set Text
        header1TextView.setText(R.string.enero);
        header2TextView.setText(R.string.febrero);
        header3TextView.setText(R.string.mayo);
        header4TextView.setText(R.string.junio);
        header5TextView.setText(R.string.julio);
        header6TextView.setText(R.string.agosto);
        header7TextView.setText(R.string.septiembre);
        header8TextView.setText(R.string.octubre);
        header9TextView.setText(R.string.noviembre);
        header10TextView.setText(R.string.diciembre);


        //**
        // All Images */

        ImageView block1ImageView = findViewById(R.id.block1_img_view);
        ImageView block2ImageView = findViewById(R.id.block2_img_view);
        ImageView block3ImageView = findViewById(R.id.block3_img_view);
        ImageView block4ImageView = findViewById(R.id.block4_img_view);
        ImageView block5ImageView = findViewById(R.id.block5_img_view);
        ImageView block6ImageView = findViewById(R.id.block6_img_view);
        ImageView block7ImageView = findViewById(R.id.block7_img_view);
        ImageView block8ImageView = findViewById(R.id.block8_img_view);
        ImageView block9ImageView = findViewById(R.id.block9_img_view);
        ImageView block10ImageView = findViewById(R.id.block10_img_view);
        ImageView block11ImageView = findViewById(R.id.block11_img_view);
        ImageView block12ImageView = findViewById(R.id.block12_img_view);
        ImageView block13ImageView = findViewById(R.id.block13_img_view);
        ImageView block14ImageView = findViewById(R.id.block14_img_view);
        ImageView block15ImageView = findViewById(R.id.block15_img_view);
        ImageView block16ImageView = findViewById(R.id.block16_img_view);
        ImageView block17ImageView = findViewById(R.id.block17_img_view);
        ImageView block18ImageView = findViewById(R.id.block18_img_view);
        ImageView block19ImageView = findViewById(R.id.block19_img_view);
        ImageView block20ImageView = findViewById(R.id.block20_img_view);
        ImageView block21ImageView = findViewById(R.id.block21_img_view);
        ImageView block22ImageView = findViewById(R.id.block22_img_view);
        ImageView block23ImageView = findViewById(R.id.block23_img_view);
        ImageView block24ImageView = findViewById(R.id.block24_img_view);
        ImageView block25ImageView = findViewById(R.id.block25_img_view);
        ImageView block26ImageView = findViewById(R.id.block26_img_view);
        ImageView block27ImageView = findViewById(R.id.block27_img_view);
        ImageView block28ImageView = findViewById(R.id.block28_img_view);
        ImageView block29ImageView = findViewById(R.id.block29_img_view);
        ImageView block30ImageView = findViewById(R.id.block30_img_view);
        ImageView block31ImageView = findViewById(R.id.block31_img_view);

        // All Images Set rsc

        block1ImageView.setImageResource(R.drawable.variara);
        block2ImageView.setImageResource(R.drawable.vicuna);
        block3ImageView.setImageResource(R.drawable.sales);
        block4ImageView.setImageResource(R.drawable.markievicz);
        block5ImageView.setImageResource(R.drawable.bosco);
        block6ImageView.setImageResource(R.drawable.difuntos);
        block7ImageView.setImageResource(R.drawable.pio);
        block8ImageView.setImageResource(R.drawable.palomino);
        block9ImageView.setImageResource(R.drawable.versiglia);
        block10ImageView.setImageResource(R.drawable.savio);
        block11ImageView.setImageResource(R.drawable.mazzarello);
        block12ImageView.setImageResource(R.drawable.fatima);
        block13ImageView.setImageResource(R.drawable.orione);
        block14ImageView.setImageResource(R.drawable.murialdo);
        block15ImageView.setImageResource(R.drawable.auxiliadora);
        block16ImageView.setImageResource(R.drawable.kowalski);
        block17ImageView.setImageResource(R.drawable.kesy);
        block18ImageView.setImageResource(R.drawable.cafasso);
        block19ImageView.setImageResource(R.drawable.meneses);
        block20ImageView.setImageResource(R.drawable.czartorysky);
        block21ImageView.setImageResource(R.drawable.troncatti);
        block22ImageView.setImageResource(R.drawable.ceferino);
        block23ImageView.setImageResource(R.drawable.calasanzaparicio);
        block24ImageView.setImageResource(R.drawable.marvelli);
        block25ImageView.setImageResource(R.drawable.dacosta);
        block26ImageView.setImageResource(R.drawable.guanella);
        block27ImageView.setImageResource(R.drawable.iglesia);
        block28ImageView.setImageResource(R.drawable.rua);
        block29ImageView.setImageResource(R.drawable.zatti);
        block30ImageView.setImageResource(R.drawable.morano);
        block31ImageView.setImageResource(R.drawable.rinaldi);


        //**
        // All Saints Textviews */

        TextView block1Textview1 = findViewById(R.id.block1_txt_view_1);
        TextView block2Textview1 = findViewById(R.id.block2_txt_view_1);
        TextView block3Textview1 = findViewById(R.id.block3_txt_view_1);
        TextView block4Textview1 = findViewById(R.id.block4_txt_view_1);
        TextView block5Textview1 = findViewById(R.id.block5_txt_view_1);
        TextView block6Textview1 = findViewById(R.id.block6_txt_view_1);
        TextView block7Textview1 = findViewById(R.id.block7_txt_view_1);
        TextView block8Textview1 = findViewById(R.id.block8_txt_view_1);
        TextView block9Textview1 = findViewById(R.id.block9_txt_view_1);
        TextView block10Textview1 = findViewById(R.id.block10_txt_view_1);
        TextView block11Textview1 = findViewById(R.id.block11_txt_view_1);
        TextView block12Textview1 = findViewById(R.id.block12_txt_view_1);
        TextView block13Textview1 = findViewById(R.id.block13_txt_view_1);
        TextView block14Textview1 = findViewById(R.id.block14_txt_view_1);
        TextView block15Textview1 = findViewById(R.id.block15_txt_view_1);
        TextView block16Textview1 = findViewById(R.id.block16_txt_view_1);
        TextView block17Textview1 = findViewById(R.id.block17_txt_view_1);
        TextView block18Textview1 = findViewById(R.id.block18_txt_view_1);
        TextView block19Textview1 = findViewById(R.id.block19_txt_view_1);
        TextView block20Textview1 = findViewById(R.id.block20_txt_view_1);
        TextView block21Textview1 = findViewById(R.id.block21_txt_view_1);
        TextView block22Textview1 = findViewById(R.id.block22_txt_view_1);
        TextView block23Textview1 = findViewById(R.id.block23_txt_view_1);
        TextView block24Textview1 = findViewById(R.id.block24_txt_view_1);
        TextView block25Textview1 = findViewById(R.id.block25_txt_view_1);
        TextView block26Textview1 = findViewById(R.id.block26_txt_view_1);
        TextView block27Textview1 = findViewById(R.id.block27_txt_view_1);
        TextView block28Textview1 = findViewById(R.id.block28_txt_view_1);
        TextView block29Textview1 = findViewById(R.id.block29_txt_view_1);
        TextView block30Textview1 = findViewById(R.id.block30_txt_view_1);
        TextView block31Textview1 = findViewById(R.id.block31_txt_view_1);


        // All Saints . Set Text

        block1Textview1.setText(R.string.luis_variara);
        block2Textview1.setText(R.string.laura_vicuña);
        block3Textview1.setText(R.string.francisco_de_sales);
        block4Textview1.setText(R.string.bronislao_markievicz);
        block5Textview1.setText(R.string.juan_bosco);
        block6Textview1.setText(R.string.salesianos_difuntos);
        block7Textview1.setText(R.string.pio_ix);
        block8Textview1.setText(R.string.eusebia_palomino);
        block9Textview1.setText(R.string.versiglia_caravario);
        block10Textview1.setText(R.string.domingo_savio);
        block11Textview1.setText(R.string.maria_mazarello);
        block12Textview1.setText(R.string.virgen_fatima);
        block13Textview1.setText(R.string.luis_orione);
        block14Textview1.setText(R.string.leonardo_murialdo);
        block15Textview1.setText(R.string.maria_auxiliadora);
        block16Textview1.setText(R.string.jose_kowalski);
        block17Textview1.setText(R.string.francisco_kęsy);
        block18Textview1.setText(R.string.jose_cafasso);
        block19Textview1.setText(R.string.maria_romero);
        block20Textview1.setText(R.string.augusto_czartorysky);
        block21Textview1.setText(R.string.maria_troncatti);
        block22Textview1.setText(R.string.ceferino_namuncura);
        block23Textview1.setText(R.string.calasanz_aparicio);
        block24Textview1.setText(R.string.alberto_marvelli);
        block25Textview1.setText(R.string.alexandrina_da_costa);
        block26Textview1.setText(R.string.luis_guanella);
        block27Textview1.setText(R.string.aniversario_iglesia);
        block28Textview1.setText(R.string.miguel_rua);
        block29Textview1.setText(R.string.artemides_zatti);
        block30Textview1.setText(R.string.magdalena_morano);
        block31Textview1.setText(R.string.felipe_rinaldi);


        //**
        // All Celebration Textviews */

        TextView block1Textview1_1 = findViewById(R.id.block1_txt_view_1_1);
        TextView block2Textview1_1 = findViewById(R.id.block2_txt_view_1_1);
        TextView block3Textview1_1 = findViewById(R.id.block3_txt_view_1_1);
        TextView block4Textview1_1 = findViewById(R.id.block4_txt_view_1_1);
        TextView block5Textview1_1 = findViewById(R.id.block5_txt_view_1_1);
        TextView block6Textview1_1 = findViewById(R.id.block6_txt_view_1_1);
        TextView block7Textview1_1 = findViewById(R.id.block7_txt_view_1_1);
        TextView block8Textview1_1 = findViewById(R.id.block8_txt_view_1_1);
        TextView block9Textview1_1 = findViewById(R.id.block9_txt_view_1_1);
        TextView block10Textview1_1 = findViewById(R.id.block10_txt_view_1_1);
        TextView block11Textview1_1 = findViewById(R.id.block11_txt_view_1_1);
        TextView block12Textview1_1 = findViewById(R.id.block12_txt_view_1_1);
        TextView block13Textview1_1 = findViewById(R.id.block13_txt_view_1_1);
        TextView block14Textview1_1 = findViewById(R.id.block14_txt_view_1_1);
        TextView block15Textview1_1 = findViewById(R.id.block15_txt_view_1_1);
        TextView block16Textview1_1 = findViewById(R.id.block16_txt_view_1_1);
        TextView block17Textview1_1 = findViewById(R.id.block17_txt_view_1_1);
        TextView block18Textview1_1 = findViewById(R.id.block18_txt_view_1_1);
        TextView block19Textview1_1 = findViewById(R.id.block19_txt_view_1_1);
        TextView block20Textview1_1 = findViewById(R.id.block20_txt_view_1_1);
        TextView block21Textview1_1 = findViewById(R.id.block21_txt_view_1_1);
        TextView block22Textview1_1 = findViewById(R.id.block22_txt_view_1_1);
        TextView block23Textview1_1 = findViewById(R.id.block23_txt_view_1_1);
        TextView block24Textview1_1 = findViewById(R.id.block24_txt_view_1_1);
        TextView block25Textview1_1 = findViewById(R.id.block25_txt_view_1_1);
        TextView block26Textview1_1 = findViewById(R.id.block26_txt_view_1_1);
        TextView block27Textview1_1 = findViewById(R.id.block27_txt_view_1_1);
        TextView block28Textview1_1 = findViewById(R.id.block28_txt_view_1_1);
        TextView block29Textview1_1 = findViewById(R.id.block29_txt_view_1_1);
        TextView block30Textview1_1 = findViewById(R.id.block30_txt_view_1_1);
        TextView block31Textview1_1 = findViewById(R.id.block31_txt_view_1_1);

        // All Celebrations .Set Text

        block1Textview1_1.setText(R.string.memoria);
        block2Textview1_1.setText(R.string.memoria_libre);
        block3Textview1_1.setText(R.string.fiesta);
        block4Textview1_1.setText(R.string.memoria_libre);
        block5Textview1_1.setText(R.string.solemnidad);
        block6Textview1_1.setText(R.string.memoria_libre);
        block7Textview1_1.setText(R.string.memoria_libre);
        block8Textview1_1.setText(R.string.memoria_libre);
        block9Textview1_1.setText(R.string.memoria_libre);
        block10Textview1_1.setText(R.string.fiesta);
        block11Textview1_1.setText(R.string.fiesta);
        block12Textview1_1.setText(R.string.memoria_libre);
        block13Textview1_1.setText(R.string.memoria_libre);
        block14Textview1_1.setText(R.string.memoria_libre);
        block15Textview1_1.setText(R.string.solemnidad);
        block16Textview1_1.setText(R.string.memoria);
        block17Textview1_1.setText(R.string.memoria_libre);
        block18Textview1_1.setText(R.string.memoria);
        block19Textview1_1.setText(R.string.memoria_libre);
        block20Textview1_1.setText(R.string.memoria_libre);
        block21Textview1_1.setText(R.string.memoria_libre);
        block22Textview1_1.setText(R.string.memoria_libre);
        block23Textview1_1.setText(R.string.memoria);
        block24Textview1_1.setText(R.string.memoria_libre);
        block25Textview1_1.setText(R.string.memoria_libre);
        block26Textview1_1.setText(R.string.memoria_libre);
        block27Textview1_1.setText(R.string.solemnidad);
        block28Textview1_1.setText(R.string.memoria);
        block29Textview1_1.setText(R.string.memoria);
        block30Textview1_1.setText(R.string.memoria_libre);
        block31Textview1_1.setText(R.string.memoria);


        //**
        // All Dates Textviews */

        TextView block1Textview2 = findViewById(R.id.block1_txt_view_2);
        TextView block2Textview2 = findViewById(R.id.block2_txt_view_2);
        TextView block3Textview2 = findViewById(R.id.block3_txt_view_2);
        TextView block4Textview2 = findViewById(R.id.block4_txt_view_2);
        TextView block5Textview2 = findViewById(R.id.block5_txt_view_2);
        TextView block6Textview2 = findViewById(R.id.block6_txt_view_2);
        TextView block7Textview2 = findViewById(R.id.block7_txt_view_2);
        TextView block8Textview2 = findViewById(R.id.block8_txt_view_2);
        TextView block9Textview2 = findViewById(R.id.block9_txt_view_2);
        TextView block10Textview2 = findViewById(R.id.block10_txt_view_2);
        TextView block11Textview2 = findViewById(R.id.block11_txt_view_2);
        TextView block12Textview2 = findViewById(R.id.block12_txt_view_2);
        TextView block13Textview2 = findViewById(R.id.block13_txt_view_2);
        TextView block14Textview2 = findViewById(R.id.block14_txt_view_2);
        TextView block15Textview2 = findViewById(R.id.block15_txt_view_2);
        TextView block16Textview2 = findViewById(R.id.block16_txt_view_2);
        TextView block17Textview2 = findViewById(R.id.block17_txt_view_2);
        TextView block18Textview2 = findViewById(R.id.block18_txt_view_2);
        TextView block19Textview2 = findViewById(R.id.block19_txt_view_2);
        TextView block20Textview2 = findViewById(R.id.block20_txt_view_2);
        TextView block21Textview2 = findViewById(R.id.block21_txt_view_2);
        TextView block22Textview2 = findViewById(R.id.block22_txt_view_2);
        TextView block23Textview2 = findViewById(R.id.block23_txt_view_2);
        TextView block24Textview2 = findViewById(R.id.block24_txt_view_2);
        TextView block25Textview2 = findViewById(R.id.block25_txt_view_2);
        TextView block26Textview2 = findViewById(R.id.block26_txt_view_2);
        TextView block27Textview2 = findViewById(R.id.block27_txt_view_2);
        TextView block28Textview2 = findViewById(R.id.block28_txt_view_2);
        TextView block29Textview2 = findViewById(R.id.block29_txt_view_2);
        TextView block30Textview2 = findViewById(R.id.block30_txt_view_2);
        TextView block31Textview2 = findViewById(R.id.block31_txt_view_2);

        // All Dates .Set Text

        block1Textview2.setText(R.string.fifteen);
        block2Textview2.setText(R.string.twenty_two);
        block3Textview2.setText(R.string.twenty_four);
        block4Textview2.setText(R.string.thirty);
        block5Textview2.setText(R.string.thirty_one);
        block6Textview2.setText(R.string.one);
        block7Textview2.setText(R.string.seven);
        block8Textview2.setText(R.string.nine);
        block9Textview2.setText(R.string.twenty_five);
        block10Textview2.setText(R.string.six);
        block11Textview2.setText(R.string.thirteen);
        block12Textview2.setText(R.string.fifteen);
        block13Textview2.setText(R.string.sixteen);
        block14Textview2.setText(R.string.eighteen);
        block15Textview2.setText(R.string.twenty_four);
        block16Textview2.setText(R.string.twenty_nine);
        block17Textview2.setText(R.string.twelve);
        block18Textview2.setText(R.string.twenty_three);
        block19Textview2.setText(R.string.seven);
        block20Textview2.setText(R.string.two);
        block21Textview2.setText(R.string.twenty_five);
        block22Textview2.setText(R.string.twenty_six);
        block23Textview2.setText(R.string.twenty_two);
        block24Textview2.setText(R.string.five);
        block25Textview2.setText(R.string.thirteen);
        block26Textview2.setText(R.string.twenty_four);
        block27Textview2.setText(R.string.twenty_five);
        block28Textview2.setText(R.string.twenty_nine);
        block29Textview2.setText(R.string.thirteen);
        block30Textview2.setText(R.string.fifteen);
        block31Textview2.setText(R.string.five);


        //**
        // All Blocks Views */

        View block1Layout = findViewById(R.id.block1_linear_layout);
        View block2Layout = findViewById(R.id.block2_linear_layout);
        View block3Layout = findViewById(R.id.block3_linear_layout);
        View block4Layout = findViewById(R.id.block4_linear_layout);
        View block5Layout = findViewById(R.id.block5_linear_layout);
        View block6Layout = findViewById(R.id.block6_linear_layout);
        View block7Layout = findViewById(R.id.block7_linear_layout);
        View block8Layout = findViewById(R.id.block8_linear_layout);
        View block9Layout = findViewById(R.id.block9_linear_layout);
        View block10Layout = findViewById(R.id.block10_linear_layout);
        View block11Layout = findViewById(R.id.block11_linear_layout);
        View block12Layout = findViewById(R.id.block12_linear_layout);
        View block13Layout = findViewById(R.id.block13_linear_layout);
        View block14Layout = findViewById(R.id.block14_linear_layout);
        View block15Layout = findViewById(R.id.block15_linear_layout);
        View block16Layout = findViewById(R.id.block16_linear_layout);
        View block17Layout = findViewById(R.id.block17_linear_layout);
        View block18Layout = findViewById(R.id.block18_linear_layout);
        View block19Layout = findViewById(R.id.block19_linear_layout);
        View block20Layout = findViewById(R.id.block20_linear_layout);
        View block21Layout = findViewById(R.id.block21_linear_layout);
        View block22Layout = findViewById(R.id.block22_linear_layout);
        View block23Layout = findViewById(R.id.block23_linear_layout);
        View block24Layout = findViewById(R.id.block24_linear_layout);
        View block25Layout = findViewById(R.id.block25_linear_layout);
        View block26Layout = findViewById(R.id.block26_linear_layout);
        View block27Layout = findViewById(R.id.block27_linear_layout);
        View block28Layout = findViewById(R.id.block28_linear_layout);
        View block29Layout = findViewById(R.id.block29_linear_layout);
        View block30Layout = findViewById(R.id.block30_linear_layout);
        View block31Layout = findViewById(R.id.block31_linear_layout);


        // All blocks . setOnClickListener

        block1Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "1");

                startActivity(selectionIntent);

            }
        });

        block2Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "2");

                startActivity(selectionIntent);

            }
        });

        block3Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "3");

                startActivity(selectionIntent);

            }
        });

        block4Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "4");

                startActivity(selectionIntent);

            }
        });

        block5Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "5");

                startActivity(selectionIntent);

            }
        });

        block6Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "6");

                startActivity(selectionIntent);

            }
        });

        block7Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "7");

                startActivity(selectionIntent);

            }
        });

        block8Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "8");

                startActivity(selectionIntent);

            }
        });

        block9Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "9");

                startActivity(selectionIntent);

            }
        });

        block10Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "10");

                startActivity(selectionIntent);

            }
        });

        block11Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "11");

                startActivity(selectionIntent);

            }
        });

        block12Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "12");

                startActivity(selectionIntent);

            }
        });

        block13Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "13");

                startActivity(selectionIntent);

            }
        });

        block14Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "14");

                startActivity(selectionIntent);

            }
        });

        block15Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "15");

                startActivity(selectionIntent);

            }
        });

        block16Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "16");

                startActivity(selectionIntent);

            }
        });

        block17Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "17");

                startActivity(selectionIntent);

            }
        });


        block18Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "18");

                startActivity(selectionIntent);

            }
        });

        block19Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "19");

                startActivity(selectionIntent);

            }
        });

        block20Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "20");

                startActivity(selectionIntent);

            }
        });

        block21Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "21");

                startActivity(selectionIntent);

            }
        });

        block22Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "22");

                startActivity(selectionIntent);

            }
        });

        block23Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "23");

                startActivity(selectionIntent);

            }
        });

        block24Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "24");

                startActivity(selectionIntent);

            }
        });

        block25Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "25");

                startActivity(selectionIntent);

            }
        });

        block26Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "26");

                startActivity(selectionIntent);

            }
        });

        block27Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "27");

                startActivity(selectionIntent);

            }
        });

        block28Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "28");

                startActivity(selectionIntent);

            }
        });

        block29Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "29");

                startActivity(selectionIntent);

            }
        });

        block30Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "30");

                startActivity(selectionIntent);

            }
        });

        block31Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "31");

                startActivity(selectionIntent);

            }
        });


        //**
        // Lower buttons Main Screen */

        Button prayButton = findViewById(R.id.pray_button);
        Button supportButton = findViewById(R.id.support_button);
        Button troubleshootButton = findViewById(R.id.troubleshoot_button);
        Button infoButton = findViewById(R.id.info_button);


        // Main screen buttons . setOnClickListener

        prayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent selectionIntent = new Intent(MainActivity.this, SelectionActivity.class);
                selectionIntent.putExtra("message", "pray");

                startActivity(selectionIntent);

            }
        });

        supportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent contentIntent = new Intent(MainActivity.this, ContentView.class);
                contentIntent.putExtra("message", "supp");

                startActivity(contentIntent);

            }
        });

        troubleshootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent contentIntent = new Intent(MainActivity.this, ContentView.class);
                contentIntent.putExtra("message", "troubleshoot");

                startActivity(contentIntent);

            }
        });

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent contentIntent = new Intent(MainActivity.this, ContentView.class);
                contentIntent.putExtra("message", "info");

                startActivity(contentIntent);

            }
        });

    }
}
