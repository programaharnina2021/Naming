package filtros;

import java.util.Objects;

public class Movil {

	private int ram;
	private int precio;
	private boolean nfc;
	private String modelo;
	private float otro;
	private Marca marca;

	public Movil(int ram, int precio, boolean nfc, String modelo,Marca marca, float otro ) {
		super();
		this.ram = ram;
		this.precio = precio;
		this.nfc = nfc;
		this.modelo = modelo;
		this.otro = otro;
		this.marca = marca;
	}

	public float getOtro() {
		return otro;
	}

	public void setOtro(float otro) {
		this.otro = otro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movil other = (Movil) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo);
	}

	@Override
	public String toString() {
		return "Movil [ram=" + ram + ", precio=" + precio + ", nfc=" + nfc + ", modelo=" + modelo + ", marca=" + marca
				+ "]";
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isNfc() {
		return nfc;
	}

	public void setNfc(boolean nfc) {
		this.nfc = nfc;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
