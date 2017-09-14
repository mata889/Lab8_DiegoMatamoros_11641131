
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class administrarHadas {

    ArrayList<hadas> listahadas = new ArrayList();
    File archivo = null;

    public administrarHadas() {
    }

    administrarHadas(String admincbm) {
        archivo = new File(admincbm);
    }

    public ArrayList<hadas> getListaHadas() {
        return listahadas;
    }

    public void setListaHadas(ArrayList<hadas> listaHadas) {
        this.listahadas = listaHadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setPersona(hadas p) {
        this.listahadas.add(p);
    }

    public void cargarArchivo() {
        try {
            listahadas = new ArrayList();
            hadas temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (hadas) objeto.readObject()) != null) {
                        listahadas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }//fin if
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (hadas t : listahadas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
