package com.amafis.model;
public class PartRequest {
    private int requestId;
    private int partId;
    private int quantityRequested;
    private String status;
    private String requestedBy;
    public PartRequest(int requestId, int partId, int quantityRequested, String status, String requestedBy) {
        this.requestId = requestId;
        this.partId = partId;
        this.quantityRequested = quantityRequested;
        this.status = status;
        this.requestedBy = requestedBy;
    }
    public int getRequestId() {
        return requestId;
    }
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
    public int getPartId() {
        return partId;
    }
    public void setPartId(int partId) {
        this.partId = partId;
    }
    public int getQuantityRequested() {
        return quantityRequested;
    }
    public void setQuantityRequested(int quantityRequested) {
        this.quantityRequested = quantityRequested;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getRequestedBy() {
        return requestedBy;
    }
    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }
    @Override
    public String toString() {
        return "PartRequest{" +
                "requestId=" + requestId +
                ", partId=" + partId +
                ", quantityRequested=" + quantityRequested +
                ", status='" + status + '\'' +
                ", requestedBy='" + requestedBy + '\'' +
                '}';
    }
}
