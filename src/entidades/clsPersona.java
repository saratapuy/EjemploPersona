/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;
/**
 *
 * @author Usuario
 */
public class clsPersona {
    private int _ID;
    private String _Nombres;
    private String _Apellidos;
    private String _Telefono;
    private String _Direccion;
    private String _Ciudad;
    private int _Edad;
    private double _Peso;
    private boolean _Sexo;
    private Date _FNacimiento;

    public clsPersona() {
    }

    public clsPersona(int _ID, String _Nombres, String _Apellidos, String _Telefono, String _Direccion, String _Ciudad, int _Edad, double _Peso, boolean _Sexo, Date _FNacimiento) {
        this._ID = _ID;
        this._Nombres = _Nombres;
        this._Apellidos = _Apellidos;
        this._Telefono = _Telefono;
        this._Direccion = _Direccion;
        this._Ciudad = _Ciudad;
        this._Edad = _Edad;
        this._Peso = _Peso;
        this._Sexo = _Sexo;
        this._FNacimiento = _FNacimiento;
    }

    public int ID() {
        return _ID;
    }

    public void ID(int ID) {
        this._ID = ID;
    }

    public String Nombres() {
        return _Nombres;
    }

    public void Nombres(String Nombres) {
        this._Nombres = Nombres;
    }

    public String Apellidos() {
        return _Apellidos;
    }

    public void Apellidos(String Apellidos) {
        this._Apellidos = Apellidos;
    }

    public String Telefono() {
        return _Telefono;
    }

    public void Telefono(String Telefono) {
        this._Telefono = Telefono;
    }

    public String Direccion() {
        return _Direccion;
    }

    public void Direccion(String Direccion) {
        this._Direccion = Direccion;
    }

    public String Ciudad() {
        return _Ciudad;
    }

    public void Ciudad(String Ciudad) {
        this._Ciudad = Ciudad;
    }

    public int Edad() {
        return _Edad;
    }

    public void Edad(int Edad) {
        this._Edad = Edad;
    }

    public double Peso() {
        return _Peso;
    }

    public void Peso(double Peso) {
        this._Peso = Peso;
    }

    public boolean isSexo() {
        return _Sexo;
    }

    public void Sexo(boolean Sexo) {
        this._Sexo = Sexo;
    }

    public Date FNacimiento() {
        return _FNacimiento;
    }

    public void FNacimiento(Date FNacimiento) {
        this._FNacimiento = FNacimiento;
    }

}