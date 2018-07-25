package com.example.christianxavier.adictosgbrbucaramanga;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.christianxavier.adictosgbrbucaramanga.vista.Create;
import com.example.christianxavier.adictosgbrbucaramanga.vista.Info;
import com.example.christianxavier.adictosgbrbucaramanga.vista.ViewUser;
import com.facebook.Profile;
import com.facebook.login.LoginManager;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.nameWelc);
        button = (Button)findViewById(R.id.btCerrarsesion);
        imageButton = (ImageButton)findViewById(R.id.imageButton);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        //if (user != null){
            textView.setText(user.getDisplayName());
        //}else{
        //    startActivity(new Intent(MainActivity.this, LoginActivity.class));
        //}

        //facebook sdk
        //if (AccessToken.getCurrentAccessToken()==null){
        //    startActivity(new Intent(MainActivity.this, LoginActivity.class));
        //}else{
        //    Profile profile = Profile.getCurrentProfile();
        //    textView.setText(profile.getName());
        //}

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //firebase sdk logout
                FirebaseAuth.getInstance().signOut();
                //facebook sdk logout
                LoginManager.getInstance().logOut();
                finish();
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ViewUser.class));
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String nombre=getIntent().getStringExtra("nombre"),
                profile=getIntent().getStringExtra("profile"),
                        id=getIntent().getStringExtra("id");
        switch (item.getItemId()){
            case R.id.info:
                Intent intent = new Intent(MainActivity.this,Info.class);
                intent.putExtra("profile",profile);
                intent.putExtra("id",id);
                intent.putExtra("nombre",nombre);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
