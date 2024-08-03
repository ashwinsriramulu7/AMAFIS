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
    public int getPartId() {
        return partId;
    }
    public int getQuantityRequested() {
        return quantityRequested;
    }
    public String getStatus() {
        return status;
    }
    public String getRequestedBy() {
        return requestedBy;
    }
    @Override
    public String toString() {
        return "Request ID: " + requestId + ", Part ID: " + partId + ", Quantity Requested: " + quantityRequested + ", Status: " + status + ", Requested By: " + requestedBy;
    }
}
