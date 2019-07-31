(ns org.deeplearning4j.spark.api.RepartitionStrategy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api RepartitionStrategy]))

(def SparkDefault
  "Enum Constant.

  type: org.deeplearning4j.spark.api.RepartitionStrategy"
  RepartitionStrategy/SparkDefault)

(def Balanced
  "Enum Constant.

  type: org.deeplearning4j.spark.api.RepartitionStrategy"
  RepartitionStrategy/Balanced)

(def ApproximateBalanced
  "Enum Constant.

  type: org.deeplearning4j.spark.api.RepartitionStrategy"
  RepartitionStrategy/ApproximateBalanced)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (RepartitionStrategy c : RepartitionStrategy.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.spark.api.RepartitionStrategy[]`"
  ([]
    (RepartitionStrategy/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.spark.api.RepartitionStrategy`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.spark.api.RepartitionStrategy [^java.lang.String name]
    (RepartitionStrategy/valueOf name)))

