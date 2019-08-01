(ns org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework TensorSliceProto$Extent$HasLengthCase]))

(def LENGTH
  "Enum Constant.

  type: org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase"
  TensorSliceProto$Extent$HasLengthCase/LENGTH)

(def HASLENGTH_NOT_SET
  "Enum Constant.

  type: org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase"
  TensorSliceProto$Extent$HasLengthCase/HASLENGTH_NOT_SET)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (TensorSliceProto.Extent.HasLengthCase c : TensorSliceProto.Extent.HasLengthCase.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase[]`"
  ([]
    (TensorSliceProto$Extent$HasLengthCase/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase [^java.lang.String name]
    (TensorSliceProto$Extent$HasLengthCase/valueOf name)))

(defn *for-number
  "value - `int`

  returns: `org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase`"
  (^org.tensorflow.framework.TensorSliceProto$Extent$HasLengthCase [^Integer value]
    (TensorSliceProto$Extent$HasLengthCase/forNumber value)))

(defn get-number
  "returns: `int`"
  (^Integer [^TensorSliceProto$Extent$HasLengthCase this]
    (-> this (.getNumber))))

