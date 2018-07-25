package org.xtext.example.mydsl.validation;

import org.eclipse.emf.ecore.EStructuralFeature;

public class Exception {
	
	String erro;
	EStructuralFeature feature;
	
	public Exception(String erro, EStructuralFeature feature){
		this.erro = erro;
		this.feature = feature;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public EStructuralFeature getFeature() {
		return feature;
	}

	public void setFeature(EStructuralFeature feature) {
		this.feature = feature;
	}
	
	

}
