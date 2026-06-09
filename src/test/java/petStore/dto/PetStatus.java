package petStore.dto;

public enum PetStatus {
    AVALIABLE("avaliable"),
    PENDING("pending"),
    SOLD("sold");
    private final String value;

    PetStatus(String value) {
        this.value = value;
    }

}
