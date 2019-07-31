(ns org.datavec.api.writable.WritableType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.writable WritableType]))

(def Boolean
  "Enum Constant.

  type: org.datavec.api.writable.WritableType"
  WritableType/Boolean)

(def Byte
  "Enum Constant.

  type: org.datavec.api.writable.WritableType"
  WritableType/Byte)

(def Double
  "Enum Constant.

  type: org.datavec.api.writable.WritableType"
  WritableType/Double)

(def Float
  "Enum Constant.

  type: org.datavec.api.writable.WritableType"
  WritableType/Float)

(def Int
  "Enum Constant.

  type: org.datavec.api.writable.WritableType"
  WritableType/Int)

(def Long
  "Enum Constant.

  type: org.datavec.api.writable.WritableType"
  WritableType/Long)

(def Null
  "Enum Constant.

  type: org.datavec.api.writable.WritableType"
  WritableType/Null)

(def Text
  "Enum Constant.

  type: org.datavec.api.writable.WritableType"
  WritableType/Text)

(def NDArray
  "Enum Constant.

  type: org.datavec.api.writable.WritableType"
  WritableType/NDArray)

(def Image
  "Enum Constant.

  type: org.datavec.api.writable.WritableType"
  WritableType/Image)

(def Arrow
  "Enum Constant.

  type: org.datavec.api.writable.WritableType"
  WritableType/Arrow)

(def Bytes
  "Enum Constant.

  type: org.datavec.api.writable.WritableType"
  WritableType/Bytes)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (WritableType c : WritableType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.writable.WritableType[]`"
  ([]
    (WritableType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.writable.WritableType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.writable.WritableType [^java.lang.String name]
    (WritableType/valueOf name)))

(defn core-writable?
  "returns: True if Writable is defined in datavec-api, false otherwise - `boolean`"
  (^Boolean [^WritableType this]
    (-> this (.isCoreWritable))))

(defn type-idx
  "Return a unique type index for the given writable

  returns: Type index for the writable - `short`"
  (^Short [^WritableType this]
    (-> this (.typeIdx))))

(defn get-writable-class
  "Return the class of the implementation corresponding to each WritableType.
  Note that if isCoreWritable() returns false, null will be returned by this method.

  returns: Class for the given WritableType - `java.lang.Class<? extends org.datavec.api.writable.Writable>`"
  ([^WritableType this]
    (-> this (.getWritableClass))))

