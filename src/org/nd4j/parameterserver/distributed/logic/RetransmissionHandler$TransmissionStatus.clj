(ns org.nd4j.parameterserver.distributed.logic.RetransmissionHandler$TransmissionStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.logic RetransmissionHandler$TransmissionStatus]))

(def MESSAGE_SENT
  "Enum Constant.

  type: org.nd4j.parameterserver.distributed.logic.RetransmissionHandler$TransmissionStatus"
  RetransmissionHandler$TransmissionStatus/MESSAGE_SENT)

(def NOT_CONNECTED
  "Enum Constant.

  type: org.nd4j.parameterserver.distributed.logic.RetransmissionHandler$TransmissionStatus"
  RetransmissionHandler$TransmissionStatus/NOT_CONNECTED)

(def BACKPRESSURE
  "Enum Constant.

  type: org.nd4j.parameterserver.distributed.logic.RetransmissionHandler$TransmissionStatus"
  RetransmissionHandler$TransmissionStatus/BACKPRESSURE)

(def ADMIN_ACTION
  "Enum Constant.

  type: org.nd4j.parameterserver.distributed.logic.RetransmissionHandler$TransmissionStatus"
  RetransmissionHandler$TransmissionStatus/ADMIN_ACTION)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (RetransmissionHandler.TransmissionStatus c : RetransmissionHandler.TransmissionStatus.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.parameterserver.distributed.logic.RetransmissionHandler$TransmissionStatus[]`"
  ([]
    (RetransmissionHandler$TransmissionStatus/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.parameterserver.distributed.logic.RetransmissionHandler$TransmissionStatus`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.parameterserver.distributed.logic.RetransmissionHandler$TransmissionStatus [^java.lang.String name]
    (RetransmissionHandler$TransmissionStatus/valueOf name)))

