package cesedbr.iveralda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Iveralda extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iveralda);

        final TextView txt_peguei = (TextView) findViewById(R.id.txt_peguei);
        Button btn_peguei = (Button) findViewById(R.id.btn_peguei);

        btn_peguei.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {   int quantidade = Integer.parseInt(txt_peguei.getText().toString());
                quantidade++;
                txt_peguei.setText(String.valueOf(quantidade));

            }
        });


    }
}
