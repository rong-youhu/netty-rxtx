package de.uniluebeck.itm.nettyrxtx.rup;

import org.jboss.netty.channel.SimpleChannelDownstreamHandler;


public class RUPPacketFragmenter extends SimpleChannelDownstreamHandler {

	private int maximumFragmentSize;

	/**
	 * Constructs a new RUPPacketEncoder with a maximum fragment size (including 19 bytes packet headers) of
	 * {@code maximumFragmentSize}. The maximum fragment size is depending on the actual protocol stack that is used
	 * for the current application, therefore it cannot be statically defined but differs from application to
	 * application.
	 *
	 * @param maximumFragmentSize the maximum fragment size (including 19 bytes of packet headers)
	 */
	public RUPPacketFragmenter(int maximumFragmentSize) {
		this.maximumFragmentSize = maximumFragmentSize;
	}

}
