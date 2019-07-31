(ns org.nd4j.linalg.api.memory.enums.SpillPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.memory.enums SpillPolicy]))

(def EXTERNAL
  "Enum Constant.

  This policy means - use external allocation for spills.
  PLEASE NOTE: external allocations will be released after end of loop is reached.

  type: org.nd4j.linalg.api.memory.enums.SpillPolicy"
  SpillPolicy/EXTERNAL)

(def REALLOCATE
  "Enum Constant.

  This policy means - use external allocation for spills  reallocate at the end of loop.

  type: org.nd4j.linalg.api.memory.enums.SpillPolicy"
  SpillPolicy/REALLOCATE)

(def FAIL
  "Enum Constant.

  This policy means - no spills will be ever possible, exception will be thrown.
  PLEASE NOTE: basically useful for debugging.

  type: org.nd4j.linalg.api.memory.enums.SpillPolicy"
  SpillPolicy/FAIL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (SpillPolicy c : SpillPolicy.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.memory.enums.SpillPolicy[]`"
  ([]
    (SpillPolicy/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.memory.enums.SpillPolicy`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.memory.enums.SpillPolicy [^java.lang.String name]
    (SpillPolicy/valueOf name)))

