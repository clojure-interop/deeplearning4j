(ns org.deeplearning4j.ui.stats.sbe.StatsType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe StatsType]))

(def Parameters
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.StatsType"
  StatsType/Parameters)

(def Gradients
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.StatsType"
  StatsType/Gradients)

(def Updates
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.StatsType"
  StatsType/Updates)

(def Activations
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.StatsType"
  StatsType/Activations)

(def NULL_VAL
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.StatsType"
  StatsType/NULL_VAL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (StatsType c : StatsType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.ui.stats.sbe.StatsType[]`"
  ([]
    (StatsType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.ui.stats.sbe.StatsType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.ui.stats.sbe.StatsType [^java.lang.String name]
    (StatsType/valueOf name)))

(defn *get
  "value - `short`

  returns: `org.deeplearning4j.ui.stats.sbe.StatsType`"
  (^org.deeplearning4j.ui.stats.sbe.StatsType [^Short value]
    (StatsType/get value)))

(defn value
  "returns: `short`"
  (^Short [^StatsType this]
    (-> this (.value))))

