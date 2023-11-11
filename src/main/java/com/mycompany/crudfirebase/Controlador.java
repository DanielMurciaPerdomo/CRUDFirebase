
package com.mycompany.crudfirebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.Map;

/**
 *
 * @author Daniel Murcia
 */
public class Controlador {
    
    CollectionReference reference;
    
    static Firestore bd;
    
    public static boolean guardar(String coleccion, String documento,
            Map<String, Object> data){
        
        bd = FirestoreClient.getFirestore();
        
        try{
            DocumentReference docRef = bd.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Guardado correctamente");
            return true;
        }catch(Exception e){
            System.err.println("Error "+e.getMessage());
        }
        return false;
    }
    
    public static boolean actualizar(String coleccion, String documento,
            Map<String, Object> data){
        
        bd = FirestoreClient.getFirestore();
        
        try{
            DocumentReference docRef = bd.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.update(data);
            System.out.println("Actualizado correctamente");
            return true;
        }catch(Exception e){
            System.err.println("Error "+e.getMessage());
        }
        return false;
    }
    
    public static int buscarId(Double cedula, String mascota){
        double tempCedula = 0;
        String tempMascota = "";
        try {
            CollectionReference registro = Conexion.bd.collection("Veterinaria");
            ApiFuture<QuerySnapshot> querySnap = registro.get();
            
            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                tempCedula = document.getDouble("Cedula");
                tempMascota = document.getString("Nombre mascota");
                if (tempCedula == cedula && tempMascota.equals(mascota)) {
                    return Integer.parseInt(document.getId());
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return -1;
        
    }
    
}
