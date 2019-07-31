(ns org.deeplearning4j.clustering.strategy.ClusteringStrategyType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.strategy ClusteringStrategyType]))

(def FIXED_CLUSTER_COUNT
  "Enum Constant.

  type: org.deeplearning4j.clustering.strategy.ClusteringStrategyType"
  ClusteringStrategyType/FIXED_CLUSTER_COUNT)

(def OPTIMIZATION
  "Enum Constant.

  type: org.deeplearning4j.clustering.strategy.ClusteringStrategyType"
  ClusteringStrategyType/OPTIMIZATION)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ClusteringStrategyType c : ClusteringStrategyType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.clustering.strategy.ClusteringStrategyType[]`"
  ([]
    (ClusteringStrategyType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.clustering.strategy.ClusteringStrategyType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.clustering.strategy.ClusteringStrategyType [^java.lang.String name]
    (ClusteringStrategyType/valueOf name)))

