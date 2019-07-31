(ns org.deeplearning4j.clustering.optimisation.ClusteringOptimizationType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.optimisation ClusteringOptimizationType]))

(def MINIMIZE_AVERAGE_POINT_TO_CENTER_DISTANCE
  "Enum Constant.

  type: org.deeplearning4j.clustering.optimisation.ClusteringOptimizationType"
  ClusteringOptimizationType/MINIMIZE_AVERAGE_POINT_TO_CENTER_DISTANCE)

(def MINIMIZE_MAXIMUM_POINT_TO_CENTER_DISTANCE
  "Enum Constant.

  type: org.deeplearning4j.clustering.optimisation.ClusteringOptimizationType"
  ClusteringOptimizationType/MINIMIZE_MAXIMUM_POINT_TO_CENTER_DISTANCE)

(def MINIMIZE_AVERAGE_POINT_TO_POINT_DISTANCE
  "Enum Constant.

  type: org.deeplearning4j.clustering.optimisation.ClusteringOptimizationType"
  ClusteringOptimizationType/MINIMIZE_AVERAGE_POINT_TO_POINT_DISTANCE)

(def MINIMIZE_MAXIMUM_POINT_TO_POINT_DISTANCE
  "Enum Constant.

  type: org.deeplearning4j.clustering.optimisation.ClusteringOptimizationType"
  ClusteringOptimizationType/MINIMIZE_MAXIMUM_POINT_TO_POINT_DISTANCE)

(def MINIMIZE_PER_CLUSTER_POINT_COUNT
  "Enum Constant.

  type: org.deeplearning4j.clustering.optimisation.ClusteringOptimizationType"
  ClusteringOptimizationType/MINIMIZE_PER_CLUSTER_POINT_COUNT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (ClusteringOptimizationType c : ClusteringOptimizationType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.deeplearning4j.clustering.optimisation.ClusteringOptimizationType[]`"
  ([]
    (ClusteringOptimizationType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.deeplearning4j.clustering.optimisation.ClusteringOptimizationType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.deeplearning4j.clustering.optimisation.ClusteringOptimizationType [^java.lang.String name]
    (ClusteringOptimizationType/valueOf name)))
