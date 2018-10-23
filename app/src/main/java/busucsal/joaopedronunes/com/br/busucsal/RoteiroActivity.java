package busucsal.joaopedronunes.com.br.busucsal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

class RoteiroActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roteiros);
        TextView roteiroNumero = findViewById(R.id.roteiroNumero);
        TextView roteiros = findViewById(R.id.todosRoteiros);
        Intent intent = getIntent();
        roteiroNumero.setText(intent.getStringExtra("roteiroNumero"));
        roteiros.setText(intent.getStringExtra("roteiros"));
    }
}
