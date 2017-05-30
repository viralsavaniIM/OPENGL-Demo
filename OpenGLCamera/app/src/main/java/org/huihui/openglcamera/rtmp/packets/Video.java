package org.huihui.openglcamera.rtmp.packets;

import org.huihui.openglcamera.rtmp.io.SessionInfo;

/**
 * Video data packet
 *  
 * @author francois
 */
public class Video extends ContentData {

    public Video(ChunkHeader header) {
        super(header);
    }

    public Video() {
        super(new ChunkHeader(ChunkType.TYPE_0_FULL, SessionInfo.RTMP_VIDEO_CHANNEL, MessageType.VIDEO));
    }

    @Override
    public String toString() {
        return "RTMP Video";
    }
}