package pe.edu.idat.boletsellerap;

import android.os.Parcel;
import android.os.Parcelable;

public class Evento implements Parcelable {

    private int id;
    private int imagen;
    private String concierto, fecha, lugar, precio;

    protected Evento(Parcel in) {
        id = in.readInt();
        imagen = in.readInt();
        concierto = in.readString();
        fecha = in.readString();
        lugar = in.readString();
        precio = in.readString();
    }

    public static final Creator<Evento> CREATOR = new Creator<Evento>() {
        @Override
        public Evento createFromParcel(Parcel in) {
            return new Evento(in);
        }

        @Override
        public Evento[] newArray(int size) {
            return new Evento[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getConcierto() {
        return concierto;
    }

    public void setConcierto(String concierto) {
        this.concierto = concierto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeInt(imagen);
        parcel.writeString(concierto);
        parcel.writeString(fecha);
        parcel.writeString(lugar);
        parcel.writeString(precio);
    }

    public Evento(int id, int imagen, String concierto, String fecha, String lugar, String precio) {
        this.id = id;
        this.imagen = imagen;
        this.concierto = concierto;
        this.fecha = fecha;
        this.lugar = lugar;
        this.precio = precio;
    }
}
