package Tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tinhtongintent.R;

public class Tuan4MainActivity extends AppCompatActivity {

    Button t4button;
    TextView tuan4tv;

    Context contex = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan4_main2);

        Tuan4VolleyFn volleyFn=new Tuan4VolleyFn();
        tuan4tv=findViewById(R.id.tuan41tv);
        t4button=findViewById(R.id.tuan4button);
        t4button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFn.GetJsonArray(contex, tuan4tv);
            }
        });
    }
}