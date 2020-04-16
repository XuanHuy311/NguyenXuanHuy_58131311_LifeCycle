package vn.edu.ntu.nguyenxuanhuy_58131311_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import static vn.edu.ntu.nguyenxuanhuy_58131311_lifecycle.R.id.txtTG;

public class MainActivity extends AppCompatActivity {

    TextView txtTG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate called ");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat spF = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String date = spF.format(new Date());
        txtTG.setText(date);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("LifeCycle", "onStart called ");
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("LifeCycle", "onRestart called ");
        Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("LifeCycle", "OnResume called ");
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("LifeCycle", "onPause called ");
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("LifeCycle", "onStop called ");
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy called ");
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
    }

}
