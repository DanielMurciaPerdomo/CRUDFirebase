
package com.mycompany.crudfirebase;

import java.io.FileInputStream;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
/**
 *
 * @author Daniel Murcia
 */
public class Conexion {
    
    public static Firestore bd;
    
    public static void conectar(){
        try {
            FileInputStream refreshToken = new FileInputStream("src/veterinaria.json");

            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(refreshToken))
                    .build();

            FirebaseApp.initializeApp(options);
            bd = FirestoreClient.getFirestore();
            System.out.println("Se conecto con exito");
        } catch (IOException e) {
            System.err.print("Error "+e.getMessage());
        }
    }
}
