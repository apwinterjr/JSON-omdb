package com.example.diego.jsonproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView textJSON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textJSON = (TextView) findViewById(R.id.textJSON);
    }

    public void loadJSON(View v){
        Album album = Util.convertJSONtoAlbum(Util.rawToJson(getResources().openRawResource(R.raw.teste)));
        textJSON.setText(album.toString());
    }

    public void novaTela(View v){
        Intent intent = new Intent(MainActivity.this,JSONActivity.class);
        startActivity(intent);
    }
}
