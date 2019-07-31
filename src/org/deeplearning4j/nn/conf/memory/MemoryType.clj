(ns org.deeplearning4j.nn.conf.memory.MemoryType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.memory MemoryType]))

(def PARAMETERS
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.memory.MemoryType"
  MemoryType/PARAMETERS)

(def PARAMATER_GRADIENTS
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.memory.MemoryType"
  MemoryType/PARAMATER_GRADIENTS)

(def ACTIVATIONS
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.memory.MemoryType"
  MemoryType/ACTIVATIONS)

(def ACTIVATION_GRADIENTS
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.memory.MemoryType"
  MemoryType/ACTIVATION_GRADIENTS)

(def UPDATER_STATE
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.memory.MemoryType"
  MemoryType/UPDATER_STATE)

(def WORKING_MEMORY_FIXED
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.memory.MemoryType"
  MemoryType/WORKING_MEMORY_FIXED)

(def WORKING_MEMORY_VARIABLE
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.memory.MemoryType"
  MemoryType/WORKING_MEMORY_VARIABLE)

(def CACHED_MEMORY_FIXED
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.memory.MemoryType"
  MemoryType/CACHED_MEMORY_FIXED)

(def CACHED_MEMORY_VARIABLE
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.memory.MemoryType"
  MemoryType/CACHED_MEMORY_VARIABLE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (MemoryType c : MemoryType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.memory.MemoryType[]`"
  ([]
    (MemoryType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.memory.MemoryType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.memory.MemoryType [^java.lang.String name]
    (MemoryType/valueOf name)))

(defn inference?
  "returns: True, if the memory type is used during inference. False if the memory type is used only during training. - `boolean`"
  (^Boolean [^MemoryType this]
    (-> this (.isInference))))

