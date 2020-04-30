package com.calonapps.oficiossalesianos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class ContentView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_view);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        Button smallTextButton = findViewById(R.id.small_text_button);
        Button mediumTextButton = findViewById(R.id.medium_text_button);
        Button largeTextButton = findViewById(R.id.large_text_button);
        final WebView contentWebView =findViewById(R.id.content_web_view);


        // 15 ENERO
        if (message.equals("enero_15_0")){

            final String fileSmall = "file:///android_asset/1.bio_01-15s.htm";
            final String fileMid = "file:///android_asset/1.bio_01-15m.htm";
            final String fileLarge = "file:///android_asset/1.bio_01-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_15_1")){

            final String fileSmall = "file:///android_asset/2.ofi_01-15s.htm";
            final String fileMid = "file:///android_asset/2.ofi_01-15m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_01-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_15_2")){

            final String fileSmall = "file:///android_asset/3.lau_01-15s.htm";
            final String fileMid = "file:///android_asset/3.lau_01-15m.htm";
            final String fileLarge = "file:///android_asset/3.lau_01-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_15_3")){

            final String fileSmall = "file:///android_asset/4.ter_01-15s.htm";
            final String fileMid = "file:///android_asset/4.ter_01-15m.htm";
            final String fileLarge = "file:///android_asset/4.ter_01-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_15_4")){

            final String fileSmall = "file:///android_asset/5.sex_01-15s.htm";
            final String fileMid = "file:///android_asset/5.sex_01-15m.htm";
            final String fileLarge = "file:///android_asset/5.sex_01-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_15_5")){

            final String fileSmall = "file:///android_asset/6.non_01-15s.htm";
            final String fileMid = "file:///android_asset/6.non_01-15m.htm";
            final String fileLarge = "file:///android_asset/6.non_01-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_15_6")){

            final String fileSmall = "file:///android_asset/7.vis_01-15s.htm";
            final String fileMid = "file:///android_asset/7.vis_01-15m.htm";
            final String fileLarge = "file:///android_asset/7.vis_01-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_15_7")){

            final String fileSmall = "file:///android_asset/8.com_01-15s.htm";
            final String fileMid = "file:///android_asset/8.com_01-15m.htm";
            final String fileLarge = "file:///android_asset/8.com_01-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 22 ENERO
        if (message.equals("enero_22_0")){

            final String fileSmall = "file:///android_asset/1.bio_01-22s.htm";
            final String fileMid = "file:///android_asset/1.bio_01-22m.htm";
            final String fileLarge = "file:///android_asset/1.bio_01-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_22_1")){

            final String fileSmall = "file:///android_asset/2.ofi_01-22s.htm";
            final String fileMid = "file:///android_asset/2.ofi_01-22m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_01-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_22_2")){

            final String fileSmall = "file:///android_asset/3.lau_01-22s.htm";
            final String fileMid = "file:///android_asset/3.lau_01-22m.htm";
            final String fileLarge = "file:///android_asset/3.lau_01-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_22_3")){

            final String fileSmall = "file:///android_asset/4.ter_01-22s.htm";
            final String fileMid = "file:///android_asset/4.ter_01-22m.htm";
            final String fileLarge = "file:///android_asset/4.ter_01-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_22_4")){

            final String fileSmall = "file:///android_asset/5.sex_01-22s.htm";
            final String fileMid = "file:///android_asset/5.sex_01-22m.htm";
            final String fileLarge = "file:///android_asset/5.sex_01-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_22_5")){

            final String fileSmall = "file:///android_asset/6.non_01-22s.htm";
            final String fileMid = "file:///android_asset/6.non_01-22m.htm";
            final String fileLarge = "file:///android_asset/6.non_01-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_22_6")){

            final String fileSmall = "file:///android_asset/7.vis_01-22s.htm";
            final String fileMid = "file:///android_asset/7.vis_01-22m.htm";
            final String fileLarge = "file:///android_asset/7.vis_01-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_22_7")){

            final String fileSmall = "file:///android_asset/8.com_01-22s.htm";
            final String fileMid = "file:///android_asset/8.com_01-22m.htm";
            final String fileLarge = "file:///android_asset/8.com_01-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 24 ENERO
        if (message.equals("enero_24_0")){

            final String fileSmall = "file:///android_asset/1.bio_01-24s.htm";
            final String fileMid = "file:///android_asset/1.bio_01-24m.htm";
            final String fileLarge = "file:///android_asset/1.bio_01-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_24_1")){

            final String fileSmall = "file:///android_asset/2.ofi_01-24s.htm";
            final String fileMid = "file:///android_asset/2.ofi_01-24m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_01-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_24_2")){

            final String fileSmall = "file:///android_asset/3.lau_01-24s.htm";
            final String fileMid = "file:///android_asset/3.lau_01-24m.htm";
            final String fileLarge = "file:///android_asset/3.lau_01-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_24_3")){

            final String fileSmall = "file:///android_asset/4.ter_01-24s.htm";
            final String fileMid = "file:///android_asset/4.ter_01-24m.htm";
            final String fileLarge = "file:///android_asset/4.ter_01-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_24_4")){

            final String fileSmall = "file:///android_asset/5.sex_01-24s.htm";
            final String fileMid = "file:///android_asset/5.sex_01-24m.htm";
            final String fileLarge = "file:///android_asset/5.sex_01-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_24_5")){

            final String fileSmall = "file:///android_asset/6.non_01-24s.htm";
            final String fileMid = "file:///android_asset/6.non_01-24m.htm";
            final String fileLarge = "file:///android_asset/6.non_01-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_24_6")){

            final String fileSmall = "file:///android_asset/7.vis_01-24s.htm";
            final String fileMid = "file:///android_asset/7.vis_01-24m.htm";
            final String fileLarge = "file:///android_asset/7.vis_01-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_24_7")){

            final String fileSmall = "file:///android_asset/8.com_01-24s.htm";
            final String fileMid = "file:///android_asset/8.com_01-24m.htm";
            final String fileLarge = "file:///android_asset/8.com_01-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 30 ENERO
        if (message.equals("enero_30_0")){

            final String fileSmall = "file:///android_asset/1.bio_01-30s.htm";
            final String fileMid = "file:///android_asset/1.bio_01-30m.htm";
            final String fileLarge = "file:///android_asset/1.bio_01-30l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_30_1")){

            final String fileSmall = "file:///android_asset/2.ofi_01-30s.htm";
            final String fileMid = "file:///android_asset/2.ofi_01-30m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_01-30l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_30_2")){

            final String fileSmall = "file:///android_asset/3.lau_01-30s.htm";
            final String fileMid = "file:///android_asset/3.lau_01-30m.htm";
            final String fileLarge = "file:///android_asset/3.lau_01-30l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_30_3")){

            final String fileSmall = "file:///android_asset/4.ter_01-30s.htm";
            final String fileMid = "file:///android_asset/4.ter_01-30m.htm";
            final String fileLarge = "file:///android_asset/4.ter_01-30l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_30_4")){

            final String fileSmall = "file:///android_asset/5.sex_01-30s.htm";
            final String fileMid = "file:///android_asset/5.sex_01-30m.htm";
            final String fileLarge = "file:///android_asset/5.sex_01-30l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_30_5")){

            final String fileSmall = "file:///android_asset/6.non_01-30s.htm";
            final String fileMid = "file:///android_asset/6.non_01-30m.htm";
            final String fileLarge = "file:///android_asset/6.non_01-30l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_30_6")){

            final String fileSmall = "file:///android_asset/7.vis_01-30s.htm";
            final String fileMid = "file:///android_asset/7.vis_01-30m.htm";
            final String fileLarge = "file:///android_asset/7.vis_01-30l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_30_7")){

            final String fileSmall = "file:///android_asset/8.com_01-30s.htm";
            final String fileMid = "file:///android_asset/8.com_01-30m.htm";
            final String fileLarge = "file:///android_asset/8.com_01-30l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        // 31 ENERO
        if (message.equals("enero_31_0")){

            final String fileSmall = "file:///android_asset/1.bio_01-31s.htm";
            final String fileMid = "file:///android_asset/1.bio_01-31m.htm";
            final String fileLarge = "file:///android_asset/1.bio_01-31l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_31_1")){

            final String fileSmall = "file:///android_asset/0.vis1_01-31s.htm";
            final String fileMid = "file:///android_asset/0.vis1_01-31m.htm";
            final String fileLarge = "file:///android_asset/0.vis1_01-31l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_31_2")){

            final String fileSmall = "file:///android_asset/2.ofi_01-31s.htm";
            final String fileMid = "file:///android_asset/2.ofi_01-31m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_01-31l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_31_3")){

            final String fileSmall = "file:///android_asset/3.lau_01-31s.htm";
            final String fileMid = "file:///android_asset/3.lau_01-31m.htm";
            final String fileLarge = "file:///android_asset/3.lau_01-31l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_31_4")){

            final String fileSmall = "file:///android_asset/4.ter_01-31s.htm";
            final String fileMid = "file:///android_asset/4.ter_01-31m.htm";
            final String fileLarge = "file:///android_asset/4.ter_01-31l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_31_5")){

            final String fileSmall = "file:///android_asset/5.sex_01-31s.htm";
            final String fileMid = "file:///android_asset/5.sex_01-31m.htm";
            final String fileLarge = "file:///android_asset/5.sex_01-31l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_31_6")){

            final String fileSmall = "file:///android_asset/6.non_01-31s.htm";
            final String fileMid = "file:///android_asset/6.non_01-31m.htm";
            final String fileLarge = "file:///android_asset/6.non_01-31l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("enero_31_7")){

            final String fileSmall = "file:///android_asset/7.vis_01-31s.htm";
            final String fileMid = "file:///android_asset/7.vis_01-31m.htm";
            final String fileLarge = "file:///android_asset/7.vis_01-31l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        if (message.equals("enero_31_8")){

            final String fileSmall = "file:///android_asset/8.com_01-31s.htm";
            final String fileMid = "file:///android_asset/8.com_01-31m.htm";
            final String fileLarge = "file:///android_asset/8.com_01-31l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        // 1 FEBRERO
        if (message.equals("febrero_1_0")){

            final String fileSmall = "file:///android_asset/1.bio_02-01s.htm";
            final String fileMid = "file:///android_asset/1.bio_02-01m.htm";
            final String fileLarge = "file:///android_asset/1.bio_02-01l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_1_1")){

            final String fileSmall = "file:///android_asset/2.ofi_02-01s.htm";
            final String fileMid = "file:///android_asset/2.ofi_02-01m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_02-01l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_1_2")){

            final String fileSmall = "file:///android_asset/3.lau_02-01s.htm";
            final String fileMid = "file:///android_asset/3.lau_02-01m.htm";
            final String fileLarge = "file:///android_asset/3.lau_02-01l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_1_3")){

            final String fileSmall = "file:///android_asset/4.ter_02-01s.htm";
            final String fileMid = "file:///android_asset/4.ter_02-01m.htm";
            final String fileLarge = "file:///android_asset/4.ter_02-01l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_1_4")){

            final String fileSmall = "file:///android_asset/5.sex_02-01s.htm";
            final String fileMid = "file:///android_asset/5.sex_02-01m.htm";
            final String fileLarge = "file:///android_asset/5.sex_02-01l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_1_5")){

            final String fileSmall = "file:///android_asset/6.non_02-01s.htm";
            final String fileMid = "file:///android_asset/6.non_02-01m.htm";
            final String fileLarge = "file:///android_asset/6.non_02-01l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_1_6")){

            final String fileSmall = "file:///android_asset/7.vis_02-01s.htm";
            final String fileMid = "file:///android_asset/7.vis_02-01m.htm";
            final String fileLarge = "file:///android_asset/7.vis_02-01l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_1_7")){

            final String fileSmall = "file:///android_asset/8.com_02-01s.htm";
            final String fileMid = "file:///android_asset/8.com_02-01m.htm";
            final String fileLarge = "file:///android_asset/8.com_02-01l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        // 7 FEBRERO
        if (message.equals("febrero_7_0")){

            final String fileSmall = "file:///android_asset/1.bio_02-07s.htm";
            final String fileMid = "file:///android_asset/1.bio_02-07m.htm";
            final String fileLarge = "file:///android_asset/1.bio_02-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_7_1")){

            final String fileSmall = "file:///android_asset/2.ofi_02-07s.htm";
            final String fileMid = "file:///android_asset/2.ofi_02-07m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_02-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_7_2")){

            final String fileSmall = "file:///android_asset/3.lau_02-07s.htm";
            final String fileMid = "file:///android_asset/3.lau_02-07m.htm";
            final String fileLarge = "file:///android_asset/3.lau_02-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_7_3")){

            final String fileSmall = "file:///android_asset/4.ter_02-07s.htm";
            final String fileMid = "file:///android_asset/4.ter_02-07m.htm";
            final String fileLarge = "file:///android_asset/4.ter_02-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_7_4")){

            final String fileSmall = "file:///android_asset/5.sex_02-07s.htm";
            final String fileMid = "file:///android_asset/5.sex_02-07m.htm";
            final String fileLarge = "file:///android_asset/5.sex_02-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_7_5")){

            final String fileSmall = "file:///android_asset/6.non_02-07s.htm";
            final String fileMid = "file:///android_asset/6.non_02-07m.htm";
            final String fileLarge = "file:///android_asset/6.non_02-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_7_6")){

            final String fileSmall = "file:///android_asset/7.vis_02-07s.htm";
            final String fileMid = "file:///android_asset/7.vis_02-07m.htm";
            final String fileLarge = "file:///android_asset/7.vis_02-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_7_7")){

            final String fileSmall = "file:///android_asset/8.com_02-07s.htm";
            final String fileMid = "file:///android_asset/8.com_02-07m.htm";
            final String fileLarge = "file:///android_asset/8.com_02-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 9 FEBRERO
        if (message.equals("febrero_9_0")){

            final String fileSmall = "file:///android_asset/1.bio_02-09s.htm";
            final String fileMid = "file:///android_asset/1.bio_02-09m.htm";
            final String fileLarge = "file:///android_asset/1.bio_02-09l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_9_1")){

            final String fileSmall = "file:///android_asset/2.ofi_02-09s.htm";
            final String fileMid = "file:///android_asset/2.ofi_02-09m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_02-09l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_9_2")){

            final String fileSmall = "file:///android_asset/3.lau_02-09s.htm";
            final String fileMid = "file:///android_asset/3.lau_02-09m.htm";
            final String fileLarge = "file:///android_asset/3.lau_02-09l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_9_3")){

            final String fileSmall = "file:///android_asset/4.ter_02-09s.htm";
            final String fileMid = "file:///android_asset/4.ter_02-09m.htm";
            final String fileLarge = "file:///android_asset/4.ter_02-09l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_9_4")){

            final String fileSmall = "file:///android_asset/5.sex_02-09s.htm";
            final String fileMid = "file:///android_asset/5.sex_02-09m.htm";
            final String fileLarge = "file:///android_asset/5.sex_02-09l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_9_5")){

            final String fileSmall = "file:///android_asset/6.non_02-09s.htm";
            final String fileMid = "file:///android_asset/6.non_02-09m.htm";
            final String fileLarge = "file:///android_asset/6.non_02-09l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_9_6")){

            final String fileSmall = "file:///android_asset/7.vis_02-09s.htm";
            final String fileMid = "file:///android_asset/7.vis_02-09m.htm";
            final String fileLarge = "file:///android_asset/7.vis_02-09l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_9_7")){

            final String fileSmall = "file:///android_asset/8.com_02-09s.htm";
            final String fileMid = "file:///android_asset/8.com_02-09m.htm";
            final String fileLarge = "file:///android_asset/8.com_02-09l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        // 25 FEBRERO
        if (message.equals("febrero_25_0")){

            final String fileSmall = "file:///android_asset/1.bio_02-25s.htm";
            final String fileMid = "file:///android_asset/1.bio_02-25m.htm";
            final String fileLarge = "file:///android_asset/1.bio_02-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_25_1")){

            final String fileSmall = "file:///android_asset/2.ofi_02-25s.htm";
            final String fileMid = "file:///android_asset/2.ofi_02-25m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_02-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_25_2")){

            final String fileSmall = "file:///android_asset/3.lau_02-25s.htm";
            final String fileMid = "file:///android_asset/3.lau_02-25m.htm";
            final String fileLarge = "file:///android_asset/3.lau_02-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_25_3")){

            final String fileSmall = "file:///android_asset/4.ter_02-25s.htm";
            final String fileMid = "file:///android_asset/4.ter_02-25m.htm";
            final String fileLarge = "file:///android_asset/4.ter_02-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_25_4")){

            final String fileSmall = "file:///android_asset/5.sex_02-25s.htm";
            final String fileMid = "file:///android_asset/5.sex_02-25m.htm";
            final String fileLarge = "file:///android_asset/5.sex_02-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_25_5")){

            final String fileSmall = "file:///android_asset/6.non_02-25s.htm";
            final String fileMid = "file:///android_asset/6.non_02-25m.htm";
            final String fileLarge = "file:///android_asset/6.non_02-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_25_6")){

            final String fileSmall = "file:///android_asset/7.vis_02-25s.htm";
            final String fileMid = "file:///android_asset/7.vis_02-25m.htm";
            final String fileLarge = "file:///android_asset/7.vis_02-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("febrero_25_7")){

            final String fileSmall = "file:///android_asset/8.com_02-25s.htm";
            final String fileMid = "file:///android_asset/8.com_02-25m.htm";
            final String fileLarge = "file:///android_asset/8.com_02-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 6 MAYO
        if (message.equals("mayo_6_0")){

            final String fileSmall = "file:///android_asset/1.bio_05-06s.htm";
            final String fileMid = "file:///android_asset/1.bio_05-06m.htm";
            final String fileLarge = "file:///android_asset/1.bio_05-06l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_6_1")){

            final String fileSmall = "file:///android_asset/0.vis1_05-06s.htm";
            final String fileMid = "file:///android_asset/0.vis1_05-06m.htm";
            final String fileLarge = "file:///android_asset/0.vis1_05-06l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_6_2")){

            final String fileSmall = "file:///android_asset/2.ofi_05-06s.htm";
            final String fileMid = "file:///android_asset/2.ofi_05-06m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_05-06l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_6_3")){

            final String fileSmall = "file:///android_asset/3.lau_05-06s.htm";
            final String fileMid = "file:///android_asset/3.lau_05-06m.htm";
            final String fileLarge = "file:///android_asset/3.lau_05-06l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_6_4")){

            final String fileSmall = "file:///android_asset/4.ter_05-06s.htm";
            final String fileMid = "file:///android_asset/4.ter_05-06m.htm";
            final String fileLarge = "file:///android_asset/4.ter_05-06l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_6_5")){

            final String fileSmall = "file:///android_asset/5.sex_05-06s.htm";
            final String fileMid = "file:///android_asset/5.sex_05-06m.htm";
            final String fileLarge = "file:///android_asset/5.sex_05-06l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_6_6")){

            final String fileSmall = "file:///android_asset/6.non_05-06s.htm";
            final String fileMid = "file:///android_asset/6.non_05-06m.htm";
            final String fileLarge = "file:///android_asset/6.non_05-06l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_6_7")){

            final String fileSmall = "file:///android_asset/7.vis_05-06s.htm";
            final String fileMid = "file:///android_asset/7.vis_05-06m.htm";
            final String fileLarge = "file:///android_asset/7.vis_05-06l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_6_8")){

            final String fileSmall = "file:///android_asset/8.com_05-06s.htm";
            final String fileMid = "file:///android_asset/8.com_05-06m.htm";
            final String fileLarge = "file:///android_asset/8.com_05-06l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 13 MAYO
        if (message.equals("mayo_13_0")){

            final String fileSmall = "file:///android_asset/1.bio_05-13s.htm";
            final String fileMid = "file:///android_asset/1.bio_05-13m.htm";
            final String fileLarge = "file:///android_asset/1.bio_05-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_13_1")){

            final String fileSmall = "file:///android_asset/0.vis1_05-13s.htm";
            final String fileMid = "file:///android_asset/0.vis1_05-13m.htm";
            final String fileLarge = "file:///android_asset/0.vis1_05-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_13_2")){

            final String fileSmall = "file:///android_asset/2.ofi_05-13s.htm";
            final String fileMid = "file:///android_asset/2.ofi_05-13m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_05-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_13_3")){

            final String fileSmall = "file:///android_asset/3.lau_05-13s.htm";
            final String fileMid = "file:///android_asset/3.lau_05-13m.htm";
            final String fileLarge = "file:///android_asset/3.lau_05-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_13_4")){

            final String fileSmall = "file:///android_asset/4.ter_05-13s.htm";
            final String fileMid = "file:///android_asset/4.ter_05-13m.htm";
            final String fileLarge = "file:///android_asset/4.ter_05-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_13_5")){

            final String fileSmall = "file:///android_asset/5.sex_05-13s.htm";
            final String fileMid = "file:///android_asset/5.sex_05-13m.htm";
            final String fileLarge = "file:///android_asset/5.sex_05-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_13_6")){

            final String fileSmall = "file:///android_asset/6.non_05-13s.htm";
            final String fileMid = "file:///android_asset/6.non_05-13m.htm";
            final String fileLarge = "file:///android_asset/6.non_05-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_13_7")){

            final String fileSmall = "file:///android_asset/7.vis_05-13s.htm";
            final String fileMid = "file:///android_asset/7.vis_05-13m.htm";
            final String fileLarge = "file:///android_asset/7.vis_05-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_13_8")){

            final String fileSmall = "file:///android_asset/8.com_05-13s.htm";
            final String fileMid = "file:///android_asset/8.com_05-13m.htm";
            final String fileLarge = "file:///android_asset/8.com_05-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 15 MAYO
        if (message.equals("mayo_15_0")){

            final String fileSmall = "file:///android_asset/1.bio_05-15s.htm";
            final String fileMid = "file:///android_asset/1.bio_05-15m.htm";
            final String fileLarge = "file:///android_asset/1.bio_05-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_15_1")){

            final String fileSmall = "file:///android_asset/2.ofi_05-15s.htm";
            final String fileMid = "file:///android_asset/2.ofi_05-15m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_05-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_15_2")){

            final String fileSmall = "file:///android_asset/3.lau_05-15s.htm";
            final String fileMid = "file:///android_asset/3.lau_05-15m.htm";
            final String fileLarge = "file:///android_asset/3.lau_05-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_15_3")){

            final String fileSmall = "file:///android_asset/4.ter_05-15s.htm";
            final String fileMid = "file:///android_asset/4.ter_05-15m.htm";
            final String fileLarge = "file:///android_asset/4.ter_05-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_15_4")){

            final String fileSmall = "file:///android_asset/5.sex_05-15s.htm";
            final String fileMid = "file:///android_asset/5.sex_05-15m.htm";
            final String fileLarge = "file:///android_asset/5.sex_05-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_15_5")){

            final String fileSmall = "file:///android_asset/6.non_05-15s.htm";
            final String fileMid = "file:///android_asset/6.non_05-15m.htm";
            final String fileLarge = "file:///android_asset/6.non_05-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_15_6")){

            final String fileSmall = "file:///android_asset/7.vis_05-15s.htm";
            final String fileMid = "file:///android_asset/7.vis_05-15m.htm";
            final String fileLarge = "file:///android_asset/7.vis_05-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_15_7")){

            final String fileSmall = "file:///android_asset/8.com_05-15s.htm";
            final String fileMid = "file:///android_asset/8.com_05-15m.htm";
            final String fileLarge = "file:///android_asset/8.com_05-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 16 MAYO
        if (message.equals("mayo_16_0")){

            final String fileSmall = "file:///android_asset/1.bio_05-16s.htm";
            final String fileMid = "file:///android_asset/1.bio_05-16m.htm";
            final String fileLarge = "file:///android_asset/1.bio_05-16l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_16_1")){

            final String fileSmall = "file:///android_asset/2.ofi_05-16s.htm";
            final String fileMid = "file:///android_asset/2.ofi_05-16m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_05-16l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_16_2")){

            final String fileSmall = "file:///android_asset/3.lau_05-16s.htm";
            final String fileMid = "file:///android_asset/3.lau_05-16m.htm";
            final String fileLarge = "file:///android_asset/3.lau_05-16l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_16_3")){

            final String fileSmall = "file:///android_asset/4.ter_05-16s.htm";
            final String fileMid = "file:///android_asset/4.ter_05-16m.htm";
            final String fileLarge = "file:///android_asset/4.ter_05-16l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_16_4")){

            final String fileSmall = "file:///android_asset/5.sex_05-16s.htm";
            final String fileMid = "file:///android_asset/5.sex_05-16m.htm";
            final String fileLarge = "file:///android_asset/5.sex_05-16l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_16_5")){

            final String fileSmall = "file:///android_asset/6.non_05-16s.htm";
            final String fileMid = "file:///android_asset/6.non_05-16m.htm";
            final String fileLarge = "file:///android_asset/6.non_05-16l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_16_6")){

            final String fileSmall = "file:///android_asset/7.vis_05-16s.htm";
            final String fileMid = "file:///android_asset/7.vis_05-16m.htm";
            final String fileLarge = "file:///android_asset/7.vis_05-16l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_16_7")){

            final String fileSmall = "file:///android_asset/8.com_05-16s.htm";
            final String fileMid = "file:///android_asset/8.com_05-16m.htm";
            final String fileLarge = "file:///android_asset/8.com_05-16l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 18 MAYO
        if (message.equals("mayo_18_0")){

            final String fileSmall = "file:///android_asset/1.bio_05-18s.htm";
            final String fileMid = "file:///android_asset/1.bio_05-18m.htm";
            final String fileLarge = "file:///android_asset/1.bio_05-18l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_18_1")){

            final String fileSmall = "file:///android_asset/2.ofi_05-18s.htm";
            final String fileMid = "file:///android_asset/2.ofi_05-18m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_05-18l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_18_2")){

            final String fileSmall = "file:///android_asset/3.lau_05-18s.htm";
            final String fileMid = "file:///android_asset/3.lau_05-18m.htm";
            final String fileLarge = "file:///android_asset/3.lau_05-18l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_18_3")){

            final String fileSmall = "file:///android_asset/4.ter_05-18s.htm";
            final String fileMid = "file:///android_asset/4.ter_05-18m.htm";
            final String fileLarge = "file:///android_asset/4.ter_05-18l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_18_4")){

            final String fileSmall = "file:///android_asset/5.sex_05-18s.htm";
            final String fileMid = "file:///android_asset/5.sex_05-18m.htm";
            final String fileLarge = "file:///android_asset/5.sex_05-18l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_18_5")){

            final String fileSmall = "file:///android_asset/6.non_05-18s.htm";
            final String fileMid = "file:///android_asset/6.non_05-18m.htm";
            final String fileLarge = "file:///android_asset/6.non_05-18l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_18_6")){

            final String fileSmall = "file:///android_asset/7.vis_05-18s.htm";
            final String fileMid = "file:///android_asset/7.vis_05-18m.htm";
            final String fileLarge = "file:///android_asset/7.vis_05-18l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_18_7")){

            final String fileSmall = "file:///android_asset/8.com_05-18s.htm";
            final String fileMid = "file:///android_asset/8.com_05-18m.htm";
            final String fileLarge = "file:///android_asset/8.com_05-18l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 24 MAYO
        if (message.equals("mayo_24_0")){

            final String fileSmall = "file:///android_asset/1.bio_05-24s.htm";
            final String fileMid = "file:///android_asset/1.bio_05-24m.htm";
            final String fileLarge = "file:///android_asset/1.bio_05-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_24_1")){

            final String fileSmall = "file:///android_asset/2.ofi_05-24s.htm";
            final String fileMid = "file:///android_asset/2.ofi_05-24m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_05-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_24_2")){

            final String fileSmall = "file:///android_asset/3.lau_05-24s.htm";
            final String fileMid = "file:///android_asset/3.lau_05-24m.htm";
            final String fileLarge = "file:///android_asset/3.lau_05-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_24_3")){

            final String fileSmall = "file:///android_asset/4.ter_05-24s.htm";
            final String fileMid = "file:///android_asset/4.ter_05-24m.htm";
            final String fileLarge = "file:///android_asset/4.ter_05-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_24_4")){

            final String fileSmall = "file:///android_asset/5.sex_05-24s.htm";
            final String fileMid = "file:///android_asset/5.sex_05-24m.htm";
            final String fileLarge = "file:///android_asset/5.sex_05-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_24_5")){

            final String fileSmall = "file:///android_asset/6.non_05-24s.htm";
            final String fileMid = "file:///android_asset/6.non_05-24m.htm";
            final String fileLarge = "file:///android_asset/6.non_05-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_24_6")){

            final String fileSmall = "file:///android_asset/7.vis_05-24s.htm";
            final String fileMid = "file:///android_asset/7.vis_05-24m.htm";
            final String fileLarge = "file:///android_asset/7.vis_05-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_24_7")){

            final String fileSmall = "file:///android_asset/8.com_05-24s.htm";
            final String fileMid = "file:///android_asset/8.com_05-24m.htm";
            final String fileLarge = "file:///android_asset/8.com_05-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 29 MAYO
        if (message.equals("mayo_29_0")){

            final String fileSmall = "file:///android_asset/1.bio_05-29s.htm";
            final String fileMid = "file:///android_asset/1.bio_05-29m.htm";
            final String fileLarge = "file:///android_asset/1.bio_05-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_29_1")){

            final String fileSmall = "file:///android_asset/2.ofi_05-29s.htm";
            final String fileMid = "file:///android_asset/2.ofi_05-29m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_05-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_29_2")){

            final String fileSmall = "file:///android_asset/3.lau_05-29s.htm";
            final String fileMid = "file:///android_asset/3.lau_05-29m.htm";
            final String fileLarge = "file:///android_asset/3.lau_05-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_29_3")){

            final String fileSmall = "file:///android_asset/4.ter_05-29s.htm";
            final String fileMid = "file:///android_asset/4.ter_05-29m.htm";
            final String fileLarge = "file:///android_asset/4.ter_05-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_29_4")){

            final String fileSmall = "file:///android_asset/5.sex_05-29s.htm";
            final String fileMid = "file:///android_asset/5.sex_05-29m.htm";
            final String fileLarge = "file:///android_asset/5.sex_05-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_29_5")){

            final String fileSmall = "file:///android_asset/6.non_05-29s.htm";
            final String fileMid = "file:///android_asset/6.non_05-29m.htm";
            final String fileLarge = "file:///android_asset/6.non_05-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_29_6")){

            final String fileSmall = "file:///android_asset/7.vis_05-29s.htm";
            final String fileMid = "file:///android_asset/7.vis_05-29m.htm";
            final String fileLarge = "file:///android_asset/7.vis_05-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("mayo_29_7")){

            final String fileSmall = "file:///android_asset/8.com_05-29s.htm";
            final String fileMid = "file:///android_asset/8.com_05-29m.htm";
            final String fileLarge = "file:///android_asset/8.com_05-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 12 JUNIO
        if (message.equals("junio_12_0")){

            final String fileSmall = "file:///android_asset/1.bio_06-12s.htm";
            final String fileMid = "file:///android_asset/1.bio_06-12m.htm";
            final String fileLarge = "file:///android_asset/1.bio_06-12l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("junio_12_1")){

            final String fileSmall = "file:///android_asset/2.ofi_06-12s.htm";
            final String fileMid = "file:///android_asset/2.ofi_06-12m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_06-12l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("junio_12_2")){

            final String fileSmall = "file:///android_asset/3.lau_06-12s.htm";
            final String fileMid = "file:///android_asset/3.lau_06-12m.htm";
            final String fileLarge = "file:///android_asset/3.lau_06-12l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("junio_12_3")){

            final String fileSmall = "file:///android_asset/4.ter_06-12s.htm";
            final String fileMid = "file:///android_asset/4.ter_06-12m.htm";
            final String fileLarge = "file:///android_asset/4.ter_06-12l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("junio_12_4")){

            final String fileSmall = "file:///android_asset/5.sex_06-12s.htm";
            final String fileMid = "file:///android_asset/5.sex_06-12m.htm";
            final String fileLarge = "file:///android_asset/5.sex_06-12l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("junio_12_5")){

            final String fileSmall = "file:///android_asset/6.non_06-12s.htm";
            final String fileMid = "file:///android_asset/6.non_06-12m.htm";
            final String fileLarge = "file:///android_asset/6.non_06-12l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("junio_12_6")){

            final String fileSmall = "file:///android_asset/7.vis_06-12s.htm";
            final String fileMid = "file:///android_asset/7.vis_06-12m.htm";
            final String fileLarge = "file:///android_asset/7.vis_06-12l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("junio_12_7")){

            final String fileSmall = "file:///android_asset/8.com_06-12s.htm";
            final String fileMid = "file:///android_asset/8.com_06-12m.htm";
            final String fileLarge = "file:///android_asset/8.com_06-12l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 23 JUNIO
        if (message.equals("junio_23_0")){

            final String fileSmall = "file:///android_asset/1.bio_06-23s.htm";
            final String fileMid = "file:///android_asset/1.bio_06-23m.htm";
            final String fileLarge = "file:///android_asset/1.bio_06-23l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("junio_23_1")){

            final String fileSmall = "file:///android_asset/2.ofi_06-23s.htm";
            final String fileMid = "file:///android_asset/2.ofi_06-23m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_06-23l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("junio_23_2")){

            final String fileSmall = "file:///android_asset/3.lau_06-23s.htm";
            final String fileMid = "file:///android_asset/3.lau_06-23m.htm";
            final String fileLarge = "file:///android_asset/3.lau_06-23l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("junio_23_3")){

            final String fileSmall = "file:///android_asset/4.ter_06-23s.htm";
            final String fileMid = "file:///android_asset/4.ter_06-23m.htm";
            final String fileLarge = "file:///android_asset/4.ter_06-23l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("junio_23_4")){

            final String fileSmall = "file:///android_asset/5.sex_06-23s.htm";
            final String fileMid = "file:///android_asset/5.sex_06-23m.htm";
            final String fileLarge = "file:///android_asset/5.sex_06-23l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("junio_23_5")){

            final String fileSmall = "file:///android_asset/6.non_06-23s.htm";
            final String fileMid = "file:///android_asset/6.non_06-23m.htm";
            final String fileLarge = "file:///android_asset/6.non_06-23l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("junio_23_6")){

            final String fileSmall = "file:///android_asset/7.vis_06-23s.htm";
            final String fileMid = "file:///android_asset/7.vis_06-23m.htm";
            final String fileLarge = "file:///android_asset/7.vis_06-23l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("junio_23_7")){

            final String fileSmall = "file:///android_asset/8.com_06-23s.htm";
            final String fileMid = "file:///android_asset/8.com_06-23m.htm";
            final String fileLarge = "file:///android_asset/8.com_06-23l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 7 JULIO
        if (message.equals("julio_7_0")){

            final String fileSmall = "file:///android_asset/1.bio_07-07s.htm";
            final String fileMid = "file:///android_asset/1.bio_07-07m.htm";
            final String fileLarge = "file:///android_asset/1.bio_07-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("julio_7_1")){

            final String fileSmall = "file:///android_asset/2.ofi_07-07s.htm";
            final String fileMid = "file:///android_asset/2.ofi_07-07m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_07-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("julio_7_2")){

            final String fileSmall = "file:///android_asset/3.lau_07-07s.htm";
            final String fileMid = "file:///android_asset/3.lau_07-07m.htm";
            final String fileLarge = "file:///android_asset/3.lau_07-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("julio_7_3")){

            final String fileSmall = "file:///android_asset/4.ter_07-07s.htm";
            final String fileMid = "file:///android_asset/4.ter_07-07m.htm";
            final String fileLarge = "file:///android_asset/4.ter_07-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("julio_7_4")){

            final String fileSmall = "file:///android_asset/5.sex_07-07s.htm";
            final String fileMid = "file:///android_asset/5.sex_07-07m.htm";
            final String fileLarge = "file:///android_asset/5.sex_07-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("julio_7_5")){

            final String fileSmall = "file:///android_asset/6.non_07-07s.htm";
            final String fileMid = "file:///android_asset/6.non_07-07m.htm";
            final String fileLarge = "file:///android_asset/6.non_07-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("julio_7_6")){

            final String fileSmall = "file:///android_asset/7.vis_07-07s.htm";
            final String fileMid = "file:///android_asset/7.vis_07-07m.htm";
            final String fileLarge = "file:///android_asset/7.vis_07-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("julio_7_7")){

            final String fileSmall = "file:///android_asset/8.com_07-07s.htm";
            final String fileMid = "file:///android_asset/8.com_07-07m.htm";
            final String fileLarge = "file:///android_asset/8.com_07-07l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 2 AGOSTO
        if (message.equals("agosto_2_0")){

            final String fileSmall = "file:///android_asset/1.bio_08-02s.htm";
            final String fileMid = "file:///android_asset/1.bio_08-02m.htm";
            final String fileLarge = "file:///android_asset/1.bio_08-02l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_2_1")){

            final String fileSmall = "file:///android_asset/2.ofi_08-02s.htm";
            final String fileMid = "file:///android_asset/2.ofi_08-02m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_08-02l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_2_2")){

            final String fileSmall = "file:///android_asset/3.lau_08-02s.htm";
            final String fileMid = "file:///android_asset/3.lau_08-02m.htm";
            final String fileLarge = "file:///android_asset/3.lau_08-02l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_2_3")){

            final String fileSmall = "file:///android_asset/4.ter_08-02s.htm";
            final String fileMid = "file:///android_asset/4.ter_08-02m.htm";
            final String fileLarge = "file:///android_asset/4.ter_08-02l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_2_4")){

            final String fileSmall = "file:///android_asset/5.sex_08-02s.htm";
            final String fileMid = "file:///android_asset/5.sex_08-02m.htm";
            final String fileLarge = "file:///android_asset/5.sex_08-02l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_2_5")){

            final String fileSmall = "file:///android_asset/6.non_08-02s.htm";
            final String fileMid = "file:///android_asset/6.non_08-02m.htm";
            final String fileLarge = "file:///android_asset/6.non_08-02l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_2_6")){

            final String fileSmall = "file:///android_asset/7.vis_08-02s.htm";
            final String fileMid = "file:///android_asset/7.vis_08-02m.htm";
            final String fileLarge = "file:///android_asset/7.vis_08-02l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_2_7")){

            final String fileSmall = "file:///android_asset/8.com_08-02s.htm";
            final String fileMid = "file:///android_asset/8.com_08-02m.htm";
            final String fileLarge = "file:///android_asset/8.com_08-02l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 25 AGOSTO
        if (message.equals("agosto_25_0")){

            final String fileSmall = "file:///android_asset/1.bio_08-25s.htm";
            final String fileMid = "file:///android_asset/1.bio_08-25m.htm";
            final String fileLarge = "file:///android_asset/1.bio_08-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_25_1")){

            final String fileSmall = "file:///android_asset/2.ofi_08-25s.htm";
            final String fileMid = "file:///android_asset/2.ofi_08-25m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_08-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_25_2")){

            final String fileSmall = "file:///android_asset/3.lau_08-25s.htm";
            final String fileMid = "file:///android_asset/3.lau_08-25m.htm";
            final String fileLarge = "file:///android_asset/3.lau_08-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_25_3")){

            final String fileSmall = "file:///android_asset/4.ter_08-25s.htm";
            final String fileMid = "file:///android_asset/4.ter_08-25m.htm";
            final String fileLarge = "file:///android_asset/4.ter_08-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_25_4")){

            final String fileSmall = "file:///android_asset/5.sex_08-25s.htm";
            final String fileMid = "file:///android_asset/5.sex_08-25m.htm";
            final String fileLarge = "file:///android_asset/5.sex_08-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_25_5")){

            final String fileSmall = "file:///android_asset/6.non_08-25s.htm";
            final String fileMid = "file:///android_asset/6.non_08-25m.htm";
            final String fileLarge = "file:///android_asset/6.non_08-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_25_6")){

            final String fileSmall = "file:///android_asset/7.vis_08-25s.htm";
            final String fileMid = "file:///android_asset/7.vis_08-25m.htm";
            final String fileLarge = "file:///android_asset/7.vis_08-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_25_7")){

            final String fileSmall = "file:///android_asset/8.com_08-25s.htm";
            final String fileMid = "file:///android_asset/8.com_08-25m.htm";
            final String fileLarge = "file:///android_asset/8.com_08-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 26 AGOSTO
        if (message.equals("agosto_26_0")){

            final String fileSmall = "file:///android_asset/1.bio_08-26s.htm";
            final String fileMid = "file:///android_asset/1.bio_08-26m.htm";
            final String fileLarge = "file:///android_asset/1.bio_08-26l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_26_1")){

            final String fileSmall = "file:///android_asset/2.ofi_08-26s.htm";
            final String fileMid = "file:///android_asset/2.ofi_08-26m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_08-26l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_26_2")){

            final String fileSmall = "file:///android_asset/3.lau_08-26s.htm";
            final String fileMid = "file:///android_asset/3.lau_08-26m.htm";
            final String fileLarge = "file:///android_asset/3.lau_08-26l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_26_3")){

            final String fileSmall = "file:///android_asset/4.ter_08-26s.htm";
            final String fileMid = "file:///android_asset/4.ter_08-26m.htm";
            final String fileLarge = "file:///android_asset/4.ter_08-26l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_26_4")){

            final String fileSmall = "file:///android_asset/5.sex_08-26s.htm";
            final String fileMid = "file:///android_asset/5.sex_08-26m.htm";
            final String fileLarge = "file:///android_asset/5.sex_08-26l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_26_5")){

            final String fileSmall = "file:///android_asset/6.non_08-26s.htm";
            final String fileMid = "file:///android_asset/6.non_08-26m.htm";
            final String fileLarge = "file:///android_asset/6.non_08-26l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_26_6")){

            final String fileSmall = "file:///android_asset/7.vis_08-26s.htm";
            final String fileMid = "file:///android_asset/7.vis_08-26m.htm";
            final String fileLarge = "file:///android_asset/7.vis_08-26l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("agosto_26_7")){

            final String fileSmall = "file:///android_asset/8.com_08-26s.htm";
            final String fileMid = "file:///android_asset/8.com_08-26m.htm";
            final String fileLarge = "file:///android_asset/8.com_08-26l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 22 SEPTIEMBRE
        if (message.equals("septiembre_22_0")){

            final String fileSmall = "file:///android_asset/1.bio_09-22s.htm";
            final String fileMid = "file:///android_asset/1.bio_09-22m.htm";
            final String fileLarge = "file:///android_asset/1.bio_09-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("septiembre_22_1")){

            final String fileSmall = "file:///android_asset/2.ofi_09-22s.htm";
            final String fileMid = "file:///android_asset/2.ofi_09-22m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_09-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("septiembre_22_2")){

            final String fileSmall = "file:///android_asset/3.lau_09-22s.htm";
            final String fileMid = "file:///android_asset/3.lau_09-22m.htm";
            final String fileLarge = "file:///android_asset/3.lau_09-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("septiembre_22_3")){

            final String fileSmall = "file:///android_asset/4.ter_09-22s.htm";
            final String fileMid = "file:///android_asset/4.ter_09-22m.htm";
            final String fileLarge = "file:///android_asset/4.ter_09-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("septiembre_22_4")){

            final String fileSmall = "file:///android_asset/5.sex_09-22s.htm";
            final String fileMid = "file:///android_asset/5.sex_09-22m.htm";
            final String fileLarge = "file:///android_asset/5.sex_09-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("septiembre_22_5")){

            final String fileSmall = "file:///android_asset/6.non_09-22s.htm";
            final String fileMid = "file:///android_asset/6.non_09-22m.htm";
            final String fileLarge = "file:///android_asset/6.non_09-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("septiembre_22_6")){

            final String fileSmall = "file:///android_asset/7.vis_09-22s.htm";
            final String fileMid = "file:///android_asset/7.vis_09-22m.htm";
            final String fileLarge = "file:///android_asset/7.vis_09-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("septiembre_22_7")){

            final String fileSmall = "file:///android_asset/8.com_09-22s.htm";
            final String fileMid = "file:///android_asset/8.com_09-22m.htm";
            final String fileLarge = "file:///android_asset/8.com_09-22l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 5 OCTUBRE
        if (message.equals("octubre_5_0")){

            final String fileSmall = "file:///android_asset/1.bio_10-05s.htm";
            final String fileMid = "file:///android_asset/1.bio_10-05m.htm";
            final String fileLarge = "file:///android_asset/1.bio_10-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_5_1")){

            final String fileSmall = "file:///android_asset/2.ofi_10-05s.htm";
            final String fileMid = "file:///android_asset/2.ofi_10-05m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_10-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_5_2")){

            final String fileSmall = "file:///android_asset/3.lau_10-05s.htm";
            final String fileMid = "file:///android_asset/3.lau_10-05m.htm";
            final String fileLarge = "file:///android_asset/3.lau_10-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_5_3")){

            final String fileSmall = "file:///android_asset/4.ter_10-05s.htm";
            final String fileMid = "file:///android_asset/4.ter_10-05m.htm";
            final String fileLarge = "file:///android_asset/4.ter_10-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_5_4")){

            final String fileSmall = "file:///android_asset/5.sex_10-05s.htm";
            final String fileMid = "file:///android_asset/5.sex_10-05m.htm";
            final String fileLarge = "file:///android_asset/5.sex_10-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_5_5")){

            final String fileSmall = "file:///android_asset/6.non_10-05s.htm";
            final String fileMid = "file:///android_asset/6.non_10-05m.htm";
            final String fileLarge = "file:///android_asset/6.non_10-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_5_6")){

            final String fileSmall = "file:///android_asset/7.vis_10-05s.htm";
            final String fileMid = "file:///android_asset/7.vis_10-05m.htm";
            final String fileLarge = "file:///android_asset/7.vis_10-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_5_7")){

            final String fileSmall = "file:///android_asset/8.com_10-05s.htm";
            final String fileMid = "file:///android_asset/8.com_10-05m.htm";
            final String fileLarge = "file:///android_asset/8.com_10-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 13 OCTUBRE
        if (message.equals("octubre_13_0")){

            final String fileSmall = "file:///android_asset/1.bio_10-13s.htm";
            final String fileMid = "file:///android_asset/1.bio_10-13m.htm";
            final String fileLarge = "file:///android_asset/1.bio_10-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_13_1")){

            final String fileSmall = "file:///android_asset/2.ofi_10-13s.htm";
            final String fileMid = "file:///android_asset/2.ofi_10-13m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_10-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_13_2")){

            final String fileSmall = "file:///android_asset/3.lau_10-13s.htm";
            final String fileMid = "file:///android_asset/3.lau_10-13m.htm";
            final String fileLarge = "file:///android_asset/3.lau_10-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_13_3")){

            final String fileSmall = "file:///android_asset/4.ter_10-13s.htm";
            final String fileMid = "file:///android_asset/4.ter_10-13m.htm";
            final String fileLarge = "file:///android_asset/4.ter_10-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_13_4")){

            final String fileSmall = "file:///android_asset/5.sex_10-13s.htm";
            final String fileMid = "file:///android_asset/5.sex_10-13m.htm";
            final String fileLarge = "file:///android_asset/5.sex_10-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_13_5")){

            final String fileSmall = "file:///android_asset/6.non_10-13s.htm";
            final String fileMid = "file:///android_asset/6.non_10-13m.htm";
            final String fileLarge = "file:///android_asset/6.non_10-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_13_6")){

            final String fileSmall = "file:///android_asset/7.vis_10-13s.htm";
            final String fileMid = "file:///android_asset/7.vis_10-13m.htm";
            final String fileLarge = "file:///android_asset/7.vis_10-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_13_7")){

            final String fileSmall = "file:///android_asset/8.com_10-13s.htm";
            final String fileMid = "file:///android_asset/8.com_10-13m.htm";
            final String fileLarge = "file:///android_asset/8.com_10-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 24 OCTUBRE
        if (message.equals("octubre_24_0")){

            final String fileSmall = "file:///android_asset/1.bio_10-24s.htm";
            final String fileMid = "file:///android_asset/1.bio_10-24m.htm";
            final String fileLarge = "file:///android_asset/1.bio_10-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_24_1")){

            final String fileSmall = "file:///android_asset/2.ofi_10-24s.htm";
            final String fileMid = "file:///android_asset/2.ofi_10-24m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_10-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_24_2")){

            final String fileSmall = "file:///android_asset/3.lau_10-24s.htm";
            final String fileMid = "file:///android_asset/3.lau_10-24m.htm";
            final String fileLarge = "file:///android_asset/3.lau_10-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_24_3")){

            final String fileSmall = "file:///android_asset/4.ter_10-24s.htm";
            final String fileMid = "file:///android_asset/4.ter_10-24m.htm";
            final String fileLarge = "file:///android_asset/4.ter_10-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_24_4")){

            final String fileSmall = "file:///android_asset/5.sex_10-24s.htm";
            final String fileMid = "file:///android_asset/5.sex_10-24m.htm";
            final String fileLarge = "file:///android_asset/5.sex_10-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_24_5")){

            final String fileSmall = "file:///android_asset/6.non_10-24s.htm";
            final String fileMid = "file:///android_asset/6.non_10-24m.htm";
            final String fileLarge = "file:///android_asset/6.non_10-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_24_6")){

            final String fileSmall = "file:///android_asset/7.vis_10-24s.htm";
            final String fileMid = "file:///android_asset/7.vis_10-24m.htm";
            final String fileLarge = "file:///android_asset/7.vis_10-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_24_7")){

            final String fileSmall = "file:///android_asset/8.com_10-24s.htm";
            final String fileMid = "file:///android_asset/8.com_10-24m.htm";
            final String fileLarge = "file:///android_asset/8.com_10-24l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 25 OCTUBRE
        if (message.equals("octubre_25_0")){

            final String fileSmall = "file:///android_asset/1.bio_10-25s.htm";
            final String fileMid = "file:///android_asset/1.bio_10-25m.htm";
            final String fileLarge = "file:///android_asset/1.bio_10-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_25_1")){

            final String fileSmall = "file:///android_asset/0.vis1_10-25s.htm";
            final String fileMid = "file:///android_asset/0.vis1_10-25m.htm";
            final String fileLarge = "file:///android_asset/0.vis1_10-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_25_2")){

            final String fileSmall = "file:///android_asset/2.ofi_10-25s.htm";
            final String fileMid = "file:///android_asset/2.ofi_10-25m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_10-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_25_3")){

            final String fileSmall = "file:///android_asset/3.lau_10-25s.htm";
            final String fileMid = "file:///android_asset/3.lau_10-25m.htm";
            final String fileLarge = "file:///android_asset/3.lau_10-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_25_4")){

            final String fileSmall = "file:///android_asset/4.ter_10-25s.htm";
            final String fileMid = "file:///android_asset/4.ter_10-25m.htm";
            final String fileLarge = "file:///android_asset/4.ter_10-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_25_5")){

            final String fileSmall = "file:///android_asset/5.sex_10-25s.htm";
            final String fileMid = "file:///android_asset/5.sex_10-25m.htm";
            final String fileLarge = "file:///android_asset/5.sex_10-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_25_6")){

            final String fileSmall = "file:///android_asset/6.non_10-25s.htm";
            final String fileMid = "file:///android_asset/6.non_10-25m.htm";
            final String fileLarge = "file:///android_asset/6.non_10-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_25_7")){

            final String fileSmall = "file:///android_asset/7.vis_10-25s.htm";
            final String fileMid = "file:///android_asset/7.vis_10-25m.htm";
            final String fileLarge = "file:///android_asset/7.vis_10-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_25_8")){

            final String fileSmall = "file:///android_asset/8.com_10-25s.htm";
            final String fileMid = "file:///android_asset/8.com_10-25m.htm";
            final String fileLarge = "file:///android_asset/8.com_10-25l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 29 OCTUBRE
        if (message.equals("octubre_29_0")){

            final String fileSmall = "file:///android_asset/1.bio_10-29s.htm";
            final String fileMid = "file:///android_asset/1.bio_10-29m.htm";
            final String fileLarge = "file:///android_asset/1.bio_10-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_29_1")){

            final String fileSmall = "file:///android_asset/2.ofi_10-29s.htm";
            final String fileMid = "file:///android_asset/2.ofi_10-29m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_10-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_29_2")){

            final String fileSmall = "file:///android_asset/3.lau_10-29s.htm";
            final String fileMid = "file:///android_asset/3.lau_10-29m.htm";
            final String fileLarge = "file:///android_asset/3.lau_10-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_29_3")){

            final String fileSmall = "file:///android_asset/4.ter_10-29s.htm";
            final String fileMid = "file:///android_asset/4.ter_10-29m.htm";
            final String fileLarge = "file:///android_asset/4.ter_10-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_29_4")){

            final String fileSmall = "file:///android_asset/5.sex_10-29s.htm";
            final String fileMid = "file:///android_asset/5.sex_10-29m.htm";
            final String fileLarge = "file:///android_asset/5.sex_10-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_29_5")){

            final String fileSmall = "file:///android_asset/6.non_10-29s.htm";
            final String fileMid = "file:///android_asset/6.non_10-29m.htm";
            final String fileLarge = "file:///android_asset/6.non_10-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_29_6")){

            final String fileSmall = "file:///android_asset/7.vis_10-29s.htm";
            final String fileMid = "file:///android_asset/7.vis_10-29m.htm";
            final String fileLarge = "file:///android_asset/7.vis_10-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("octubre_29_7")){

            final String fileSmall = "file:///android_asset/8.com_10-29s.htm";
            final String fileMid = "file:///android_asset/8.com_10-29m.htm";
            final String fileLarge = "file:///android_asset/8.com_10-29l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 13 NOVIEMBRE
        if (message.equals("noviembre_13_0")){

            final String fileSmall = "file:///android_asset/1.bio_11-13s.htm";
            final String fileMid = "file:///android_asset/1.bio_11-13m.htm";
            final String fileLarge = "file:///android_asset/1.bio_11-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("noviembre_13_1")){

            final String fileSmall = "file:///android_asset/2.ofi_11-13s.htm";
            final String fileMid = "file:///android_asset/2.ofi_11-13m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_11-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("noviembre_13_2")){

            final String fileSmall = "file:///android_asset/3.lau_11-13s.htm";
            final String fileMid = "file:///android_asset/3.lau_11-13m.htm";
            final String fileLarge = "file:///android_asset/3.lau_11-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("noviembre_13_3")){

            final String fileSmall = "file:///android_asset/4.ter_11-13s.htm";
            final String fileMid = "file:///android_asset/4.ter_11-13m.htm";
            final String fileLarge = "file:///android_asset/4.ter_11-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("noviembre_13_4")){

            final String fileSmall = "file:///android_asset/5.sex_11-13s.htm";
            final String fileMid = "file:///android_asset/5.sex_11-13m.htm";
            final String fileLarge = "file:///android_asset/5.sex_11-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("noviembre_13_5")){

            final String fileSmall = "file:///android_asset/6.non_11-13s.htm";
            final String fileMid = "file:///android_asset/6.non_11-13m.htm";
            final String fileLarge = "file:///android_asset/6.non_11-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("noviembre_13_6")){

            final String fileSmall = "file:///android_asset/7.vis_11-13s.htm";
            final String fileMid = "file:///android_asset/7.vis_11-13m.htm";
            final String fileLarge = "file:///android_asset/7.vis_11-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("noviembre_13_7")){

            final String fileSmall = "file:///android_asset/8.com_11-13s.htm";
            final String fileMid = "file:///android_asset/8.com_11-13m.htm";
            final String fileLarge = "file:///android_asset/8.com_11-13l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 15 NOVIEMBRE
        if (message.equals("noviembre_15_0")){

            final String fileSmall = "file:///android_asset/1.bio_11-15s.htm";
            final String fileMid = "file:///android_asset/1.bio_11-15m.htm";
            final String fileLarge = "file:///android_asset/1.bio_11-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("noviembre_15_1")){

            final String fileSmall = "file:///android_asset/2.ofi_11-15s.htm";
            final String fileMid = "file:///android_asset/2.ofi_11-15m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_11-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("noviembre_15_2")){

            final String fileSmall = "file:///android_asset/3.lau_11-15s.htm";
            final String fileMid = "file:///android_asset/3.lau_11-15m.htm";
            final String fileLarge = "file:///android_asset/3.lau_11-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("noviembre_15_3")){

            final String fileSmall = "file:///android_asset/4.ter_11-15s.htm";
            final String fileMid = "file:///android_asset/4.ter_11-15m.htm";
            final String fileLarge = "file:///android_asset/4.ter_11-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("noviembre_15_4")){

            final String fileSmall = "file:///android_asset/5.sex_11-15s.htm";
            final String fileMid = "file:///android_asset/5.sex_11-15m.htm";
            final String fileLarge = "file:///android_asset/5.sex_11-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("noviembre_15_5")){

            final String fileSmall = "file:///android_asset/6.non_11-15s.htm";
            final String fileMid = "file:///android_asset/6.non_11-15m.htm";
            final String fileLarge = "file:///android_asset/6.non_11-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("noviembre_15_6")){

            final String fileSmall = "file:///android_asset/7.vis_11-15s.htm";
            final String fileMid = "file:///android_asset/7.vis_11-15m.htm";
            final String fileLarge = "file:///android_asset/7.vis_11-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("noviembre_15_7")){

            final String fileSmall = "file:///android_asset/8.com_11-15s.htm";
            final String fileMid = "file:///android_asset/8.com_11-15m.htm";
            final String fileLarge = "file:///android_asset/8.com_11-15l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // 5 DICIEMBRE
        if (message.equals("diciembre_5_0")){

            final String fileSmall = "file:///android_asset/1.bio_12-05s.htm";
            final String fileMid = "file:///android_asset/1.bio_12-05m.htm";
            final String fileLarge = "file:///android_asset/1.bio_12-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("diciembre_5_1")){

            final String fileSmall = "file:///android_asset/2.ofi_12-05s.htm";
            final String fileMid = "file:///android_asset/2.ofi_12-05m.htm";
            final String fileLarge = "file:///android_asset/2.ofi_12-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("diciembre_5_2")){

            final String fileSmall = "file:///android_asset/3.lau_12-05s.htm";
            final String fileMid = "file:///android_asset/3.lau_12-05m.htm";
            final String fileLarge = "file:///android_asset/3.lau_12-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("diciembre_5_3")){

            final String fileSmall = "file:///android_asset/4.ter_12-05s.htm";
            final String fileMid = "file:///android_asset/4.ter_12-05m.htm";
            final String fileLarge = "file:///android_asset/4.ter_12-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("diciembre_5_4")){

            final String fileSmall = "file:///android_asset/5.sex_12-05s.htm";
            final String fileMid = "file:///android_asset/5.sex_12-05m.htm";
            final String fileLarge = "file:///android_asset/5.sex_12-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("diciembre_5_5")){

            final String fileSmall = "file:///android_asset/6.non_12-05s.htm";
            final String fileMid = "file:///android_asset/6.non_12-05m.htm";
            final String fileLarge = "file:///android_asset/6.non_12-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("diciembre_5_6")){

            final String fileSmall = "file:///android_asset/7.vis_12-05s.htm";
            final String fileMid = "file:///android_asset/7.vis_12-05m.htm";
            final String fileLarge = "file:///android_asset/7.vis_12-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("diciembre_5_7")){

            final String fileSmall = "file:///android_asset/8.com_12-05s.htm";
            final String fileMid = "file:///android_asset/8.com_12-05m.htm";
            final String fileLarge = "file:///android_asset/8.com_12-05l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        //ALTERNATIVE 2 - PRAYERS
        //Inherit prayers

        if (message.equals("pray_0")){

            final String fileSmall = "file:///android_asset/espirituSanto_s.htm";
            final String fileMid = "file:///android_asset/espirituSanto_m.htm";
            final String fileLarge = "file:///android_asset/espirituSanto_l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        if (message.equals("pray_1")){

            final String fileSmall = "file:///android_asset/consagrarDia_s.htm";
            final String fileMid = "file:///android_asset/consagrarDia_m.htm";
            final String fileLarge = "file:///android_asset/consagrarDia_l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("pray_2")){

            final String fileSmall = "file:///android_asset/rezoDiario_s.htm";
            final String fileMid = "file:///android_asset/rezoDiario_m.htm";
            final String fileLarge = "file:///android_asset/rezoDiario_l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("pray_3")){

            final String fileSmall = "file:///android_asset/mañana_s.htm";
            final String fileMid = "file:///android_asset/mañana_m.htm";
            final String fileLarge = "file:///android_asset/mañana_l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("pray_4")){

            final String fileSmall = "file:///android_asset/donBosco_s.htm";
            final String fileMid = "file:///android_asset/donBosco_m.htm";
            final String fileLarge = "file:///android_asset/donBosco_l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("pray_5")){

            final String fileSmall = "file:///android_asset/jovenes_s.htm";
            final String fileMid = "file:///android_asset/jovenes_m.htm";
            final String fileLarge = "file:///android_asset/jovenes_l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("pray_6")){

            final String fileSmall = "file:///android_asset/virgen_s.htm";
            final String fileMid = "file:///android_asset/virgen_m.htm";
            final String fileLarge = "file:///android_asset/virgen_l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("pray_7")){

            final String fileSmall = "file:///android_asset/sosiego_s.htm";
            final String fileMid = "file:///android_asset/sosiego_m.htm";
            final String fileLarge = "file:///android_asset/sosiego_l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("pray_8")){

            final String fileSmall = "file:///android_asset/familia_s.htm";
            final String fileMid = "file:///android_asset/familia_m.htm";
            final String fileLarge = "file:///android_asset/familia_l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        if (message.equals("pray_9")){

            final String fileSmall = "file:///android_asset/alimentos_s.htm";
            final String fileMid = "file:///android_asset/alimentos_m.htm";
            final String fileLarge = "file:///android_asset/alimentos_l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        // Support Button

        if (message.equals("supp")){

            final String fileSmall = "file:///android_asset/colabora_s.htm";
            final String fileMid = "file:///android_asset/colabora_m.htm";
            final String fileLarge = "file:///android_asset/colabora_l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }


        // Troubleshoot Button

        if (message.equals("troubleshoot")){

            final String fileSmall = "file:///android_asset/soporte_s.htm";
            final String fileMid = "file:///android_asset/soporte_m.htm";
            final String fileLarge = "file:///android_asset/soporte_l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }

        // Info Button

        if (message.equals("info")){

            final String fileSmall = "file:///android_asset/info_s.htm";
            final String fileMid = "file:///android_asset/info_m.htm";
            final String fileLarge = "file:///android_asset/info_l.htm";


            contentWebView.loadUrl(fileSmall);

            smallTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileSmall);

                }
            });

            mediumTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileMid);
                }
            });

            largeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    contentWebView.loadUrl(fileLarge);
                }
            });

        }
    }
}
