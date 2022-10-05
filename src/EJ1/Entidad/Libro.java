/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.poo;

/**
 *
 * @author pikos
 */
public class Libro {

    public int libro;
    public int ISBN;
    public String título;
    public String autor;

        public Libro() {
    }

    public Libro(int libro, int ISBN, String título, String autor) {
        this.libro = libro;
        this.ISBN = ISBN;
        this.título = título;
        this.autor = autor;
    }

    public int getLibro() {
        return libro;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public void setLibro(int libro) {
        this.libro = libro;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "EJ1{" + "libro=" + libro + ", ISBN=" + ISBN + ", t\u00edtulo=" + título + ", autor=" + autor + '}';
    }

    public void setautor(String next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTitulo(String next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNumerodepaginas(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
