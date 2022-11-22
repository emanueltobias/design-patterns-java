package com.emanueltobias.abstractfactory.apple.factory.abstractFactory;

import com.emanueltobias.abstractfactory.apple.model.certificate.BrazilianCertificate;
import com.emanueltobias.abstractfactory.apple.model.certificate.Certificate;
import com.emanueltobias.abstractfactory.apple.model.packing.BrazilianPacking;
import com.emanueltobias.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
