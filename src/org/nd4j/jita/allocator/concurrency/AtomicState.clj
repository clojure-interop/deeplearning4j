(ns org.nd4j.jita.allocator.concurrency.AtomicState
  "Thread-safe atomic Tick/Tack/Toe implementation.
 TODO: add more explanations here"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.concurrency AtomicState]))

(defn ->atomic-state
  "Constructor.

  initial-status - `org.nd4j.jita.allocator.enums.AccessState`"
  (^AtomicState [^org.nd4j.jita.allocator.enums.AccessState initial-status]
    (new AtomicState initial-status))
  (^AtomicState []
    (new AtomicState )))

(defn request-tack
  "This method requests to change state to Tack"
  ([^AtomicState this]
    (-> this (.requestTack))))

(defn get-tack-requests
  "This method returns number of current Tack sessions

  returns: `long`"
  (^Long [^AtomicState this]
    (-> this (.getTackRequests))))

(defn try-request-toe
  "This method requests to change state to Toe
  PLEASE NOTE: this method is non-blocking, if Toe request is impossible atm, it will return false.

  returns: TRUE, if Toe state entered, FALSE otherwise - `boolean`"
  (^Boolean [^AtomicState this]
    (-> this (.tryRequestToe))))

(defn request-toe
  "This method requests to change state to Toe
  PLEASE NOTE: this method is blocking, untill all Tick requests are brought down to Tack state;"
  ([^AtomicState this]
    (-> this (.requestToe))))

(defn request-tick
  "This method requests to change state to Tick.
  PLEASE NOTE: this method is blocking, if memory is in Toe state.
  PLEASE NOTE: if Tick can't be acquired within specified timeframe, exception will be thrown

  time - `long`
  time-unit - `java.util.concurrent.TimeUnit`"
  ([^AtomicState this ^Long time ^java.util.concurrent.TimeUnit time-unit]
    (-> this (.requestTick time time-unit)))
  ([^AtomicState this]
    (-> this (.requestTick))))

(defn get-tick-requests
  "This method returns number of current Tick sessions

  returns: `long`"
  (^Long [^AtomicState this]
    (-> this (.getTickRequests))))

(defn schedule-toe
  "This method schedules Toe state entry, but doesn't enters it."
  ([^AtomicState this]
    (-> this (.scheduleToe))))

(defn toe-available?
  "This method checks, if Toe state can be entered.

  returns: True if Toe is available, false otherwise - `boolean`"
  (^Boolean [^AtomicState this]
    (-> this (.isToeAvailable))))

(defn get-waiting-tick-requests
  "This methods

  returns: number of WAITING tick requests, if they are really WAITING. If state isn't Toe, return value will always be 0. - `long`"
  (^Long [^AtomicState this]
    (-> this (.getWaitingTickRequests))))

(defn get-current-state
  "This method returns the current memory state

  returns: `org.nd4j.jita.allocator.enums.AccessState`"
  (^org.nd4j.jita.allocator.enums.AccessState [^AtomicState this]
    (-> this (.getCurrentState))))

(defn release-toe
  "This method requests release Toe status back to Tack.
  PLEASE NOTE: only the thread originally entered Toe state is able to release it."
  ([^AtomicState this]
    (-> this (.releaseToe))))

(defn discard-scheduled-toe
  "This method discards scheduled Toe state entry, but doesn't exits currently entered Toe state, if that's the case."
  ([^AtomicState this]
    (-> this (.discardScheduledToe))))

