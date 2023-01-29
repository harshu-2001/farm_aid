package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;


public class MainActivity extends AppCompatActivity {

    public static final float MINIMUM_CONFIDENCE_TF_OD_API = 0.5f;
    private StorageReference mStorageRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStorageRef = FirebaseStorage.getInstance().getReference();
        Button cameraButton = findViewById(R.id.cameraButton);

        cameraButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, DetectorActivity.class)));




    }



}
