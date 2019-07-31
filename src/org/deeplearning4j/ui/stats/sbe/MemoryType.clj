(ns org.deeplearning4j.ui.stats.sbe.MemoryType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe MemoryType]))

(def JvmCurrent
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.MemoryType"
  MemoryType/JvmCurrent)

(def JvmMax
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.MemoryType"
  MemoryType/JvmMax)

(def OffHeapCurrent
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.MemoryType"
  MemoryType/OffHeapCurrent)

(def OffHeapMax
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.MemoryType"
  MemoryType/OffHeapMax)

(def DeviceCurrent
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.MemoryType"
  MemoryType/DeviceCurrent)

(def DeviceMax
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.MemoryType"
  MemoryType/DeviceMax)

(def NULL_VAL
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.MemoryType"
  MemoryType/NULL_VAL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (MemoryType c : MemoryType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.ui.stats.sbe.MemoryType[]`"
  ([]
    (MemoryType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.ui.stats.sbe.MemoryType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.ui.stats.sbe.MemoryType [^java.lang.String name]
    (MemoryType/valueOf name)))

(defn *get
  "value - `short`

  returns: `org.deeplearning4j.ui.stats.sbe.MemoryType`"
  (^org.deeplearning4j.ui.stats.sbe.MemoryType [^Short value]
    (MemoryType/get value)))

(defn value
  "returns: `short`"
  (^Short [^MemoryType this]
    (-> this (.value))))

