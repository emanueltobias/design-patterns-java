package com.emanueltobias.abstractfactory.apple.factory.abstractFactory;

import com.emanueltobias.abstractfactory.apple.model.certificate.Certificate;
import com.emanueltobias.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
