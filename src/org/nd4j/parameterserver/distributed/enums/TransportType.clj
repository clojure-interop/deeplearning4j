(ns org.nd4j.parameterserver.distributed.enums.TransportType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.enums TransportType]))

(def ROUTED
  "Enum Constant.

  This is default Transport implementation, suitable for network environments without UDP Broadcast support

  type: org.nd4j.parameterserver.distributed.enums.TransportType"
  TransportType/ROUTED)

(def BROADCAST
  "Enum Constant.

  This implementation is suitable for network environments that DO support UDP Broadcast support.
  PLEASE NOTE: AWS/Azure instances do NOT support UDP Broadcast out of box

  type: org.nd4j.parameterserver.distributed.enums.TransportType"
  TransportType/BROADCAST)

(def CUSTOM
  "Enum Constant.

  This option means you'll provide own Transport interface implementation via VoidParameterServer.init() method

  type: org.nd4j.parameterserver.distributed.enums.TransportType"
  TransportType/CUSTOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (TransportType c : TransportType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.parameterserver.distributed.enums.TransportType[]`"
  ([]
    (TransportType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.parameterserver.distributed.enums.TransportType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.parameterserver.distributed.enums.TransportType [^java.lang.String name]
    (TransportType/valueOf name)))

