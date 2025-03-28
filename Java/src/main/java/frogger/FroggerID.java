package frogger;

// Record class ашигласнаар өгөгдөл immutable болж, код ойлгомжтой болно.
public record FroggerID(String firstName,
                        String lastName,
                        String phoneNumber,
                        String zipCode,
                        String state,
                        String gender) {
}
