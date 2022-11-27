package com.emanueltobias.mediator.translate.mediator;

import com.emanueltobias.mediator.translate.model.User;

public class ChatMediator extends Mediator {

	public String getMessage(String message, User to, User from) {
		return message;
	}
}
