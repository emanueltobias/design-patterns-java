package com.emanueltobias.abstractfactory.apple.factory.abstractFactory;

import com.emanueltobias.abstractfactory.apple.model.certificate.Certificate;
import com.emanueltobias.abstractfactory.apple.model.certificate.USCertificate;
import com.emanueltobias.abstractfactory.apple.model.packing.Packing;
import com.emanueltobias.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
