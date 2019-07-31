(ns org.nd4j.linalg.memory.MemcpyDirection
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.memory MemcpyDirection]))

(def HOST_TO_DEVICE
  "Enum Constant.

  type: org.nd4j.linalg.memory.MemcpyDirection"
  MemcpyDirection/HOST_TO_DEVICE)

(def DEVICE_TO_DEVICE
  "Enum Constant.

  type: org.nd4j.linalg.memory.MemcpyDirection"
  MemcpyDirection/DEVICE_TO_DEVICE)

(def DEVICE_TO_HOST
  "Enum Constant.

  type: org.nd4j.linalg.memory.MemcpyDirection"
  MemcpyDirection/DEVICE_TO_HOST)

(def HOST_TO_HOST
  "Enum Constant.

  type: org.nd4j.linalg.memory.MemcpyDirection"
  MemcpyDirection/HOST_TO_HOST)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (MemcpyDirection c : MemcpyDirection.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.memory.MemcpyDirection[]`"
  ([]
    (MemcpyDirection/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.memory.MemcpyDirection`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.memory.MemcpyDirection [^java.lang.String name]
    (MemcpyDirection/valueOf name)))

