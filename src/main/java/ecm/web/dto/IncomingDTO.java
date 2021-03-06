package ecm.web.dto;

import ecm.model.Incoming;

import java.time.LocalDate;

/**
 * ДТО {@link Incoming}
 * @author dkarachurin
 */
public class IncomingDTO extends AbstractDocumentDTO {
    private Integer senderId;
    private String senderName;
    private Integer recipientId;
    private String recipientName;
    private String referenceNumber;
    private LocalDate outboundRegDate;
    private String type = "incoming";

    public IncomingDTO() {
    }


    public IncomingDTO(Incoming incoming) {
        super(incoming);
        this.senderId = incoming.getSender().getId();
        this.senderName = incoming.getSender().toString();
        this.recipientId = incoming.getRecipient().getId();
        this.recipientName = incoming.getRecipient().toString();
        this.referenceNumber = incoming.getReferenceNumber();
        this.outboundRegDate = incoming.getOutboundRegDate();
        this.setFullname(incoming.toString());
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public LocalDate getOutboundRegDate() {
        return outboundRegDate;
    }

    public void setOutboundRegDate(LocalDate outboundRegDate) {
        this.outboundRegDate = outboundRegDate;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
