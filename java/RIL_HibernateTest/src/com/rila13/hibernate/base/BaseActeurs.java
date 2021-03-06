package com.rila13.hibernate.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an object that contains data related to the acteurs table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="acteurs"
 */
public abstract class BaseActeurs  implements Serializable {

	public static String PROP_NOM_ACTEUR = "NomActeur";
	public static String PROP_CODE_ACTEUR = "CodeActeur";
	public static String PROP_ANNEE_NAISSANCE_ACTEUR = "AnneeNaissanceActeur";
	public static String PROP_PRENOM_ACTEUR = "PrenomActeur";
	public static String PROP_IMAGE = "Image";
	public static String PROP_SEXE_ACTEUR = "SexeActeur";


	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer _codeActeur;

	// fields
	private java.lang.String _nomActeur;
	private java.lang.String _prenomActeur;
	private java.lang.String _image;
	private java.lang.Integer _anneeNaissanceActeur;
	private java.lang.Integer _sexeActeur;

	// collections
	private java.util.Set _joueSet;


	// constructors
	public BaseActeurs () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseActeurs (java.lang.Integer _codeActeur) {
		this.setCodeActeur(_codeActeur);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseActeurs (
		java.lang.Integer _codeActeur,
		java.lang.String _nomActeur,
		java.lang.String _prenomActeur,
		java.lang.String _image,
		java.lang.Integer _anneeNaissanceActeur,
		java.lang.Integer _sexeActeur) {

		this.setCodeActeur(_codeActeur);
		this.setNomActeur(_nomActeur);
		this.setPrenomActeur(_prenomActeur);
		this.setImage(_image);
		this.setAnneeNaissanceActeur(_anneeNaissanceActeur);
		this.setSexeActeur(_sexeActeur);
		initialize();
	}

	protected void initialize () {}



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="vm"
     *  column="codeActeur"
     */
	public java.lang.Integer getCodeActeur () {
		return _codeActeur;
	}

	/**
	 * Set the unique identifier of this class
	 * @param _codeActeur the new ID
	 */
	public void setCodeActeur (java.lang.Integer _codeActeur) {
		this._codeActeur = _codeActeur;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
	 * Return the value associated with the column: nomActeur
	 */
	public java.lang.String getNomActeur () {
		return _nomActeur;
	}

	/**
	 * Set the value related to the column: nomActeur
	 * @param _nomActeur the nomActeur value
	 */
	public void setNomActeur (java.lang.String _nomActeur) {
		this._nomActeur = _nomActeur;
	}


	/**
	 * Return the value associated with the column: prenomActeur
	 */
	public java.lang.String getPrenomActeur () {
		return _prenomActeur;
	}

	/**
	 * Set the value related to the column: prenomActeur
	 * @param _prenomActeur the prenomActeur value
	 */
	public void setPrenomActeur (java.lang.String _prenomActeur) {
		this._prenomActeur = _prenomActeur;
	}


	/**
	 * Return the value associated with the column: image
	 */
	public java.lang.String getImage () {
		return _image;
	}

	/**
	 * Set the value related to the column: image
	 * @param _image the image value
	 */
	public void setImage (java.lang.String _image) {
		this._image = _image;
	}


	/**
	 * Return the value associated with the column: anneeNaissanceActeur
	 */
	public java.lang.Integer getAnneeNaissanceActeur () {
		return _anneeNaissanceActeur;
	}

	/**
	 * Set the value related to the column: anneeNaissanceActeur
	 * @param _anneeNaissanceActeur the anneeNaissanceActeur value
	 */
	public void setAnneeNaissanceActeur (java.lang.Integer _anneeNaissanceActeur) {
		this._anneeNaissanceActeur = _anneeNaissanceActeur;
	}


	/**
	 * Return the value associated with the column: sexeActeur
	 */
	public java.lang.Integer getSexeActeur () {
		return _sexeActeur;
	}

	/**
	 * Set the value related to the column: sexeActeur
	 * @param _sexeActeur the sexeActeur value
	 */
	public void setSexeActeur (java.lang.Integer _sexeActeur) {
		this._sexeActeur = _sexeActeur;
	}


	/**
	 * Return the value associated with the column: JoueSet
	 */
	public java.util.Set getJoueSet () {
		return this._joueSet;
	}

	/**
	 * Set the value related to the column: JoueSet
	 * @param _joueSet the JoueSet value
	 */
	public void setJoueSet (java.util.Set _joueSet) {
		this._joueSet = _joueSet;
	}
	
	public void addToJoueSet (Object obj) {
		if (null == this._joueSet) this._joueSet = new java.util.HashSet();
		this._joueSet.add(obj);
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.rila13.hibernate.base.BaseActeurs)) return false;
		else {
			com.rila13.hibernate.base.BaseActeurs mObj = (com.rila13.hibernate.base.BaseActeurs) obj;
			if (null == this.getCodeActeur() || null == mObj.getCodeActeur()) return false;
			else return (this.getCodeActeur().equals(mObj.getCodeActeur()));
		}
	}


	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getCodeActeur()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getCodeActeur().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}