(ns org.datavec.api.transform.ColumnType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform ColumnType]))

(def String
  "Enum Constant.

  type: org.datavec.api.transform.ColumnType"
  ColumnType/String)

(def Integer
  "Enum Constant.

  type: org.datavec.api.transform.ColumnType"
  ColumnType/Integer)

(def Long
  "Enum Constant.

  type: org.datavec.api.transform.ColumnType"
  ColumnType/Long)

(def Double
  "Enum Constant.

  type: org.datavec.api.transform.ColumnType"
  ColumnType/Double)

(def Float
  "Enum Constant.

  type: org.datavec.api.transform.ColumnType"
  ColumnType/Float)

(def Categorical
  "Enum Constant.

  type: org.datavec.api.transform.ColumnType"
  ColumnType/Categorical)

(def Time
  "Enum Constant.

  type: org.datavec.api.transform.ColumnType"
  ColumnType/Time)

(def Bytes
  "Enum Constant.

  type: org.datavec.api.transform.ColumnType"
  ColumnType/Bytes)

(def Boolean
  "Enum Constant.

  type: org.datavec.api.transform.ColumnType"
  ColumnType/Boolean)

(def NDArray
  "Enum Constant.

  type: org.datavec.api.transform.ColumnType"
  ColumnType/NDArray)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ColumnType c : ColumnType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.transform.ColumnType[]`"
  ([]
    (ColumnType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.transform.ColumnType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.transform.ColumnType [^java.lang.String name]
    (ColumnType/valueOf name)))

(defn new-column-meta-data
  "column-name - `java.lang.String`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^ColumnType this ^java.lang.String column-name]
    (-> this (.newColumnMetaData column-name))))

(defn get-writable-type
  "returns: The type of writable for this column - `org.datavec.api.writable.WritableType`"
  (^org.datavec.api.writable.WritableType [^ColumnType this]
    (-> this (.getWritableType))))

