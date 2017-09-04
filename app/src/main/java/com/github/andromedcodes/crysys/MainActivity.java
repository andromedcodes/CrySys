package com.github.andromedcodes.crysys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.andromedcodes.crysys.engine.CrySys;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        String cypher = CrySys.getInstance().XOREncrypter.encrypt("Mohammed");
        tv.setText("\nOriginal Text : " + CrySys.getInstance().XOREncrypter.decrypt(cypher) + "\nEncrypted Text : " + cypher);
    }
}
