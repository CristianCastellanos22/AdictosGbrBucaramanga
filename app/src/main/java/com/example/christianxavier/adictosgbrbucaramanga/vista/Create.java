package com.example.christianxavier.adictosgbrbucaramanga.vista;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.christianxavier.adictosgbrbucaramanga.R;
import com.example.christianxavier.adictosgbrbucaramanga.modelo.Piloto;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class Create extends AppCompatActivity {

    DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Bucaramanga");


    String estado1,savePicture;
    String cod,nomP,apellP,rh,celuP,ingre,cump,apo,ocupa,moti,moto,model,placa,nombCont,celCont;
    TextInputEditText edtCod,edtName,edtLast,edtrh,edtApo,edtCel,edtCump,edtIngre,edtOcup,edtMoto,edtModel,edtPla,
    edtNameCont,edtCelCont;
    Spinner estado;
    Button button,btncrear;
    ImageView imageView;
    private final static int GALLERT_INTENT = 1;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        estado = (Spinner)findViewById(R.id.cmbEstado);
        imageView = (ImageView)findViewById(R.id.imgPerfil);
        button = (Button)findViewById(R.id.btnImgePro);
        dialog = new ProgressDialog(this);
        btncrear = (Button)findViewById(R.id.crearPilot);

        edtCod = (TextInputEditText)findViewById(R.id.edtcod);
        edtName = (TextInputEditText)findViewById(R.id.name);
        edtLast = (TextInputEditText)findViewById(R.id.lastName);
        edtrh = (TextInputEditText)findViewById(R.id.rh);
        edtApo = (TextInputEditText)findViewById(R.id.apodo);
        edtCel = (TextInputEditText)findViewById(R.id.celular);
        edtCump = (TextInputEditText)findViewById(R.id.cumple);
        edtIngre = (TextInputEditText)findViewById(R.id.ingreso);
        edtOcup = (TextInputEditText)findViewById(R.id.ocupacion);
        edtMoto = (TextInputEditText)findViewById(R.id.moto);
        edtModel = (TextInputEditText)findViewById(R.id.modelo);
        edtPla = (TextInputEditText)findViewById(R.id.placa);
        edtNameCont = (TextInputEditText)findViewById(R.id.nameCon);
        edtCelCont = (TextInputEditText)findViewById(R.id.telContac);

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this,R.array.estado,android.R.layout.simple_spinner_item);

        estado.setAdapter(adapter);

        estado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                estado1=parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                estado1=("Activo");
            }
        });

        //button.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        Intent intent = new Intent(Intent.ACTION_PICK);
        //        intent.setType("image/*");
        //        startActivityForResult(intent, GALLERT_INTENT);
        //    }
        //});

        btncrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cod=edtCod.getText().toString(); nomP=edtName.getText().toString(); apellP=edtLast.getText().toString();
                rh=edtrh.getText().toString(); celuP=edtCel.getText().toString(); ingre=edtIngre.getText().toString();
                cump=edtCump.getText().toString(); apo=edtApo.getText().toString(); ocupa=edtOcup.getText().toString();
                moti=""; moto=edtMoto.getText().toString(); model=edtModel.getText().toString(); placa=edtPla.getText().toString();
                nombCont=edtNameCont.getText().toString(); celCont=edtCelCont.getText().toString();

                Piloto piloto = new Piloto(savePicture,estado1,cod,nomP,apellP,rh,celuP,ingre,cump,apo,ocupa,moti,moto,model,placa,nombCont,celCont);
                reference.child("Agbr").push().setValue(piloto);

                edtCod.setText(""); edtName.setText(""); edtLast.setText(""); edtrh.setText(""); edtCel.setText(""); edtIngre.setText("");
                edtCump.setText(""); edtApo.setText(""); edtOcup.setText(""); edtMoto.setText(""); edtModel.setText(""); edtPla.setText("");
                edtNameCont.setText(""); edtCelCont.setText(""); imageView.setImageDrawable(null);
            }
        });
    }

    //@Override
    //protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    //    super.onActivityResult(requestCode, resultCode, data);

    //    if (requestCode == GALLERT_INTENT && resultCode == RESULT_OK){
    //        dialog.setTitle("Subiendo...");
    //        dialog.setMessage("Subiendo foto");
    //        dialog.setCancelable(false);
    //        dialog.show();

    //        StorageReference storageReference = FirebaseStorage.getInstance().getReference();
    //        Uri uri = data.getData();
    //        StorageReference file = storageReference.child("Agbr_Bucaramanga").child(uri.getLastPathSegment());
    //        file.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
    //            @Override
    //            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
    //                dialog.dismiss();
    //                Uri descarga = taskSnapshot.getDownloadUrl();
    //                //Uri downloadUrl = taskSnapshot.getDownloadUrl();
    //                savePicture=descarga.toString();
     //               Glide.with(Create.this).load(descarga).into(imageView);
    //                Toast.makeText(Create.this, "Imagen Cargada Con Éxito", Toast.LENGTH_LONG).show();
    //            }
    //        });
    //    }else{
    //        Toast.makeText(Create.this,"Error",Toast.LENGTH_LONG).show();
    //    }
    //}
}
