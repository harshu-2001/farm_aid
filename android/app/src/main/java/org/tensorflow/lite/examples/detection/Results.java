package org.tensorflow.lite.examples.detection;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.webkit.WebView;




public class Results extends AppCompatActivity {
    public String value;
    WebView web;
//    private StorageReference mStorageRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        web=findViewById(R.id.webo);
//        mStorageRef = FirebaseStorage.getInstance().getReference();
        Bundle extras=getIntent().getExtras();
        if (extras != null) {
            value = extras.getString("kyu");
        }

//        Uri file = Uri.fromFile(new File("path/to/images/rivers.jpg"));
//        StorageReference storageRef = null;
//        StorageReference riversRef = storageRef.child(value+"/"+img);
//
//        riversRef.putFile(file)
//                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
//                    @Override
//                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
//                        // Get a URL to the uploaded content
//                        Uri downloadUrl = taskSnapshot.getDownloadUrl();
//                    }
//                })
//                .addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception exception) {
//                        // Handle unsuccessful uploads
//                        // ...
//                    }
//                });
//        System.out.println("helloooooooooooooo"+value);
//        String query=value; // Get the text from EditText here
        String url = "https://www.google.com/search?q="+value+" pest cure methods ";
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl(url);
        System.out.print(value);
    }


}