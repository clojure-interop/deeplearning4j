(ns org.deeplearning4j.api.storage.StorageType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.api.storage StorageType]))

(def MetaData
  "Enum Constant.

  type: org.deeplearning4j.api.storage.StorageType"
  StorageType/MetaData)

(def StaticInfo
  "Enum Constant.

  type: org.deeplearning4j.api.storage.StorageType"
  StorageType/StaticInfo)

(def Update
  "Enum Constant.

  type: org.deeplearning4j.api.storage.StorageType"
  StorageType/Update)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (StorageType c : StorageType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.api.storage.StorageType[]`"
  ([]
    (StorageType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.api.storage.StorageType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.api.storage.StorageType [^java.lang.String name]
    (StorageType/valueOf name)))

