package io.bitsquare.p2p.peers.keepalive.messages;

import io.bitsquare.app.Version;

public final class Pong extends KeepAliveMessage {
    // That object is sent over the wire, so we need to take care of version compatibility.
    private static final long serialVersionUID = Version.P2P_NETWORK_VERSION;

    public final int requestNonce;

    public Pong(int requestNonce) {
        this.requestNonce = requestNonce;
    }

    @Override
    public String toString() {
        return "Pong{" +
                "requestNonce=" + requestNonce +
                "} " + super.toString();
    }
}
