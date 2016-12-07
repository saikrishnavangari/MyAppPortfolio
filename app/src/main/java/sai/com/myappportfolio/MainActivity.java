package sai.com.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.Popular_Movies)
    Button Popular_Movies;
    @BindView(R.id.Stock_Hawk)
    Button Stock_Hawk;
    @BindView(R.id.Build_it_Bigger)
    Button Build_it_Bigger;
    @BindView(R.id.MYAM)
    Button MYAM;
    @BindView(R.id.Go_Ubiquitous)
    Button Go_Ubiquitous;
    @BindView(R.id.Capstone)
    Button Capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         ButterKnife.bind(this);
        Popular_Movies.setOnClickListener(this);
        Stock_Hawk.setOnClickListener(this);
        Build_it_Bigger.setOnClickListener(this);
        MYAM.setOnClickListener(this);
        Go_Ubiquitous.setOnClickListener(this);
        Capstone.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.Popular_Movies:
                displayMessage("Popular Movies");
                break;
            case R.id.Stock_Hawk:
                displayMessage("Stock Hawk");
                break;
            case R.id.Build_it_Bigger:
                displayMessage("Build it Bigger");
                break;
            case R.id.MYAM:
                displayMessage("Make your app material");
                break;
            case R.id.Go_Ubiquitous:
                displayMessage("Go Ubiquitous");
                break;
            case R.id.Capstone:
                displayMessage("Capstone");
                break;
            default:
                break;
        }
    }

    private void displayMessage(String message) {
        Toast.makeText(this,"this button will launch my "+message+" project",Toast.LENGTH_LONG).show();
    }
}
