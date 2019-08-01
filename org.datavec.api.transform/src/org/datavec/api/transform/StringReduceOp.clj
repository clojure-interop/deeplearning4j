(ns org.datavec.api.transform.StringReduceOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform StringReduceOp]))

(def PREPEND
  "Enum Constant.

  type: org.datavec.api.transform.StringReduceOp"
  StringReduceOp/PREPEND)

(def APPEND
  "Enum Constant.

  type: org.datavec.api.transform.StringReduceOp"
  StringReduceOp/APPEND)

(def MERGE
  "Enum Constant.

  type: org.datavec.api.transform.StringReduceOp"
  StringReduceOp/MERGE)

(def REPLACE
  "Enum Constant.

  type: org.datavec.api.transform.StringReduceOp"
  StringReduceOp/REPLACE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (StringReduceOp c : StringReduceOp.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.datavec.api.transform.StringReduceOp[]`"
  ([]
    (StringReduceOp/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.datavec.api.transform.StringReduceOp`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.datavec.api.transform.StringReduceOp [^java.lang.String name]
    (StringReduceOp/valueOf name)))

