
package com.mycompany.crudfirebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Precondition;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    
    public static boolean eliminar(String coleccion, String documento){
        
        bd = FirestoreClient.getFirestore();
        
        try{
            DocumentReference docRef = bd.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.delete(Precondition.NONE);
            System.out.println("Eliminado correctamente");
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
        } catch (InterruptedException | NumberFormatException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return -1;
        
    }
    
    public static void llenarTabla(JTable table){
        
        String alergia = "";
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cedula");
        model.addColumn("Nombre propietario");
        model.addColumn("Nombre mascota");
        model.addColumn("Raza");
        model.addColumn("Peso (Kg)");
        model.addColumn("Tamaño (m)");
        model.addColumn("Alergias");
        try{
            CollectionReference registro = Conexion.bd.collection("Veterinaria");
            ApiFuture<QuerySnapshot> querySnap = registro.get();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                alergia = document.getString("Alergias");
                if (alergia.equals("")) {
                    model.addRow(new Object[]{
                        document.getDouble("Cedula"),
                        document.getString("Nombre"),
                        document.getString("Nombre mascota"),
                        document.getString("Raza mascota"),
                        document.getDouble("Peso mascota"),
                        document.getDouble("Tamaño mascota"),
                        "No tiene alergias"
                    });
                } else {
                    model.addRow(new Object[]{
                        document.getDouble("Cedula"),
                        document.getString("Nombre"),
                        document.getString("Nombre mascota"),
                        document.getString("Raza mascota"),
                        document.getDouble("Peso mascota"),
                        document.getDouble("Tamaño mascota"),
                        document.getString("Alergias")
                    });
                }
            }
        }catch(InterruptedException | ExecutionException e){
            System.err.println("Error: "+e.getMessage());
        }
        table.setModel(model);
    }
    
    public static void tablaBuscada(JTable table, int id){
        String alergia = "";
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cedula");
        model.addColumn("Nombre propietario");
        model.addColumn("Nombre mascota");
        model.addColumn("Raza");
        model.addColumn("Peso (Kg)");
        model.addColumn("Tamaño (m)");
        model.addColumn("Alergias");
        try {
            CollectionReference registro = Conexion.bd.collection("Veterinaria");
            ApiFuture<QuerySnapshot> querySnap = registro.get();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                int i = Integer.parseInt(document.getId());
                if (i == id) {
                    alergia = document.getString("Alergias");
                    if (alergia.equals("")) {
                        model.addRow(new Object[]{
                            document.getDouble("Cedula"),
                            document.getString("Nombre"),
                            document.getString("Nombre mascota"),
                            document.getString("Raza mascota"),
                            document.getDouble("Peso mascota"),
                            document.getDouble("Tamaño mascota"),
                            "No tiene alergias"
                        });
                    } else {
                        model.addRow(new Object[]{
                            document.getDouble("Cedula"),
                            document.getString("Nombre"),
                            document.getString("Nombre mascota"),
                            document.getString("Raza mascota"),
                            document.getDouble("Peso mascota"),
                            document.getDouble("Tamaño mascota"),
                            document.getString("Alergias")
                        });
                    }
                }
            }
        } catch (InterruptedException | NumberFormatException | ExecutionException e) {
            System.err.println("Error: "+e.getMessage());
        }
        table.setModel(model);
    }

}
