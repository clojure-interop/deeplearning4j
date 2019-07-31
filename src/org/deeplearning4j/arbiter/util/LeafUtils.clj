(ns org.deeplearning4j.arbiter.util.LeafUtils
  "Created by Alex on 29/06/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.util LeafUtils]))

(defn *get-unique-objects
  "Returns a list of unique objects, not using the .equals() method, but rather using ==

  all-leaves - Leaf values to process - `java.util.List`

  returns: A list of unique parameter space values - `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^java.util.List all-leaves]
    (LeafUtils/getUniqueObjects all-leaves)))

(defn *count-unique-parameters
  "Count the number of unique parameters in the specified leaf nodes

  all-leaves - Leaf values to count the parameters fore - `java.util.List`

  returns: Number of parameters for all unique objects - `int`"
  (^Integer [^java.util.List all-leaves]
    (LeafUtils/countUniqueParameters all-leaves)))

