(ns org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Mode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.recurrent Bidirectional$Mode]))

(def ADD
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Mode"
  Bidirectional$Mode/ADD)

(def MUL
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Mode"
  Bidirectional$Mode/MUL)

(def AVERAGE
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Mode"
  Bidirectional$Mode/AVERAGE)

(def CONCAT
  "Enum Constant.

  type: org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Mode"
  Bidirectional$Mode/CONCAT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (Bidirectional.Mode c : Bidirectional.Mode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Mode[]`"
  ([]
    (Bidirectional$Mode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Mode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Mode [^java.lang.String name]
    (Bidirectional$Mode/valueOf name)))

