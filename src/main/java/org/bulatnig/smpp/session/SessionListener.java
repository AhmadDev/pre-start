package org.bulatnig.smpp.session;

import org.bulatnig.smpp.pdu.Pdu;

/**
 * Session incoming messages listener.
 *
 * @author Bulat Nigmatullin
 */
public interface SessionListener {

    /**
     * Process incoming PDU and return response if required.
     *
     * @param pdu   incoming PDU from SMSC
     * @return  response PDU, null allowed
     */
    Pdu received(Pdu pdu);

}