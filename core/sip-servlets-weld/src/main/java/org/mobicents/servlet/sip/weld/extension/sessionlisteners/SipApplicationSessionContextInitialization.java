package org.mobicents.servlet.sip.weld.extension.sessionlisteners;

import javax.enterprise.inject.Produces;
import javax.servlet.sip.SipApplicationSession;
import javax.servlet.sip.SipApplicationSessionEvent;
import javax.servlet.sip.SipApplicationSessionListener;
import javax.servlet.sip.annotation.SipListener;

import org.mobicents.servlet.sip.weld.extension.context.sip.SipApplicationSessionContext;
import org.mobicents.servlet.sip.weld.extension.context.sip.SipApplicationSessionContextImpl;
import org.mobicents.servlet.sip.weld.extension.context.sip.SipApplicationSessionScoped;

@SipListener
public class SipApplicationSessionContextInitialization implements SipApplicationSessionListener
{

	private static SipApplicationSessionContext sipApplicationSessionContext;
	private SipApplicationSession sipApplicationSession;
	
	public static SipApplicationSessionContext getSipApplicationSessionContext(){
		return sipApplicationSessionContext;
	}
	
	@Override
	public void sessionCreated(SipApplicationSessionEvent arg0) {
//		sipApplicationSessionContext = SipApplicationSessionContextImpl.getInstance();
//		sipApplicationSession = arg0.getApplicationSession();
	}

	@Override
	public void sessionDestroyed(SipApplicationSessionEvent arg0) {
//		sipApplicationSessionContext.destroy(arg0.getApplicationSession());
//		sipApplicationSession = null;
	}

	@Override
	public void sessionExpired(SipApplicationSessionEvent arg0) {
//		sipApplicationSessionContext.destroy(arg0.getApplicationSession());
	}

	@Override
	public void sessionReadyToInvalidate(SipApplicationSessionEvent arg0) {
//		sipApplicationSessionContext.invalidate();
	}
}