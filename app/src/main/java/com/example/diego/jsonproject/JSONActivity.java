package com.example.diego.jsonproject;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JSONActivity extends Activity {

    private TextView textJSON;
    EditText editTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);
        textJSON = (TextView) findViewById(R.id.textJSON);
        editTitle = (EditText) findViewById(R.id.editTitle);
    }

    public void conectar(View v){
        String content = editTitle.getText().toString();
        new DownloadFromOpenWeather().execute(content);
    }

    private class DownloadFromOpenWeather extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            String titulo = params[0];
            HttpURLConnection urlConnection = null;
            try {

                titulo.replaceAll(" ","+");

                URL url = new URL("http://www.omdbapi.com/?t="+titulo+"");

                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.connect();

                String result = Util.webToString(urlConnection.getInputStream());

                return result;
            } catch (Exception e) {
                Log.e("Error", "Error ", e);
                return null;
            } finally{
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
            }
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Omdb omdb = Util.JSONtoOmdb(s);
            if(omdb != null){
                String data = "Titulo: " + omdb.getTitle() + "\n";
                data += "Ano: " + omdb.getYear();
                textJSON.setText(data);
            }
        }
    }
}
