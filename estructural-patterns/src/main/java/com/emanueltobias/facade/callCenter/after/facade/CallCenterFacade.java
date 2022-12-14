package com.emanueltobias.facade.callCenter.after.facade;

import java.util.List;

import com.emanueltobias.facade.callCenter.after.model.Card;
import com.emanueltobias.facade.callCenter.after.model.Register;
import com.emanueltobias.facade.callCenter.after.services.CardService;
import com.emanueltobias.facade.callCenter.after.services.PaymentService;
import com.emanueltobias.facade.callCenter.after.services.RegisterService;
import com.emanueltobias.facade.callCenter.after.services.ReportService;
import com.emanueltobias.facade.callCenter.after.services.SecurityService;

public class CallCenterFacade {
	CardService cardService;
	RegisterService registerService;
	ReportService reportService;
	PaymentService paymentService;
	SecurityService securityService;
	
	public CallCenterFacade() {
		cardService = new CardService();
		registerService = new RegisterService();
		reportService = new ReportService(registerService);
		paymentService = new PaymentService(registerService);
		securityService = new SecurityService(cardService, registerService);
	}
	
	public Card getCardByUser(Long l) {
		return cardService.getCardByUser(l);
	}
	
	public void getSumary(Card card) {
		reportService.getSumary(card);
	}
	
	public void getPaymentInfoByCard(Card card) {
		paymentService.getPaymentInfoByCard(card);
	}
	
	public void cancelLastRegister(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		registerService.removeByIndex(card, registers.size() - 1);
		List<Register> pendingRegisters = securityService.blockCard(card);
		Card newCard = cardService.createNewCard(123456L, 33445566L);
		registerService.addCardRegisters(newCard, pendingRegisters);
		reportService.getSumary(newCard);
	}
}
