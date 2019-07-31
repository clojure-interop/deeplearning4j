(ns org.nd4j.linalg.api.memory.enums.MirroringPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.memory.enums MirroringPolicy]))

(def FULL
  "Enum Constant.

  type: org.nd4j.linalg.api.memory.enums.MirroringPolicy"
  MirroringPolicy/FULL)

(def HOST_ONLY
  "Enum Constant.

  type: org.nd4j.linalg.api.memory.enums.MirroringPolicy"
  MirroringPolicy/HOST_ONLY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (MirroringPolicy c : MirroringPolicy.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.memory.enums.MirroringPolicy[]`"
  ([]
    (MirroringPolicy/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.memory.enums.MirroringPolicy`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.memory.enums.MirroringPolicy [^java.lang.String name]
    (MirroringPolicy/valueOf name)))

