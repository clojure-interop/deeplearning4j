(ns org.deeplearning4j.nn.conf.memory.MemoryUseMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.memory MemoryUseMode]))

(def INFERENCE
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.memory.MemoryUseMode"
  MemoryUseMode/INFERENCE)

(def TRAINING
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.memory.MemoryUseMode"
  MemoryUseMode/TRAINING)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (MemoryUseMode c : MemoryUseMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.memory.MemoryUseMode[]`"
  ([]
    (MemoryUseMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.memory.MemoryUseMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.memory.MemoryUseMode [^java.lang.String name]
    (MemoryUseMode/valueOf name)))

