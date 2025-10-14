package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.photopass.services.dto.AssociationResponseDTO;
import com.disney.wdpro.photopass.services.model.MediaLink;
import java.io.Serializable;

/* loaded from: classes15.dex */
public class Association implements Serializable {
    private int mediaCount;
    private MediaLink mediaLink;

    public static class Builder {
        private int mediaCount;
        private MediaLink mediaLink;

        public Builder(AssociationResponseDTO associationResponseDTO) {
            this.mediaCount = associationResponseDTO.mediaCount;
            if (associationResponseDTO.getMediaLinkDTO() != null) {
                this.mediaLink = parseMediaLink(associationResponseDTO.getMediaLinkDTO());
            }
        }

        private MediaLink parseMediaLink(AssociationResponseDTO.MediaLinkDTO mediaLinkDTO) {
            return new MediaLink.Builder(mediaLinkDTO).build();
        }

        public Association build() {
            return new Association(this);
        }
    }

    public Association(Builder builder) {
        this.mediaCount = builder.mediaCount;
        this.mediaLink = builder.mediaLink;
    }

    public int getMediaCount() {
        return this.mediaCount;
    }

    public MediaLink getMediaLink() {
        return this.mediaLink;
    }
}