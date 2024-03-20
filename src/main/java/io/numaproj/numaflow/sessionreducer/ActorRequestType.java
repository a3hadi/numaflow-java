package io.numaproj.numaflow.sessionreducer;

/**
 * ActorRequestType represents the purpose of an ActorRequest.
 */
public enum ActorRequestType {
    // open a brand-new session window
    OPEN,
    // append a message to an existing session window
    APPEND,
    // close a session window
    CLOSE,
    // expand a session window
    EXPAND,
    // ask a to-be-merged session window for it's accumulator
    GET_ACCUMULATOR,
}
