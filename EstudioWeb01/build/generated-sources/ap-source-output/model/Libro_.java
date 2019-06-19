package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Libro.class)
public abstract class Libro_ {

	public static volatile SingularAttribute<Libro, Integer> paginas;
	public static volatile SingularAttribute<Libro, String> titulo;
	public static volatile SingularAttribute<Libro, Integer> id;
	public static volatile SingularAttribute<Libro, String> autor;
	public static volatile SingularAttribute<Libro, Integer> anio;

}

