(ns org.datavec.audio.processor.ArrayRankDouble
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.processor ArrayRankDouble]))

(defn ->array-rank-double
  "Constructor."
  (^ArrayRankDouble []
    (new ArrayRankDouble )))

(defn get-max-value-index
  "Get the index position of maximum value the given array

  array - an array - `double[]`

  returns: index of the max value in array - `int`"
  (^Integer [^ArrayRankDouble this array]
    (-> this (.getMaxValueIndex array))))

(defn get-min-value-index
  "Get the index position of minimum value in the given array

  array - an array - `double[]`

  returns: index of the min value in array - `int`"
  (^Integer [^ArrayRankDouble this array]
    (-> this (.getMinValueIndex array))))

(defn get-nth-ordered-value
  "Get the n-th value in the array after sorted

  array - an array - `double[]`
  n - position in array - `int`
  ascending - is ascending order or not - `boolean`

  returns: value at nth position of array - `double`"
  (^Double [^ArrayRankDouble this array ^Integer n ^Boolean ascending]
    (-> this (.getNthOrderedValue array n ascending))))

