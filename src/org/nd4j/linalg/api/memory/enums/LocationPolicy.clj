(ns org.nd4j.linalg.api.memory.enums.LocationPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.memory.enums LocationPolicy]))

(def RAM
  "Enum Constant.

  Allocations will be in RAM

  type: org.nd4j.linalg.api.memory.enums.LocationPolicy"
  LocationPolicy/RAM)

(def MMAP
  "Enum Constant.

  Allocations will be in memory-mapped file

  type: org.nd4j.linalg.api.memory.enums.LocationPolicy"
  LocationPolicy/MMAP)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (LocationPolicy c : LocationPolicy.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.api.memory.enums.LocationPolicy[]`"
  ([]
    (LocationPolicy/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.api.memory.enums.LocationPolicy`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.api.memory.enums.LocationPolicy [^java.lang.String name]
    (LocationPolicy/valueOf name)))

