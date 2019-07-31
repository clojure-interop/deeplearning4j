(ns org.deeplearning4j.ui.stats.sbe.StatSource
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe StatSource]))

(def Parameters
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.StatSource"
  StatSource/Parameters)

(def Updates
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.StatSource"
  StatSource/Updates)

(def Activations
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.StatSource"
  StatSource/Activations)

(def NULL_VAL
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.StatSource"
  StatSource/NULL_VAL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (StatSource c : StatSource.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.ui.stats.sbe.StatSource[]`"
  ([]
    (StatSource/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.ui.stats.sbe.StatSource`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.ui.stats.sbe.StatSource [^java.lang.String name]
    (StatSource/valueOf name)))

(defn *get
  "value - `short`

  returns: `org.deeplearning4j.ui.stats.sbe.StatSource`"
  (^org.deeplearning4j.ui.stats.sbe.StatSource [^Short value]
    (StatSource/get value)))

(defn value
  "returns: `short`"
  (^Short [^StatSource this]
    (-> this (.value))))

