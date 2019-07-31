(ns org.datavec.spark.transform.TransformDataType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform TransformDataType]))

(def CSV
  "Enum Constant.

  type: org.datavec.spark.transform.TransformDataType"
  TransformDataType/CSV)

(def IMAGE
  "Enum Constant.

  type: org.datavec.spark.transform.TransformDataType"
  TransformDataType/IMAGE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (TransformDataType c : TransformDataType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.spark.transform.TransformDataType[]`"
  ([]
    (TransformDataType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.spark.transform.TransformDataType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.spark.transform.TransformDataType [^java.lang.String name]
    (TransformDataType/valueOf name)))

