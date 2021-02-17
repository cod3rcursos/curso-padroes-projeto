package br.com.cod3r.mediator.translate.mediator;

import br.com.cod3r.mediator.translate.model.User;
import br.com.cod3r.mediator.translate.services.Translator;

public class TranslatorMediator extends Mediator {

	private Translator translator = new Translator();

	protected String getMessage(String message, User to, User from) {
		return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
	}
}
