package clases;

import java.util.ArrayList;

public class Grupo {

	String nombre;
	ArrayList<Miembro> miembros;
	ArrayList<String> tareas;

	public Grupo(String nombre){
		this(
			nombre,
			new ArrayList<Miembro>(),
			new ArrayList<String>()
		);
	}

	public Grupo(String nombre, ArrayList<Miembro> miembros, ArrayList<String> tareas){
		this.nombre = nombre;
		this.miembros = miembros;
		this.tareas = tareas;
	}

	public String getNombre(){
		return this.nombre;
	}

	public void addMiembro(Miembro miembro){
	 	this.miembros.add(miembro);
	}

	public Miembro getMiembro(int index){
		return this.miembros.get(index);
	}

	public void removeMiembro(Miembro miembro){
		this.miembros.remove(miembro);
	}

	public void addTarea(String tarea){
		this.tareas.add(tarea);
	}

	public void removeTarea(String tarea){
		this.tareas.remove(tarea);
	}

	@Override
	public String toString(){
		return this.nombre + ": "+ this.miembros.size() + " miembros";
	}
}