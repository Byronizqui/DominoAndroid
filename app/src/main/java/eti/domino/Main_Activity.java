package eti.domino;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Totto on 17/5/2017.
 */

public class Main_Activity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void jugar(View view){
        Intent i = new Intent(this, DominoActivity.class);
        startActivity(i);
    }


    public void salir(View view){
        finish();
    }

}


