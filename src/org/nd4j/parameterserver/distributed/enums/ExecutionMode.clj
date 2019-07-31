(ns org.nd4j.parameterserver.distributed.enums.ExecutionMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.enums ExecutionMode]))

(def SHARDED
  "Enum Constant.

  This option assumes data (parameters) are split over multiple hosts

  type: org.nd4j.parameterserver.distributed.enums.ExecutionMode"
  ExecutionMode/SHARDED)

(def AVERAGING
  "Enum Constant.

  This option assumes data stored on multiple shards at the same time

  type: org.nd4j.parameterserver.distributed.enums.ExecutionMode"
  ExecutionMode/AVERAGING)

(def MANAGED
  "Enum Constant.

  This option means data storage is controlled by application, and out of VoidParameterServer control

  type: org.nd4j.parameterserver.distributed.enums.ExecutionMode"
  ExecutionMode/MANAGED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ExecutionMode c : ExecutionMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.parameterserver.distributed.enums.ExecutionMode[]`"
  ([]
    (ExecutionMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.parameterserver.distributed.enums.ExecutionMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.parameterserver.distributed.enums.ExecutionMode [^java.lang.String name]
    (ExecutionMode/valueOf name)))

