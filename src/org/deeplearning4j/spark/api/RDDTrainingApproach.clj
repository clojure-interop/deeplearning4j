(ns org.deeplearning4j.spark.api.RDDTrainingApproach
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api RDDTrainingApproach]))

(def Export
  "Enum Constant.

  type: org.deeplearning4j.spark.api.RDDTrainingApproach"
  RDDTrainingApproach/Export)

(def Direct
  "Enum Constant.

  type: org.deeplearning4j.spark.api.RDDTrainingApproach"
  RDDTrainingApproach/Direct)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (RDDTrainingApproach c : RDDTrainingApproach.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.spark.api.RDDTrainingApproach[]`"
  ([]
    (RDDTrainingApproach/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.spark.api.RDDTrainingApproach`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.spark.api.RDDTrainingApproach [^java.lang.String name]
    (RDDTrainingApproach/valueOf name)))

