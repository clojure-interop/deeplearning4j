(ns org.datavec.api.transform.Distance
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform Distance]))

(def COSINE
  "Enum Constant.

  type: org.datavec.api.transform.Distance"
  Distance/COSINE)

(def EUCLIDEAN
  "Enum Constant.

  type: org.datavec.api.transform.Distance"
  Distance/EUCLIDEAN)

(def MANHATTAN
  "Enum Constant.

  type: org.datavec.api.transform.Distance"
  Distance/MANHATTAN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Distance c : Distance.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.transform.Distance[]`"
  ([]
    (Distance/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.transform.Distance`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.transform.Distance [^java.lang.String name]
    (Distance/valueOf name)))

