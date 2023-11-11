
package com.mycompany.crudfirebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.Map;

/**
 *
 * @author Daniel Murcia
 */
public class Controlador {
    
    CollectionReference reference;
    
    static Firestore db;
    
    public static boolean guardar(String coleccion, String documento,
            Map<String, Object> data){
        
        db = FirestoreClient.getFirestore();
        
        try{
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Guardado correctamente");
            return true;
        }catch(Exception e){
            System.err.println("Error "+e.getMessage());
        }
        return false;
    }
    
}
