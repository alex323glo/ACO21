package ua.artcode.model;

public enum OrderState {
    NEW,            // marked after order is created
    IN_PROGRESS,    // marked when order is taken by driver
    CANCELED,       // marked when order is canceled by client
    DONE            // marked when order is done (finished)
}
