package busucsal.joaopedronunes.com.br.busucsal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Intent minhaintent;
    ListView lista1;
    ListView lista2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        minhaintent = new Intent(MainActivity.this, RoteiroActivity.class);

        //LISTA SEGUNDA A SEXTA
        lista1 = (ListView) findViewById(R.id.listVDiasUteis);
        final ArrayList<String> listaDiasUteis = dadosRecebidosDiasUteis();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaDiasUteis);
        lista1.setAdapter(arrayAdapter);
        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String rota = (listaDiasUteis.get(position)).toString();
                Character ultimaLeta = rota.charAt(rota.length()-1);

               if(ultimaLeta == '1'){
                    roteiro1();
                }else if(ultimaLeta == '2'){
                   roteiro2();
                }else if(ultimaLeta == '3'){
                   roteiro3();
                }else if (ultimaLeta == '4'){
                    roteiro4();
                }else if (ultimaLeta == '5'){
                    roteiro5();
                }

            }
        });

        //LISTA SABADO
        lista2 = (ListView) findViewById(R.id.listVSabado);
        final ArrayList<String> listaSabado = dadosRecebidosSabado();
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaSabado);
        lista2.setAdapter(arrayAdapter2);
        lista2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    roteiro1();
                }else if(position == 1){
                    roteiro2();
                }else if(position == 2){
                    roteiro4();
                }else if(position == 3){
                    roteiro2();
                }else if(position == 4){
                    roteiro4();
                }
            }
        });


    }


    private ArrayList<String> dadosRecebidosSabado() {
        ArrayList<String> array = new ArrayList<>();

        array.add("06h50 - Roteiro 1");
        array.add("08h25 - Roteiro 2");
        array.add("09h50 - Roteiro 4");
        array.add("11h30 - Roteiro 2");
        array.add("12h30 - Roteiro 4");

        return array;
    }

    private ArrayList<String> dadosRecebidosDiasUteis() {
        ArrayList<String> array = new ArrayList<>();

        array.add("06h30 - Roteiro 1");
        array.add("06h45 - Roteiro 1");
        array.add("07h00 - Roteiro 1");
        array.add("07h20 - Roteiro 1");
        array.add("07h40 - Roteiro 1");
        array.add("09h30 - Roteiro 2");
        array.add("10h00 - Roteiro 2");
        array.add("10h30 - Roteiro 5");
        array.add("11h15 - Roteiro 2");
        array.add("11h45 - Roteiro 2");
        array.add("12h15 - Roteiro 2");
        array.add("12h45 - Roteiro 5");
        array.add("13h30 - Roteiro 4");
        array.add("17h10 - Roteiro 1");
        array.add("18h20 - Roteiro 1");
        array.add("18h40 - Roteiro 1");
        array.add("20h30 - Roteiro 3");
        array.add("20h55 - Roteiro 3");
        array.add("21h20 - Roteiro 3");
        array.add("21h40 - Roteiro 5");
        array.add("20h55 - Roteiro 3");
        array.add("22h15 - Roteiro 4");

        return array;
    }


    public void roteiro1() {
        minhaintent.putExtra("roteiroNumero","Roteiro 1");
        minhaintent.putExtra("roteiros","Única Parada - Av. Paralela (sentido aeroporto) - Ponto do estádio de Pituaçu.");
        startActivity(minhaintent);
    }

    public void roteiro2() {
        minhaintent.putExtra("roteiroNumero", "Roteiro 2");
        minhaintent.putExtra("roteiros","1° Parada - Av. Pinto de Aguiar (sentido Paralela) - Atrás do primeiro ponto de ônibus;\n" +
                "2° Parada - Av. Pinto de Aguiar (sentido Paralela) - Ponto do Greenville;\n" +
                "3° Parada - Terminal Pituaçu - 1° andar, Plataforma E, 17.");
        startActivity(minhaintent);
}

    public void roteiro3() {
        minhaintent.putExtra("roteiroNumero", "Roteiro 3");
        minhaintent.putExtra("roteiros","1° Parada - Av. Pinto de Aguiar (sentido Paralela) - Ponto do Greenville;\n" +
                "2° Parada - Av. Pinto de Aguiar (sentido Paralela) - Atrás do primeiro ponto de ônibus;\n" +
                "3° Parada - Av. Paralela (sentido aeroporto) - Ponto Estádio Pituaçu.");
        startActivity(minhaintent);
    }

    public void roteiro4() {
        minhaintent.putExtra("roteiroNumero", "Roteiro 4");
        minhaintent.putExtra("roteiros","1° Parada - Av. Pinto de Aguiar (sentido Paralela) - Ponto do Greenville;\n" +
                "2° Parada - Av. Paralela (sentido centro) - Ponto Estádio Pituaçu.\n" +
                "3° Parada - Av. Paralela (sentido centro) - Ponto Extra paralela;\n" +
                "4° Parada - Av. Paralela (sentido aeroporto) - Ponto Extra paralela;\n" +
                "5° Parada - Avenida Luis Viana Filho (sentido aeroporto) - Ponto do estádio Pituaçu.");
        startActivity(minhaintent);
    }

    public void roteiro5() {
        minhaintent.putExtra("roteiroNumero", "Roteiro 5");
        minhaintent.putExtra("roteiros","1° Parada - Av. Pinto de Aguiar (sentido orla) - Ponto do Greenville;\n" +
                "2° Parada - Av. Pinto de Aguiar (sentido Paralela) - Atrás do primeiro ponto de ônibus;\n" +
                "3° Parada - Av. Paralela (sentido aeroporto) - Ponto Wall Street Empresarial;\n" +
                "4° Parada - Av. Paralela (sentido aeroporto) - Ponto Posto Menor Preço;\n" +
                "5° Parada - Av. Paralela (sentido centro) - Ponto em frente ao Colégio Villa;\n" +
                "6° Parada - Av. Paralela (sentido centro) - Ponto próximo a entrada do Flamboyant;\n" +
                "7° Parada - Av. Paralela (sentido centro) - Ponto em frente ao Condomínio Brisas;\n" +
                "8° Parada - Av. Paralela (sentido centro) - Ponto Estação de Metrô Pituaçu;\n" +
                "9° Parada - Av. Paralela (sentido centro) - Ponto Extra paralela;\n" +
                "10° Parada - Av. Paralela (sentido aeroporto) - Ponto Extra paralela;\n" +
                "11° Parada - Av. Paralela (sentido aeroporto) - Ponto Estádio Pituaçu.");
        startActivity(minhaintent);
    }

}
