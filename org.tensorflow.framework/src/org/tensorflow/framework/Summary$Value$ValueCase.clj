(ns org.tensorflow.framework.Summary$Value$ValueCase
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework Summary$Value$ValueCase]))

(def SIMPLE_VALUE
  "Enum Constant.

  type: org.tensorflow.framework.Summary$Value$ValueCase"
  Summary$Value$ValueCase/SIMPLE_VALUE)

(def OBSOLETE_OLD_STYLE_HISTOGRAM
  "Enum Constant.

  type: org.tensorflow.framework.Summary$Value$ValueCase"
  Summary$Value$ValueCase/OBSOLETE_OLD_STYLE_HISTOGRAM)

(def IMAGE
  "Enum Constant.

  type: org.tensorflow.framework.Summary$Value$ValueCase"
  Summary$Value$ValueCase/IMAGE)

(def HISTO
  "Enum Constant.

  type: org.tensorflow.framework.Summary$Value$ValueCase"
  Summary$Value$ValueCase/HISTO)

(def AUDIO
  "Enum Constant.

  type: org.tensorflow.framework.Summary$Value$ValueCase"
  Summary$Value$ValueCase/AUDIO)

(def TENSOR
  "Enum Constant.

  type: org.tensorflow.framework.Summary$Value$ValueCase"
  Summary$Value$ValueCase/TENSOR)

(def VALUE_NOT_SET
  "Enum Constant.

  type: org.tensorflow.framework.Summary$Value$ValueCase"
  Summary$Value$ValueCase/VALUE_NOT_SET)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Summary.Value.ValueCase c : Summary.Value.ValueCase.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.tensorflow.framework.Summary$Value$ValueCase[]`"
  ([]
    (Summary$Value$ValueCase/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.tensorflow.framework.Summary$Value$ValueCase`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.tensorflow.framework.Summary$Value$ValueCase [^java.lang.String name]
    (Summary$Value$ValueCase/valueOf name)))

(defn *for-number
  "value - `int`

  returns: `org.tensorflow.framework.Summary$Value$ValueCase`"
  (^org.tensorflow.framework.Summary$Value$ValueCase [^Integer value]
    (Summary$Value$ValueCase/forNumber value)))

(defn get-number
  "returns: `int`"
  (^Integer [^Summary$Value$ValueCase this]
    (-> this (.getNumber))))

