package tatastrive.application.divisiblenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e;
    Button b;
    TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        t=findViewById( R.id.te );
        e= findViewById( R.id.editText );
        b= findViewById( R.id.button );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText( " " );
                int n=Integer.parseInt( String.valueOf( e.getText() ) );
                t.append( "Divisible by 3 :" );
                for(int i=1;i<n;i++){
                if(i%3==0)
                {
                    t.append( ""+i+"," );
                }
                }
                t.append(" Divisible by 5 :" );
            for( int i=1;i<n;i++){
                if(i%5==0)
                {
                    t.append( ""+i+", " );
                }
            }
             t.append( "Divisible by 3 & 5 :" );
            for(int i = 1; i<n; i++){
                if(i%3==0 && i%5==0)
                {
                    t.append( ""+i+", " );
                }
            }

            }
        } );
    }
        }
