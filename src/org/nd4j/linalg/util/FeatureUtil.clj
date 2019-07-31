(ns org.nd4j.linalg.util.FeatureUtil
  "Feature matrix related jcuda.utils"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util FeatureUtil]))

(defn ->feature-util
  "Constructor."
  (^FeatureUtil []
    (new FeatureUtil )))

(defn *to-outcome-vector
  "Creates an out come vector from the specified inputs

  index - the index of the label - `long`
  num-outcomes - the number of possible outcomes - `long`

  returns: a binary label matrix used for supervised learning - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Long index ^Long num-outcomes]
    (FeatureUtil/toOutcomeVector index num-outcomes)))

(defn *to-outcome-matrix
  "Creates an out come vector from the specified inputs

  index - the index of the label - `int[]`
  num-outcomes - the number of possible outcomes - `long`

  returns: a binary label matrix used for supervised learning - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [index ^Long num-outcomes]
    (FeatureUtil/toOutcomeMatrix index num-outcomes)))

(defn *normalize-matrix
  "to-normalize - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray to-normalize]
    (FeatureUtil/normalizeMatrix to-normalize)))

(defn *scale-by-max
  "Divides each row by its max

  to-scale - the matrix to divide by its row maxes - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray to-scale]
    (FeatureUtil/scaleByMax to-scale)))

(defn *scale-min-max
  "Scales the ndarray columns
  to the given min/max values

  min - the minimum number - `double`
  max - the max number - `double`
  to-scale - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Double min ^Double max ^org.nd4j.linalg.api.ndarray.INDArray to-scale]
    (FeatureUtil/scaleMinMax min max to-scale)))

