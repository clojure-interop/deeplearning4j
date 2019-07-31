(ns org.deeplearning4j.ui.stats.sbe.SummaryType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe SummaryType]))

(def Mean
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.SummaryType"
  SummaryType/Mean)

(def Stdev
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.SummaryType"
  SummaryType/Stdev)

(def MeanMagnitude
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.SummaryType"
  SummaryType/MeanMagnitude)

(def NULL_VAL
  "Enum Constant.

  type: org.deeplearning4j.ui.stats.sbe.SummaryType"
  SummaryType/NULL_VAL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (SummaryType c : SummaryType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.ui.stats.sbe.SummaryType[]`"
  ([]
    (SummaryType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.ui.stats.sbe.SummaryType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.ui.stats.sbe.SummaryType [^java.lang.String name]
    (SummaryType/valueOf name)))

(defn *get
  "value - `short`

  returns: `org.deeplearning4j.ui.stats.sbe.SummaryType`"
  (^org.deeplearning4j.ui.stats.sbe.SummaryType [^Short value]
    (SummaryType/get value)))

(defn value
  "returns: `short`"
  (^Short [^SummaryType this]
    (-> this (.value))))

