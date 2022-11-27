package com.emanueltobias.mediator.translate.mediator;

import com.emanueltobias.mediator.translate.model.User;
import com.emanueltobias.mediator.translate.services.Translator;

public class TranslatorMediator extends Mediator {

	private Translator translator = new Translator();

	protected String getMessage(String message, User to, User from) {
		return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
	}
}
