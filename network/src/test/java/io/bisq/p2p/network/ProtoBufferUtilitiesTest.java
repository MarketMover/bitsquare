package io.bisq.p2p.network;

import io.bisq.common.wire.proto.Messages;
import io.bisq.messages.trade.offer.payload.Offer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mike on 13/03/2017.
 */
public class ProtoBufferUtilitiesTest {

    @Test
    public void testEnum() {
        Messages.Offer.Direction direction = Messages.Offer.Direction.SELL;
        Messages.Offer.Direction direction2 = Messages.Offer.Direction.BUY;
        Offer.Direction realDirection = ProtoBufferUtilities.getDirection(direction);
        Offer.Direction realDirection2 = ProtoBufferUtilities.getDirection(direction2);
        assertEquals("SELL", realDirection.name());
        assertEquals("BUY", realDirection2.name());
    }
}