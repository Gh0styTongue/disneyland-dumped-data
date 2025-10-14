package com.disney.wdpro.photopass.services.model;

import com.disney.wdpro.photopass.services.dto.AssociationResponseDTO;
import java.io.Serializable;

/* loaded from: classes15.dex */
public class MediaLink implements Serializable {
    private boolean photoPassId;
    private String type;
    private String value;

    public static class Builder {
        private boolean photoPassId;
        private String type;
        private String value;

        public Builder(AssociationResponseDTO.MediaLinkDTO mediaLinkDTO) {
            this.type = mediaLinkDTO.getType();
            this.value = mediaLinkDTO.getValue();
            if (mediaLinkDTO.getPhotoPassId() != null) {
                this.photoPassId = mediaLinkDTO.getPhotoPassId().booleanValue();
            }
        }

        public MediaLink build() {
            return new MediaLink(this);
        }
    }

    public MediaLink(Builder builder) {
        this.type = builder.type;
        this.value = builder.value;
        this.photoPassId = builder.photoPassId;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isPhotoPassId() {
        return this.photoPassId;
    }
}